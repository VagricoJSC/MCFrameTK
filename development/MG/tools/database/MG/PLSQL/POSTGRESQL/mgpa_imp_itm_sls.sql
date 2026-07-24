CREATE OR REPLACE PROCEDURE mgpa_imp_itm_sls$p_ins_mgw_main (
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_upri_imp_typ VARCHAR,
	IN i_imp_ope_typ VARCHAR,
	INOUT o_err_flg CHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目販売マスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		ワークテーブル作成メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_SLS_UPRI_IMP_TYP
		販売単価取込区分
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<INOUT>	O_ERR_FLG
		エラーフラグ
<HISTORY>
**********************************************************/
DECLARE
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;

	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_rndoff CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_RND_TYP','RNDOFF') ;

	c_imp_std CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_UPRI_IMP_TYP','STD') ;
	c_imp_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_UPRI_IMP_TYP','ITM') ;
	c_imp_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_UPRI_IMP_TYP','CST') ;
	c_imp_std_itm CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_UPRI_IMP_TYP','STD_ITM') ;
	c_imp_std_itm_cst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_SLS_UPRI_IMP_TYP','STD_ITM_CST') ;
	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE') ;
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH') ;

	c_mycur VARCHAR := mapa_xchng$f_get_base_cur_cd() ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	l_std_upri_flg CHAR(1) := c_off ;
	l_cst_upri_flg CHAR(1) := c_off ;
	l_itm_upri_flg CHAR(1) := c_off ;

	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE ;
	l_wg_cd mam_wg.wg_cd%TYPE ;
	l_parm mam_sys_parm.parm_val%TYPE ;
	l_co mam_co%ROWTYPE := mapa_co$f_get_co_rec() ;

	l_ins	mgw_imp_itm_sls[] ;
	rec_ins	mgw_imp_itm_sls%ROWTYPE ;
	i INTEGER := 0 ;
	x RECORD ;
BEGIN

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP') ;

	IF i_imp_ope_typ = c_interactive THEN
		/* デフォルトの計算カテゴリＣＤを使い、ワーキンググループＣＤは無視する */
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL) ;
		l_wg_cd := NULL ;
	ELSE
		l_calc_ctg_cd := i_calc_ctg ;
		l_wg_cd := i_wg_cd ;
	END IF ;

	DELETE FROM	mgw_imp_itm_sls w
	WHERE	0=0
	AND	w.calc_ctg_cd = l_calc_ctg_cd
	AND	w.term = i_term
	AND	(l_wg_cd IS NULL OR w.wg_cd = l_wg_cd)
	AND	(i_imp_ope_typ = c_batch
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
			)
		)
	;

	IF i_sls_upri_imp_typ = c_imp_std THEN
		l_std_upri_flg := c_on ;
	ELSIF i_sls_upri_imp_typ = c_imp_itm THEN
		l_itm_upri_flg := c_on ;
	ELSIF i_sls_upri_imp_typ = c_imp_cst THEN
		l_cst_upri_flg := c_on ;
	ELSIF i_sls_upri_imp_typ = c_imp_std_itm THEN
		l_std_upri_flg := c_on ;
		l_itm_upri_flg := c_on ;
	ELSIF i_sls_upri_imp_typ = c_imp_std_itm_cst THEN
		l_std_upri_flg := c_on ;
		l_itm_upri_flg := c_on ;
		l_cst_upri_flg := c_on ;
	ELSE
		l_std_upri_flg := c_on ;
		l_cst_upri_flg := c_on ;
		l_itm_upri_flg := c_on ;
	END IF ;

	/* ＳＣＭのマスタからコピーする */
	FOR x IN
		SELECT
			m01.itm_cd,
			m01.itm_sub1,
			m01.itm_sub2,
			m01.itm_sub3,
			c_null_val AS dpt_cd,
			m01.cst_cd,
			m01.dlv_cd,
			m01.dest_cd1,
			m01.dest_cd2,
			m01.dest_cd3,
			m01.term,
			l_calc_ctg_cd AS calc_ctg_cd,
			m01.wg_cd,
			CASE m01.unit_cd
				WHEN m01.base_unit_cd THEN 1
				ELSE COALESCE(mapa_calc$f_rnd(m02.conv_qty / m02.conv_base_qty, m01.base_unit_dec_place, m01.base_unit_rnd_typ), 1)
			END AS base_qty,
			m01.upri,
			m01.cur_cd,
			m01.prio,
			NULL::NUMERIC AS alc_val1,
			NULL::NUMERIC AS alc_val2,
			NULL::NUMERIC AS alc_val3,
			NULL::NUMERIC AS alc_val4,
			NULL::NUMERIC AS alc_val5,
			m01.memo1 AS rmrks,
			NULL::VARCHAR AS sub_char1,
			NULL::VARCHAR AS sub_char2,
			NULL::VARCHAR AS sub_char3,
			c_off AS non_calc_flg,
			c_off AS imp_err_flg,
			CASE i_imp_ope_typ
				WHEN c_interactive THEN c_on
				ELSE c_off
			END AS imp_flg,
			m01.upri_rate,
			m01.sls_tax_cd,
			m01.sls_tax_rnd_typ,
			m01.inc_tax_flg,
			m01.tax_rate,
			m01.upri_dec_place,
			m01.dt,
			m01.unit_cd,
			m01.sls_upri_rnd_typ
		FROM	(
			SELECT
				m11.itm_cd,
				m11.itm_sub1,
				m11.itm_sub2,
				m11.itm_sub3,
				m11.cst_cd,
				m11.dlv_cd,
				m11.dest_cd1,
				m11.dest_cd2,
				m11.dest_cd3,
				m11.term,
				m11.wg_cd,
				m11.cur_cd,
				m11.upri,
				m11.upri_rate,
				m11.prio,
				m11.memo1,
				m11.sls_tax_cd,
				m11.sls_tax_rnd_typ,
				m11.upri_dec_place,
				m11.unit_cd,
				m11.base_unit_cd,
				m11.base_unit_dec_place,
				m11.base_unit_rnd_typ,
				m11.dt,
				m12.inc_tax_flg,
				m12.tax_rate,
				COALESCE(m13.sls_upri_rnd_typ, c_rndoff) AS sls_upri_rnd_typ,
				ROW_NUMBER() OVER (
					PARTITION BY
						m11.itm_cd,
						m11.itm_sub1,
						m11.itm_sub2,
						m11.itm_sub3,
						m11.cst_cd,
						m11.dlv_cd,
						m11.dest_cd1,
						m11.dest_cd2,
						m11.dest_cd3,
						m11.wg_cd
					ORDER BY
						m11.prio,
						m11.unit_cur_prio,
						m11.base_cur_upri desc nulls last,
						m11.cur_cd,
						m11.unit_cd,
						m11.lot_qty) AS rn
			FROM	(
			/* 得意先販売単価マスタから取得する(品目指定) */
				SELECT
					m21.itm_cd,
					m21.itm_sub1,
					m21.itm_sub2,
					m21.itm_sub3,
					m21.cst_cd,
					m21.dlv_cd,
					m21.dest_cd1,
					m21.dest_cd2,
					m21.dest_cd3,
					m23.term,
					m21.wg_cd,
					m21.cur_cd,
					m21.upri,
					m21.upri_rate,
					m21.lot_qty,
					CASE
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 10
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 20
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 50
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 60
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 90
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 100
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 130
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 140
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 170
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 180
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 210
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 220
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 250
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 260
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 290
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 300
					END AS prio,
					m21.memo1,
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)) AS dt,
					m25.upri_dec_place,
					m21.unit_cd,
					m22.unit_cd AS base_unit_cd,
					m22.dec_place AS base_unit_dec_place,
					m22.rnd_typ AS base_unit_rnd_typ,
					mapa_tax$f_get_sls_tax_cd(
						m21.itm_cd,
						m21.itm_sub1,
						m21.itm_sub2,
						m21.itm_sub3,
						m21.cst_cd,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))) AS sls_tax_cd,
					m24.sls_tax_rnd_typ,
					CASE
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd = m22.unit_cd THEN 1
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd = m22.unit_cd THEN 2
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd <> m22.unit_cd THEN 3
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd <> m22.unit_cd THEN 4
					END AS unit_cur_prio,
					mapa_xchng$f_xchng(
						m21.upri,
						mapa_xchng$f_get_sls_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
						m25.upri_dec_place,
						l_co.xrate_rnd_typ) AS base_cur_upri,
					ROW_NUMBER() OVER (
						PARTITION BY
							m21.itm_cd,
							m21.itm_sub1,
							m21.itm_sub2,
							m21.itm_sub3,
							m21.cst_cd,
							m21.dlv_cd,
							m21.dest_cd1,
							m21.dest_cd2,
							m21.dest_cd3,
							m21.unit_cd,
							m21.lot_qty,
							m21.cur_cd,
							m21.wg_cd
						ORDER BY
							m21.st_dt
					) AS st_dt_rn
				FROM	mam_cst_sls_upri_ m21
					INNER JOIN mam_itm_srch m22 ON
						(0=0
						AND m21.itm_cd = m22.itm_cd
						AND m21.itm_sub1 = m22.itm_sub1
						AND m21.itm_sub2 = m22.itm_sub2
						AND m21.itm_sub3 = m22.itm_sub3
						AND m22.del_flg = c_off
						)
					INNER JOIN mam_term m23 ON (m23.term = i_term)
					INNER JOIN mam_bp m24 ON (m21.cst_cd = m24.bp_cd)
					INNER JOIN mam_cur m25 ON (m21.cur_cd = m25.cur_cd)
				WHERE	0=0
				AND (
					i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
					OR
					i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
					)
				AND m21.del_flg = c_off
				AND m21.sls_upri_grp_cd = c_null_val
				AND l_cst_upri_flg = c_on
				AND m21.not_cost_flg = c_off
				AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
				AND (i_imp_ope_typ = c_batch
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = m21.itm_cd
						AND wk.itm_sub1 = m21.itm_sub1
						AND wk.itm_sub2 = m21.itm_sub2
						AND wk.itm_sub3 = m21.itm_sub3
						AND wk.wg_cd = m21.wg_cd
					)
				)
				UNION ALL
				/* 得意先販売単価マスタから取得する(販売単価分類指定) */
				SELECT
					m22.itm_cd,
					m22.itm_sub1,
					m22.itm_sub2,
					m22.itm_sub3,
					m21.cst_cd,
					m21.dlv_cd,
					m21.dest_cd1,
					m21.dest_cd2,
					m21.dest_cd3,
					m23.term,
					m21.wg_cd,
					m21.cur_cd,
					m21.upri,
					m21.upri_rate,
					m21.lot_qty,
					CASE
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 30
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 40
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 70
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 80
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 110
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 120
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 150
						WHEN m21.dlv_cd <> c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 160
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 190
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 200
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 230
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 <> c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 240
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 270
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 <> c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 280
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 310
						WHEN m21.dlv_cd = c_null_val AND m21.dest_cd1 = c_null_val AND m21.dest_cd2 = c_null_val AND m21.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 320
					END AS prio,
					m21.memo1,
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)) AS dt,
					m25.upri_dec_place,
					m21.unit_cd,
					m22.unit_cd AS base_unit_cd,
					m22.dec_place AS base_unit_dec_place,
					m22.rnd_typ AS base_unit_rnd_typ,
					mapa_tax$f_get_sls_tax_cd(
						m22.itm_cd,
						m22.itm_sub1,
						m22.itm_sub2,
						m22.itm_sub3,
						m21.cst_cd,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))) AS sls_tax_cd,
					COALESCE(m24.sls_tax_rnd_typ, c_rndoff) AS sls_tax_rnd_typ,
					CASE
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd = m22.unit_cd THEN 1
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd = m22.unit_cd THEN 2
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd <> m22.unit_cd THEN 3
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd <> m22.unit_cd THEN 4
					END AS unit_cur_prio,
					mapa_xchng$f_xchng(
						m21.upri,
						mapa_xchng$f_get_sls_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
						m25.upri_dec_place,
						l_co.xrate_rnd_typ) AS base_cur_upri,
					ROW_NUMBER() OVER (
						PARTITION BY
							m22.itm_cd,
							m22.itm_sub1,
							m22.itm_sub2,
							m22.itm_sub3,
							m21.cst_cd,
							m21.dlv_cd,
							m21.dest_cd1,
							m21.dest_cd2,
							m21.dest_cd3,
							m21.unit_cd,
							m21.lot_qty,
							m21.cur_cd,
							m21.wg_cd
						ORDER BY
							m21.st_dt
					) AS st_dt_rn
				FROM	mam_cst_sls_upri_ m21
					INNER JOIN mam_itm_srch m22 ON (m21.sls_upri_grp_cd = m22.sls_upri_grp_cd AND m22.del_flg = c_off)
					INNER JOIN mam_term m23 ON (m23.term = i_term)
					INNER JOIN mam_bp m24 ON (m21.cst_cd = m24.bp_cd)
					INNER JOIN mam_cur m25 ON (m21.cur_cd = m25.cur_cd)
				WHERE	0=0
				AND (
					i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
					OR
					i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
				)
				AND m21.del_flg = c_off
				AND m21.itm_cd = c_null_val
				AND l_cst_upri_flg = c_on
				AND m21.not_cost_flg = c_off
				AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
				AND (i_imp_ope_typ = c_batch
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = m22.itm_cd
						AND wk.itm_sub1 = m22.itm_sub1
						AND wk.itm_sub2 = m22.itm_sub2
						AND wk.itm_sub3 = m22.itm_sub3
						AND wk.wg_cd = m21.wg_cd
					)
				)
				UNION ALL
				/* 品目販売単価マスタから取得する(品目指定) */
				SELECT
					m21.itm_cd,
					m21.itm_sub1,
					m21.itm_sub2,
					m21.itm_sub3,
					COALESCE(m27.cst_cd, c_null_val) AS cst_cd,
					COALESCE(m27.dlv_cd, c_null_val) AS dlv_cd,
					COALESCE(m27.dest_cd1, c_null_val) AS dest_cd1,
					COALESCE(m27.dest_cd2, c_null_val) AS dest_cd2,
					COALESCE(m27.dest_cd3, c_null_val) AS dest_cd3,
					m23.term,
					m21.wg_cd,
					m21.cur_cd,
					m21.upri,
					m21.upri_rate,
					m21.lot_qty,
					CASE
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 330
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 340
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 370
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 380
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 410
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 420
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 450
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 460
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 490
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 500
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 530
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 540
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 570
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 580
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 610
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 620
						WHEN m27.cst_cd IS NULL AND m21.upri IS NOT NULL THEN 650
						WHEN m27.cst_cd IS NULL AND m21.upri IS NULL THEN 660
					END AS prio,
					m21.memo1,
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)) AS dt,
					m25.upri_dec_place,
					m21.unit_cd,
					m22.unit_cd AS base_unit_cd,
					m22.dec_place AS base_unit_dec_place,
					m22.rnd_typ AS base_unit_rnd_typ,
					mapa_tax$f_get_sls_tax_cd(
						m21.itm_cd,
						m21.itm_sub1,
						m21.itm_sub2,
						m21.itm_sub3,
						m27.cst_cd,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))) AS sls_tax_cd,
					COALESCE(m24.sls_tax_rnd_typ, c_rndoff) AS sls_tax_rnd_typ,
					CASE
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd = m22.unit_cd THEN 1
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd = m22.unit_cd THEN 2
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd <> m22.unit_cd THEN 3
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd <> m22.unit_cd THEN 4
					END AS unit_cur_prio,
					mapa_xchng$f_xchng(
						m21.upri,
						mapa_xchng$f_get_sls_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
						m25.upri_dec_place,
						l_co.xrate_rnd_typ) AS base_cur_upri,
					ROW_NUMBER() OVER (
						PARTITION BY
							m21.itm_cd,
							m21.itm_sub1,
							m21.itm_sub2,
							m21.itm_sub3,
							COALESCE(m27.cst_cd, c_null_val),
							COALESCE(m27.dlv_cd, c_null_val),
							COALESCE(m27.dest_cd1, c_null_val),
							COALESCE(m27.dest_cd2, c_null_val),
							COALESCE(m27.dest_cd3, c_null_val),
							m21.unit_cd,
							m21.lot_qty,
							m21.cur_cd,
							m21.wg_cd
						ORDER BY
							m21.st_dt
					) AS st_dt_rn
				FROM	mam_itm_sls_upri_ m21
					INNER JOIN mam_itm_srch m22 ON
						(0=0
						AND m21.itm_cd = m22.itm_cd
						AND m21.itm_sub1 = m22.itm_sub1
						AND m21.itm_sub2 = m22.itm_sub2
						AND m21.itm_sub3 = m22.itm_sub3
						AND m22.del_flg = c_off
						)
					INNER JOIN mam_term m23 ON (m23.term = i_term)
					INNER JOIN mam_cur m25 ON (m21.cur_cd = m25.cur_cd)
					LEFT OUTER JOIN mam_cst_sls_upri_rank m27 ON
						(0=0
						AND m21.sls_upri_rank_cd = m27.sls_upri_rank_cd
						AND fcpa_postgres_util$greatest(i_term, m21.st_dt) BETWEEN m27.st_dt AND m27.end_dt
						)
					LEFT OUTER JOIN mam_bp m24 ON (m27.cst_cd = m24.bp_cd)
				WHERE	0=0
				AND (
					i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
					OR
					i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
					)
				AND m21.del_flg = c_off
				AND m21.sls_upri_grp_cd = c_null_val
				AND l_itm_upri_flg = c_on
				AND m21.not_cost_flg = c_off
				AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
				AND (i_imp_ope_typ = c_batch
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = m21.itm_cd
						AND wk.itm_sub1 = m21.itm_sub1
						AND wk.itm_sub2 = m21.itm_sub2
						AND wk.itm_sub3 = m21.itm_sub3
						AND wk.wg_cd = m21.wg_cd
					)
				)
				UNION ALL
				/* 品目販売単価マスタから取得する(販売単価分類指定) */
				SELECT
					m22.itm_cd,
					m22.itm_sub1,
					m22.itm_sub2,
					m22.itm_sub3,
					COALESCE(m27.cst_cd, c_null_val) AS cst_cd,
					COALESCE(m27.dlv_cd, c_null_val) AS dlv_cd,
					COALESCE(m27.dest_cd1, c_null_val) AS dest_cd1,
					COALESCE(m27.dest_cd2, c_null_val) AS dest_cd2,
					COALESCE(m27.dest_cd3, c_null_val) AS dest_cd3,
					m23.term,
					m21.wg_cd,
					m21.cur_cd,
					m21.upri,
					m21.upri_rate,
					m21.lot_qty,
					CASE
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 350
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 360
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 390
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 400
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 430
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 440
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 470
						WHEN m27.dlv_cd <> c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 480
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NOT NULL THEN 510
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 <> c_null_val AND m21.upri IS NULL THEN 520
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 550
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 <> c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 560
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 590
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 <> c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 600
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NOT NULL THEN 630
						WHEN m27.dlv_cd = c_null_val AND m27.dest_cd1 = c_null_val AND m27.dest_cd2 = c_null_val AND m27.dest_cd3 = c_null_val AND m21.upri IS NULL THEN 640
						WHEN m27.cst_cd IS NULL AND m21.upri IS NOT NULL THEN 670
						WHEN m27.cst_cd IS NULL AND m21.upri IS NULL THEN 680
					END AS prio,
					m21.memo1,
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)) AS dt,
					m25.upri_dec_place,
					m21.unit_cd,
					m22.unit_cd AS base_unit_cd,
					m22.dec_place AS base_unit_dec_place,
					m22.rnd_typ AS base_unit_rnd_typ,
					mapa_tax$f_get_sls_tax_cd(
						m22.itm_cd,
						m22.itm_sub1,
						m22.itm_sub2,
						m22.itm_sub3,
						m27.cst_cd,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))) AS sls_tax_cd,
					COALESCE(m24.sls_tax_rnd_typ, c_rndoff) AS sls_tax_rnd_typ,
					CASE
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd = m22.unit_cd THEN 1
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd = m22.unit_cd THEN 2
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd <> m22.unit_cd THEN 3
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd <> m22.unit_cd THEN 4
					END AS unit_cur_prio,
					mapa_xchng$f_xchng(
						m21.upri,
						mapa_xchng$f_get_sls_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
						m25.upri_dec_place,
						l_co.xrate_rnd_typ) AS base_cur_upri,
					ROW_NUMBER() OVER (
						PARTITION BY
							m22.itm_cd,
							m22.itm_sub1,
							m22.itm_sub2,
							m22.itm_sub3,
							COALESCE(m27.cst_cd, c_null_val),
							COALESCE(m27.dlv_cd, c_null_val),
							COALESCE(m27.dest_cd1, c_null_val),
							COALESCE(m27.dest_cd2, c_null_val),
							COALESCE(m27.dest_cd3, c_null_val),
							m21.unit_cd,
							m21.lot_qty,
							m21.cur_cd,
							m21.wg_cd
						ORDER BY
							m21.st_dt
					) AS st_dt_rn
				FROM	mam_itm_sls_upri_ m21
					INNER JOIN mam_itm_srch m22 ON (m21.sls_upri_grp_cd = m22.sls_upri_grp_cd AND m22.del_flg = c_off)
					INNER JOIN mam_term m23 ON (m23.term = i_term)
					INNER JOIN mam_cur m25 ON (m21.cur_cd = m25.cur_cd)
					LEFT OUTER JOIN mam_cst_sls_upri_rank m27 ON
						(0=0
						AND m21.sls_upri_rank_cd = m27.sls_upri_rank_cd
						AND fcpa_postgres_util$greatest(i_term, m21.st_dt) BETWEEN m27.st_dt AND m27.end_dt
						)
					LEFT OUTER JOIN mam_bp m24 ON (m24.bp_cd = m27.cst_cd)
				WHERE	0=0
				AND (
					i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
					OR
					i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
				)
				AND m21.del_flg = c_off
				AND m21.itm_cd = c_null_val
				AND l_itm_upri_flg = c_on
				AND m21.not_cost_flg = c_off
				AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
				AND (i_imp_ope_typ = c_batch
					OR EXISTS (
						SELECT	'X'
						FROM	mgw_imp_interactive_key wk
						WHERE	0=0
						AND wk.itm_cd = m22.itm_cd
						AND wk.itm_sub1 = m22.itm_sub1
						AND wk.itm_sub2 = m22.itm_sub2
						AND wk.itm_sub3 = m22.itm_sub3
						AND wk.wg_cd = m21.wg_cd
					)
				)
				UNION ALL
				/* 標準販売単価マスタから取得する */
				SELECT
					m21.itm_cd,
					m21.itm_sub1,
					m21.itm_sub2,
					m21.itm_sub3,
					c_null_val AS cst_cd,
					c_null_val AS dlv_cd,
					c_null_val AS dest_cd1,
					c_null_val AS dest_cd2,
					c_null_val AS dest_cd3,
					m23.term,
					m21.wg_cd,
					m21.cur_cd,
					m21.upri,
					NULL AS upri_rate,
					m21.lot_qty,
					690 AS prio,
					m21.memo1,
					COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt)) AS dt,
					m25.upri_dec_place,
					m21.unit_cd,
					m22.unit_cd AS base_unit_cd,
					m22.dec_place AS base_unit_dec_place,
					m22.rnd_typ AS base_unit_rnd_typ,
					mapa_tax$f_get_sls_tax_cd(
						m21.itm_cd,
						m21.itm_sub1,
						m21.itm_sub2,
						m21.itm_sub3,
						NULL,
						COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))) AS sls_tax_cd,
					c_rndoff AS sls_tax_rnd_typ,
					CASE
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd = m22.unit_cd THEN 1
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd = m22.unit_cd THEN 2
						WHEN m21.cur_cd = c_mycur AND m21.unit_cd <> m22.unit_cd THEN 3
						WHEN m21.cur_cd <> c_mycur AND m21.unit_cd <> m22.unit_cd THEN 4
					END AS unit_cur_prio,
					mapa_xchng$f_xchng(
						m21.upri,
						mapa_xchng$f_get_sls_xrate_ne(m21.cur_cd, COALESCE(i_dt, fcpa_postgres_util$greatest(m23.term, m21.st_dt))),
						m25.upri_dec_place,
						l_co.xrate_rnd_typ) AS base_cur_upri,
					ROW_NUMBER() OVER (
						PARTITION BY
							m21.itm_cd,
							m21.itm_sub1,
							m21.itm_sub2,
							m21.itm_sub3,
							m21.unit_cd,
							m21.lot_qty,
							m21.cur_cd,
							m21.wg_cd
						ORDER BY
							m21.st_dt
					) AS st_dt_rn
					FROM	mam_std_sls_upri_ m21
						INNER JOIN mam_itm_srch m22 ON
							(0=0
							AND m21.itm_cd = m22.itm_cd
							AND m21.itm_sub1 = m22.itm_sub1
							AND m21.itm_sub2 = m22.itm_sub2
							AND m21.itm_sub3 = m22.itm_sub3
							AND m22.del_flg = c_off
							)
						INNER JOIN mam_term m23 ON (m23.term = i_term)
						INNER JOIN mam_cur m25 ON (m21.cur_cd = m25.cur_cd)
					WHERE	0=0
					AND (
						i_dt IS NOT NULL AND m21.st_dt <= i_dt AND m21.end_dt >= i_dt
						OR
						i_dt IS NULL AND m21.st_dt < m23.term_end_ym AND m21.end_dt >= m23.term
						)
					AND m21.del_flg = c_off
					AND l_std_upri_flg = c_on
					AND m21.not_cost_flg = c_off
					AND (l_wg_cd IS NULL OR m21.wg_cd = l_wg_cd)
					AND (i_imp_ope_typ = c_batch
						OR EXISTS (
							SELECT	'X'
							FROM	mgw_imp_interactive_key wk
							WHERE	0=0
							AND wk.itm_cd = m21.itm_cd
							AND wk.itm_sub1 = m21.itm_sub1
							AND wk.itm_sub2 = m21.itm_sub2
							AND wk.itm_sub3 = m21.itm_sub3
							AND wk.wg_cd = m21.wg_cd
						)
					)
				) m11
				INNER JOIN mam_tax m12 ON (m11.sls_tax_cd = m12.tax_cd)
				LEFT OUTER JOIN mam_bp m13 ON (m11.cst_cd = m13.bp_cd)
			WHERE	0=0
			AND m11.st_dt_rn = 1
			) m01
			INNER JOIN mavm_itm_unit m02 ON
				(0=0
				AND m01.itm_cd = m02.itm_cd
				AND m01.itm_sub1 = m02.itm_sub1
				AND m01.itm_sub2 = m02.itm_sub2
				AND m01.itm_sub3 = m02.itm_sub3
				AND m01.unit_cd = m02.unit_cd
				)
		WHERE	0=0
		AND m01.rn = 1
		ORDER BY
			m01.itm_cd, m01.itm_sub1, m01.itm_sub2, m01.itm_sub3,
			m01.cst_cd, m01.dlv_cd, m01.dest_cd1, m01.dest_cd2, m01.dest_cd3
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			IF x.upri_rate IS NOT NULL AND x.upri IS NULL THEN
				/* 掛率の計算 */
				BEGIN
					SELECT	mapa_calc$f_rnd(x.upri_rate / 100 * m11s.upri, x.upri_dec_place, x.sls_upri_rnd_typ)
					INTO	STRICT x.upri
					FROM	(
						SELECT
							m21s.*,
							ROW_NUMBER() OVER (
								PARTITION BY
									m21s.itm_cd,
									m21s.itm_sub1,
									m21s.itm_sub2,
									m21s.itm_sub3,
									m21s.unit_cd,
									m21s.cur_cd,
									m21s.st_dt
								ORDER BY
									CASE m21s.wg_cd WHEN c_null_val THEN 2 ELSE 1 END, m21s.lot_qty) AS rn
						FROM	mam_std_sls_upri_ m21s
						WHERE	0=0
						AND	m21s.itm_cd = x.itm_cd
						AND	m21s.itm_sub1 = x.itm_sub1
						AND	m21s.itm_sub2 = x.itm_sub2
						AND	m21s.itm_sub3 = x.itm_sub3
						AND	m21s.unit_cd = x.unit_cd
						AND	m21s.cur_cd = x.cur_cd
						AND	m21s.wg_cd IN (x.wg_cd, c_null_val)
						AND	m21s.st_dt <= x.dt
						AND	m21s.end_dt >= x.dt
						AND	m21s.not_cost_flg = c_off
						AND	m21s.del_flg = c_off
						) m11s
					WHERE	0=0
					AND m11s.rn = 1 ;
				EXCEPTION
					WHEN no_data_found THEN
						/* 掛率が指定されていますが、標準販売単価マスタまたは通貨マスタが取得できません。 */
						/* 販売単価を取り込みません。品目：{1}得意先：{2}納品先：{3}通貨：{4} */
						CALL fcpa_batch_log$p_data_log('MGBDD0051', l_log_no, l_log_sub_key1, l_log_sub_key2,
							mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
							x.cst_cd,
							x.dlv_cd,
							x.cur_cd) ;

						o_err_flg := c_on ;
						EXIT NEXT_LOOP ;
				END ;
			END IF ;

			i := i + 1 ;

			rec_ins.itm_cd := x.itm_cd ;
			rec_ins.itm_sub1 := x.itm_sub1 ;
			rec_ins.itm_sub2 := x.itm_sub2 ;
			rec_ins.itm_sub3 := x.itm_sub3 ;
			rec_ins.dpt_cd := x.dpt_cd ;
			rec_ins.cst_cd := x.cst_cd ;
			rec_ins.dlv_cd := x.dlv_cd ;
			rec_ins.dest_cd1 := x.dest_cd1 ;
			rec_ins.dest_cd2 := x.dest_cd2 ;
			rec_ins.dest_cd3 := x.dest_cd3 ;
			rec_ins.term := x.term ;
			rec_ins.calc_ctg_cd := x.calc_ctg_cd ;
			rec_ins.wg_cd := x.wg_cd ;
			rec_ins.base_qty := x.base_qty ;
			rec_ins.cur_cd := x.cur_cd ;
			rec_ins.upri := x.upri ;
			rec_ins.prio := x.prio ;
			rec_ins.alc_val1 := x.alc_val1 ;
			rec_ins.alc_val2 := x.alc_val2 ;
			rec_ins.alc_val3 := x.alc_val3 ;
			rec_ins.alc_val4 := x.alc_val4 ;
			rec_ins.alc_val5 := x.alc_val5 ;
			rec_ins.rmrks := x.rmrks ;
			rec_ins.sub_char1 := x.sub_char1 ;
			rec_ins.sub_char2 := x.sub_char2 ;
			rec_ins.sub_char3 := x.sub_char3 ;
			rec_ins.non_calc_flg := x.non_calc_flg ;
			rec_ins.imp_err_flg := x.imp_err_flg ;
			rec_ins.imp_flg := x.imp_flg ;

			/* 税込単価の場合は税抜単価に換算する */
			IF x.upri <> 0 AND x.inc_tax_flg = c_on THEN
				rec_ins.upri := COALESCE(
					mapa_amt$f_get_exc_tax_amt(
						x.upri,
						1,
						x.sls_tax_rnd_typ,
						x.sls_tax_rnd_typ,
						x.upri_dec_place,
						'1',
						x.tax_rate,
						0)
					, x.upri) ;
			END IF ;
			l_ins[i] := rec_ins ;

			IF i > c_max_cnt THEN
				INSERT INTO mgw_imp_itm_sls SELECT * FROM UNNEST(l_ins) ;
				l_ins := '{}' ;
				i := 0 ;
			END IF ;

		END ;

	END LOOP ;

	IF i > 0 THEN
		INSERT INTO mgw_imp_itm_sls SELECT * FROM UNNEST(l_ins) ;
		l_ins := '{}' ;
	END IF ;

	l_ins := '{}' ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_sls$p_imp_mgt_main (
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR,
	IN i_usr VARCHAR,
	INOUT o_err_flg CHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目販売)
