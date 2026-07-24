CREATE OR REPLACE PROCEDURE mspa_ord$p_set_date ()
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	品目オーダのワークを元に品目オーダの予定日付を計算する。
<REMARKS>
	品目オーダ予定日計算
<ARGUMENTS>
	なし
<HISTORY>
**********************************************************/
/*********************************************************/
DECLARE
	c_mfg		CONSTANT	VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_TYP','MFG') ;		/* 製造 */
	c_purc		CONSTANT	VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_TYP','PURC') ;		/* 購買 */
	c_outsrc	CONSTANT	VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_TYP','OUTSRC') ;	/* 外注 */
	c_xfr		CONSTANT	VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_TYP','XFR') ;		/* 移送 */
	c_wg_xfr	CONSTANT	VARCHAR := fcpa_const$get_const_val('MSC_ITM_ORD_TYP','WG_XFR') ;	/* ＷＧ間移送 */

	c_null_val	CONSTANT	VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;

	c_fwd_off	CONSTANT	CHAR := '0' ;		/* 直前の稼働日 */
	c_fwd_on	CONSTANT	CHAR := '1' ;		/* 直後の稼働日 */
	c_xfr_off	CONSTANT	CHAR := '0' ;		/* 休日をリードタイムに含める（製造用） */
	c_xfr_on	CONSTANT	CHAR := '1' ;		/* 休日をリードタイムに含めない（移動用） */

	l_po_schd_dt		msw_itm_order.po_schd_dt%TYPE ;		/* 発注予定日 */
	l_purc_lt		msw_itm_order.purc_lt%TYPE ;		/* 購入ＬＴ */
	l_gi_schd_dt		msw_itm_order.gi_schd_dt%TYPE ;		/* 出庫予定日 */
	l_mfg_st_schd_dt	msw_itm_order.mfg_st_schd_dt%TYPE ;	/* 製造着手予定日 */
	l_mfg_lt		msw_itm_order.mfg_lt%TYPE ;		/* 製造ＬＴ */
	l_mfg_end_schd_dt	msw_itm_order.mfg_end_schd_dt%TYPE ;	/* 製造終了予定日 */
	l_strg_schd_dt		msw_itm_order.strg_schd_dt%TYPE ;	/* 格納完了予定日 */
	l_accpt_schd_dt		msw_itm_order.accpt_schd_dt%TYPE ;	/* 検収予定日 */
	l_insp_lt		msw_itm_order.insp_lt%TYPE ;		/* 検査ＬＴ */
	l_insp_offst		msw_itm_order.insp_offst%TYPE ;		/* 検査オフセット */
	l_insp_st_schd_dt	msw_itm_order.insp_st_schd_dt%TYPE ;	/* 検査着手予定日 */
	l_insp_end_schd_dt	msw_itm_order.insp_end_schd_dt%TYPE ;	/* 検査終了予定日 */
	l_avl_schd_dt		msw_itm_order.avl_schd_dt%TYPE ;	/* 使用可能予定日 */
	l_xfr_lt_strg_schd_dt	msw_itm_order.strg_schd_dt%TYPE ;	/* 格納完了予定日（製造終了予定日＋移動ＬＴ） */

	l_tmp_insp_end_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_tmp_insp_st_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_tmp_accpt_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_tmp_strg_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_tmp_mfg_end_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_tmp_avl_schd_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	l_org_insp_offst	msw_itm_order.insp_offst%TYPE ;

	c_min_dt	CONSTANT TIMESTAMP(0) WITHOUT TIME ZONE := TO_TIMESTAMP('19000101', 'YYYYMMDD') ;
	l_tmp_dt	TIMESTAMP(0) WITHOUT TIME ZONE ;
	x	RECORD ;
