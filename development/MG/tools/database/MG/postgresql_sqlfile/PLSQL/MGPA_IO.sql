\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_io$p_main(
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR DEFAULT NULL
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	受払表データ作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_wg_cd
		ワーキンググループＣＤ
<HISTORY>
**************************************************************************/
DECLARE
	c_eval_month_ave	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','MONTH_AVE');
	c_eval_term_ave	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','TERM_AVE');
	c_eval_std_unit	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','STD_UNIT');
	c_unit_calc_non	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','NON');
	c_unit_calc_calc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','CALC');
	c_expns_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD');
	c_calc_rec_st_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_STK');
	c_calc_rec_purc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','PURC');
	c_calc_rec_comp	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','COMP');
	c_calc_rec_io	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','IO');
	c_calc_rec_inpt	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INPT');
	c_calc_rec_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','SLS');
	c_calc_rec_end_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK');
	c_calc_rec_ave	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','AVE');
	c_calc_rec_gp_alc	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','GP_ALC');
	c_cost_io_ffr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','FFR_PROV');
	c_cost_io_onr_prov	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','ONR_PROV');
	c_cost_io_stk_in	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_cost_io_stk_out	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');
	c_cost_io_stk_io	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IO');
	c_ac_slip_prod_itm_so	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','PROD_ITM_SO');
	c_ac_slip_ship	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP');
	c_ac_slip_ship_ret	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AC_SLIP_TYP','SHIP_RET');
	c_asst_prod	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst_sls	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asset_mng_mng	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASSET_MNG_TYP','MNG');
	c_calc_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'CALC_STK');
	c_max_cnt	CONSTANT INTEGER := 50000; /* バルクインサートでの最大レコード数 */
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	l_arg	mgt_arg%ROWTYPE;
	l_cnt	INTEGER;
	l_monthly_flg	CHAR(1);
	l_rec	mgt_io[] ;
	l_tmp_rec	mgt_io%ROWTYPE ;
	x	RECORD;
	y	RECORD;
	z	RECORD;