<REMARKS>
		取込メイン処理用プロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<IN>	I_USR
		ユーザＩＤ
<INOUT>	O_ERR_FLG
		エラーフラグ
<HISTORY>
**********************************************************/
DECLARE
	i INTEGER := 0 ;
	k INTEGER := 0 ;
	l_chk_flg CHAR(1) ;
	l_parm mam_sys_parm.parm_val%TYPE ;
	l_calc_ctg_cd mam_calc_ctg.calc_ctg_cd%TYPE ;
	j RECORD ;
	l RECORD ;
	z RECORD ;
	x RECORD ;
	y RECORD ;

	l_log_no fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1 fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2 fct_batch_log_msg.log_sub_key2%TYPE ;

	c_max_cnt CONSTANT INTEGER := 50000 ; /* バルクインサートでの最大レコード数 */
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_interactive CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','INTERACTIVE') ;
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH') ;
BEGIN

	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_sls$p_imp_mgt_main$l_imp', 'mgw_imp_itm_sls', 'integer') ;
	CALL fcpa_postgres_util$type_is_table_row('mgpa_imp_itm_sls$p_imp_mgt_main$l_imp_tmp', 'mgw_imp_itm_sls', 'integer') ;

	l_parm := mapa_comm$f_get_parm('ITM_SUB_TYP') ;

	/* 個別取込ならデフォルトの計算カテゴリＣＤを使う */
	/* 通常取込なら無視する */
	IF i_imp_ope_typ = c_interactive THEN
		l_calc_ctg_cd := mgpa_co_parm$f_get_calc_ctg_cd(NULL) ;
	ELSE
		l_calc_ctg_cd := NULL ;
	END IF ;

	FOR z IN
		SELECT
			t.*,
			m.asset_mng_typ AS asset_mng_typ
		FROM	(
			SELECT DISTINCT
				w.itm_cd,
				w.itm_sub1,
				w.itm_sub2,
				w.itm_sub3
			FROM	mgw_imp_itm_sls w
			WHERE	0=0
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term
			AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd)
			AND (i_imp_ope_typ = c_batch
					AND w.upd_srv_req_no = fcpa_context$f_get_processid()
				OR EXISTS (
					SELECT	'X'
					FROM	mgw_imp_interactive_key wk
					WHERE	0=0
					AND wk.itm_cd = w.itm_cd
					AND wk.itm_sub1 = w.itm_sub1
					AND wk.itm_sub2 = w.itm_sub2
					AND wk.itm_sub3 = w.itm_sub3
					AND wk.wg_cd = w.wg_cd
				)
			)
		) t
		LEFT OUTER JOIN mam_itm_srch m ON
			(0=0
			AND t.itm_cd = m.itm_cd
			AND t.itm_sub1 = m.itm_sub1
			AND t.itm_sub2 = m.itm_sub2
			AND t.itm_sub3 = m.itm_sub3
			AND m.del_flg = c_off
			)
		WHERE	0=0
	LOOP
		/* 品目チェック処理、エラーとなった品目と同じ品目のワークのデータは全件をエラーとして、取り込まない */
		IF z.asset_mng_typ IS NULL THEN
			/* 品目マスタに有効な品目として登録されていません。品目：{1} */
			CALL fcpa_batch_log$p_data_log('MGBDD0023', l_log_no, l_log_sub_key1, l_log_sub_key2,
				mapa_comm$f_to_disp_itm(z.itm_cd, z.itm_sub1, z.itm_sub2, z.itm_sub3, l_parm)) ;
		
			UPDATE mgw_imp_itm_sls w
			SET imp_err_flg = c_on
			WHERE	0=0
			AND w.itm_cd = z.itm_cd
			AND w.itm_sub1 = z.itm_sub1
			AND w.itm_sub2 = z.itm_sub2
			AND w.itm_sub3 = z.itm_sub3
			AND w.imp_flg = c_on
			AND w.upd_usr_id = i_usr
			AND w.term = i_term
			;
		
			o_err_flg := c_on ;

		END IF ;
	END LOOP ;

	FOR x IN
		SELECT DISTINCT
			w.itm_cd,
			w.itm_sub1,
			w.itm_sub2,
			w.itm_sub3,
			w.wg_cd,
			w.term,
			w.calc_ctg_cd
		FROM	mgw_imp_itm_sls w
		WHERE	0=0
		AND w.imp_flg = c_on
		AND w.imp_err_flg = c_off
		AND w.upd_usr_id = i_usr
		AND w.term = i_term
		AND (l_calc_ctg_cd IS NULL OR w.calc_ctg_cd = l_calc_ctg_cd)
		AND (i_imp_ope_typ = c_batch
				AND w.upd_srv_req_no = fcpa_context$f_get_processid()
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
			)
		)
	LOOP
		<<NEXT_LOOP>>
		BEGIN
			k := 0 ;
			FOR y IN
				SELECT
					w.itm_cd,
					w.itm_sub1,
					w.itm_sub2,
					w.itm_sub3,
					w.dpt_cd,
					w.cst_cd,
					w.dlv_cd,
					w.dest_cd1,
					w.dest_cd2,
					w.dest_cd3,
					w.term,
					w.calc_ctg_cd,
					w.wg_cd,
					w.base_qty,
					w.cur_cd,
					w.upri,
					w.prio,
					w.alc_val1,
					w.alc_val2,
					w.alc_val3,
					w.alc_val4,
					w.alc_val5,
					w.rmrks,
					w.sub_char1,
					w.sub_char2,
					w.sub_char3,
					w.non_calc_flg,
					w.imp_err_flg,
					w.imp_flg,
					m1.dpt_cd AS cost_dpt_cd,
					m2.bp_cd AS cst_bp_cd,
					m3.bp_cd AS dlv_bp_cd,
					m4.bp_cd AS dest_cd1_bp_cd,
					m5.bp_cd AS dest_cd2_bp_cd,
					m6.bp_cd AS dest_cd3_bp_cd
				FROM	mgw_imp_itm_sls AS w
				LEFT OUTER JOIN mam_cost_dpt AS m1 ON (w.dpt_cd = m1.dpt_cd AND w.term = m1.term)
				LEFT OUTER JOIN mam_bp AS m2 ON (w.cst_cd = m2.bp_cd)
				LEFT OUTER JOIN mam_bp AS m3 ON (w.dlv_cd = m3.bp_cd)
				LEFT OUTER JOIN mam_bp AS m4 ON (w.dest_cd1 = m4.bp_cd)
				LEFT OUTER JOIN mam_bp AS m5 ON (w.dest_cd2 = m5.bp_cd)
				LEFT OUTER JOIN mam_bp AS m6 ON (w.dest_cd3 = m6.bp_cd)
				WHERE	0=0
				AND w.itm_cd = x.itm_cd
				AND w.itm_sub1 = x.itm_sub1
				AND w.itm_sub2 = x.itm_sub2
				AND w.itm_sub3 = x.itm_sub3
				AND w.wg_cd = x.wg_cd
				AND w.term = x.term
				AND w.calc_ctg_cd = x.calc_ctg_cd
				AND w.upd_usr_id = i_usr
				AND w.imp_flg = c_on
			LOOP
				l_chk_flg := c_off ;
				/* 取込対象データのチェック、品目、ワーキンググループ、期、計算カテゴリ、ユーザ単位でチェックする */
				IF y.base_qty <= 0 THEN
					/* 基準数には正の数字を設定してください。 */
					/* 品目：{1} ワーキンググループ：{2} 期：{3} 計算カテゴリ：{4} 基準数：{5} */
					CALL fcpa_batch_log$p_data_log('MGBDD0037', l_log_no, l_log_sub_key1, l_log_sub_key2,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm),
						x.wg_cd,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m()),
						x.calc_ctg_cd,
						y.base_qty::VARCHAR
						) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.dpt_cd <> c_null_val AND y.cost_dpt_cd IS NULL THEN
					/* 原価部門マスタに登録されていません。部門：{1} */
					CALL fcpa_batch_log$p_data_log('MGBXD0041', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.dpt_cd,
						fcpa_date_util$f_to_char(x.term, fcpa_date_util$y4m())) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.cst_cd <> c_null_val AND y.cst_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。得意先：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0061', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.cst_cd) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.dlv_cd <> c_null_val AND y.dlv_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。納品先：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0062', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.dlv_cd) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.dest_cd1 <> c_null_val AND y.dest_cd1_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先１：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0063', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.dest_cd1) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.dest_cd2 <> c_null_val AND y.dest_cd2_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先２：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0064', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.dest_cd2) ;
					l_chk_flg := c_on ;
				END IF ;

				IF y.dest_cd3 <> c_null_val AND y.dest_cd3_bp_cd IS NULL THEN
					/* 取引先マスタに有効な取引先として登録されていません。仕向先３：{1} */
					CALL fcpa_batch_log$p_data_log('MGBDD0065', l_log_no, l_log_sub_key1, l_log_sub_key2,
						y.dest_cd3) ;
					l_chk_flg := c_on ;
				END IF ;

				IF l_chk_flg = c_on THEN
					UPDATE mgw_imp_itm_sls w
					SET imp_err_flg = c_on
					WHERE	0=0
					AND w.itm_cd = x.itm_cd
					AND w.itm_sub1 = x.itm_sub1
					AND w.itm_sub2 = x.itm_sub2
					AND w.itm_sub3 = x.itm_sub3
					AND w.wg_cd = x.wg_cd
					AND w.term = x.Term
					AND w.calc_ctg_cd = x.calc_ctg_cd
					AND w.upd_usr_id = i_usr
					;
				
					o_err_flg := c_on ;

					EXIT NEXT_LOOP ;
				END IF ;

				k := k + 1 ;
				INSERT INTO mgpa_imp_itm_sls$p_imp_mgt_main$l_imp_tmp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					dpt_cd,
					cst_cd,
					dlv_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					term,
					calc_ctg_cd,
					wg_cd,
					base_qty,
					cur_cd,
					upri,
					prio,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
				)
				VALUES
				(
					y.itm_cd,
					y.itm_sub1,
					y.itm_sub2,
					y.itm_sub3,
					y.dpt_cd,
					y.cst_cd,
					y.dlv_cd,
					y.dest_cd1,
					y.dest_cd2,
					y.dest_cd3,
					y.term,
					y.calc_ctg_cd,
					y.wg_cd,
					y.base_qty,
					y.cur_cd,
					y.upri,
					y.prio,
					y.alc_val1,
					y.alc_val2,
					y.alc_val3,
					y.alc_val4,
					y.alc_val5,
					y.rmrks,
					y.sub_char1,
					y.sub_char2,
					y.sub_char3,
					y.non_calc_flg,
					k
				) ;
			
			END LOOP ;

			FOR l IN
				SELECT * FROM mgpa_imp_itm_sls$p_imp_mgt_main$l_imp_tmp ORDER BY _index_ ASC
			LOOP
				i := i + 1 ;
				INSERT INTO mgpa_imp_itm_sls$p_imp_mgt_main$l_imp (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					dpt_cd,
					cst_cd,
					dlv_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					term,
					calc_ctg_cd,
					wg_cd,
					base_qty,
					cur_cd,
					upri,
					prio,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg,
					_index_
				)
				VALUES
				(
					l.itm_cd,
					l.itm_sub1,
					l.itm_sub2,
					l.itm_sub3,
					l.dpt_cd,
					l.cst_cd,
					l.dlv_cd,
					l.dest_cd1,
					l.dest_cd2,
					l.dest_cd3,
					l.term,
					l.calc_ctg_cd,
					l.wg_cd,
					l.base_qty,
					l.cur_cd,
					l.upri,
					l.prio,
					l.alc_val1,
					l.alc_val2,
					l.alc_val3,
					l.alc_val4,
					l.alc_val5,
					l.rmrks,
					l.sub_char1,
					l.sub_char2,
					l.sub_char3,
					l.non_calc_flg,
					i
				) ;
			END LOOP ;

			IF i > c_max_cnt THEN
				FOR j IN
					SELECT * FROM mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
				LOOP
					DELETE FROM mgt_itm_sls m
					WHERE	0=0
					AND	m.itm_cd = j.itm_cd
					AND	m.itm_sub1 = j.itm_sub1
					AND	m.itm_sub2 = j.itm_sub2
					AND	m.itm_sub3 = j.itm_sub3
					AND	m.term = j.term
					AND	m.calc_ctg_cd = j.calc_ctg_cd
					AND	m.wg_cd = j.wg_cd
					;
				END LOOP ;
			
				INSERT INTO mgt_itm_sls (
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					dpt_cd,
					cst_cd,
					dlv_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					term,
					calc_ctg_cd,
					wg_cd,
					base_qty,
					cur_cd,
					upri,
					prio,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
				)
				SELECT
					itm_cd,
					itm_sub1,
					itm_sub2,
					itm_sub3,
					dpt_cd,
					cst_cd,
					dlv_cd,
					dest_cd1,
					dest_cd2,
					dest_cd3,
					term,
					calc_ctg_cd,
					wg_cd,
					base_qty,
					cur_cd,
					upri,
					prio,
					alc_val1,
					alc_val2,
					alc_val3,
					alc_val4,
					alc_val5,
					rmrks,
					sub_char1,
					sub_char2,
					sub_char3,
					non_calc_flg
				FROM
					mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ;
			
				TRUNCATE TABLE mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ;
			
				i := 0 ;
			END IF ;

		END ;
		TRUNCATE TABLE mgpa_imp_itm_sls$p_imp_mgt_main$l_imp_tmp ;
	END LOOP ;

	IF i > 0 THEN
		FOR j IN
			SELECT * FROM mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ORDER BY _index_ ASC
		LOOP
			DELETE FROM mgt_itm_sls m
			WHERE	0=0
			AND	m.itm_cd = j.itm_cd
			AND	m.itm_sub1 = j.itm_sub1
			AND	m.itm_sub2 = j.itm_sub2
			AND	m.itm_sub3 = j.itm_sub3
			AND	m.term = j.term
			AND	m.calc_ctg_cd = j.calc_ctg_cd
			AND	m.wg_cd = j.wg_cd
			;
		END LOOP ;
		
		INSERT INTO mgt_itm_sls (
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			dpt_cd,
			cst_cd,
			dlv_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			term,
			calc_ctg_cd,
			wg_cd,
			base_qty,
			cur_cd,
			upri,
			prio,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
		)
		SELECT
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			dpt_cd,
			cst_cd,
			dlv_cd,
			dest_cd1,
			dest_cd2,
			dest_cd3,
			term,
			calc_ctg_cd,
			wg_cd,
			base_qty,
			cur_cd,
			upri,
			prio,
			alc_val1,
			alc_val2,
			alc_val3,
			alc_val4,
			alc_val5,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg
		FROM
			mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ;
	
		TRUNCATE TABLE mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ;
	END IF ;

	TRUNCATE TABLE mgpa_imp_itm_sls$p_imp_mgt_main$l_imp_tmp ;
	TRUNCATE TABLE mgpa_imp_itm_sls$p_imp_mgt_main$l_imp ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_sls$p_ins_mgw (
	IN i_calc_ctg VARCHAR,
	IN i_wg_cd VARCHAR,
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE,
	IN i_sls_upri_imp_typ VARCHAR,
	IN i_imp_ope_typ VARCHAR DEFAULT '2'
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		品目販売マスタ用のデータをコピー用ワークテーブルに作成する
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_CALC_CTG
		計算カテゴリＣＤ
<IN>	I_WG_CD
		ワーキンググループＣＤ
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<IN>	I_SLS_UPRI_IMP_TYP
		販売単価取込区分
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	l_calc_ctg mam_calc_ctg.calc_ctg_cd%TYPE ;
	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	l_err_flg CHAR(1) ;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_SLS.P_INS_MGW') ;

	l_calc_ctg := mgpa_co_parm$f_get_calc_ctg_cd(i_calc_ctg) ;

	l_err_flg := c_off ;

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_sls$p_ins_mgw_main(l_calc_ctg, i_wg_cd, i_term, i_dt, i_sls_upri_imp_typ, i_imp_ope_typ, l_err_flg) ;

	IF l_err_flg = c_on THEN
		COMMIT ;
		CALL fcpa_err$raise_app_err('MGBDD0058') ;
	END IF ;

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_SLS.P_INS_MGW') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_sls$p_imp_mgt (
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_imp_ope_typ VARCHAR DEFAULT '2'
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目販売)
<REMARKS>
		メイン処理を起動するプロシージャ
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_IMP_OPE_TYP
		マスタ取込処理区分
