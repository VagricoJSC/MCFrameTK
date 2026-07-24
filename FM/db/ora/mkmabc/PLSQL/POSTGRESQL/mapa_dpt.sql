CREATE OR REPLACE FUNCTION mapa_dpt$f_get_dpt_cd_ne (
	 IN i_dpt_cd VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	日付に対して有効な部門ＣＤを返す(Not Exception版)
	※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
<REMARKS>
	無効な部門ＣＤの場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		日付
<RETURN VALUE>
	部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x RECORD ;
BEGIN
	l_dpt_cd := NULL ;
	IF i_dpt_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;
	FOR x IN 
		SELECT	p.dpt_cd
		FROM	(
			SELECT	m.dpt_cd,
				1 AS prio
			FROM	mam_dpt m
			WHERE	0=0
			AND	m.dpt_cd = i_dpt_cd
			AND	m.st_dt <= i_dt
			AND	m.end_dt >= i_dt
			UNION ALL
			SELECT	m.new_dpt_cd AS dpt_cd,
				99 AS prio
			FROM	mam_dpt_map m
			WHERE	0=0
			AND	m.old_dpt_cd = i_dpt_cd
			AND	m.st_dt <= i_dt
			AND	m.end_dt >= i_dt
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	LOOP
		l_dpt_cd := x.dpt_cd ;
		EXIT ;
	END LOOP ;

	RETURN l_dpt_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dpt$f_get_dpt_cd (
	 IN i_dpt_cd VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	日付に対して有効な部門ＣＤを返す
	※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
<REMARKS>
	無効な部門ＣＤの場合はエラーを返す
<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		日付
<RETURN VALUE>
	部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd mam_dpt.dpt_cd%TYPE ;
	l_bind VARCHAR[] ;
BEGIN
	l_dpt_cd := NULL ;
	IF i_dpt_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;

	l_dpt_cd := mapa_dpt$f_get_dpt_cd_ne(i_dpt_cd, i_dt) ;
	IF l_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_dpt_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABCD0002', l_bind) ;
	END IF ;

	RETURN l_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_dpt$f_check_dpt_cd(
	 IN i_dpt_cd VARCHAR,
	 IN i_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	日付に対して入力された部門が有効かどうか確認する
	有効な場合は入力された部門を返す
	無効な場合はＮＵＬＬを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		日付
<RETURN VALUE>
	部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	IF i_dpt_cd IS NULL OR i_dt IS NULL THEN
		RETURN NULL ;
	END IF ;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_dpt m
	WHERE	0=0
	AND	m.dpt_cd = i_dpt_cd
	AND	m.st_dt <= i_dt
	AND	m.end_dt >= i_dt
	;

	IF l_cnt > 0 THEN
		RETURN i_dpt_cd ;
	END IF ;

	RETURN NULL ;

END ;
$BODY$
LANGUAGE plpgsql
;
