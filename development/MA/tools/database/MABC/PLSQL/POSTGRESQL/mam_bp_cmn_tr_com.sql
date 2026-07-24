CREATE OR REPLACE FUNCTION mam_bp_cmn_tr_com_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF TG_OP = 'INSERT' AND new.all_com_flg = '0' THEN
		INSERT INTO mam_bp_com_all (bp_cd, co_cd, ex_flg)
		SELECT
			new.bp_cd AS bp_cd,
			fcpa_context$f_get_co_cd() AS co_cd,
			'0' AS ex_flg
		ON CONFLICT (bp_cd, co_cd)
		DO UPDATE SET ex_flg = '0'
		;
	ELSIF TG_OP = 'DELETE' THEN
		DELETE FROM mam_bp_com_all WHERE bp_cd = old.bp_cd ;
	END IF ;

	IF TG_OP = 'INSERT' THEN
		RETURN NEW ;
	ELSIF TG_OP = 'UPDATE' THEN
		RETURN NEW ;
	ELSIF TG_OP = 'DELETE' THEN
		RETURN OLD ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

DROP TRIGGER IF EXISTS mam_bp_cmn_tr_com ON mam_bp_cmn ;

CREATE TRIGGER mam_bp_cmn_tr_com
BEFORE INSERT OR UPDATE OR DELETE
ON mam_bp_cmn
FOR EACH ROW
EXECUTE PROCEDURE mam_bp_cmn_tr_com_body()
;