<HISTORY>
**********************************************************/
DECLARE
	l_err_flg CHAR(1) ;
	l_usr mgw_imp_itm_sls.upd_usr_id%TYPE ;

	c_off CONSTANT CHAR(1) := '0' ;
	c_on CONSTANT CHAR(1) := '1' ;
	c_batch CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_IMP_OPE_TYP','BATCH') ;
BEGIN
	/* 処理を開始しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IMP_ITM_SLS.P_IMP_MGT') ;

	l_usr := fcpa_context$f_get_userid() ;

	l_err_flg := c_off ;

	/* メイン処理の起動 */
	CALL mgpa_imp_itm_sls$p_imp_mgt_main(i_term, i_imp_ope_typ, l_usr, l_err_flg) ;

	/* エラーデータ以外は削除 */
	DELETE FROM	mgw_imp_itm_sls w
	WHERE	0=0
	AND w.imp_flg = c_on
	AND w.imp_err_flg = c_off
	AND w.upd_usr_id = l_usr
	AND w.term = i_term
	AND (i_imp_ope_typ = c_batch
			AND w.upd_srv_req_no = fcpa_context$f_get_processid()
		OR EXISTS (
			SELECT	'X'
			FROM	mgw_imp_interactive_key wk
			WHERE	0=0
			AND wk.itm_cd = w.itm_cd
			AND wk.itm_sub1 = w.itm_sub1
			AND wk.itm_sub2 = w.itm_sub2
			AND wk.itm_sub3 = w.itm_sub3
			AND wk.wg_cd = w.wg_cd
			)
		)
	;

	IF l_err_flg = c_on THEN
		UPDATE mgw_imp_itm_sls w
		SET imp_flg = c_off
		WHERE	0=0
		AND w.imp_flg = c_on
		AND w.imp_err_flg = c_on
		AND w.upd_usr_id = l_usr
		AND w.term = i_term
		AND (i_imp_ope_typ = c_batch
				AND w.upd_srv_req_no = fcpa_context$f_get_processid()
			OR EXISTS (
				SELECT	'X'
				FROM	mgw_imp_interactive_key wk
				WHERE	0=0
				AND wk.itm_cd = w.itm_cd
				AND wk.itm_sub1 = w.itm_sub1
				AND wk.itm_sub2 = w.itm_sub2
				AND wk.itm_sub3 = w.itm_sub3
				AND wk.wg_cd = w.wg_cd
				)
			)
		;
	
		COMMIT ;
		CALL fcpa_err$raise_app_err('MGBDD0057') ;
	END IF ;

	/* 処理が終了しました。 */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IMP_ITM_SLS.P_IMP_MGT') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_imp_itm_sls$p_set_key (
	IN i_term TIMESTAMP WITHOUT TIME ZONE,
	IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
		取り込み処理を実行するためのワークテーブルを作成する
<REMARKS>
		MAW_IMP_ITMをもとにMGW_IMP_INTERACTIVE_KEYを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_DT
		対象日
<HISTORY>
**********************************************************/
DECLARE
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
BEGIN
	DELETE FROM	mgw_imp_interactive_key ;

	INSERT INTO mgw_imp_interactive_key (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		wg_cd
		)
	SELECT DISTINCT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		c_null_val
	FROM	maw_imp_itm x
	WHERE	0=0
	;

	INSERT INTO mgw_imp_interactive_key (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3,
		wg_cd
	)
	SELECT DISTINCT
		x.itm_cd,
		x.itm_sub1,
		x.itm_sub2,
		x.itm_sub3,
		m.wg_cd
	FROM	maw_imp_itm x, mam_wg m
	WHERE	0=0
	AND m.sls_flg = '1'
	;

END ;
$BODY$
LANGUAGE plpgsql
;
