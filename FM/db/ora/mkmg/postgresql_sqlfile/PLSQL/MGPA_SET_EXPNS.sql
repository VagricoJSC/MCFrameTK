\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_set_expns$f_get_ave_fix (
	 IN i_key	mgt_ave_fix
)
RETURNS mgt_ave_fix
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_ave_fixのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	i_key
		mgt_ave_fixのキーとなるレコード
<RETURNVALUE>
	対象となるmgt_ave_fixのレコード
<HISTORY>
**********************************************************/
DECLARE
	c_null_val	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL') ;
	c_asst_oth	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH') ;
	c_unit_calc_calc	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','CALC') ;

	l_rec	mgt_ave_fix%ROWTYPE ;
	l_wg_cd	mam_wg.wg_cd%TYPE ;
	x	RECORD ;
BEGIN
	SELECT	COALESCE(t.runtime_wg_cd, i_key.wg_cd)
	INTO	STRICT l_wg_cd
	FROM	mam_calc_grp t
	WHERE t.calc_grp_cd = i_key.calc_grp_cd
	;

	FOR x IN
		SELECT	t1.*
		FROM	mgt_ave_fix t1, mgt_calc_itm t2, mgt_calc_ptn t3
		WHERE	0=0
		AND	t1.calc_no = t2.calc_no
		AND	t1.calc_grp_cd = t2.calc_grp_cd
		AND	t1.itm_cd = t2.itm_cd
		AND	t1.itm_sub1 = t2.itm_sub1
		AND	t1.itm_sub2 = t2.itm_sub2
		AND	t1.itm_sub3 = t2.itm_sub3
		AND	t1.wg_cd = t2.wg_cd
		AND	t2.calc_no = t3.calc_no
		AND	t2.calc_grp_cd = t3.calc_grp_cd
		AND	t2.calc_ptn_cd = t3.calc_ptn_cd
		AND	t1.calc_grp_cd = i_key.calc_grp_cd
		AND	t1.wg_cd = l_wg_cd
		AND	t1.ym <= i_key.ym
		AND	COALESCE(t1.mng_dpt_cd, c_null_val) =
			CASE t3.dpt_typ
				WHEN c_unit_calc_calc THEN i_key.mng_dpt_cd
				ELSE c_null_val
			END
		AND	t1.itm_cd = i_key.itm_cd
		AND	t1.itm_sub1 = i_key.itm_sub1
		AND	t1.itm_sub2 = i_key.itm_sub2
		AND	t1.itm_sub3 = i_key.itm_sub3
		AND	t1.lot_no =
			CASE t3.lot_typ
				WHEN c_unit_calc_calc THEN i_key.lot_no
				ELSE c_null_val
			END
		AND	t1.sublot_no =
			CASE t3.sublot_typ
				WHEN c_unit_calc_calc THEN i_key.sublot_no
				ELSE c_null_val
			END
		AND	t1.sno1 =
			CASE t3.sno1_typ
				WHEN c_unit_calc_calc THEN i_key.sno1
				ELSE c_null_val
			END
		AND	t1.sno2 =
			CASE t3.sno2_typ
				WHEN c_unit_calc_calc THEN i_key.sno2
				ELSE c_null_val
			END
		AND	t1.sno3 =
			CASE t3.sno3_typ
				WHEN c_unit_calc_calc THEN i_key.sno3
				ELSE c_null_val
			END
		AND	t1.sno4 =
			CASE t3.sno4_typ
				WHEN c_unit_calc_calc THEN i_key.sno4
				ELSE c_null_val
			END
		AND	(
			i_key.asst_typ = c_asst_oth AND t1.sppl_cd = i_key.sppl_cd
			OR
			i_key.asst_typ <> c_asst_oth
			)
		AND	t1.asst_typ = i_key.asst_typ
		AND	t1.ave_upri <> 0
		ORDER BY t1.ym DESC
	LOOP
		l_rec := x ;
		EXIT ;
	END LOOP ;

	RETURN l_rec ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_set_expns$p_inpt (
	 IN i_err_flg	CHARACTER DEFAULT '1'
)
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	投入実績費目別原価に金額をセットする
<REMARKS>
	事前にmgw_expns_inptを作成しておく必要がある
<ARGUMENTS>
<IN>	i_err_flg
		エラーＦＬＧ
