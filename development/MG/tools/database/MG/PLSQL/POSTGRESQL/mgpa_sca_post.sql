CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_set_so_alc (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	出庫による配賦金額を配賦費用へ設定する
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_rec_io		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP', 'IO') ;
	c_cost_io_stk_out	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_OUT') ;
	c_amt_alc			CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_AMT_ADD_TYP', 'ALC') ;
	c_eval_expns		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP', 'EXPNS') ;
	c_eval_zero			CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP', 'ZERO') ;
	l_log_no			fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1		fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2		fct_batch_log_msg.log_sub_key2%TYPE ;
	l_parm_itm_sub_typ	mam_sys_parm.parm_val%TYPE ;
	l_parm_sno_typ		mam_sys_parm.parm_val%TYPE ;

	x RECORD ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_POST.P_SET_SO_ALC') ;

	l_parm_itm_sub_typ :=  mapa_comm$f_get_parm('ITM_SUB_TYP') ;
	l_parm_sno_typ := mapa_comm$f_get_parm('SNO_TYP') ;

	DELETE FROM	mgt_calc_io_expns_amt t
	WHERE	0=0
	AND	t.calc_no = i_arg.calc_no
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.amt_add_typ = c_amt_alc
	;

	INSERT INTO mgt_calc_io_expns_amt (
		calc_no, calc_grp_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3, itm_ext,
		wg_cd,
		act_io_id, act_io_id_sub,
		expns_cd,
		amt_add_typ,
		amt
		)
	SELECT /*+
			IndexScan(mgt_calc_io_mgt_calc_io_all_org mgt_calc_io_all_ie01) 
			IndexScan(mgt_acc_top_tmp_mgt_acc_top_tmp_all_org mgt_acc_top_tmp_all_ie01) 
			IndexScan(mgt_acc_sml_cost_tmp_mgt_acc_sml_cost_tmp_all_org mgt_acc_sml_cost_tmp_all_ie01) 
			*/
		i_arg.calc_no, i_arg.calc_grp_cd,
		t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.itm_ext,
		t1.wg_cd,
		t1.act_io_id, t1.act_io_id_sub,
		t3.expns_cd,
		c_amt_alc,
		SUM(t3.act_cost)
	FROM	mgt_calc_io t1, mgt_acc_top_tmp t2, mgt_acc_sml_cost_tmp t3
	WHERE	0=0
	AND	t1.calc_no = i_arg.calc_no
	AND	t1.calc_grp_cd = i_arg.calc_grp_cd
	AND	t1.alc_ac_cd IS NOT NULL
	AND	t1.alc_amt_flg = '1'
	AND	t1.cost_io_typ = c_cost_io_stk_out
	AND	t1.calc_no = t2.calc_no
	AND	t1.calc_grp_cd = t2.calc_grp_cd
	AND	t1.act_io_id = t2.act_id
	AND	t1.act_io_id_sub = t2.act_id_sub
	AND	t1.cost_io_typ = t2.cost_io_typ
	AND	t2.calc_rec_typ = c_calc_rec_io
	AND	t2.calc_no = t3.calc_no
	AND	t2.calc_grp_cd = t3.calc_grp_cd
	AND	t2.top_rec_no = t3.top_rec_no
	AND	t3.act_cost != 0
	GROUP BY t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.itm_ext,
		t1.wg_cd,
		t1.act_io_id, t1.act_io_id_sub,
		t3.expns_cd
	;

	FOR x IN
		SELECT t1.calc_no, t1.calc_grp_cd, t1.act_io_id, t1.act_io_id_sub,
			t1.ym, t1.wg_cd, t1.mng_dpt_cd, t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3,
			t1.lot_no, t1.sublot_no, t1.sno1, t1.sno2, t1.sno3, t1.sno4, t1.asst_typ, t1.alc_ac_cd
		FROM mgt_calc_io t1, mgt_acc_top_tmp t2
		WHERE 0=0
		AND t1.calc_no = i_arg.calc_no
		AND t1.calc_grp_cd = i_arg.calc_grp_cd
		AND t1.alc_ac_cd IS NOT NULL
		AND t1.alc_amt_flg = '1'
		AND t1.cost_io_typ = c_cost_io_stk_out
		AND t1.calc_no = t2.calc_no
		AND t1.calc_grp_cd = t2.calc_grp_cd
		AND t1.act_io_id = t2.act_id
		AND t1.act_io_id_sub = t2.act_id_sub
		AND t1.cost_io_typ = t2.cost_io_typ
		AND t2.calc_rec_typ = c_calc_rec_io
		AND t1.rec_eval_typ IS NULL
		AND NOT EXISTS (
			SELECT 'X' FROM mgt_calc_io_expns_amt w
			WHERE w.calc_no = t1.calc_no
			AND w.calc_grp_cd = t1.calc_grp_cd
			AND w.act_io_id = t1.act_io_id
			AND w.act_io_id_sub = t1.act_io_id_sub)
	LOOP
		UPDATE mgt_calc_io t1
		SET rec_eval_typ = c_eval_zero
		WHERE 0=0
		AND t1.calc_no = x.calc_no
		AND t1.calc_grp_cd = x.calc_grp_cd
		AND t1.act_io_id = x.act_io_id
		AND t1.act_io_id_sub = x.act_io_id_sub
		;

		CALL fcpa_batch_log$p_data_log('MGBXD0049', l_log_no, l_log_sub_key1, l_log_sub_key2,
			fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()), x.wg_cd, x.mng_dpt_cd,
			mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
			x.lot_no, x.sublot_no,
			mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
			x.asst_typ, x.alc_ac_cd, x.act_io_id, x.act_io_id_sub);
	END LOOP ;

	UPDATE mgt_calc_io t1
	SET rec_eval_typ = c_eval_expns
	WHERE	0=0
	AND	t1.calc_no = i_arg.calc_no
	AND	t1.calc_grp_cd = i_arg.calc_grp_cd
	AND	t1.alc_ac_cd IS NOT NULL
	AND	t1.alc_amt_flg = '1'
	AND	t1.cost_io_typ = c_cost_io_stk_out
	AND	t1.rec_eval_typ IS NULL
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_POST.P_SET_SO_ALC') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_set_other_trd (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	異なる計算グループ間の振替処理
<REMARKS>
	MGPA_SCA_PREPでＮＵＬＬにした振替グループを計算結果へ設定する
