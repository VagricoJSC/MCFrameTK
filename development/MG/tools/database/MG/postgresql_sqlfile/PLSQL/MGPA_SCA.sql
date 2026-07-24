\encoding UTF-8

CREATE OR REPLACE PROCEDURE mgpa_sca$p_sca0 (
	 IN i_co_cd	VARCHAR,
	 IN i_usr_cd	VARCHAR,
	 IN i_calc_grp_cd	VARCHAR,
	 IN i_calc_no	VARCHAR,
	 INOUT o_rc	NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算セッション設定処理
<REMARKS>

<ARGUMENTS>
<IN>	i_co_cd
		会社コード
<IN>	i_usr_cd
		ユーザコード
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<OUT>	o_rc
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
DECLARE
	x	RECORD ;
BEGIN
	CALL fcpa_context$set_co_cd_ext(i_co_cd) ; --一番最初に呼ぶ

	CALL fcpa_context$set_userid(i_usr_cd) ;

	FOR x IN
		SELECT	t.*
		FROM	mgvt_arg_usr t
		WHERE	0=0
		AND	t.calc_no = i_calc_no
		AND	t.calc_grp_cd = i_calc_grp_cd
	LOOP
		CALL fcpa_context$set_call_pg_id(x.ins_func_id) ;
		CALL fcpa_context$set_processid(x.upd_srv_req_no) ;
		CALL fcpa_context$set_usernm(x.ins_usr_nm) ;

		EXIT ;
	END LOOP ;

	o_rc := 0 ;

EXCEPTION
	WHEN others THEN
		o_rc := 1 ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca$p_sca1 (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 INOUT o_rc NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン前処理
<REMARKS>
	マルチスレッドで実行されることもあるためセッションに関する情報のみ設定する。
	一時表を使用するためcommitを行ってはいけない。
<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<OUT>	o_rc
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
DECLARE
	l_usr	fcm_user.user_id%TYPE ;
BEGIN
	l_usr := fcpa_context$f_get_userid() ;

	CALL mgpa_arg$p_set_work(i_calc_grp_cd, i_calc_no) ;

	/* 部門・品群構成用 */
	DELETE FROM maw_term ;
	INSERT INTO maw_term (term) SELECT w.term FROM mgw_arg w ;

	DELETE FROM	mgw_usr_itm ;
	INSERT INTO mgw_usr_itm (
		itm_cd,
		itm_sub1,
		itm_sub2,
		itm_sub3
		)
	SELECT	t.itm_cd,
		t.itm_sub1,
		t.itm_sub2,
		t.itm_sub3
	FROM	mgt_usr_itm t
	WHERE	0=0
	AND	t.calc_grp_cd = i_calc_grp_cd
	AND	t.usr_cd = l_usr
	;

	o_rc := 0 ;
EXCEPTION
	WHEN others THEN
		o_rc := 1 ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_sca$p_sca2 (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 INOUT o_rc NUMERIC
)
AS
$BODY$
/**************************************************************************
<SYNOPSIS>
	原価計算エンジン後処理
<REMARKS>

<ARGUMENTS>
<IN>	i_calc_grp_cd
		計算グループＣＤ
<IN>	i_calc_no
		原価計算ＮＯ
<OUT>	o_rc
		処理結果 0：正常終了 1：エラー
<HISTORY>
**************************************************************************/
BEGIN
	o_rc := 0 ;
EXCEPTION
	WHEN others THEN
		o_rc := 1 ;
END ;
$BODY$
LANGUAGE plpgsql
;

