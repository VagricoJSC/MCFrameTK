\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_arg$p_get_calc_no_sub (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_length INTEGER,
	 INOUT o_calc_no VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算ＮＯの発番・取得を行う
<REMARKS>
	mgt_calc_noの更新
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_length
		原価計算ＮＯの桁数
<OUT>	o_calc_no
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
BEGIN

	SELECT	(t.calc_no::INTEGER + 1)::VARCHAR
	INTO STRICT	o_calc_no
	FROM	mgt_calc_no t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	FOR UPDATE
	;

	IF LENGTH(o_calc_no) < i_length THEN
		o_calc_no := LPAD(o_calc_no, i_length, '0') ;
	END IF ;

	UPDATE	mgt_calc_no t
	SET	calc_no = o_calc_no
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_get_calc_no (
	 IN i_calc_grp_cd VARCHAR,
	 INOUT o_calc_no VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算ＮＯの発番・取得を行う
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<OUT>	o_calc_no
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
DECLARE
	c_def_length	CONSTANT INTEGER := 15 ;
	c_min_length	CONSTANT INTEGER := 5 ;

	l_cnt		NUMERIC ;
	l_calc_length	INTEGER ;
	l_msg		VARCHAR[] ;
	x	RECORD ;
BEGIN
	o_calc_no := NULL ;

	BEGIN
		SELECT	COALESCE(MIN(m.parm_val::NUMERIC), c_def_length)
		INTO STRICT	l_calc_length
		FROM	mgt_parm m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
		AND	m.parm_key = 'ETC_CALC_LENGTH'
		;

		IF l_calc_length < c_min_length OR l_calc_length > c_def_length THEN
			l_calc_length := c_def_length ;
		END IF ;
	EXCEPTION
		WHEN others THEN
			l_calc_length := c_def_length ;
	END ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_calc_no t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	IF l_cnt = 0 THEN
		o_calc_no := LPAD('1', l_calc_length, '0') ;
		BEGIN
			INSERT INTO mgt_calc_no (
				calc_grp_cd,
				calc_no
				)
			VALUES (
				i_calc_grp_cd,
				o_calc_no
				)
			;
		EXCEPTION
			WHEN others THEN
				CALL mgpa_arg$p_get_calc_no_sub(i_calc_grp_cd, l_calc_length, o_calc_no) ;
		END ;
	ELSE
		CALL mgpa_arg$p_get_calc_no_sub(i_calc_grp_cd, l_calc_length, o_calc_no) ;
	END IF ;

	IF o_calc_no IS NULL THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd) ;
		CALL fcpa_err$raise_app_err('MGBXD0006', l_msg) ;
	END IF ;

	FOR x IN
		SELECT	m.parm_val AS pre
		FROM	mgt_parm m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
		AND	m.parm_key = 'ETC_CALC_PRE'
		AND	m.parm_val IS NOT NULL
	LOOP
		o_calc_no := x.pre || o_calc_no ;
	END LOOP ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_set_arg (
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_calc_grp_cd VARCHAR,
	 IN i_st_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_end_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_xrate_cd VARCHAR,
	 IN i_itm_limit_flg CHARACTER,
	 IN i_check_flg CHARACTER,
	 IN i_carry_flg CHARACTER,
	 IN i_rmrks VARCHAR,
	 IN i_sub_char1 VARCHAR,
	 IN i_sub_char2 VARCHAR,
	 IN i_sub_char3 VARCHAR,
	 INOUT o_calc_no VARCHAR,
	 INOUT o_calc_cnt NUMERIC
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	mgt_arg_usrに対するデータ作成を行う
<REMARKS>

<ARGUMENTS>
<IN>	i_term
		対象期
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_st_ym
		対象期間先頭月
<IN>	i_end_ym
		対象期間末尾月
<IN>	i_xrate_cd
		為替レートＣＤ
<IN>	i_itm_limit_flg
		品目指定ＦＬＧ
<IN>	i_check_flg
		データ確認計算ＦＬＧ
<IN>	i_carry_flg
		繰越ＦＬＧ
<IN>	i_rmrks
		備考
<IN>	i_sub_char1
		予備１
<IN>	i_sub_char2
		予備２
<IN>	i_sub_char3
		予備３
<OUT>	o_calc_no
		原価計算ＮＯ
<OUT>	o_calc_cnt
		計算回数
<HISTORY>
**************************************************************************/
DECLARE
	l_calc_grp	mam_calc_grp%ROWTYPE ;
	l_usr		fcm_user.user_id%TYPE ;
	l_parm_cnt	NUMERIC ;
	l_itm_limit_flg	CHAR(1) ;
	l_msg		VARCHAR[] ;
	l_stk_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
	l_wip_calc_grp_cd	mam_calc_grp.calc_grp_cd%TYPE ;
	l_etc_itm_ext	mgt_parm.parm_val%TYPE ;
	l_pre_calc_grp	mam_calc_grp.calc_grp_cd%TYPE ;
	l_pre_calc_no	mgt_arg.calc_no%TYPE ;
	l_pre_etc_itm_ext	mgt_parm.parm_val%TYPE ;
BEGIN
	/*** 原価計算ＮＯの取得 ***/
	CALL mgpa_arg$p_get_calc_no(i_calc_grp_cd, o_calc_no) ;

	/*** 計算グループマスタ情報の取得 ***/
	l_calc_grp := mgpa_calc_grp$f_get_rec(i_calc_grp_cd) ;

	/*** 原価計算設定情報の作成 ***/
	SELECT	MAX(t.ins_usr_id)
	INTO STRICT	l_usr
	FROM	mgt_arg_usr t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	IF l_usr IS NOT NULL THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, l_usr) ;
		CALL fcpa_err$raise_app_err('MGBDD0009', l_msg) ;
	END IF ;

	SELECT	MIN(m.parm_val)
	INTO STRICT	l_stk_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_calc_grp_cd
	AND	m.parm_key = 'ETC_STK_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	AND m.parm_val <> i_calc_grp_cd
	;

	SELECT	MIN(m.parm_val)
	INTO STRICT	l_wip_calc_grp_cd
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_calc_grp_cd
	AND	m.parm_key = 'ETC_WIP_CALC_GRP'
	AND	m.parm_val IS NOT NULL
	AND m.parm_val <> i_calc_grp_cd
	;

	SELECT	MIN(m.parm_val)
	INTO STRICT	l_etc_itm_ext
	FROM	mgt_parm m
	WHERE	0=0
	AND	m.calc_grp_cd = i_calc_grp_cd
	AND	m.parm_key = 'ETC_ITM_EXT'
	AND	m.parm_val IS NOT NULL
	;

	BEGIN
		IF l_stk_calc_grp_cd IS NOT NULL THEN
			SELECT	t.calc_grp_cd, t.calc_no, t.parm_val
			INTO STRICT	l_pre_calc_grp, l_pre_calc_no, l_pre_etc_itm_ext
			FROM	(
				SELECT	w.calc_grp_cd, w.calc_no, m.parm_val
				FROM
					mgvt_arg_usr w
					LEFT OUTER JOIN mgt_parm m ON (w.calc_grp_cd = m.calc_grp_cd AND m.parm_key = 'ETC_ITM_EXT')
				WHERE	0=0
				AND	w.calc_grp_cd = l_stk_calc_grp_cd
				ORDER BY	m.parm_val
			) t
			WHERE	0=0
			LIMIT 1
			;
		ELSE
			SELECT	t.calc_grp_cd, t.calc_no, t.parm_val
			INTO STRICT	l_pre_calc_grp, l_pre_calc_no, l_pre_etc_itm_ext
			FROM	(
				SELECT	w.calc_grp_cd, w.calc_no, m2.parm_val
				FROM
					mgt_parm m1,
					mgvt_arg_usr w
					LEFT OUTER JOIN mgt_parm m2 ON (w.calc_grp_cd = m2.calc_grp_cd AND m2.parm_key = 'ETC_ITM_EXT')
				WHERE	0=0
				AND	w.calc_grp_cd = m1.calc_grp_cd
				AND	m1.parm_key = 'ETC_STK_CALC_GRP'
				AND	m1.parm_val = i_calc_grp_cd
				ORDER BY	m2.parm_val
			) t
			WHERE	0=0
			LIMIT 1
			;
		END IF ;
	EXCEPTION
	WHEN no_data_found THEN
		l_pre_calc_grp := NULL ;
		l_pre_calc_no := NULL ;
		l_pre_etc_itm_ext := NULL ;
	END ;

	IF l_pre_calc_grp IS NOT NULL AND (l_etc_itm_ext IS NOT NULL OR l_pre_etc_itm_ext IS NOT NULL) THEN
		l_msg := fcpa_err$msg_binder(l_pre_calc_grp, l_pre_calc_no) ;
		CALL fcpa_err$raise_app_err('MGBXD0009', l_msg) ;
	END IF ;

	BEGIN
		IF l_wip_calc_grp_cd IS NOT NULL THEN
			SELECT	t.calc_grp_cd, t.calc_no, t.PARM_VAL
			INTO STRICT	l_pre_calc_grp, l_pre_calc_no, l_pre_etc_itm_ext
			FROM	(
				SELECT	w.calc_grp_cd, w.calc_no, m.parm_val
				FROM
					mgvt_arg_usr w
					LEFT OUTER JOIN mgt_parm m ON (w.calc_grp_cd = m.calc_grp_cd AND m.parm_key = 'ETC_ITM_EXT')
				WHERE	0=0
				AND	w.calc_grp_cd = l_wip_calc_grp_cd
				ORDER BY	m.parm_val
			) t
			WHERE	0=0
			LIMIT 1
			;
		ELSE
			SELECT	t.calc_grp_cd, t.calc_no, t.parm_val
			INTO STRICT	l_pre_calc_grp, l_pre_calc_no, l_pre_etc_itm_ext
			FROM	(
				SELECT	w.calc_grp_cd, w.calc_no, m2.parm_val
				FROM
					mgt_parm m1,
					mgvt_arg_usr w
					LEFT OUTER JOIN mgt_parm m2 ON (w.calc_grp_cd = m2.calc_grp_cd AND m2.parm_key = 'ETC_ITM_EXT')
				WHERE	0=0
				AND	w.calc_grp_cd = m1.calc_grp_cd
				AND	m1.parm_key = 'ETC_WIP_CALC_GRP'
				AND	m1.parm_val = i_calc_grp_cd
				ORDER BY	m2.parm_val
			) t
			WHERE	0=0
			LIMIT 1
			;
		END IF ;
	EXCEPTION
	WHEN no_data_found THEN
		l_pre_calc_grp := NULL ;
		l_pre_calc_no := NULL ;
		l_pre_etc_itm_ext := NULL ;
	END ;

	IF l_pre_calc_grp IS NOT NULL AND (l_etc_itm_ext IS NOT NULL OR l_pre_etc_itm_ext IS NOT NULL) THEN
		l_msg := fcpa_err$msg_binder(l_pre_calc_grp, l_pre_calc_no) ;
		CALL fcpa_err$raise_app_err('MGBXD0009', l_msg) ;
	END IF ;

	l_itm_limit_flg := i_itm_limit_flg ;
	IF l_itm_limit_flg = '0' THEN
		SELECT	COUNT(*)
		INTO STRICT	l_parm_cnt
		FROM	mgt_parm  m
		WHERE	0=0
		AND	m.calc_grp_cd = i_calc_grp_cd
		AND	m.parm_key = 'ETC_ITM_LIMIT'
		AND	m.parm_val = '1'
		;

		IF l_parm_cnt > 0 THEN
			l_itm_limit_flg := '1' ;
		END IF ;
	END IF ;

	IF i_check_flg = '0' THEN
		o_calc_cnt := l_calc_grp.calc_cnt ;
	ELSE
		o_calc_cnt := 1 ;
	END IF ;

	INSERT INTO mgt_arg_usr (
		calc_no,
		calc_grp_cd,
		term,
		st_ym,
		end_ym,
		sa_typ,
		exp_calc_typ,
		pre_alc_calc_typ,
		alc_calc_typ,
		cost_calc_typ,
		eval_typ,
		inpt_calc_flg,
		wk_calc_flg,
		prov_calc_flg,
		xfr_calc_flg,
		calc_cnt,
		xrate_cd,
		runtime_wg_cd,
		calc_st,
		itm_limit_flg,
		data_check_flg,
		carry_flg,
		ins_srv_req_no,
		batch_log_no,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3
		)
	VALUES (
		o_calc_no,
		i_calc_grp_cd,
		i_term,
		i_st_ym,
		i_end_ym,
		l_calc_grp.sa_typ,
		l_calc_grp.exp_calc_typ,
		l_calc_grp.pre_alc_calc_typ,
		l_calc_grp.alc_calc_typ,
		l_calc_grp.cost_calc_typ,
		l_calc_grp.eval_typ,
		l_calc_grp.inpt_calc_flg,
		l_calc_grp.wk_calc_flg,
		l_calc_grp.prov_calc_flg,
		l_calc_grp.xfr_calc_flg,
		o_calc_cnt,
		COALESCE(i_xrate_cd, l_calc_grp.xrate_cd),
		l_calc_grp.runtime_wg_cd,
		fcpa_date_util$f_mcsystimestamp(),
		l_itm_limit_flg,
		i_check_flg,
		i_carry_flg,
		fcpa_context$f_get_processid(),
		fcpa_batch_log$f_get_log_no(),
		i_rmrks,
		i_sub_char1,
		i_sub_char2,
		i_sub_char3
		)
	;

	COMMIT ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_arg$f_get_arg_usr (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
RETURNS mgt_arg
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_arg_usrのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<RETURNVALUE>
	対象となるmgt_arg_usrのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_rec	mgt_arg%ROWTYPE ;
	l_msg	VARCHAR[] ;
BEGIN
	BEGIN
		SELECT	t.*
		INTO STRICT	l_rec
		FROM	mgvt_arg_usr t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_calc_no) ;
			CALL fcpa_err$raise_app_err('MGBXD0007', l_msg) ;
	END ;

	RETURN l_rec ;

END ;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_arg$f_get_arg (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
RETURNS mgt_arg
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mgt_argのレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<RETURNVALUE>
	対象となるmgt_argのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_cnt	NUMERIC ;
	l_rec	mgt_arg%ROWTYPE ;
BEGIN
	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_arg t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	IF l_cnt > 0 THEN
		SELECT	t.*
		INTO STRICT	l_rec
		FROM	mgt_arg t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		;
	ELSE
		l_rec := mgpa_arg$f_get_arg_usr(i_calc_grp_cd, i_calc_no) ;
	END IF ;

	RETURN l_rec ;

END ;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_calc_fin (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_calc_err_flg CHARACTER
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	計算終了処理
<REMARKS>
	mgt_arg_usrからmgt_argにデータを作成する
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_calc_err_flg
		エラーＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_calc_rec_adj			CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ADJ') ;
	c_calc_rec_end_stk		CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK') ;
	c_cost_calc_cost_std	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP','COST_STD') ;
	c_alc_calc_non			CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ALC_CALC_TYP','NON') ;

	l_alc_err_flg	CHAR(1) ;
	l_trd_amt_flg	CHAR(1) ;
	l_adj_amt_flg	CHAR(1) ;
	l_minus_stk_flg	CHAR(1) ;
	l_other_chk_flg	CHAR(1) ;

	l_cnt	NUMERIC ;

	l_usr	VARCHAR(500) ;
BEGIN
	l_alc_err_flg := '0' ;
	l_trd_amt_flg := '0' ;
	l_adj_amt_flg := '0' ;
	l_minus_stk_flg := '0' ;
	l_other_chk_flg := '0' ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_alc_calc_err t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.amt != 0
	;

	IF l_cnt > 0 THEN
		l_alc_err_flg := '1' ;
	END IF ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_acc_trd t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.amt != 0
	;

	IF l_cnt > 0 THEN
		l_trd_amt_flg := '1' ;
	END IF ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_acc_top t1, mgt_acc_sml_cost t2
	WHERE	0=0
	AND	t1.calc_no = i_calc_no
	AND	t1.calc_grp_cd = i_calc_grp_cd
	AND	t1.calc_rec_typ = c_calc_rec_adj
	AND	t1.calc_no = t2.calc_no
	AND	t1.calc_grp_cd = t2.calc_grp_cd
	AND	t1.top_rec_no = t2.top_rec_no
	AND	t2.act_cost != 0
	;

	IF l_cnt > 0 THEN
		l_adj_amt_flg := '1' ;
	END IF ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_acc_top t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.calc_rec_typ = c_calc_rec_end_stk
	AND	t.qty < 0
	;

	IF l_cnt > 0 THEN
		l_minus_stk_flg := '1' ;
	END IF ;

	SELECT	COUNT(*)
	INTO STRICT	l_cnt
	FROM	mgt_calc_chk m
	WHERE	0=0
	AND	m.calc_grp_cd = i_calc_grp_cd
	AND	EXISTS (
			SELECT	'X'
			FROM	mgt_calc_log w
			WHERE	0=0
			AND	w.calc_no = i_calc_no
			AND	w.calc_grp_cd = m.calc_grp_cd
			AND	w.msg_id LIKE m.msg_id
		)
	;

	IF l_cnt > 0 THEN
		l_other_chk_flg := '1' ;
	END IF ;

	UPDATE mgt_arg_usr t
	SET calc_fin = fcpa_date_util$f_mcsystimestamp(),
		alc_err_flg = l_alc_err_flg,
		trd_amt_flg = l_trd_amt_flg,
		adj_amt_flg = l_adj_amt_flg,
		minus_stk_flg = l_minus_stk_flg,
		other_chk_flg = l_other_chk_flg,
		calc_err_flg = i_calc_err_flg
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	INSERT INTO mgt_arg
	SELECT	t.*
	FROM	mgt_arg_usr t
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

	DELETE FROM mgt_arg_usr t WHERE t.calc_no = i_calc_no AND t.calc_grp_cd = i_calc_grp_cd ;

	l_usr := fcpa_context$f_get_userid() ;
	DELETE FROM mgt_usr_itm t WHERE t.calc_grp_cd = i_calc_grp_cd AND t.usr_cd = l_usr ;

	IF i_calc_err_flg = '0' THEN
		SELECT	COUNT(*)
		INTO STRICT	l_cnt
		FROM	mgt_arg t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		AND	t.cost_calc_typ = c_cost_calc_cost_std
		AND	t.alc_calc_typ <> c_alc_calc_non
		;

		IF l_cnt > 0 THEN
			DELETE FROM mgt_calc_std_alc_rate t WHERE t.calc_no = i_calc_no AND t.calc_grp_cd = i_calc_grp_cd ;
		END IF ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_calc_err (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	計算エラー処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<HISTORY>
**********************************************************/
BEGIN
	CALL fcpa_batch_log$p_proc_log('MGBXD0001', 'MGPA_ARG.P_CALC_ERR') ;

	CALL mgpa_arg$p_calc_fin(i_calc_grp_cd, i_calc_no, '1') ;

	COMMIT ;

	CALL fcpa_batch_log$p_proc_log('MGBXD0002', 'MGPA_ARG.P_CALC_ERR') ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_cnt_up (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	計算回数のカウントアップ処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<HISTORY>
**********************************************************/
BEGIN

	UPDATE	mgt_arg_usr t
	SET	calc_exec_cnt = t.calc_exec_cnt + 1
	WHERE	0=0
	AND	t.calc_no = i_calc_no
	AND	t.calc_grp_cd = i_calc_grp_cd
	;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_set_work (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	MGW_ARGに対するデータ作成を行う
<REMARKS>

<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<HISTORY>
**************************************************************************/
BEGIN
	DELETE FROM mgw_arg ;
	INSERT INTO mgw_arg (
		calc_no,
		calc_grp_cd,
		term,
		st_ym,
		end_ym,
		sa_typ,
		exp_calc_typ,
		pre_alc_calc_typ,
		alc_calc_typ,
		cost_calc_typ,
		eval_typ,
		inpt_calc_flg,
		wk_calc_flg,
		prov_calc_flg,
		xfr_calc_flg,
		xrate_cd,
		runtime_wg_cd,
		calc_st,
		calc_fin,
		calc_cnt,
		calc_exec_cnt,
		alc_err_flg,
		trd_amt_flg,
		adj_amt_flg,
		minus_stk_flg,
		other_chk_flg,
		itm_limit_flg,
		data_check_flg,
		carry_flg,
		non_del_flg,
		fix_flg,
		rate_fix_flg,
		calc_err_flg,
		ins_srv_req_no,
		batch_log_no,
		rmrks,
		sub_char1,
		sub_char2,
		sub_char3
		)
	SELECT
		t.calc_no,
		t.calc_grp_cd,
		t.term,
		t.st_ym,
		t.end_ym,
		t.sa_typ,
		t.exp_calc_typ,
		t.pre_alc_calc_typ,
		t.alc_calc_typ,
		t.cost_calc_typ,
		t.eval_typ,
		t.inpt_calc_flg,
		t.wk_calc_flg,
		t.prov_calc_flg,
		t.xfr_calc_flg,
		t.xrate_cd,
		t.runtime_wg_cd,
		t.calc_st,
		t.calc_fin,
		t.calc_cnt,
		t.calc_exec_cnt,
		t.alc_err_flg,
		t.trd_amt_flg,
		t.adj_amt_flg,
		t.minus_stk_flg,
		t.other_chk_flg,
		t.itm_limit_flg,
		t.data_check_flg,
		t.carry_flg,
		t.non_del_flg,
		t.fix_flg,
		t.rate_fix_flg,
		t.calc_err_flg,
		t.ins_srv_req_no,
		t.batch_log_no,
		t.rmrks,
		t.sub_char1,
		t.sub_char2,
		t.sub_char3
	FROM	mgt_arg_usr t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.calc_no = i_calc_no
	;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_arg$p_lock (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_err_flg CHARACTER
)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	ロック処理
<REMARKS>
	NOWAITでロックする
	i_err_flgが1となるときは対象となるデータが存在しないときはエラーとする
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<IN>	i_err_flg
		存在チェックＦＬＧ
<HISTORY>
**************************************************************************/
DECLARE
	lock_arg CURSOR FOR
		SELECT	t.calc_no
		FROM	mgt_arg t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
		FOR UPDATE NOWAIT
	;

	l_rec	mgt_arg%ROWTYPE ;
	l_msg	VARCHAR[] ;
BEGIN
	IF i_err_flg = '1' THEN
		l_rec := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no) ;
	END IF ;

	FOR x IN lock_arg LOOP EXIT ;
	END LOOP ;

EXCEPTION
	WHEN lock_not_available THEN
		l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_calc_no) ;
		CALL fcpa_err$raise_app_err('MGBXD0009', l_msg) ;
END ;
$BODY$
LANGUAGE plpgsql
;