<ARGUMENTS>
<IN>	i_arg
		mgt_argレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_rec_io		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP', 'IO') ;
	c_cost_io_stk_in	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_IN') ;
	c_cost_io_stk_out	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP', 'STK_OUT') ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_POST.P_SET_OTHER_TRD') ;

	UPDATE mgt_acc_top t
	SET trd_grp = (
			SELECT	x.trd_grp
			FROM	mgt_calc_io_trd x
			WHERE	0=0
			AND	x.calc_no = t.calc_no
			AND	x.calc_grp_cd = t.calc_grp_cd
			AND	x.act_io_id = t.act_id
			AND	x.act_io_id_sub = t.act_id_sub
			)
	WHERE	0=0
	AND	t.calc_no = i_arg.calc_no
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.trd_grp IS NULL
	AND	t.calc_rec_typ = c_calc_rec_io
	AND	t.cost_io_typ IN (c_cost_io_stk_out, c_cost_io_stk_in)
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_io_trd w
			WHERE	0=0
			AND	w.calc_no = t.calc_no
			AND	w.calc_grp_cd = t.calc_grp_cd
			AND	w.act_io_id = t.act_id
			AND	w.act_io_id_sub = t.act_id_sub
		)
	;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_POST.P_SET_OTHER_TRD') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_set_st_data (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月初情報を前月データの計算結果として作成する
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_calc_rec_inst		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP', 'INST') ;
	c_calc_rec_st_wip	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP', 'ST_WIP') ;

	l_cnt NUMERIC ;
	l_ym mam_term.term%TYPE ;
	l_tmp_no CONSTANT VARCHAR := '0' ;
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_POST.P_SET_ST_DATA') ;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mgt_arg t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.st_ym < i_arg.st_ym
	;

	IF l_cnt > 0 THEN
		RETURN ;
	END IF ;

	l_ym := fcpa_postgres_util$add_months(i_arg.st_ym, -1) ;

	DELETE FROM	mgt_ym_no t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	(t.ym = l_ym OR t.calc_no = l_tmp_no)
	;

	INSERT INTO mgt_ym_no (
		calc_grp_cd,
		ym,
		calc_no
		)
	VALUES (
		i_arg.calc_grp_cd,
		l_ym,
		l_tmp_no
		)
	;

	/* 月初仕掛データの作成（内訳照会用） */
	DELETE FROM	mgt_acc_top t	WHERE t.calc_grp_cd = i_arg.calc_grp_cd AND t.calc_no = l_tmp_no ;
	DELETE FROM	mgt_acc_inpt t	WHERE t.calc_grp_cd = i_arg.calc_grp_cd AND t.calc_no = l_tmp_no ;
	DELETE FROM	mgt_acc_cost t	WHERE t.calc_grp_cd = i_arg.calc_grp_cd AND t.calc_no = l_tmp_no ;

	INSERT INTO mgt_acc_top (
		calc_no, calc_grp_cd,
		top_rec_no,
		calc_rec_typ,
		wg_cd,
		ym, ac_dt,
		mng_dpt_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		mfg_purc_typ,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		cost_io_typ,
		ac_slip_typ, ac_rsn_cd,
		itm_mfg_inst_no,
		mfg_act_no,
		loc_cd, str_ln_cd,
		oper_act_no, oper_cd, oper_seq,
		bp_cd, stk_bp_cd,
		po_no, slo_no, iv_no,
		act_id, act_id_sub,
		alc_dpt_cd, other_dpt_cd,
		asst_typ,
		qty, amt,
		std_qty, std_amt,
		trd_grp,
		act_upri, std_upri,
		so_act_amt, so_std_amt,
		per, mfg_cost_ratio,
		alc_ac_cd, rec_eval_typ,
		par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3
		)
	SELECT	l_tmp_no, t.calc_grp_cd,
		t.top_rec_no,
		c_calc_rec_inst,
		t.wg_cd,
		l_ym, t.ac_dt,
		t.mng_dpt_cd,
		t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
		t.mfg_purc_typ,
		t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4,
		t.cost_io_typ,
		t.ac_slip_typ, t.ac_rsn_cd,
		t.itm_mfg_inst_no,
		t.mfg_act_no,
		t.loc_cd, t.str_ln_cd,
		t.oper_act_no, t.oper_cd, t.oper_seq,
		t.bp_cd, t.stk_bp_cd,
		t.po_no, t.slo_no, t.iv_no,
		t.act_id, t.act_id_sub,
		t.alc_dpt_cd, t.other_dpt_cd,
		t.asst_typ,
		0, t.amt,
		0, t.std_amt,
		t.trd_grp,
		t.act_upri, t.std_upri,
		t.so_act_amt, t.so_std_amt,
		t.per, t.mfg_cost_ratio,
		t.alc_ac_cd, t.rec_eval_typ,
		t.par_itm_cd, t.par_itm_sub1, t.par_itm_sub2, t.par_itm_sub3
	FROM	mgt_acc_top t
	WHERE	0=0
	AND	t.calc_grp_cd = i_arg.calc_grp_cd
	AND	t.calc_no = i_arg.calc_no
	AND	t.calc_rec_typ = c_calc_rec_st_wip
	;

	INSERT INTO mgt_acc_inpt (
		calc_no, calc_grp_cd,
		inpt_rec_no, top_rec_no,
		lvl,
		wg_cd,
		ym, ac_dt,
		mng_dpt_cd,
		itm_cd, itm_sub1, itm_sub2, itm_sub3,
		mfg_purc_typ,
		lot_no, sublot_no, sno1, sno2, sno3, sno4,
		loc_cd, str_ln_cd,
		oper_act_no, oper_cd, oper_seq,
		ac_slip_typ, ac_rsn_cd,
		asst_typ,
		act_qty, std_qty,
		act_upri, std_upri
		)
	SELECT	l_tmp_no, t2.calc_grp_cd,
		t2.top_rec_no, t2.top_rec_no,
		t2.lvl,
		t2.wg_cd,
		l_ym, t2.ac_dt,
		t2.mng_dpt_cd,
		t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3,
		t2.mfg_purc_typ,
		t2.lot_no, t2.sublot_no, t2.sno1, t2.sno2, t2.sno3, t2.sno4,
		t2.loc_cd, t2.str_ln_cd,
		t2.oper_act_no, t2.oper_cd, t2.oper_seq,
		t2.ac_slip_typ, t2.ac_rsn_cd,
		t2.asst_typ,
		0, 0,
		t2.act_upri, t2.std_upri
	FROM	mgt_acc_top t1, mgt_acc_inpt t2
	WHERE	0=0
	AND	t1.calc_grp_cd = i_arg.calc_grp_cd
	AND	t1.calc_no = i_arg.calc_no
	AND	t1.calc_rec_typ = c_calc_rec_st_wip
	AND	t1.calc_grp_cd = t2.calc_grp_cd
	AND	t1.calc_no = t2.calc_no
	AND	t1.top_rec_no = t2.top_rec_no
	AND	t2.lvl = 0
	;

	INSERT INTO mgt_acc_cost (
		calc_no, calc_grp_cd,
		inpt_rec_no, wk_rec_no,
		oper_act_no, oper_cd, oper_seq,
		expns_cd,
		act_cost, std_cost,
		sml_inpt_rec_no, top_rec_no,
		loc_cd, str_ln_cd,
		oper_cost_flg, expns_typ,
		diff_qty, diff_wk, diff_up, diff_rt, diff_std,
		diff_a, diff_b, diff_c, diff_d, diff_e
		)
	SELECT	l_tmp_no, t2.calc_grp_cd,
		t2.top_rec_no, MIN(t2.wk_rec_no),
		MIN(t2.oper_act_no), MIN(t2.oper_cd), MIN(t2.oper_seq),
		t2.expns_cd,
		SUM(t2.act_cost), SUM(t2.std_cost),
		t2.top_rec_no, t2.top_rec_no,
		MIN(t2.loc_cd), MIN(t2.str_ln_cd),
		MIN(t2.oper_cost_flg), t2.expns_typ,
		SUM(t2.diff_qty), SUM(t2.diff_wk), SUM(t2.diff_up), SUM(t2.diff_rt), SUM(t2.diff_std),
		SUM(t2.diff_a), SUM(t2.diff_b), SUM(t2.diff_c), SUM(t2.diff_d), SUM(t2.diff_e)
	FROM	mgt_acc_top t1, mgt_acc_cost t2
	WHERE	0=0
	AND	t1.calc_grp_cd = i_arg.calc_grp_cd
	AND	t1.calc_no = i_arg.calc_no
	AND	t1.calc_rec_typ = c_calc_rec_st_wip
	AND	t1.calc_grp_cd = t2.calc_grp_cd
	AND	t1.calc_no = t2.calc_no
	AND	t1.top_rec_no = t2.top_rec_no
	GROUP BY t2.calc_grp_cd, t2.top_rec_no,
		t2.expns_cd, t2.expns_typ
	;

	COMMIT ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_POST.P_SET_ST_DATA') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_set_st_data (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR,
	IN i_st_ym TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	月初情報を前月データの計算結果として作成する
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/
DECLARE
	l_arg mgt_arg%ROWTYPE ;
