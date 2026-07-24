\encoding UTF-8

CREATE OR REPLACE FUNCTION mgpa_xchng$f_get_cur(
	 IN i_cur_cd VARCHAR
)
RETURNS mam_cur
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	通貨情報のレコードを返す
<REMARKS>

<ARGUMENTS>
<IN>	i_cur_cd
		通貨ＣＤ
<RETURNVALUE>
	対象となるMAM_CURのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_cur mam_cur%ROWTYPE ;
	l_msg VARCHAR[] ;
BEGIN
	BEGIN
		SELECT	m.*
		INTO	STRICT l_cur
		FROM	mam_cur m
		WHERE	0=0
		AND	m.cur_cd = i_cur_cd
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_cur_cd) ;
			CALL fcpa_err$raise_app_err('MGBXD0044', l_msg) ;
	END ;

	RETURN l_cur ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_xchng$p_ini(
	 IN i_term TIMESTAMP WITHOUT TIME ZONE,
	 IN i_xrate_cd VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_TERM
		期
<IN>	I_XRATE_CD
		為替レートＣＤ
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM	mgw_calc_xrate ;
	INSERT INTO mgw_calc_xrate (
		fr_cur_cd,
		to_cur_cd,
		xrate
		)
	SELECT	m.fr_cur_cd,
		m.to_cur_cd,
		m.xrate
	FROM	mgt_cur_xrate m
	WHERE	0=0
	AND	m.xrate_cd = i_xrate_cd
	AND	m.term = i_term
	;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_xchng$p_ini(
	 IN i_arg mgt_arg
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	F_XCHNGを利用する前の初期化処理
<REMARKS>
	MGW_CALC_XRATE, MGT_CALC_XRATEのデータを作成する
<ARGUMENTS>
<IN>	I_ARG
		原価計算情報
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_xchng$p_ini$g_arg', 'mgt_arg', 'integer') ;
	TRUNCATE TABLE mgpa_xchng$p_ini$g_arg ;

	INSERT INTO mgpa_xchng$p_ini$g_arg (
		term,
		xrate_cd,
		calc_no,
		calc_grp_cd
		)
	VALUES (
		i_arg.term,
		i_arg.xrate_cd,
		i_arg.calc_no,
		i_arg.calc_grp_cd
	)
	;

	CALL mgpa_xchng$p_ini(i_arg.term, i_arg.xrate_cd) ;

	DELETE FROM mgt_calc_xrate t WHERE t.calc_no = i_arg.calc_no AND t.calc_grp_cd = i_arg.calc_grp_cd ;

	INSERT INTO mgt_calc_xrate (
		calc_no, calc_grp_cd,
		fr_cur_cd,
		to_cur_cd,
		xrate_cd,
		xrate
		)
	SELECT	i_arg.calc_no, i_arg.calc_grp_cd,
		m.fr_cur_cd,
		m.to_cur_cd,
		m.xrate_cd,
		m.xrate
	FROM	mgt_cur_xrate m
	WHERE	0=0
	AND	m.xrate_cd = i_arg.xrate_cd
	AND	m.term = i_arg.term
	;
	GET DIAGNOSTICS l_cnt = ROW_COUNT ;
	CALL fcpa_batch_log$p_proc_log('MGBDD0008', 'MGT_CALC_XRATE', l_cnt::VARCHAR) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_xchng$f_xchng(
	 IN i_fr_cur_cd VARCHAR,
	 IN i_to_cur_cd VARCHAR,
	 IN i_dec_place NUMERIC,
	 IN i_xrate_rnd_typ VARCHAR,
	 IN i_amt NUMERIC,
	 IN i_tgt VARCHAR DEFAULT NULL
)
RETURNS NUMERIC
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	為替レートがＮＵＬＬで変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	i_fr_cur_cd
		通貨ＣＤ
<IN>	i_to_cur_cd
		基準通貨ＣＤ
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_xrate_rnd_typ
		為替レート換算端数処理区分
<IN>	i_amt
		金額
<IN>	i_tgt
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/
DECLARE
	l_rate mgw_calc_xrate.xrate%TYPE ;
	l_msg VARCHAR[] ;
BEGIN
	IF i_amt IS NULL
	OR i_amt = 0
	OR i_fr_cur_cd IS NULL
	OR i_fr_cur_cd = i_to_cur_cd
	THEN
		RETURN i_amt ;
	END IF ;

	SELECT	MIN(t.xrate)
	INTO	STRICT l_rate
	FROM	mgw_calc_xrate t
	WHERE	0=0
	AND	t.fr_cur_cd = i_fr_cur_cd
	AND	t.to_cur_cd = i_to_cur_cd
	;

	IF l_rate IS NULL THEN
		l_msg := fcpa_err$msg_binder(
				i_fr_cur_cd, i_to_cur_cd, (SELECT xrate_cd FROM mgpa_xchng$p_ini$g_arg),
				fcpa_date_util$f_to_char((SELECT term FROM mgpa_xchng$p_ini$g_arg), fcpa_date_util$y4md()),
				i_tgt) ;
		CALL fcpa_err$raise_app_err('MGBXD0008', l_msg) ;
	END IF ;

	RETURN mapa_calc$f_rnd(i_amt * l_rate, i_dec_place, i_xrate_rnd_typ) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_xchng$f_xchng2(
	 IN i_fr_cur_cd VARCHAR,
	 IN i_to_cur_cd VARCHAR,
	 IN i_xrate NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_xrate_rnd_typ VARCHAR,
	 IN i_amt NUMERIC,
	 IN i_tgt VARCHAR DEFAULT NULL
)
RETURNS NUMERIC
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	為替レートを元に指定した通貨コードへの換算金額を返す
<REMARKS>
	入力された金額がＮＵＬＬのときはＮＵＬＬを返す。
	変換前通貨コードがＮＵＬＬのときは入力値を返す。
	変換できない場合はエラーとする。
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	i_fr_cur_cd
		通貨ＣＤ
<IN>	i_to_cur_cd
		基準通貨ＣＤ
<IN>	i_xrate
		為替レート
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_xrate_rnd_typ
		為替レート換算端数処理区分
<IN>	i_amt
		金額
<IN>	i_tgt
		対象テーブル
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
*************************************************************************/
DECLARE
	l_msg VARCHAR[] ;
BEGIN
	IF i_amt IS NULL
	OR i_amt = 0
	OR i_fr_cur_cd IS NULL
	OR i_fr_cur_cd = i_to_cur_cd
	OR i_xrate = 1
	THEN
		RETURN i_amt ;
	END IF ;

	IF i_xrate IS NULL THEN
		l_msg := fcpa_err$msg_binder(
				i_fr_cur_cd, i_to_cur_cd, (SELECT xrate_cd FROM mgpa_xchng$p_ini$g_arg),
				fcpa_date_util$f_to_char((SELECT term FROM mgpa_xchng$p_ini$g_arg), fcpa_date_util$y4md()),
				i_tgt) ;
		CALL fcpa_err$raise_app_err('MGBXD0008', l_msg) ;
	END IF ;

	RETURN mapa_calc$f_rnd(i_amt * i_xrate, i_dec_place, i_xrate_rnd_typ) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_xchng$f_get_rate(
	 IN i_fr_cur_cd VARCHAR,
	 IN i_to_cur_cd VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/************************************************************************
<SYNOPSIS>
	為替情報を元に指定した通貨コードへの為替レートを返す
<REMARKS>
	実行する前にP_INIを実行しておく必要がある。
<ARGUMENTS>
<IN>	i_fr_cur_cd
		通貨ＣＤ
<IN>	i_to_cur_cd
		基準通貨ＣＤ
<RETURNVALUE>
		為替レート
<HISTORY>
*************************************************************************/
DECLARE
	l_rate mgw_calc_xrate.xrate%TYPE ;
BEGIN
	IF i_fr_cur_cd IS NULL THEN
		RETURN NULL ;
	ELSIF i_fr_cur_cd = i_to_cur_cd THEN
		RETURN 1 ;
	END IF ;

	SELECT	MIN(t.xrate)
	INTO	STRICT l_rate
	FROM	mgw_calc_xrate t
	WHERE	0=0
	AND	t.fr_cur_cd = i_fr_cur_cd
	AND	t.to_cur_cd = i_to_cur_cd
	;

	RETURN l_rate ;
END ;
$BODY$
LANGUAGE plpgsql
;

