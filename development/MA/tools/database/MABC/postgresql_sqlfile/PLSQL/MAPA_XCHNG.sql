\encoding UTF-8

CREATE OR REPLACE FUNCTION mapa_xchng$f_get_base_cur_cd()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	会社マスタから基準通貨ＣＤを取得する
<REMARKS>
<ARGUMENTS>
<RETURNVALUE>
	基準通貨ＣＤ
<HISTORY>
**********************************************************/
BEGIN

	RETURN (mapa_co$f_get_co_rec()).base_cur_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_ptax_cur_cd()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	会社マスタから納税通貨ＣＤを取得する
<REMARKS>
<ARGUMENTS>
<RETURNVALUE>
	納税通貨ＣＤ
<HISTORY>
**********************************************************/
BEGIN

	RETURN (mapa_co$f_get_co_rec()).ptax_cur_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_cur_rec(
	 IN i_cur_cd VARCHAR
)
RETURNS mam_cur
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	通貨マスタのレコードを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_cur_cd
		通貨ＣＤ
<RETURNVALUE>
	通貨マスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_cur mam_cur%ROWTYPE;
	l_msg VARCHAR[];
BEGIN
	BEGIN
		SELECT	m.*
		INTO	STRICT l_cur
		FROM	mam_cur AS m
		WHERE	0=0
		AND	m.cur_cd = i_cur_cd
		;
	EXCEPTION
		WHEN no_data_found THEN
			l_msg := fcpa_err$msg_binder(i_cur_cd) ;
			CALL fcpa_err$raise_app_err('MAUCD0023', l_msg) ;
	END;

	RETURN l_cur;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_xchng$p_get_cur_info(
	 IN i_cur_cd VARCHAR,
	 INOUT o_upri_dec_place NUMERIC,
	 INOUT o_amt_dec_place NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	通貨に対する金額端数処理桁・単価端数処理桁を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_cur_cd
		通貨ＣＤ
<OUT>	o_upri_dec_place
		単価小数部有効桁数
<OUT>	o_amt_dec_place
		金額小数部有効桁数
<HISTORY>
**********************************************************/
DECLARE
	l_cur mam_cur%ROWTYPE;
BEGIN
	l_cur := mapa_xchng$f_get_cur_rec(i_cur_cd);

	o_upri_dec_place := l_cur.upri_dec_place;
	o_amt_dec_place := l_cur.amt_dec_place;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_xchng$p_get_base_cur_info(
	 INOUT o_base_cur_cd VARCHAR,
	 INOUT o_upri_dec_place NUMERIC,
	 INOUT o_amt_dec_place NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	基準通貨に対する通貨ＣＤ・金額端数処理桁・単価端数処理桁を取得する
<REMARKS>
<ARGUMENTS>
<OUT>	o_base_cur_cd
		基準通貨ＣＤ
<OUT>	o_upri_dec_place
		単価小数部有効桁数
<OUT>	o_amt_dec_place
		金額小数部有効桁数
<HISTORY>
**********************************************************/
BEGIN
	o_base_cur_cd := mapa_xchng$f_get_base_cur_cd();

	CALL mapa_xchng$p_get_cur_info(o_base_cur_cd, o_upri_dec_place, o_amt_dec_place);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_xchng$p_get_ptax_cur_info(
	 INOUT o_ptax_cur_cd VARCHAR,
	 INOUT o_upri_dec_place NUMERIC,
	 INOUT o_amt_dec_place NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	納税通貨に対する通貨ＣＤ・金額端数処理桁・単価端数処理桁を取得する
<REMARKS>
<ARGUMENTS>
<OUT>	o_ptax_cur_cd
		納税通貨ＣＤ
<OUT>	o_upri_dec_place
		単価小数部有効桁数
<OUT>	o_amt_dec_place
		金額小数部有効桁数
<HISTORY>
**********************************************************/
BEGIN
	o_ptax_cur_cd := mapa_xchng$f_get_ptax_cur_cd();

	o_upri_dec_place := NULL;
	o_amt_dec_place := NULL;
	IF o_ptax_cur_cd IS NOT NULL THEN
		CALL mapa_xchng$p_get_cur_info(o_ptax_cur_cd, o_upri_dec_place, o_amt_dec_place);
	END IF;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_xrate_ne(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_cur_cd VARCHAR,
	 IN i_xrate_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	為替レートを取得する
	取得できない場合はNULLを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_xrate_cd
		為替レートＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
		為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_xrate mam_cur_xrate.xrate%TYPE;
BEGIN
	l_xrate := NULL;
	IF i_trd_cur_cd = i_base_cur_cd THEN
		l_xrate := 1;
	ELSE
		SELECT	MAX(m.xrate)
		INTO	STRICT l_xrate
		FROM	mam_cur_xrate m
		WHERE	0=0
		AND	m.fr_cur_cd = i_trd_cur_cd
		AND	m.to_cur_cd = i_base_cur_cd
		AND	m.xrate_cd = i_xrate_cd
		AND	i_base_dt BETWEEN m.st_dt AND m.end_dt
		AND m.del_flg = '0'
		;
	END IF;

	RETURN l_xrate;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_xrate(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_cur_cd VARCHAR,
	 IN i_xrate_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	為替レートを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_xrate_cd
		為替レートＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
		為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_xrate mam_cur_xrate.xrate%TYPE;
	l_msg VARCHAR[];
BEGIN
	l_xrate := NULL;

	l_xrate := mapa_xchng$f_get_xrate_ne(i_trd_cur_cd, i_base_cur_cd, i_xrate_cd, i_base_dt);
	IF l_xrate IS NULL THEN
		l_msg := fcpa_err$msg_binder(i_trd_cur_cd, i_base_cur_cd, i_xrate_cd,
			fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MAUCD0024', l_msg) ;
	END IF;

	RETURN l_xrate;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_sls_xrate(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する売上為替レートを取得する
<REMARKS>
	会社マスタから基準通貨ＣＤ、売上為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	売上為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate(i_trd_cur_cd, l_co.base_cur_cd, l_co.sls_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_sls_xrate_ne(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する売上為替レートを取得する
	取得できない場合はNULLを返す
<REMARKS>
	会社マスタから基準通貨ＣＤ、売上為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	売上為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate_ne(i_trd_cur_cd, l_co.base_cur_cd, l_co.sls_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_purc_xrate(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する仕入為替レートを取得する
<REMARKS>
	会社マスタから基準通貨ＣＤ、仕入為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	仕入為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate(i_trd_cur_cd, l_co.base_cur_cd, l_co.purc_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_purc_xrate_ne(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する仕入為替レートを取得する
	取得できない場合はNULLを返す
<REMARKS>
	会社マスタから基準通貨ＣＤ、仕入為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	仕入為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate_ne(i_trd_cur_cd, l_co.base_cur_cd, l_co.purc_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_prov_xrate(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する支給為替レートを取得する
<REMARKS>
	会社マスタから基準通貨ＣＤ、支給為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	支給為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate(i_trd_cur_cd, l_co.base_cur_cd, l_co.prov_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_get_prov_xrate_ne(
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引通貨ＣＤから基準通貨ＣＤへ換算する支給為替レートを取得する
	取得できない場合はNULLを返す
<REMARKS>
	会社マスタから基準通貨ＣＤ、支給為替レートＣＤを取得して計算する
<ARGUMENTS>
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	支給為替レート
<HISTORY>
**********************************************************/
DECLARE
	l_co mam_co%ROWTYPE;
BEGIN
	l_co := mapa_co$f_get_co_rec();

	RETURN mapa_xchng$f_get_xrate_ne(i_trd_cur_cd, l_co.base_cur_cd, l_co.prov_xrate_cd, i_base_dt);

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_xchng$f_xchng(
	 IN i_amt NUMERIC,
	 IN i_xrate NUMERIC,
	 IN i_dec_place NUMERIC,
	 IN i_xrate_rnd_typ VARCHAR
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	為替レート換算した金額を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_amt
		金額
<IN>	i_xrate
		為替レート
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_xrate_rnd_typ
		為替端数処理区分
<RETURNVALUE>
		為替レート換算後の金額
<HISTORY>
**********************************************************/
DECLARE
	l_xchng_amt NUMERIC;	/* 桁あふれでの例外発生時にも値を格納したいためにNUMERIC型としておく */
	l_msg VARCHAR[];
BEGIN
	IF i_amt IS NULL THEN
		RETURN NULL;
	END IF;

	IF i_xrate IS NULL THEN
		RETURN NULL;
	END IF;

	l_xchng_amt := mapa_calc$f_rnd(i_amt * i_xrate, i_dec_place, i_xrate_rnd_typ);

	RETURN l_xchng_amt;
EXCEPTION
	WHEN data_exception THEN
		l_msg := fcpa_err$msg_binder(i_amt, i_xrate, l_xchng_amt) ;
		CALL fcpa_err$raise_app_err('MAUCD0025', l_msg) ;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mapa_xchng$p_xchng(
	 IN i_amt NUMERIC,
	 IN i_trd_cur_cd VARCHAR,
	 IN i_base_cur_cd VARCHAR,
	 IN i_xrate_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dec_place NUMERIC,
	 IN i_xrate_rnd_typ VARCHAR,
	 INOUT o_base_cur_amt NUMERIC,
	 INOUT o_xrate NUMERIC
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	為替レート換算した金額及び使用した為替レートを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_amt
		金額
<IN>	i_trd_cur_cd
		取引通貨ＣＤ
<IN>	i_base_cur_cd
		基準通貨ＣＤ
<IN>	i_xrate_cd
		為替レートＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_dec_place
		小数部有効桁数
<IN>	i_xrate_rnd_typ
		為替端数処理区分
<OUT>	o_base_cur_amt
		基準通貨金額
<OUT>	o_xrate
		為替レート
<HISTORY>
**********************************************************/
BEGIN
	o_xrate := mapa_xchng$f_get_xrate(i_trd_cur_cd, i_base_cur_cd, i_xrate_cd, i_base_dt);
	o_base_cur_amt := mapa_xchng$f_xchng(i_amt, o_xrate, i_dec_place, i_xrate_rnd_typ);

END;
$BODY$
LANGUAGE plpgsql
;