BEGIN
	l_arg.calc_grp_cd := i_calc_grp_cd ;
	l_arg.calc_no := i_calc_no ;
	l_arg.st_ym := i_st_ym ;

	CALL mgpa_sca_post$p_set_st_data(l_arg) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_procz (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	複数回の計算を行うときの最後の処理
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argレコード
<HISTORY>
**************************************************************************/
DECLARE
	c_wip_loc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_BATCH_TYP', 'WIP_LOC') ; /* 場所別仕掛原価データ作成処理 */
	c_io CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_BATCH_TYP', 'IO') ; /* 原価受払表データ作成処理 */

	c_cost_calc_calc_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'CALC_STK') ;
	c_cost_calc_not_stk		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'NOT_STK') ;

	l_wip_loc_flg CHAR(1) ;
	l_io_flg CHAR(1) ;

	x RECORD ;
	x1 RECORD ;
	x2 RECORD ;
BEGIN
	<<PROC_FIN>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_POST.P_PROCZ') ;

		CALL mgpa_set_itm_ext$p_itm_ext_null(i_arg) ;

		IF i_arg.data_check_flg = '1' THEN
			EXIT PROC_FIN ;
		END IF ;

		l_wip_loc_flg := '1' ;
		l_io_flg := '1' ;
		FOR x IN
			SELECT	t.batch_typ
			FROM	mgt_batch_out t
			WHERE	0=0
			AND	t.calc_grp_cd = i_arg.calc_grp_cd
		LOOP
			CASE x.batch_typ
			WHEN c_wip_loc THEN
				l_wip_loc_flg := '0' ;
			WHEN c_io THEN
				l_io_flg := '0' ;
			ELSE
				NULL ;
			END CASE ;
		END LOOP ;

		IF i_arg.cost_calc_typ = c_cost_calc_calc_stk THEN
			CALL mgpa_sca_post$p_set_other_trd(i_arg) ;
			IF l_io_flg = '1' THEN
				CALL mgpa_io$p_main(i_arg.calc_grp_cd, i_arg.calc_no) ;
			END IF ;
		END IF ;

		IF i_arg.cost_calc_typ IN (c_cost_calc_calc_stk, c_cost_calc_not_stk) THEN
			IF l_wip_loc_flg = '1' THEN
				CALL mgpa_wip_loc$p_main(i_arg.calc_grp_cd, i_arg.calc_no) ;
			END IF ;

			IF mgpa_calc_fix$f_chk_fix(i_arg.calc_grp_cd, i_arg.end_ym) = '0' THEN
				/* 最終年月が未確定のときのみ参照用のレコード及び前月データを作成する */
				CALL mgpa_sca_post$p_set_st_data(i_arg) ;
				CALL mgpa_calc_fix$p_ins_ym_no(i_arg.calc_grp_cd, i_arg.calc_no) ;
				COMMIT ;
			END IF ;
		END IF ;

		FOR x1 IN
			SELECT	m.rpt_ptn_cd,
				m.rpt_key_cd
			FROM	mam_calc_rpt_ptn m
			WHERE	0=0
			AND	m.calc_grp_cd = i_arg.calc_grp_cd
			AND	m.auto_flg = '1'
		LOOP
			CALL mgpa_rpt$p_main(i_arg.calc_grp_cd, i_arg.calc_no, x1.rpt_ptn_cd, x1.rpt_key_cd, '0') ;
		END LOOP ;

		FOR x2 IN
			SELECT	m.cost_io_id
			FROM	mam_calc_cost_io m
			WHERE	0=0
			AND	m.calc_grp_cd = i_arg.calc_grp_cd
			AND	m.auto_flg = '1'
		LOOP
			CALL mgpa_cost_io$p_main(i_arg.calc_grp_cd, i_arg.calc_no, x2.cost_io_id, '0') ;
		END LOOP ;

		IF i_arg.carry_flg = '1'
		AND	i_arg.cost_calc_typ IN (c_cost_calc_calc_stk, c_cost_calc_not_stk) THEN
			CALL mgpa_carry_over$p_main(i_arg.calc_grp_cd, i_arg.calc_no) ;
		END IF ;
	END ;

	CALL mgpa_arg$p_calc_fin(i_arg.calc_grp_cd, i_arg.calc_no, '0') ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_POST.P_PROCZ') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_procx (
	IN i_arg mgt_arg
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	複数回の計算を行うときの処理
<REMARKS>

<ARGUMENTS>
<IN>	i_arg
		mgt_argレコード
<HISTORY>
**************************************************************************/
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SCA_POST.P_PROCX') ;

	CALL mgpa_arg$p_cnt_up(i_arg.calc_grp_cd, i_arg.calc_no) ;

	CALL mgpa_sca_post$p_set_so_alc(i_arg) ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SCA_POST.P_PROCX') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca_post$p_main (
	IN i_calc_grp_cd VARCHAR,
	IN i_calc_no VARCHAR
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算後処理のメイン処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	l_arg	mgt_arg%ROWTYPE ;
BEGIN
	l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;

	IF l_arg.calc_exec_cnt < l_arg.calc_cnt THEN
		CALL mgpa_sca_post$p_procx(l_arg) ;
	ELSE
		CALL mgpa_sca_post$p_procz(l_arg) ;
	END IF ;

	COMMIT ;
END ;
$BODY$
LANGUAGE plpgsql
;
