CREATE OR REPLACE PROCEDURE mgpa_wip_loc$p_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_wg_cd VARCHAR DEFAULT NULL
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	場所別仕掛原価データの作成メイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg	mgt_arg%ROWTYPE;

	c_null_val			CONSTANT VARCHAR(20) := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_calc_rec_st_wip	CONSTANT VARCHAR(1) := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_WIP') ;
	c_calc_rec_comp		CONSTANT VARCHAR(1) := fcpa_const$get_const_val('MGC_CALC_REC_TYP','COMP') ;
	c_calc_rec_end_wip	CONSTANT VARCHAR(1) := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_WIP') ;
	c_calc_rec_inst		CONSTANT VARCHAR(1) := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INST') ;
BEGIN
	IF i_wg_cd IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_WIP_LOC.P_MAIN') ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_WIP_LOC.P_MAIN - ' || i_wg_cd) ;
	END IF;

	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	DELETE FROM	mgt_wip_loc t
	WHERE	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	(i_wg_cd IS NULL OR t.wg_cd = i_wg_cd)
	;

	INSERT INTO mgt_wip_loc (
		calc_no,
		calc_grp_cd,
		wg_cd,
		ym,
		mng_dpt_cd,
		loc_cd,
		str_ln_cd,
		oper_cd,
		oper_seq,
		expns_cd,
		st_wip_amt,
		prod_amt,
		inpt_amt,
		comp_amt,
		end_wip_amt
		)
	SELECT /*+
			IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie01)
			IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
			IndexScan(mgt_acc_top_mgt_acc_top_all_org_2 mgt_acc_top_all_ie01)
			IndexScan(mgt_acc_cost_mgt_acc_cost_all_org mgt_acc_cost_all_ie06)
			*/
		i_calc_no,
		i_calc_grp_cd,
		x.wg_cd,
		x.ym,
		x.mng_dpt_cd,
		x.loc_cd,
		COALESCE(x.str_ln_cd, c_null_val),
		x.oper_cd,
		x.oper_seq,
		x.expns_cd,
		SUM(x.st_wip_amt),
		SUM(x.prod_amt),
		SUM(x.inpt_amt),
		SUM(x.comp_amt),
		SUM(x.end_wip_amt)
	FROM	(
		/* 月初仕掛・完成・月末仕掛データの取得 */
		SELECT
			t1.wg_cd,
			t1.ym,
			t1.mng_dpt_cd,
			t1.loc_cd,
			t1.str_ln_cd,
			t1.oper_cd,
			t1.oper_seq,
			t2.expns_cd,
			CASE t1.calc_rec_typ
				WHEN c_calc_rec_st_wip THEN SUM(t2.act_cost)
				ELSE 0
			END AS st_wip_amt,
			0 AS prod_amt,
			0 AS inpt_amt,
			CASE t1.calc_rec_typ
				WHEN c_calc_rec_comp THEN SUM(t2.act_cost)
				ELSE 0
			END AS comp_amt,
			CASE t1.calc_rec_typ
				WHEN c_calc_rec_end_wip THEN SUM(t2.act_cost)
				ELSE 0
			END AS end_wip_amt
		FROM	mgt_acc_top t1, mgt_acc_sml_cost t2
		WHERE	0=0
		AND	t1.calc_no = i_calc_no
		AND	t1.calc_grp_cd = i_calc_grp_cd
		AND	(i_wg_cd IS NULL OR t1.wg_cd = i_wg_cd)
		AND	t1.calc_rec_typ IN (
				c_calc_rec_st_wip,
				c_calc_rec_comp,
				c_calc_rec_end_wip
				)
		AND	t1.calc_no = t2.calc_no
		AND	t1.calc_grp_cd = t2.calc_grp_cd
		AND	t1.top_rec_no = t2.top_rec_no
		GROUP BY t1.wg_cd, t1.ym, t1.mng_dpt_cd,
			t1.loc_cd, t1.str_ln_cd,
			t1.oper_cd, t1.oper_seq,
			t1.calc_rec_typ,
			t2.expns_cd
		UNION ALL
		/* 月初仕掛データの取得（複数年月での計算時） */
		SELECT
			t1.wg_cd,
			fcpa_postgres_util$add_months(t1.ym, 1) AS ym,
			t1.mng_dpt_cd,
			t1.loc_cd,
			t1.str_ln_cd,
			t1.oper_cd,
			t1.oper_seq,
			t2.expns_cd,
			SUM(t2.act_cost) AS st_wip_amt,
			0 AS prod_amt,
			0 AS inpt_amt,
			0 AS comp_amt,
			0 AS end_wip_amt
		FROM	mgt_acc_top t1, mgt_acc_sml_cost t2
		WHERE	0=0
		AND	t1.calc_no = i_calc_no
		AND	t1.calc_grp_cd = i_calc_grp_cd
		AND	(i_wg_cd IS NULL OR t1.wg_cd = i_wg_cd)
		AND	t1.calc_rec_typ = c_calc_rec_end_wip
		AND	t1.ym <= fcpa_postgres_util$add_months(l_arg.end_ym, - 1)
		AND	t1.calc_no = t2.calc_no
		AND	t1.calc_grp_cd = t2.calc_grp_cd
		AND	t1.top_rec_no = t2.top_rec_no
		GROUP BY t1.wg_cd,
			fcpa_postgres_util$add_months(t1.ym, 1), t1.mng_dpt_cd,
			t1.loc_cd, t1.str_ln_cd,
			t1.oper_cd, t1.oper_seq,
			t2.expns_cd
		UNION ALL
		/* 発生原価・製造品投入原価データの取得 */
		SELECT
			t1.wg_cd,
			t1.ym,
			t1.mng_dpt_cd,
			t1.loc_cd,
			t1.str_ln_cd,
			t2.oper_cd,
			t2.oper_seq,
			t2.expns_cd,
			0 AS st_wip_amt,
			CASE t2.oper_cost_flg
				WHEN '1' THEN SUM(t2.act_cost)
				ELSE 0
			END AS prod_amt,
			CASE t2.oper_cost_flg
				WHEN '0' THEN SUM(t2.act_cost)
				ELSE 0
			END AS inpt_amt,
			0 AS comp_amt,
			0 AS end_wip_amt
		FROM	mgt_acc_top t1, mgt_acc_cost t2
		WHERE	0=0
		AND	t1.calc_no = i_calc_no
		AND	t1.calc_grp_cd = i_calc_grp_cd
		AND	(i_wg_cd IS NULL OR t1.wg_cd = i_wg_cd)
		AND	t1.calc_rec_typ = c_calc_rec_inst
		AND	t1.calc_no = t2.calc_no
		AND	t1.calc_grp_cd = t2.calc_grp_cd
		AND	t1.top_rec_no = t2.top_rec_no
		GROUP BY t1.wg_cd, t1.ym, t1.mng_dpt_cd,
			t1.loc_cd, t1.str_ln_cd,
			t2.oper_cd, t2.oper_seq,
			t2.oper_cost_flg,
			t2.expns_cd
		) x
	WHERE	0=0
	GROUP BY x.wg_cd, x.ym, x.mng_dpt_cd,
		x.loc_cd, COALESCE(x.str_ln_cd, c_null_val),
		x.oper_cd, x.oper_seq,
		x.expns_cd
	;

	IF i_wg_cd IS NULL THEN
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_WIP_LOC.P_MAIN') ;
	ELSE
		CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_WIP_LOC.P_MAIN - ' || i_wg_cd) ;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;
