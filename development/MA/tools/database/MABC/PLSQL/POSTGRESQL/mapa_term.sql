CREATE OR REPLACE FUNCTION mapa_term$f_get_term_rec (
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS mam_term
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	対象の対象期間マスタのレコードを返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		日付
<RETURNVALUE>
		対象の対象期間マスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	l_msg VARCHAR[] ;
	l_rec mam_term%ROWTYPE ;
BEGIN
	SELECT	*
	INTO	STRICT l_rec
	FROM	mam_term
	WHERE	0=0
	AND	term <= i_dt
	AND	term_end_ym > i_dt
	;

	RETURN l_rec ;
EXCEPTION
	WHEN no_data_found THEN
		l_msg := fcpa_err$msg_binder(fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABCD0003', l_msg) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_term$f_get_term (
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	対象の対象期間マスタの期開始年月を返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		日付
<RETURNVALUE>
		対象の対象期間マスタの期開始年月
<HISTORY>
**********************************************************/
DECLARE
	l_rec mam_term%ROWTYPE ;
BEGIN
	l_rec := mapa_term$f_get_term_rec(i_dt) ;
	RETURN l_rec.term ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_term$f_get_term_ne (
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	対象の対象期間マスタの期開始年月を返す。
	対象のレコードが見つからない場合はNULLを返す。
<REMARKS>
<ARGUMENTS>
<IN>	i_dt
		日付
<RETURNVALUE>
		対象の対象期間マスタの期開始年月
<HISTORY>
**********************************************************/
BEGIN
	RETURN mapa_term$f_get_term(i_dt) ;
EXCEPTION
	WHEN others THEN
		RETURN NULL ;
END ;
$BODY$
LANGUAGE plpgsql
;
