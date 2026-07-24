CREATE OR REPLACE FUNCTION fcpa_gp_batch_grp$f_get_gp_batch_grp_nm(
	IN gp_batch_grp VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ログインロケール名称を取得する
-- ===============================================================================
BEGIN
	RETURN fcpa_gp_batch_grp$f_get_gp_batch_grp_nm(gp_batch_grp, fcpa_context$f_get_locale());
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_gp_batch_grp$f_get_gp_batch_grp_nm(
	IN gp_batch_grp VARCHAR,
	IN lcl VARCHAR
) RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- ロケール別名称を取得する
-- ===============================================================================
DECLARE
	rtn VARCHAR(100);
BEGIN
	SELECT
		MIN(m.gp_batch_grp_nm)
	INTO STRICT
		rtn
	FROM
		fcm_gp_batch_grp_lcl_all m
	WHERE
		m.gp_batch_grp_cd = gp_batch_grp
		AND m.lcl_cd = lcl
		AND m.co_cd = fcpa_context$f_get_co_cd();

	RETURN rtn;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_gp_batch_grp$add_gp_batch_grp(
	IN gp_batch_grp_cd VARCHAR,
	IN gp_batch_grp_nm VARCHAR,
	IN module_id VARCHAR,
	IN logic_id VARCHAR,
	IN func_typ VARCHAR
)
AS 
$BODY$
-- ===============================================================================
-- 汎用バッチ処理グループを登録する
-- ===============================================================================
BEGIN
	INSERT INTO fcm_gp_batch_grp_all (gp_batch_grp_cd, co_cd, gp_batch_grp_nm, module_id, logic_id, func_typ)
	VALUES (gp_batch_grp_cd, fcpa_context$f_get_co_cd(), gp_batch_grp_nm, module_id, logic_id, func_typ);
END;
$BODY$
LANGUAGE plpgsql
;
