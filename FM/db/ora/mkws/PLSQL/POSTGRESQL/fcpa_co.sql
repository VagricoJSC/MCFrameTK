CREATE OR REPLACE FUNCTION fcpa_co$f_get_co_nm (
	IN co	VARCHAR,
	IN lcl	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 指定された会社のロケール別名称を取得する
-- ===============================================================================
DECLARE
	rtn VARCHAR ;
BEGIN
	SELECT	MIN(m.co_nm)
	INTO STRICT rtn
	FROM	fcm_co_lcl_all m
	WHERE	0=0
	AND	m.co_cd = co
	AND	m.lcl_cd = lcl
	;

	RETURN rtn ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION fcpa_co$f_get_co_nm (
	IN lcl VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ログイン会社のロケール別名称を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_co$f_get_co_nm(fcpa_context$f_get_co_cd(), lcl) ;
END ;
$BODY$
LANGUAGE plpgsql
;