BEGIN

	<<PROC_END>>
	BEGIN
		IF i_wg_cd IS NULL THEN
			CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IO.P_MAIN');
		ELSE
			CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_IO.P_MAIN - ' || i_wg_cd);
		END IF;
		l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no);

		IF l_arg.cost_calc_typ != c_calc_stk THEN
			EXIT PROC_END;
		END IF;

		DELETE FROM mgt_io t WHERE t.calc_no = i_calc_no AND t.calc_grp_cd = i_calc_grp_cd
		AND (i_wg_cd IS NULL OR t.wg_cd = i_wg_cd) ;

		SELECT	COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_calc_parm t
		WHERE	0=0
		AND t.calc_grp_cd = i_calc_grp_cd
		AND t.calc_no = i_calc_no
		AND t.parm_key = 'SCA_TO'
		AND t.parm_val IS NOT NULL
		AND t.parm_val != '0'
		AND t.parm_val != 'NO';

		IF l_cnt > 0 THEN
			l_monthly_flg := '1';
		ELSE
			l_monthly_flg := '0';
		END IF;

		FOR x IN
			SELECT /*+
					NestLoop(mgt_calc_itm_mgt_calc_itm_all_org mgt_calc_ptn_mgt_calc_ptn_all_org mgt_acc_top_mgt_acc_top_all_org)
					IndexScan(mgt_calc_itm_mgt_calc_itm_all_org mgt_calc_itm_all_pk)
					IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
					*/
				DISTINCT
				CASE t2.eval_typ
						WHEN c_eval_term_ave THEN NULL
						WHEN c_eval_std_unit THEN
						CASE l_monthly_flg
							WHEN '0' THEN NULL ELSE t0.ym
						END
					ELSE t0.ym
				END AS ym,
				t0.wg_cd,
				t0.mng_dpt_cd,
				t0.itm_cd,
				t0.itm_sub1,
				t0.itm_sub2,
				t0.itm_sub3,
				CASE t2.lot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.lot_no
				END AS lot_no,
				CASE t2.sublot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.sublot_no
				END AS sublot_no,
				CASE t2.sno1_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.sno1
				END AS sno1,
				CASE t2.sno2_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.sno2
				END AS sno2,
				CASE t2.sno3_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.sno3
				END AS sno3,
				CASE t2.sno4_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t0.sno4
				END AS sno4,
				t0.asst_typ,
				t2.lot_typ,
				t2.sublot_typ,
				t2.sno1_typ,
				t2.sno2_typ,
				t2.sno3_typ,
				t2.sno4_typ,
				COALESCE(m.asset_mng_typ, c_asset_mng_mng) AS asset_mng_typ
			FROM mgt_acc_top t0
				INNER JOIN mgt_calc_itm t1
				ON (
					t0.calc_no = t1.calc_no
					AND t0.calc_grp_cd = t1.calc_grp_cd
					AND t0.itm_cd = t1.itm_cd
					AND t0.itm_sub1 = t1.itm_sub1
					AND t0.itm_sub2 = t1.itm_sub2
					AND t0.itm_sub3 = t1.itm_sub3
					AND t0.wg_cd = t1.wg_cd
				)
				INNER JOIN mgt_calc_ptn t2
				ON (
					t1.calc_no = t2.calc_no
					AND t1.calc_grp_cd = t2.calc_grp_cd
					AND t1.calc_ptn_cd = t2.calc_ptn_cd
				)
				LEFT OUTER JOIN mam_itm_srch m
				ON (
					t0.itm_cd = m.itm_cd
					AND t0.itm_sub1 = m.itm_sub1
					AND t0.itm_sub2 = m.itm_sub2
					AND t0.itm_sub3 = m.itm_sub3
					AND m.del_flg = '0'
					AND m.release_flg = '1'
				)
			WHERE	0=0
			AND t0.calc_no = i_calc_no
			AND t0.calc_grp_cd = i_calc_grp_cd
			AND (i_wg_cd IS NULL OR t0.wg_cd = i_wg_cd)
			AND t0.asst_typ IN (c_asst_prod, c_asst_sls)
			AND t0.repurc_obli_flg = '0'
			AND t0.calc_rec_typ IN (
					c_calc_rec_st_stk,
					c_calc_rec_purc,
					c_calc_rec_comp,
					c_calc_rec_io,
					c_calc_rec_inpt,
					c_calc_rec_sls,
					c_calc_rec_end_stk,
					c_calc_rec_gp_alc
				)
		LOOP

			l_tmp_rec.calc_no	:= i_calc_no ;
			l_tmp_rec.calc_grp_cd := i_calc_grp_cd ;
			l_tmp_rec.wg_cd := x.wg_cd ;
			l_tmp_rec.ym	:= COALESCE(x.ym, l_arg.end_ym) ;
			l_tmp_rec.ym_sub	:= x.ym ;
			l_tmp_rec.mng_dpt_cd := x.mng_dpt_cd ;
			l_tmp_rec.itm_cd	:= x.itm_cd ;
			l_tmp_rec.itm_sub1	:= x.itm_sub1 ;
			l_tmp_rec.itm_sub2	:= x.itm_sub2 ;
			l_tmp_rec.itm_sub3	:= x.itm_sub3 ;
			l_tmp_rec.lot_no	:= COALESCE(x.lot_no, c_null_val) ;
			l_tmp_rec.sublot_no	:= COALESCE(x.sublot_no, c_null_val) ;
			l_tmp_rec.sno1	:= COALESCE(x.sno1, c_null_val) ;
			l_tmp_rec.sno2	:= COALESCE(x.sno2, c_null_val) ;
			l_tmp_rec.sno3	:= COALESCE(x.sno3, c_null_val) ;
			l_tmp_rec.sno4	:= COALESCE(x.sno4, c_null_val) ;
			l_tmp_rec.asst_typ	:= x.asst_typ ;

			l_tmp_rec.std_qty	:= 0 ;
			l_tmp_rec.ave_upri	:= 0 ;
			l_tmp_rec.std_upri	:= 0 ;
			l_tmp_rec.st_stk_qty := 0 ;
			l_tmp_rec.st_stk_amt := 0 ;
			l_tmp_rec.mfg_qty	:= 0 ;
			l_tmp_rec.mfg_amt	:= 0 ;
			l_tmp_rec.purc_qty	:= 0 ;
			l_tmp_rec.purc_amt	:= 0 ;
			l_tmp_rec.mfg_gr_qty := 0 ;
			l_tmp_rec.mfg_gr_amt := 0 ;
			l_tmp_rec.othr_gr_qty := 0 ;
			l_tmp_rec.othr_gr_amt := 0 ;
			l_tmp_rec.alc_amt	:= 0 ;
			l_tmp_rec.inpt_qty	:= 0 ;
			l_tmp_rec.inpt_amt	:= 0 ;
			l_tmp_rec.plnt_gi_qty := 0 ;
			l_tmp_rec.plnt_gi_amt := 0 ;
			l_tmp_rec.othr_gi_qty := 0 ;
			l_tmp_rec.othr_gi_amt := 0 ;
			l_tmp_rec.prov_qty	:= 0 ;
			l_tmp_rec.prov_amt	:= 0 ;
			l_tmp_rec.sls_qty	:= 0 ;
			l_tmp_rec.sls_amt	:= 0 ;
			l_tmp_rec.end_stk_qty := 0 ;
			l_tmp_rec.end_stk_amt := 0 ;
			l_tmp_rec.diff_qty	:= 0 ;
			l_tmp_rec.diff_amt	:= 0 ;
			l_tmp_rec.xpns_inpt_qty := 0 ;
			l_tmp_rec.xpns_inpt_amt := 0 ;

			/* 受払情報の取得 */
			FOR y IN
				SELECT /*+
					IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
					IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
					*/
					w.calc_rec_typ,
					w.cost_io_typ,
					w.ac_slip_typ,
					w.ym, SUM(w.qty) AS qty,
					SUM(w.amt) AS amt
				FROM	(
					SELECT
						t1.top_rec_no,
						t1.calc_rec_typ,
						t1.cost_io_typ,
						t1.ac_slip_typ,
						t1.ym,
						t1.qty,
						COALESCE(SUM(t2.act_cost), 0) AS amt
					FROM	mgt_acc_top t1
						LEFT OUTER JOIN mgt_acc_sml_cost t2
						ON (
							t1.calc_no = t2.calc_no
							AND t1.calc_grp_cd = t2.calc_grp_cd
							AND t1.top_rec_no = t2.top_rec_no
							AND t2.expns_typ = c_expns_prod
						)
					WHERE	0=0
					AND t1.calc_no = i_calc_no
					AND t1.calc_grp_cd = i_calc_grp_cd
					AND t1.wg_cd = x.WG_CD
					AND (
						t1.ym = COALESCE(x.ym, t1.ym)::TIMESTAMP WITHOUT TIME ZONE
						OR
						t1.calc_rec_typ = c_calc_rec_end_stk AND t1.ym = fcpa_postgres_util$add_months(x.ym, - 1)
						)
					AND t1.mng_dpt_cd = x.mng_dpt_cd
					AND t1.itm_cd = x.itm_cd
					AND t1.itm_sub1 = x.itm_sub1
					AND t1.itm_sub2 = x.itm_sub2
					AND t1.itm_sub3 = x.itm_sub3
					AND t1.lot_no = COALESCE(x.lot_no, t1.lot_no)
					AND t1.sublot_no = COALESCE(x.sublot_no, t1.sublot_no)
					AND t1.sno1 = COALESCE(x.sno1, t1.sno1)
					AND t1.sno2 = COALESCE(x.sno2, t1.sno2)
					AND t1.sno3 = COALESCE(x.sno3, t1.sno3)
					AND t1.sno4 = COALESCE(x.sno4, t1.sno4)
					AND t1.asst_typ = x.asst_typ
					AND t1.repurc_obli_flg = '0'
					AND t1.calc_rec_typ IN (
							c_calc_rec_st_stk,
							c_calc_rec_purc,
							c_calc_rec_comp,
							c_calc_rec_io,
							c_calc_rec_inpt,
							c_calc_rec_sls,
							c_calc_rec_end_stk,
							c_calc_rec_gp_alc
						)
					GROUP BY t1.top_rec_no, t1.calc_rec_typ, t1.cost_io_typ,
						t1.ac_slip_typ, t1.ym, t1.qty
					) w
				WHERE	0=0
				GROUP BY w.calc_rec_typ, w.cost_io_typ, w.ac_slip_typ, w.ym
			LOOP
				IF y.calc_rec_typ = c_calc_rec_io
				AND 	(
					y.cost_io_typ IN (c_cost_io_ffr_prov, c_cost_io_stk_io)
					OR
					y.ac_slip_typ IN (c_ac_slip_ship, c_ac_slip_ship_ret)
					)
				THEN
					NULL;

				ELSIF y.calc_rec_typ = c_calc_rec_st_stk THEN
					l_tmp_rec.st_stk_qty := l_tmp_rec.st_stk_qty + y.qty ;
					l_tmp_rec.st_stk_amt := l_tmp_rec.st_stk_amt + y.amt ;

				ELSIF y.calc_rec_typ = c_calc_rec_purc THEN
					l_tmp_rec.purc_qty := l_tmp_rec.purc_qty + y.qty ;
					l_tmp_rec.purc_amt := l_tmp_rec.purc_amt + y.amt ;

				ELSIF y.calc_rec_typ = c_calc_rec_comp THEN
					l_tmp_rec.mfg_qty := l_tmp_rec.mfg_qty + y.qty ;
					l_tmp_rec.mfg_amt := l_tmp_rec.mfg_amt + y.amt ;

				ELSIF y.calc_rec_typ = c_calc_rec_inpt THEN
					IF x.asset_mng_typ = c_asset_mng_mng THEN
						l_tmp_rec.inpt_qty := l_tmp_rec.inpt_qty + y.qty ;
						l_tmp_rec.inpt_amt := l_tmp_rec.inpt_amt + y.amt ;

					ELSE
						l_tmp_rec.xpns_inpt_qty := l_tmp_rec.xpns_inpt_qty + y.qty ;
						l_tmp_rec.xpns_inpt_amt := l_tmp_rec.xpns_inpt_amt + y.amt ;
					END IF;

				ELSIF y.calc_rec_typ = c_calc_rec_io THEN
					IF y.cost_io_typ = c_cost_io_onr_prov THEN
						l_tmp_rec.prov_qty := l_tmp_rec.prov_qty + y.qty ;
						l_tmp_rec.prov_amt := l_tmp_rec.prov_amt + y.amt ;

					ELSIF y.cost_io_typ = c_cost_io_stk_in THEN
						IF y.ac_slip_typ = c_ac_slip_prod_itm_so THEN
							l_tmp_rec.mfg_gr_qty := l_tmp_rec.mfg_gr_qty + y.qty ;
							l_tmp_rec.mfg_gr_amt := l_tmp_rec.mfg_gr_amt + y.amt ;
						ELSE
							l_tmp_rec.othr_gr_qty := l_tmp_rec.othr_gr_qty + y.qty ;
							l_tmp_rec.othr_gr_amt := l_tmp_rec.othr_gr_amt + y.amt ;
						END IF;

					ELSIF y.cost_io_typ = c_cost_io_stk_out THEN
						IF y.ac_slip_typ = c_ac_slip_prod_itm_so THEN
							l_tmp_rec.plnt_gi_qty := l_tmp_rec.plnt_gi_qty + y.qty ;
							l_tmp_rec.plnt_gi_amt := l_tmp_rec.plnt_gi_amt + y.amt ;
						ELSE
							l_tmp_rec.othr_gi_qty := l_tmp_rec.othr_gi_qty + y.qty ;
							l_tmp_rec.othr_gi_amt := l_tmp_rec.othr_gi_amt + y.amt ;
						END IF;
					END IF;

				ELSIF y.calc_rec_typ = c_calc_rec_sls THEN
					l_tmp_rec.sls_qty := l_tmp_rec.sls_qty + y.qty ;
					l_tmp_rec.sls_amt := l_tmp_rec.sls_amt + y.amt ;

				ELSIF y.calc_rec_typ = c_calc_rec_end_stk THEN
					IF x.ym IS NULL OR x.ym = y.ym THEN
						l_tmp_rec.end_stk_qty := l_tmp_rec.end_stk_qty + y.qty ;
						l_tmp_rec.end_stk_amt := l_tmp_rec.end_stk_amt + y.amt ;
					ELSE
						l_tmp_rec.st_stk_qty := l_tmp_rec.st_stk_qty + y.qty ;
						l_tmp_rec.st_stk_amt := l_tmp_rec.st_stk_amt + y.amt ;
					END IF;

				ELSIF y.calc_rec_typ = c_calc_rec_gp_alc THEN
					l_tmp_rec.alc_amt := l_tmp_rec.alc_amt + y.amt ;

				END IF;

			END LOOP;

			/* 総平均単価情報の取得 */
			FOR z IN
				SELECT /*+
					NestLoop(mgt_acc_top_mgt_acc_top_all_org mgt_acc_sml_cost_mgt_acc_sml_cost_all_org)
					IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
					IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
					*/
					t1.top_rec_no,
					t1.qty,
					COALESCE(SUM(t2.act_cost), 0) AS act_upri,
					COALESCE(SUM(t2.std_cost), 0) AS std_upri
				FROM	mgt_acc_top t1
					LEFT OUTER JOIN mgt_acc_sml_cost t2
					ON (
						t1.calc_no = t2.calc_no
						AND t1.calc_grp_cd = t2.calc_grp_cd
						AND t1.top_rec_no = t2.top_rec_no
						AND t2.expns_typ = c_expns_prod
					)
				WHERE	0=0
				AND t1.calc_no = i_calc_no
				AND t1.calc_grp_cd = i_calc_grp_cd
				AND t1.wg_cd = x.wg_cd
				AND t1.itm_cd = x.itm_cd
				AND t1.itm_sub1 = x.itm_sub1
				AND t1.itm_sub2 = x.itm_sub2
				AND t1.itm_sub3 = x.itm_sub3
				AND (t1.ym = x.ym::TIMESTAMP WITHOUT TIME ZONE OR t1.ym = l_arg.end_ym AND x.ym IS NULL)
				AND COALESCE(t1.mng_dpt_cd, x.mng_dpt_cd) = x.mng_dpt_cd
				AND t1.lot_no =
					CASE x.lot_typ
						WHEN c_unit_calc_calc THEN x.lot_no
						ELSE t1.lot_no
					END
				AND t1.sublot_no =
					CASE x.sublot_typ
						WHEN c_unit_calc_calc THEN x.sublot_no
						ELSE t1.sublot_no
					END
				AND t1.sno1 =
					CASE x.sno1_typ
						WHEN c_unit_calc_calc THEN x.sno1
						ELSE t1.sno1
					END
				AND t1.sno2 =
					CASE x.sno2_typ
						WHEN c_unit_calc_calc THEN x.sno2
						ELSE t1.sno2
					END
				AND t1.sno3 =
					CASE x.sno3_typ
						WHEN c_unit_calc_calc THEN x.sno3
						ELSE t1.sno3
					END
				AND t1.sno4 =
					CASE x.sno4_typ
						WHEN c_unit_calc_calc THEN x.sno4
						ELSE t1.sno4
					END AND t1.asst_typ = x.asst_typ AND t1.calc_rec_typ = c_calc_rec_ave
				AND t1.repurc_obli_flg = '0'
				GROUP BY t1.top_rec_no, t1.qty
			LOOP
				l_tmp_rec.std_qty := z.qty ;
				l_tmp_rec.ave_upri := z.act_upri ;
				l_tmp_rec.std_upri := z.std_upri ;
				EXIT;
			END LOOP;

			l_tmp_rec.diff_qty := 0
				+ l_tmp_rec.st_stk_qty + l_tmp_rec.mfg_qty
				+ l_tmp_rec.purc_qty + l_tmp_rec.mfg_gr_qty + l_tmp_rec.othr_gr_qty
				- l_tmp_rec.inpt_qty - l_tmp_rec.plnt_gi_qty - l_tmp_rec.othr_gi_qty
				- l_tmp_rec.prov_qty - l_tmp_rec.sls_qty - l_tmp_rec.end_stk_qty
				;

			l_tmp_rec.diff_amt := 0
				+ l_tmp_rec.st_stk_amt + l_tmp_rec.mfg_amt
				+ l_tmp_rec.purc_amt + l_tmp_rec.mfg_gr_amt + l_tmp_rec.othr_gr_amt + l_tmp_rec.alc_amt
				- l_tmp_rec.inpt_amt - l_tmp_rec.plnt_gi_amt - l_tmp_rec.othr_gi_amt
				- l_tmp_rec.prov_amt - l_tmp_rec.sls_amt - l_tmp_rec.end_stk_amt
				;

			l_rec[COALESCE(array_length(l_rec, 1), 0) + 1] := l_tmp_rec ;

			IF COALESCE(array_length(l_rec, 1), 0) >= c_max_cnt THEN
				INSERT INTO mgt_io SELECT * FROM UNNEST(l_rec);

				l_rec := '{}' ;
			END IF;
		END LOOP;

		IF COALESCE(array_length(l_rec, 1), 0) > 0 THEN
			INSERT INTO mgt_io SELECT * FROM UNNEST(l_rec);
		END IF;

		l_rec := '{}' ;
	END;

	COMMIT;

	IF i_wg_cd IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IO.P_MAIN');
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_IO.P_MAIN - ' || i_wg_cd);
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;