<HISTORY>
*************************************************************************/
DECLARE
	c_set_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','STD') ;
	c_set_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','ZERO') ;
	c_set_ave		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE') ;
	c_set_ave_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE_STD') ;
	c_eval_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','STD_UNIT') ;
	c_eval_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','ZERO') ;
	c_eval_expns	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS') ;

	l_ave_fix	mgt_ave_fix%ROWTYPE ;
	l_parm_itm_sub_typ	mam_sys_parm.parm_val%TYPE ;
	l_parm_sno_typ	mam_sys_parm.parm_val%TYPE ;

	l_cnt	NUMERIC ;
	l_log_no		fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE ;
	l_msg	VARCHAR[] ;
	l_err_msg	VARCHAR[] ;
	x	RECORD ;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_EXPNS.P_INPT') ;

	l_parm_itm_sub_typ :=  mapa_comm$f_get_parm('ITM_SUB_TYP') ;
	l_parm_sno_typ := mapa_comm$f_get_parm('SNO_TYP') ;

	UPDATE mgt_act_inpt t
	SET rec_eval_typ = (
			SELECT
				CASE
					WHEN w2.amt_set_typ = c_set_std THEN c_eval_std
					WHEN w2.amt_set_typ = c_set_zero THEN c_eval_zero
					WHEN w2.amt_set_typ = c_set_ave THEN c_eval_expns
					WHEN w2.amt_set_typ = c_set_ave_std THEN c_eval_expns
					ELSE NULL
				END
			FROM	mgw_expns_inpt w2
			WHERE	0=0
			AND	w2.act_inpt_id = t.act_inpt_id
			AND	w2.act_inpt_id_sub = t.act_inpt_id_sub
		)
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_inpt w
			WHERE	0=0
			AND	w.act_inpt_id = t.act_inpt_id
			AND	w.act_inpt_id_sub = t.act_inpt_id_sub
			)
	;

	DELETE FROM	mgt_act_inpt_expns t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_inpt w
			WHERE	0=0
			AND	w.act_inpt_id = t.act_inpt_id
			AND	w.act_inpt_id_sub = t.act_inpt_id_sub
			)
	;

	FOR x IN
		SELECT	w.*
		FROM	mgw_expns_inpt w
		WHERE	0=0
		AND	w.amt_set_typ IN (c_set_ave, c_set_ave_std)
	LOOP
		l_ave_fix.calc_grp_cd := x.calc_grp_cd ;
		l_ave_fix.wg_cd := x.wg_cd ;
		l_ave_fix.ym := x.ym ;
		l_ave_fix.mng_dpt_cd := x.mng_dpt_cd ;
		l_ave_fix.itm_cd := x.itm_cd ;
		l_ave_fix.itm_sub1 := x.itm_sub1 ;
		l_ave_fix.itm_sub2 := x.itm_sub2 ;
		l_ave_fix.itm_sub3 := x.itm_sub3 ;
		l_ave_fix.lot_no := x.lot_no ;
		l_ave_fix.sublot_no := x.sublot_no ;
		l_ave_fix.sno1 := x.sno1 ;
		l_ave_fix.sno2 := x.sno2 ;
		l_ave_fix.sno3 := x.sno3 ;
		l_ave_fix.sno4 := x.sno4 ;
		l_ave_fix.sppl_cd := x.stk_bp_cd ;
		l_ave_fix.asst_typ := x.asst_typ ;

		l_ave_fix := mgpa_set_expns$f_get_ave_fix(l_ave_fix) ;

		INSERT INTO mgt_act_inpt_expns (
			act_inpt_id,
			act_inpt_id_sub,
			expns_cd,
			amt
			)
		SELECT	x.act_inpt_id,
			x.act_inpt_id_sub,
			t.expns_cd,
			mgpa_calc_itm_rnd$f_rnd_amt(x.qty * t.act_cost / l_ave_fix.std_qty)
		FROM	mgt_acc_sml_cost t
		WHERE	0=0
		AND	t.calc_no = l_ave_fix.calc_no
		AND	t.calc_grp_cd = l_ave_fix.calc_grp_cd
		AND	t.top_rec_no = l_ave_fix.top_rec_no
		AND	t.act_cost <> 0
		;
		GET DIAGNOSTICS l_cnt = ROW_COUNT ;

		IF l_cnt = 0 THEN
			l_err_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_inpt_id, x.act_inpt_id_sub
					) ;

			l_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_inpt_id, x.act_inpt_id_sub
					) ;

			IF x.amt_set_typ = c_set_ave_std THEN
				UPDATE mgt_act_inpt t
				SET rec_eval_typ = c_eval_std
				WHERE	0=0
				AND	t.act_inpt_id = x.act_inpt_id
				AND	t.act_inpt_id_sub = x.act_inpt_id_sub
				;

				IF i_err_flg = '0' THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0042', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
				ELSE
					COMMIT ;
					CALL fcpa_err$raise_app_err('MGBBD0042', l_err_msg) ;
				END IF ;

			ELSIF i_err_flg = '0' THEN
				UPDATE mgt_act_inpt t
				SET rec_eval_typ = NULL
				WHERE	0=0
				AND	t.act_inpt_id = x.act_inpt_id
				AND	t.act_inpt_id_sub = x.act_inpt_id_sub
				;
				CALL fcpa_batch_log$p_data_log('MGBBD0041', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
			ELSE
				CALL fcpa_err$raise_app_err('MGBBD0041', l_err_msg) ;
			END IF ;
		ELSE
			DELETE FROM mgt_act_inpt_expns t
			WHERE t.act_inpt_id = x.act_inpt_id
			AND t.act_inpt_id_sub = x.act_inpt_id_sub
			AND t.amt = 0;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgt_act_inpt_expns t
			WHERE t.act_inpt_id = x.act_inpt_id
			AND t.act_inpt_id_sub = x.act_inpt_id_sub;

			IF l_cnt = 0 THEN
				UPDATE mgt_act_inpt t
				SET rec_eval_typ = c_eval_zero
				WHERE t.act_inpt_id = x.act_inpt_id
				AND t.act_inpt_id_sub = x.act_inpt_id_sub;

				l_msg := fcpa_err$msg_binder(
						x.calc_grp_cd,
						fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
						x.wg_cd, x.mng_dpt_cd,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
						x.lot_no, x.sublot_no,
						mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
						x.asst_typ,
						x.act_inpt_id, x.act_inpt_id_sub
						) ;
				CALL fcpa_batch_log$p_data_log('MGBBD0052', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
			END IF ;
		END IF ;
	END LOOP ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_EXPNS.P_INPT') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_set_expns$p_io (
	 IN i_err_flg CHARACTER DEFAULT '1'
)
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	入出庫実績費目別原価に金額をセットする
<REMARKS>
	事前にMGW_EXPNS_IOを作成しておく必要がある
<ARGUMENTS>
<IN>	I_ERR_FLG
		エラーＦＬＧ
<HISTORY>
*************************************************************************/
DECLARE
	c_set_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','STD') ;
	c_set_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','ZERO') ;
	c_set_ave		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE') ;
	c_set_ave_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE_STD') ;
	c_eval_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','STD_UNIT') ;
	c_eval_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','ZERO') ;
	c_eval_expns	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS') ;

	l_ave_fix	mgt_ave_fix%ROWTYPE ;
	l_parm_itm_sub_typ	mam_sys_parm.parm_val%TYPE ;
	l_parm_sno_typ	mam_sys_parm.parm_val%TYPE ;

	l_cnt	NUMERIC ;
	l_log_no		fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE ;
	l_msg	VARCHAR[] ;
	l_err_msg	VARCHAR[] ;
	x	RECORD ;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_EXPNS.P_IO') ;

	l_parm_itm_sub_typ :=  mapa_comm$f_get_parm('ITM_SUB_TYP') ;
	l_parm_sno_typ := mapa_comm$f_get_parm('SNO_TYP') ;

	UPDATE mgt_act_io t
	SET rec_eval_typ = (
			SELECT
				CASE
					WHEN w2.amt_set_typ = c_set_std THEN c_eval_std
					WHEN w2.amt_set_typ = c_set_zero THEN c_eval_zero
					WHEN w2.amt_set_typ = c_set_ave THEN c_eval_expns
					WHEN w2.amt_set_typ = c_set_ave_std THEN c_eval_expns
					ELSE NULL
				END
			FROM	mgw_expns_io w2
			WHERE	0=0
			AND	w2.act_io_id = t.act_io_id
			AND	w2.act_io_id_sub = t.act_io_id_sub
		)
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_io w
			WHERE	0=0
			AND	w.act_io_id = t.act_io_id
			AND	w.act_io_id_sub = t.act_io_id_sub
			)
	;

	DELETE FROM	mgt_act_io_expns t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_io w
			WHERE	0=0
			AND	w.act_io_id = t.act_io_id
			AND	w.act_io_id_sub = t.act_io_id_sub
			)
	;

	FOR x IN
		SELECT	w.*
		FROM	mgw_expns_io w
		WHERE	0=0
		AND	w.amt_set_typ IN (c_set_ave, c_set_ave_std)
	LOOP
		l_ave_fix.calc_grp_cd := x.calc_grp_cd ;
		l_ave_fix.wg_cd := x.wg_cd ;
		l_ave_fix.ym := x.ym ;
		l_ave_fix.mng_dpt_cd := x.mng_dpt_cd ;
		l_ave_fix.itm_cd := x.itm_cd ;
		l_ave_fix.itm_sub1 := x.itm_sub1 ;
		l_ave_fix.itm_sub2 := x.itm_sub2 ;
		l_ave_fix.itm_sub3 := x.itm_sub3 ;
		l_ave_fix.lot_no := x.lot_no ;
		l_ave_fix.sublot_no := x.sublot_no ;
		l_ave_fix.sno1 := x.sno1 ;
		l_ave_fix.sno2 := x.sno2 ;
		l_ave_fix.sno3 := x.sno3 ;
		l_ave_fix.sno4 := x.sno4 ;
		l_ave_fix.sppl_cd := x.stk_bp_cd ;
		l_ave_fix.asst_typ := x.asst_typ ;

		l_ave_fix := mgpa_set_expns$f_get_ave_fix(l_ave_fix) ;

		INSERT INTO mgt_act_io_expns (
			act_io_id,
			act_io_id_sub,
			expns_cd,
			amt
			)
		SELECT
			x.act_io_id,
			x.act_io_id_sub,
			t.expns_cd,
			mgpa_calc_itm_rnd$f_rnd_amt(x.qty * t.act_cost / l_ave_fix.std_qty)
		FROM	mgt_acc_sml_cost t
		WHERE	0=0
		AND	t.calc_no = l_ave_fix.calc_no
		AND	t.calc_grp_cd = l_ave_fix.calc_grp_cd
		AND	t.top_rec_no = l_ave_fix.top_rec_no
		AND	t.act_cost <> 0
		;
		GET DIAGNOSTICS l_cnt = ROW_COUNT ;

		IF l_cnt = 0 THEN
			l_err_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_io_id, x.act_io_id_sub
					) ;

			l_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_io_id, x.act_io_id_sub
					) ;

			IF x.amt_set_typ = c_set_ave_std THEN
				UPDATE mgt_act_io t
				SET rec_eval_typ = c_eval_std
				WHERE	0=0
				AND	t.act_io_id = x.act_io_id
				AND	t.act_io_id_sub = x.act_io_id_sub
				;

				IF i_err_flg = '0' THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0042', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
				ELSE
					COMMIT ;
					CALL fcpa_err$raise_app_err('MGBBD0042', l_err_msg) ;
				END IF ;

			ELSIF i_err_flg = '0' THEN
				UPDATE mgt_act_io t
				SET rec_eval_typ = NULL
				WHERE	0=0
				AND	t.act_io_id = x.act_io_id
				AND	t.act_io_id_sub = x.act_io_id_sub
				;
				CALL fcpa_batch_log$p_data_log('MGBBD0041', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;

			ELSE
				CALL fcpa_err$raise_app_err('MGBBD0041', l_err_msg) ;
			END IF ;
		ELSE
			DELETE FROM mgt_act_io_expns t
			WHERE t.act_io_id = x.act_io_id
			AND t.act_io_id_sub = x.act_io_id_sub
			AND t.amt = 0;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgt_act_io_expns t
			WHERE t.act_io_id = x.act_io_id
			AND t.act_io_id_sub = x.act_io_id_sub;

			IF l_cnt = 0 THEN
				UPDATE mgt_act_io t
				SET rec_eval_typ = c_eval_zero
				WHERE t.act_io_id = x.act_io_id
				AND t.act_io_id_sub = x.act_io_id_sub;

				l_msg := fcpa_err$msg_binder(
						x.calc_grp_cd,
						fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
						x.wg_cd, x.mng_dpt_cd,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
						x.lot_no, x.sublot_no,
						mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
						x.asst_typ,
						x.act_io_id, x.act_io_id_sub
						) ;
				CALL fcpa_batch_log$p_data_log('MGBBD0052', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
			END IF ;
		END IF ;
	END LOOP ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_EXPNS.P_IO') ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_set_expns$p_sls (
	 IN i_err_flg CHARACTER DEFAULT '1'
)
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	売上実績費目別原価に金額をセットする
<REMARKS>
	事前にmgw_expns_slsを作成しておく必要がある
<ARGUMENTS>
<IN>	i_err_flg
		エラーＦＬＧ
<HISTORY>
*************************************************************************/
DECLARE
	c_set_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','STD') ;
	c_set_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','ZERO') ;
	c_set_ave		CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE') ;
	c_set_ave_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_AMT_SET_TYP','AVE_STD') ;
	c_eval_std		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','STD_UNIT') ;
	c_eval_zero		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','ZERO') ;
	c_eval_expns	CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS') ;

	l_ave_fix	mgt_ave_fix%ROWTYPE ;
	l_parm_itm_sub_typ	mam_sys_parm.parm_val%TYPE ;
	l_parm_sno_typ	mam_sys_parm.parm_val%TYPE ;

	l_cnt	NUMERIC ;
	l_log_no		fct_batch_log_msg.batch_log_no%TYPE ;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE ;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE ;
	l_msg	VARCHAR[] ;
	l_err_msg	VARCHAR[] ;
	x	RECORD ;
BEGIN
	/* 処理を開始しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_SET_EXPNS.P_SLS') ;

	l_parm_itm_sub_typ :=  mapa_comm$f_get_parm('ITM_SUB_TYP') ;
	l_parm_sno_typ := mapa_comm$f_get_parm('SNO_TYP') ;

	UPDATE mgt_act_sls t
	SET rec_eval_typ = (
			SELECT
				CASE
					WHEN w2.amt_set_typ = c_set_std THEN c_eval_std
					WHEN w2.amt_set_typ = c_set_zero THEN c_eval_zero
					WHEN w2.amt_set_typ = c_set_ave THEN c_eval_expns
					WHEN w2.amt_set_typ = c_set_ave_std THEN c_eval_expns
					ELSE NULL
				END
			FROM	mgw_expns_sls w2
			WHERE	0=0
			AND	w2.act_sls_id = t.act_sls_id
			AND	w2.act_sls_id_sub = t.act_sls_id_sub
		)
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_sls w
			WHERE	0=0
			AND	w.act_sls_id = t.act_sls_id
			AND	w.act_sls_id_sub = t.act_sls_id_sub
			)
	;

	DELETE FROM	mgt_act_sls_expns t
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	mgw_expns_sls w
			WHERE	0=0
			AND	w.act_sls_id = t.act_sls_id
			AND	w.act_sls_id_sub = t.act_sls_id_sub
			)
	;

	FOR x IN
		SELECT	w.*
		FROM	mgw_expns_sls w
		WHERE	0=0
		AND	w.amt_set_typ IN (c_set_ave, c_set_ave_std)
	LOOP
		l_ave_fix.calc_grp_cd := x.calc_grp_cd ;
		l_ave_fix.wg_cd := x.wg_cd ;
		l_ave_fix.ym := x.ym ;
		l_ave_fix.mng_dpt_cd := x.mng_dpt_cd ;
		l_ave_fix.itm_cd := x.itm_cd ;
		l_ave_fix.itm_sub1 := x.itm_sub1 ;
		l_ave_fix.itm_sub2 := x.itm_sub2 ;
		l_ave_fix.itm_sub3 := x.itm_sub3 ;
		l_ave_fix.lot_no := x.lot_no ;
		l_ave_fix.sublot_no := x.sublot_no ;
		l_ave_fix.sno1 := x.sno1 ;
		l_ave_fix.sno2 := x.sno2 ;
		l_ave_fix.sno3 := x.sno3 ;
		l_ave_fix.sno4 := x.sno4 ;
		l_ave_fix.sppl_cd := x.stk_bp_cd ;
		l_ave_fix.asst_typ := x.asst_typ ;

		l_ave_fix := mgpa_set_expns$f_get_ave_fix(l_ave_fix) ;

		INSERT INTO mgt_act_sls_expns (
			act_sls_id,
			act_sls_id_sub,
			expns_cd,
			amt
			)
		SELECT
			x.act_sls_id,
			x.act_sls_id_sub,
			t.expns_cd,
			mgpa_calc_itm_rnd$f_rnd_amt(x.qty * t.act_cost / l_ave_fix.std_qty)
		FROM	mgt_acc_sml_cost t
		WHERE	0=0
		AND	t.calc_no = l_ave_fix.calc_no
		AND	t.calc_grp_cd = l_ave_fix.calc_grp_cd
		AND	t.top_rec_no = l_ave_fix.top_rec_no
		AND	t.act_cost <> 0
		;
		GET DIAGNOSTICS l_cnt = ROW_COUNT ;

		IF l_cnt = 0 THEN
			l_err_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_sls_id, x.act_sls_id_sub
					) ;

			l_msg := fcpa_err$msg_binder(
					x.calc_grp_cd,
					fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
					x.wg_cd, x.mng_dpt_cd,
					mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
					x.lot_no, x.sublot_no,
					mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
					x.asst_typ,
					x.act_sls_id, x.act_sls_id_sub
					) ;

			IF x.amt_set_typ = c_set_ave_std THEN
				UPDATE mgt_act_sls t
				SET rec_eval_typ = c_eval_std
				WHERE	0=0
				AND	t.act_sls_id = x.act_sls_id
				AND	t.act_sls_id_sub = x.act_sls_id_sub
				;

				IF i_err_flg = '0' THEN
					CALL fcpa_batch_log$p_data_log('MGBBD0042', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
				ELSE
					COMMIT ;
 					CALL fcpa_err$raise_app_err('MGBBD0042', l_err_msg) ;
				END IF ;
			ELSIF i_err_flg = '0' THEN
				UPDATE mgt_act_sls t
				SET rec_eval_typ = NULL
				WHERE	0=0
				AND	t.act_sls_id = x.act_sls_id
				AND	t.act_sls_id_sub = x.act_sls_id_sub
				;
				CALL fcpa_batch_log$p_data_log('MGBBD0041', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
			ELSE
				CALL fcpa_err$raise_app_err('MGBBD0041', l_err_msg) ;
			END IF ;
		ELSE
			DELETE FROM mgt_act_sls_expns t
			WHERE t.act_sls_id = x.act_sls_id
			AND t.act_sls_id_sub = x.act_sls_id_sub
			AND t.amt = 0;

			SELECT COUNT(*) INTO STRICT l_cnt FROM mgt_act_sls_expns t
			WHERE t.act_sls_id = x.act_sls_id
			AND t.act_sls_id_sub = x.act_sls_id_sub;

			IF l_cnt = 0 THEN
				UPDATE mgt_act_sls t
				SET rec_eval_typ = c_eval_zero
				WHERE t.act_sls_id = x.act_sls_id
				AND t.act_sls_id_sub = x.act_sls_id_sub;

				l_msg := fcpa_err$msg_binder(
						x.calc_grp_cd,
						fcpa_date_util$f_to_char(x.ym, fcpa_date_util$y4m()),
						x.wg_cd, x.mng_dpt_cd,
						mapa_comm$f_to_disp_itm(x.itm_cd, x.itm_sub1, x.itm_sub2, x.itm_sub3, l_parm_itm_sub_typ),
						x.lot_no, x.sublot_no,
						mapa_comm$f_to_disp_sno(x.sno1, x.sno2, x.sno3, x.sno4, l_parm_sno_typ),
						x.asst_typ,
						x.act_sls_id, x.act_sls_id_sub
						) ;
				CALL fcpa_batch_log$p_data_log('MGBBD0052', l_msg, l_log_no, l_log_sub_key1, l_log_sub_key2) ;
			END IF ;
		END IF ;
	END LOOP ;

	/* 処理が終了しました。{1} */
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_SET_EXPNS.P_SLS') ;

END ;
$BODY$
LANGUAGE plpgsql
;