/*********************************************************/
BEGIN
	FOR x IN (
		SELECT
			t.ctid,
			t.itm_ord_typ,
			t.po_schd_dt,
			t.gi_schd_dt,
			t.mfg_st_schd_dt,
			t.mfg_end_schd_dt,
			t.strg_schd_dt,
			t.accpt_schd_dt,
			t.insp_st_schd_dt,
			t.insp_end_schd_dt,
			t.avl_schd_dt,
			t.mfg_loc_cd,
			t.rqst_loc_cd,
			t.strg_loc_cd,
			t.inst_qty,
			COALESCE(t.mfg_lt, 0) AS mfg_lt,
			t.mfg_lt_add_qty,
			COALESCE(
				CASE
					WHEN t.strg_sppl_cd IS NULL THEN t.purc_lt
					ELSE COALESCE(m7.purc_lt, t.purc_lt)
				END,
				0) AS purc_lt,
			COALESCE(
				CASE
					WHEN t.strg_sppl_cd IS NULL THEN t.purc_lt_add_qty
					ELSE COALESCE(m7.purc_lt_add_qty, t.purc_lt_add_qty)
				END,
				0) AS purc_lt_add_qty,
			CASE
				WHEN t.itm_ord_typ = c_mfg then 0
				ELSE COALESCE(m8.xfr_lt, m9.xfr_lt, 0)
			END AS xfr_lt,
			m10.in_prmt_insp_flg,
			CASE
				WHEN m10.in_prmt_insp_flg = '1' THEN NULL
				ELSE t.insp_lt
			END AS insp_lt,
			CASE
				WHEN m10.in_prmt_insp_flg = '1' THEN NULL
				ELSE t.insp_offst
			END AS insp_offst,
			t.insp_lt org_insp_lt,
			t.insp_offst org_insp_offst,
			t.accpt_insp_lt,
			t.outsrc_cal_cd,
			t.sppl_cal_cd
		FROM
			(
			SELECT
				t1.ctid,
				t1.itm_ord_typ,
				t1.po_schd_dt,
				t1.gi_schd_dt,
				t1.mfg_st_schd_dt,
				t1.mfg_end_schd_dt,
				t1.strg_schd_dt,
				t1.accpt_schd_dt,
				t1.insp_st_schd_dt,
				t1.insp_end_schd_dt,
				t1.avl_schd_dt,
				t1.master_dt,
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.mfg_loc_cd,
				t1.sppl_cd,
				t1.maker_cd,
				t1.rqst_loc_cd,
				t1.bom_ptn,
				t1.strg_loc_cd,
				t1.inst_qty,
				m1.mfg_lt,
				COALESCE(m1.mfg_lt_add_qty, 0) mfg_lt_add_qty,
				m1.purc_lt,
				m1.purc_lt_add_qty,
				t1.insp_lt,
				CASE
					WHEN t1.insp_lt IS NULL THEN NULL
					ELSE COALESCE(t1.insp_offst, 0)
				END AS insp_offst,
				CASE
					WHEN t1.judge_ddlv = '1' THEN 0
					ELSE COALESCE(m1.accpt_insp_lt, 0)
				END AS accpt_insp_lt,
				m2.lg_grp_cd mfg_loc_lg_grp_cd,
				m3.sppl_cal_cd as outsrc_cal_cd,
				t1.strg_loc_lg_grp_cd,
				m5.lg_grp_cd rqst_loc_lg_grp_cd,
				t1.strg_sppl_cd,
				t1.strg_site_cd,
				m4.ship_term_cd,
				m6.sppl_cal_cd,
				t1.wg_cd,
				COALESCE(m2.sppl_cd, t1.sppl_cd) ddlv_sppl_cd
			FROM
				(
				SELECT
					w.ctid,
					w.itm_ord_typ,
					w.po_schd_dt,
					w.gi_schd_dt,
					w.mfg_st_schd_dt,
					w.mfg_end_schd_dt,
					w.strg_schd_dt,
					w.accpt_schd_dt,
					w.insp_st_schd_dt,
					w.insp_end_schd_dt,
					w.avl_schd_dt,
					w.master_dt,
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.mfg_loc_cd,
					w.sppl_cd,
					w.maker_cd,
					w.rqst_loc_cd,
					w.bom_ptn,
					w.strg_loc_cd,
					w.inst_qty,
					w.insp_lt,
					w.insp_offst,
					CASE
						WHEN w.lg_grp_cd IS NULL THEN m.lg_grp_cd
						ELSE w.lg_grp_cd
					END AS strg_loc_lg_grp_cd,
					CASE
						WHEN w.dlv_cd IS NULL THEN m.sppl_cd
						ELSE w.dlv_cd
					END AS strg_sppl_cd,
					CASE
						WHEN w.dlv_cd IS NULL THEN m.site_cd
						ELSE NULL
					END AS strg_site_cd,
					CASE
						WHEN w.dlv_cd IS NOT NULL THEN '1'
						ELSE '0'
					END AS judge_ddlv,
					m.wg_cd
				FROM	msw_itm_order$temp w -- ctidを使用するため
				LEFT OUTER JOIN mam_loc m ON (w.strg_loc_cd = m.loc_cd)
				WHERE	0=0
			) t1
			LEFT OUTER JOIN mam_itm_dtl m1 ON (
				0=0
				and t1.itm_cd = m1.itm_cd
				and t1.itm_sub1 = m1.itm_sub1
				and t1.itm_sub2 = m1.itm_sub2
				and t1.itm_sub3 = m1.itm_sub3
				and t1.mfg_loc_cd = m1.mfg_loc_cd
				and t1.sppl_cd = m1.sppl_cd
				and t1.maker_cd = m1.maker_cd
				and t1.rqst_loc_cd = m1.rqst_loc_cd
				and t1.wg_cd = m1.wg_cd
				and t1.bom_ptn = m1.bom_ptn
				and t1.master_dt >= m1.st_dt
				and t1.master_dt <= m1.end_dt)
			LEFT OUTER JOIN mam_loc m2 ON (t1.mfg_loc_cd = m2.loc_cd)
			LEFT OUTER JOIN mam_bp m3 ON (m2.sppl_cd = m3.bp_cd)
			LEFT OUTER JOIN mam_itm m4 ON (
				0=0
				and t1.itm_cd = m4.itm_cd
				and t1.itm_sub1 = m4.itm_sub1
				and t1.itm_sub2 = m4.itm_sub2
				and t1.itm_sub3 = m4.itm_sub3)
			LEFT OUTER JOIN mam_loc m5 ON (t1.rqst_loc_cd = m5.loc_cd)
			LEFT OUTER JOIN mam_bp m6 ON (t1.sppl_cd = m6.bp_cd)
			WHERE	0=0
		) t
		LEFT OUTER JOIN mam_purc_ddlv_lt m7 ON (
			0=0
			AND t.itm_cd = m7.itm_cd
			AND t.itm_sub1 = m7.itm_sub1
			AND t.itm_sub2 = m7.itm_sub2
			AND t.itm_sub3 = m7.itm_sub3
			AND t.ddlv_sppl_cd = m7.sppl_cd
			AND t.strg_loc_lg_grp_cd = m7.lg_grp_cd
			AND t.master_dt >= m7.st_dt
			AND t.master_dt <= m7.end_dt
			AND m7.del_flg = '0')
		LEFT OUTER JOIN mam_lg_ctl m8 ON (
			0=0
			AND COALESCE(t.mfg_loc_lg_grp_cd, t.rqst_loc_lg_grp_cd) = m8.fr_lg_grp_cd
			AND t.strg_loc_lg_grp_cd = m8.to_lg_grp_cd
			AND t.ship_term_cd = m8.ship_term_cd
			AND m8.del_flg = '0')
		LEFT OUTER JOIN mam_lg_ctl m9 ON (
			0=0
			AND COALESCE(t.mfg_loc_lg_grp_cd, t.rqst_loc_lg_grp_cd) = m9.fr_lg_grp_cd
			AND t.strg_loc_lg_grp_cd = m9.to_lg_grp_cd
			AND m9.ship_term_cd = c_null_val
			AND m9.del_flg = '0')
		LEFT OUTER JOIN mam_itm_site m10 ON (
			0=0
			AND t.itm_cd = m10.itm_cd
			AND t.itm_sub1 = m10.itm_sub1
			AND t.itm_sub2 = m10.itm_sub2
			AND t.itm_sub3 = m10.itm_sub3
			AND t.strg_site_cd = m10.site_cd
			AND m10.del_flg = '0')
		WHERE	0=0
	) LOOP
		l_tmp_insp_end_schd_dt := NULL ;
		l_tmp_insp_st_schd_dt := NULL ;
		l_tmp_accpt_schd_dt := NULL ;
		l_tmp_strg_schd_dt := NULL ;
		l_tmp_mfg_end_schd_dt := NULL ;
		l_tmp_avl_schd_dt := NULL ;

		l_po_schd_dt := NULL ;
		l_purc_lt := NULL ;
		l_gi_schd_dt := NULL ;
		l_mfg_st_schd_dt := NULL ;
		l_mfg_lt := NULL ;
		l_mfg_end_schd_dt := NULL ;
		l_strg_schd_dt := NULL ;
		l_accpt_schd_dt := NULL ;
		l_insp_offst := NULL ;
		l_insp_st_schd_dt := NULL ;
		l_insp_end_schd_dt := NULL ;
		l_avl_schd_dt := NULL ;
		l_org_insp_offst := NULL ;

		l_insp_offst := x.insp_offst ;
		IF x.itm_ord_typ <> c_mfg AND l_insp_offst > 0 THEN
			l_insp_offst := 0 ;
		END IF ;
		l_org_insp_offst := x.org_insp_offst ;
		IF x.itm_ord_typ <> c_mfg AND l_org_insp_offst > 0 THEN
			l_org_insp_offst := 0 ;
		END IF ;

		/* 製造ＬＴ＝製造ＬＴ＋製造可変ＬＴ */
		IF x.mfg_lt_add_qty = 0 THEN
			l_mfg_lt := x.mfg_lt ;
		ELSIF x.mfg_lt_add_qty <> 0 THEN
			l_mfg_lt := x.mfg_lt + TRUNC(x.inst_qty / x.mfg_lt_add_qty) ;
		END IF ;

		/* 購買ＬＴ＝購買ＬＴ＋購買可変ＬＴ */
		IF x.purc_lt_add_qty = 0 THEN
			l_purc_lt := x.purc_lt ;
		ELSIF x.purc_lt_add_qty <> 0 THEN
			l_purc_lt := x.purc_lt + TRUNC(x.inst_qty / x.purc_lt_add_qty) ;
		END IF ;

		/* 計算用暫定使用可能日 */
		IF x.avl_schd_dt IS NOT NULL THEN
			l_tmp_avl_schd_dt := mapa_dt$f_cal_date_loc(x.avl_schd_dt, 0, c_fwd_off, x.strg_loc_cd, c_xfr_off) ;
		ELSE
			IF x.accpt_schd_dt IS NOT NULL AND x.insp_lt IS NOT NULL AND x.insp_end_schd_dt IS NULL AND x.insp_st_schd_dt IS NULL THEN
				IF x.accpt_insp_lt < x.insp_lt - l_insp_offst THEN
					l_tmp_strg_schd_dt :=  mapa_dt$f_cal_date_loc(x.accpt_schd_dt, x.accpt_insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off) ;
					l_tmp_insp_end_schd_dt := mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, x.insp_lt - l_insp_offst, c_fwd_on, x.strg_loc_cd, c_xfr_off) ;
				END IF ;
			END IF ;

			IF x.insp_end_schd_dt IS NOT NULL THEN
				l_tmp_insp_end_schd_dt := x.insp_end_schd_dt ;
			ELSIF x.insp_st_schd_dt IS NOT NULL THEN
				l_tmp_insp_end_schd_dt := mapa_dt$f_cal_date_loc(x.insp_st_schd_dt, COALESCE(x.insp_lt, 0), c_fwd_on, x.strg_loc_cd, c_xfr_off) ;
			END IF ;

			l_tmp_dt := fcpa_postgres_util$greatest(COALESCE(l_tmp_insp_end_schd_dt, c_min_dt), COALESCE(x.accpt_schd_dt, c_min_dt), COALESCE(x.strg_schd_dt, c_min_dt)) ;
			IF x.in_prmt_insp_flg = '1' AND x.org_insp_lt IS NOT NULL THEN
				IF x.accpt_schd_dt IS NOT NULL THEN
					l_tmp_dt := fcpa_postgres_util$greatest(x.accpt_schd_dt, COALESCE(x.strg_schd_dt, c_min_dt)) ;
				ELSE
					l_tmp_strg_schd_dt := x.strg_schd_dt ;
					IF l_tmp_strg_schd_dt IS NULL THEN
						IF x.insp_st_schd_dt IS NOT NULL THEN
							l_tmp_strg_schd_dt := mapa_dt$f_cal_date_loc(x.insp_st_schd_dt, l_org_insp_offst, c_fwd_off, x.strg_loc_cd, c_xfr_off) ;
						ELSIF x.insp_end_schd_dt IS NOT NULL THEN
							l_tmp_strg_schd_dt := mapa_dt$f_cal_date_loc(x.insp_end_schd_dt, l_org_insp_offst - x.org_insp_lt, c_fwd_off, x.strg_loc_cd, c_xfr_off) ;
						END IF ;
					END IF ;

					IF l_tmp_strg_schd_dt IS NOT NULL THEN
						IF (x.itm_ord_typ = c_purc OR x.itm_ord_typ = c_outsrc) AND x.accpt_insp_lt IS NOT NULL THEN
							l_tmp_accpt_schd_dt := mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, x.accpt_insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off) ;
						END IF ;
						l_tmp_dt := fcpa_postgres_util$greatest(COALESCE(l_tmp_accpt_schd_dt, c_min_dt), l_tmp_strg_schd_dt) ;
					END IF ;
				END IF ;
			END IF ;

			IF l_tmp_dt <> c_min_dT THEN
				l_tmp_avl_schd_dt := mapa_dt$f_cal_date_loc(l_tmp_dt, 0, c_fwd_off, x.strg_loc_cd, c_xfr_off) ;
			END IF ;
		END IF ;

		/* 各種予定日計算 */
		IF x.itm_ord_typ = c_mfg THEN
			IF x.insp_lt IS NOT NULL AND x.insp_lt - l_insp_offst > 0 THEN
				l_tmp_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, l_tmp_avl_schd_dt) ;

				l_tmp_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_end_schd_dt, x.insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;

				l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_st_schd_dt, l_insp_offst, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
			ELSE
				l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, l_tmp_avl_schd_dt) ;
			END IF ;

			/* 暫定製造終了予定日＝暫定格納予定日－ 移送ＬＴ */
			l_tmp_mfg_end_schd_dt := COALESCE(x.mfg_end_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, x.xfr_lt * -1, c_fwd_off, x.mfg_loc_cd, c_xfr_on)) ;

			/* 製造着手予定日＝暫定製造終了予定日－ 製造ＬＴ */
			l_mfg_st_schd_dt := COALESCE(x.mfg_st_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_mfg_end_schd_dt, l_mfg_lt * -1, c_fwd_off, x.mfg_loc_cd, c_xfr_off)) ;

			/* 製造終了予定日＝製造着手予定日＋製造ＬＴ */
			l_mfg_end_schd_dt := COALESCE(x.mfg_end_schd_dt, mapa_dt$f_cal_date_loc(l_mfg_st_schd_dt, l_mfg_lt, c_fwd_on, x.mfg_loc_cd, c_xfr_off)) ;

			/* 格納予定日＝製造終了予定日＋移送ＬＴ */
			l_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_mfg_end_schd_dt, x.xfr_lt, c_fwd_on, x.strg_loc_cd, c_xfr_on)) ;

			IF l_mfg_end_schd_dt > l_strg_schd_dt THEN
				l_strg_schd_dt := mapa_dt$f_cal_date_loc(l_mfg_end_schd_dt, x.xfr_lt, c_fwd_on, x.strg_loc_cd, c_xfr_on);
			END IF;

			IF x.insp_lt IS NOT NULL THEN
				/* 検査開始予定日＝格納予定日ー検査オフセット */
				l_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, l_insp_offst * -1, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				/* 検査終了予定日＝検査着手予定日＋検査ＬＴ */
				l_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, mapa_dt$f_cal_date_loc(l_insp_st_schd_dt, x.insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				IF l_strg_schd_dt > l_insp_end_schd_dt THEN
					/* 使用可能日＝格納予定日 */
					l_avl_schd_dt := COALESCE(x.avl_schd_dt, l_strg_schd_dt) ;
				ELSE
					/* 使用可能日＝検査終了予定日 */
					l_avl_schd_dt := COALESCE(x.avl_schd_dt, l_insp_end_schd_dt) ;
				END IF ;
			ELSE
				/* 使用可能日＝格納予定日 */
				l_avl_schd_dt := COALESCE(x.avl_schd_dt, l_strg_schd_dt) ;
			END IF ;

		ELSIF x.itm_ord_typ = c_purc THEN
			IF x.insp_lt IS NOT NULL THEN
				IF x.accpt_insp_lt IS NOT NULL AND x.accpt_insp_lt >=  x.insp_lt - l_insp_offst THEN
					l_tmp_accpt_schd_dt := COALESCE(x.accpt_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_accpt_schd_dt, x.accpt_insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				ELSE
					l_tmp_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_end_schd_dt, x.insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_st_schd_dt, l_insp_offst, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				END IF ;
			ELSE
				IF x.accpt_insp_lt IS NOT NULL AND x.accpt_insp_lt >0 THEN
					l_tmp_accpt_schd_dt := COALESCE(x.accpt_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_accpt_schd_dt, x.accpt_insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				ELSE
					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, l_tmp_avl_schd_dt) ;
				END IF ;
			END IF ;

			/* 発注予定日＝暫定格納完了予定日ー購入ＬＴ */
			l_po_schd_dt := COALESCE(x.po_schd_dt, mapa_dt$f_cal_date_loc(mapa_dt$f_cal_date(l_tmp_strg_schd_dt, l_purc_lt * -1, c_fwd_off, x.sppl_cal_cd, c_xfr_off), 0, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;

			/* 格納完了予定日＝発注予定日＋購入ＬＴ */
			l_tmp_strg_schd_dt := mapa_dt$f_cal_date(l_po_schd_dt, l_purc_lt, c_fwd_on, x.sppl_cal_cd, c_xfr_off) ;
			l_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, 0, c_fwd_on, x.strg_loc_cd, c_xfr_on)) ;

			/* 検収予定日＝格納完了予定日＋検収ＬＴ */
			l_accpt_schd_dt := COALESCE(x.accpt_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, x.accpt_insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

			IF x.insp_lt IS NOT NULL THEN
				/* 検査着手予定日＝格納完了予定日ー検査オフセット */
				l_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, l_insp_offst * -1, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				/* 検査終了予定日＝検査着手予定日＋検査ＬＴ */
				l_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, mapa_dt$f_cal_date_loc(l_insp_st_schd_dt, x.insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				IF x.avl_schd_dt IS NULL THEN--
					IF l_strg_schd_dt >= l_insp_end_schd_dt AND l_strg_schd_dt >= l_accpt_schd_dt THEN
						l_avl_schd_dt := l_strg_schd_dt ;
					ELSIF l_insp_end_schd_dt >= l_strg_schd_dt AND l_insp_end_schd_dt >= l_accpt_schd_dt THEN
						l_avl_schd_dt := l_insp_end_schd_dt ;
					ELSIF  l_accpt_schd_dt >= l_strg_schd_dt AND l_accpt_schd_dt >= l_insp_end_schd_dt THEN
						l_avl_schd_dt := l_accpt_schd_dt ;
					END IF ;
				ELSE
					l_avl_schd_dt := x.avl_schd_dt ;
				END IF ;
			ELSE
				IF x.avl_schd_dt IS NULL THEN
					IF l_accpt_schd_dt > l_strg_schd_dt THEN
						l_avl_schd_dt :=  l_accpt_schd_dt ;
					ELSE
						l_avl_schd_dt := l_strg_schd_dt ;
					END IF ;
				ELSE
					l_avl_schd_dt := x.avl_schd_dt ;
				END IF ;
			END IF ;
		ELSIF x.itm_ord_typ = c_outsrc THEN
			IF x.insp_lt IS NOT NULL THEN
				IF x.accpt_insp_lt IS NOT NULL AND x.accpt_insp_lt >= x.insp_lt - l_insp_offst THEN
					l_tmp_accpt_schd_dt := COALESCE(x.accpt_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_accpt_schd_dt, x.accpt_insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				ELSE
					l_tmp_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_end_schd_dt, x.insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_insp_st_schd_dt, l_insp_offst, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				END IF ;
			ELSE
				IF x.accpt_insp_lt IS NOT NULL AND x.accpt_insp_lt > 0 THEN
					l_tmp_accpt_schd_dt := COALESCE(x.accpt_schd_dt, l_tmp_avl_schd_dt) ;

					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_accpt_schd_dt, x.accpt_insp_lt * -1, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;
				ELSE
					l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, l_tmp_avl_schd_dt) ;
				END IF ;
			END IF ;

			IF l_tmp_strg_schd_dt IS NULL THEN
				IF x.mfg_end_schd_dt IS NOT NULL THEN
					l_tmp_mfg_end_schd_dt := x.mfg_end_schd_dt ;
				ELSIF x.mfg_st_schd_dt IS NOT NULL THEN
					l_tmp_mfg_end_schd_dt := mapa_dt$f_cal_date_loc(x.mfg_st_schd_dt, l_mfg_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off) ;
				END IF ;

				l_tmp_strg_schd_dt := mapa_dt$f_cal_date_loc(l_tmp_mfg_end_schd_dt, x.xfr_lt, c_fwd_on, x.strg_loc_cd, c_xfr_on) ;
			END IF ;

			l_po_schd_dt := COALESCE(x.po_schd_dt, mapa_dt$f_cal_date_loc(mapa_dt$f_cal_date(l_tmp_strg_schd_dt, l_purc_lt * -1, c_fwd_off, x.outsrc_cal_cd, c_xfr_off), 0, c_fwd_off, x.strg_loc_cd, c_xfr_off)) ;

			IF x.strg_schd_dt IS NULL THEN
				l_tmp_strg_schd_dt := mapa_dt$f_cal_date(l_po_schd_dt, l_purc_lt, c_fwd_on, x.outsrc_cal_cd, c_xfr_off) ;

				l_strg_schd_dt := mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, 0, c_fwd_on, x.strg_loc_cd, c_xfr_on) ;
			ELSE
				l_strg_schd_dt := x.strg_schd_dt ;
			END IF ;

			l_mfg_end_schd_dt := COALESCE(x.mfg_end_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, x.xfr_lt * -1, c_fwd_off, x.mfg_loc_cd, c_xfr_on)) ;

			l_mfg_st_schd_dt := COALESCE(x.mfg_st_schd_dt, mapa_dt$f_cal_date_loc(l_mfg_end_schd_dt, l_mfg_lt * -1, c_fwd_off, x.mfg_loc_cd, c_xfr_off)) ;

			l_mfg_end_schd_dt := COALESCE(x.mfg_end_schd_dt, mapa_dt$f_cal_date_loc(l_mfg_st_schd_dt, l_mfg_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

			l_xfr_lt_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_mfg_end_schd_dt, x.xfr_lt, c_fwd_on, x.strg_loc_cd, c_xfr_on)) ;
			--発注予定日＋購入ＬＴ、または製造終了予定日＋移動ＬＴの遅い方を格納完了予定日とする
			IF (l_strg_schd_dt < l_xfr_lt_strg_schd_dt) THEN
				l_strg_schd_dt := l_xfr_lt_strg_schd_dt;
			END IF ;

			l_accpt_schd_dt := COALESCE(x.accpt_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, x.accpt_insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

			IF x.insp_lt IS NOT NULL THEN
				l_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, l_insp_offst * -1, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				l_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, mapa_dt$f_cal_date_loc(l_insp_st_schd_dt, x.insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

				IF l_accpt_schd_dt IS NULL THEN
					IF l_insp_end_schd_dt > l_strg_schd_dt THEN
						l_avl_schd_dt := l_insp_end_schd_dt ;
					ELSE
						l_avl_schd_dt := l_strg_schd_dt ;
					END IF ;
				ELSE
					IF l_insp_end_schd_dt >= l_strg_schd_dt AND l_insp_end_schd_dt >= l_accpt_schd_dt THEN
						l_avl_schd_dt := l_insp_end_schd_dt ;
					ELSIF l_strg_schd_dt >= l_insp_end_schd_dt AND l_strg_schd_dt >= l_accpt_schd_dt THEN
						l_avl_schd_dt := l_strg_schd_dt ;
					ELSIF l_accpt_schd_dt >= l_insp_end_schd_dt AND l_accpt_schd_dt >= l_strg_schd_dt THEN
						l_avl_schd_dt := l_accpt_schd_dt ;
					END IF ;
				END IF ;
			ELSE
				IF l_accpt_schd_dt IS NULL OR l_accpt_schd_dt < l_strg_schd_dt THEN
					l_avl_schd_dt := l_strg_schd_dt ;
				ELSE
					l_avl_schd_dt := l_accpt_schd_dt ;
				END IF ;
			END IF ;
		ELSIF x.itm_ord_typ = c_xfr  OR x.itm_ord_typ = c_wg_xfr THEN

			l_tmp_strg_schd_dt := COALESCE(x.strg_schd_dt, l_tmp_avl_schd_dt) ;

			/* 出庫予定日＝暫定格納完了予定日ー移動ＬＴ */
			l_gi_schd_dt := COALESCE(x.gi_schd_dt, mapa_dt$f_cal_date_loc(l_tmp_strg_schd_dt, x.xfr_lt * -1, c_fwd_off, x.rqst_loc_cd, c_xfr_on)) ;

			/* 格納完了予定日＝出庫予定日＋移動ＬＴ */
			l_strg_schd_dt := COALESCE(x.strg_schd_dt, mapa_dt$f_cal_date_loc(l_gi_schd_dt, x.xfr_lt, c_fwd_on, x.strg_loc_cd, c_xfr_on)) ;

			/* 使用可能予定日＝格納完了予定日 */
			l_avl_schd_dt := COALESCE(x.avl_schd_dt, l_strg_schd_dt) ;
		END IF ;

		/* 検査中ロット使用許可品の検査関連項目の算出 */
		l_insp_lt := x.insp_lt ;
		IF x.in_prmt_insp_flg = '1' AND x.org_insp_lt IS NOT NULL THEN
			l_insp_lt := x.org_insp_lt ;
			l_insp_offst := l_org_insp_offst ;

			/* 検査着手予定日＝格納完了予定日ー検査オフセット */
			l_insp_st_schd_dt := COALESCE(x.insp_st_schd_dt, mapa_dt$f_cal_date_loc(l_strg_schd_dt, l_insp_offst * -1, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;

			/* 検査終了予定日＝検査着手予定日＋検査ＬＴ */
			l_insp_end_schd_dt := COALESCE(x.insp_end_schd_dt, mapa_dt$f_cal_date_loc(l_insp_st_schd_dt, l_insp_lt, c_fwd_on, x.strg_loc_cd, c_xfr_off)) ;
		END IF ;

		/* 日付、ＬＴ、オフセットを更新する */
		update msw_itm_order$temp
		SET
			po_schd_dt = l_po_schd_dt,
			purc_lt = l_purc_lt,
			gi_schd_dt = l_gi_schd_dt,
			mfg_st_schd_dt = l_mfg_st_schd_dt,
			mfg_lt = l_mfg_lt,
			mfg_end_schd_dt = l_mfg_end_schd_dt,
			xfr_lt = x.xfr_lt,
			strg_schd_dt = l_strg_schd_dt,
			accpt_insp_lt = x.accpt_insp_lt,
			accpt_schd_dt = l_accpt_schd_dt,
			insp_offst = l_insp_offst,
			insp_st_schd_dt = l_insp_st_schd_dt,
			insp_lt = l_insp_lt,
			insp_end_schd_dt = l_insp_end_schd_dt,
			avl_schd_dt = l_avl_schd_dt
		WHERE	0=0
		AND ctid = x.ctid
		;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ord$f_get_ver_no (
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_strc_loc_cd	VARCHAR,
	 IN i_base_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目オーダ補完用版ＮＯ取得
<REMARKS>
<ARGUMENTS>
<ITEM>
<IN>	i_itm_cd
		品目
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_strc_loc_cd
		格納場所
<IN>	i_base_dt
		格納完了予定日
<HISTORY>
**********************************************************/
DECLARE
	l_ver_no	mam_itm_ver.ver_no%TYPE ;
BEGIN
	SELECT ver_no AS t INTO STRICT l_ver_no
	FROM
		(
		SELECT	t1.ver_no
		FROM
			mam_itm_ver t1,
			mam_loc t2
		WHERE	0=0
		AND	t1.itm_cd = i_itm_cd
		AND	t1.itm_sub1 = i_itm_sub1
		AND	t1.itm_sub2 = i_itm_sub2
		AND	t1.itm_sub3 = i_itm_sub3
		AND	t1.purc_st_dt <= i_base_dt
		AND	t1.del_flg = '0'
		AND	t1.site_cd = t2.site_cd
		AND	t2.loc_cd = i_strc_loc_cd
		ORDER BY t1.purc_st_dt DESC
		) var_sbq
	LIMIT 1
	;
	RETURN l_ver_no ;

EXCEPTION
	WHEN no_data_found THEN
		RETURN NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ord$f_get_ver_no (
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_strc_loc_cd	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目オーダ補完用版ＮＯ取得
<REMARKS>
<ARGUMENTS>
<ITEM>
<IN>	i_itm_cd
		品目
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_strc_loc_cd
		格納場所
<HISTORY>
**********************************************************/
DECLARE
	l_ver_no	mam_itm_ver.ver_no%TYPE ;
BEGIN
	SELECT ver_no AS t INTO STRICT l_ver_no
	FROM
		(
		SELECT	t1.ver_no
		FROM
			mam_itm_ver t1,
			mam_loc t2
		WHERE	0=0
		AND	t1.itm_cd = i_itm_cd
		AND	t1.itm_sub1 = i_itm_sub1
		AND	t1.itm_sub2 = i_itm_sub2
		AND	t1.itm_sub3 = i_itm_sub3
		AND	t1.del_flg = '0'
		AND	t1.site_cd = t2.site_cd
		AND	t2.loc_cd = i_strc_loc_cd
		ORDER BY t1.purc_st_dt DESC
		) var_sbq
	LIMIT 1
	;
	RETURN l_ver_no ;

EXCEPTION
	WHEN no_data_found THEN
		RETURN NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ord$f_get_alloc_pln_gi_schd_dt (
	 IN i_io_schd_pr_no	VARCHAR,
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_lot_no	VARCHAR,
	 IN i_sno1	VARCHAR,
	 IN i_sno2	VARCHAR,
	 IN i_sno3	VARCHAR,
	 IN i_sno4	VARCHAR,
	 IN i_loc_cd	VARCHAR
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		引当予定情報から最早出庫予定日を取得する
<REMARKS>
		受払進捗管理ＮＯが指定された場合、受払進捗管理ＮＯを使用して最早出庫予定日を取得する。
		取得できなかった場合は、品目ＣＤ等の在庫情報を使用して最早出庫予定日を取得する。
<ARGUMENTS>
<ITEM>
<IN>	i_io_schd_pr_no
		受払進捗管理ＮＯ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_lot_no
		ロットＮＯ
<IN>	i_sno1
		手配ＮＯ１
<IN>	i_sno2
		手配ＮＯ２
<IN>	i_sno3
		手配ＮＯ３
<IN>	i_sno4
		手配ＮＯ４
<RETURNVALUE>
		最早出庫予定日
<HISTORY>
**************************************************************************/
DECLARE
	l_gi_schd_dt	mst_alloc_pln.gi_schd_dt%TYPE ;
BEGIN

	IF i_io_schd_pr_no IS NOT NULL THEN
		/* 受払進捗管理ＮＯで取得 */
		SELECT MIN(t1.gi_schd_dt) INTO STRICT l_gi_schd_dt
		FROM	mst_alloc_pln t1
		WHERE	0=0
		AND	t1.io_schd_pr_no = i_io_schd_pr_no
		;
	END IF ;

	IF l_gi_schd_dt IS NULL
		AND	i_itm_cd IS NOT NULL
		AND	i_itm_cd IS NOT NULL
		AND	i_itm_sub1 IS NOT NULL
		AND	i_itm_sub2 IS NOT NULL
		AND	i_itm_sub3 IS NOT NULL
		AND	i_lot_no IS NOT NULL
		AND	i_sno1 IS NOT NULL
		AND	i_sno2 IS NOT NULL
		AND	i_sno3 IS NOT NULL
		AND	i_sno4 IS NOT NULL THEN

		/* 在庫情報で取得 */
		SELECT MIN(t1.gi_schd_dt) INTO STRICT l_gi_schd_dt
		FROM	mst_alloc_pln t1
		WHERE	0=0
		AND	t1.itm_cd = i_itm_cd
		AND	t1.itm_sub1 = i_itm_sub1
		AND	t1.itm_sub2 = i_itm_sub2
		AND	t1.itm_sub3 = i_itm_sub3
		AND	t1.lot_no = i_lot_no
		AND	t1.sno1 = i_sno1
		AND	t1.sno2 = i_sno2
		AND	t1.sno3 = i_sno3
		AND	t1.sno4 = i_sno4
		AND	t1.loc_cd = i_loc_cd
		;
	END IF ;

	RETURN l_gi_schd_dt ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mspa_ord$f_get_alloc_pln_gi_schd_dt_ne (
	 IN i_io_schd_pr_no	VARCHAR,
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_lot_no	VARCHAR,
	 IN i_sno1	VARCHAR,
	 IN i_sno2	VARCHAR,
	 IN i_sno3	VARCHAR,
	 IN i_sno4	VARCHAR,
	 IN i_loc_cd	VARCHAR
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
		引当予定情報から最早出庫予定日を取得する(Not Exception版)
<REMARKS>
		受払進捗管理ＮＯが指定された場合、受払進捗管理ＮＯを使用して最早出庫予定日を取得する。
		取得できなかった場合は、品目ＣＤ等の在庫情報を使用して最早出庫予定日を取得する。
<ARGUMENTS>
<ITEM>
<IN>	i_io_schd_pr_no
		受払進捗管理ＮＯ
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_lot_no
		ロットＮＯ
<IN>	i_sno1
		手配ＮＯ１
<IN>	i_sno2
		手配ＮＯ２
<IN>	i_sno3
		手配ＮＯ３
<IN>	i_sno4
		手配ＮＯ４
<RETURNVALUE>
		最早出庫予定日
<HISTORY>
**************************************************************************/
DECLARE
	l_gi_schd_dt	mst_alloc_pln.gi_schd_dt%TYPE ;
BEGIN

	l_gi_schd_dt := mspa_ord$f_get_alloc_pln_gi_schd_dt(i_io_schd_pr_no, i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_lot_no, i_sno1, i_sno2, i_sno3, i_sno4, i_loc_cd) ;
	RETURN l_gi_schd_dt ;

EXCEPTION
	WHEN others THEN
		RETURN l_gi_schd_dt ;

END ;
$BODY$
LANGUAGE plpgsql
;
