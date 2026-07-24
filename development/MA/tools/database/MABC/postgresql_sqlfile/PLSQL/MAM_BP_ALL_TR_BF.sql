\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_bp_all_tr_bf_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF new.prnt_lcl_cd IS NULL THEN
		new.prnt_lcl_cd := fcpa_context$f_get_def_locale_cd() ;
	END IF ;

	IF TG_OP = 'INSERT' THEN
		RETURN NEW ;
	ELSIF TG_OP = 'UPDATE' THEN
		RETURN NEW ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;

DROP TRIGGER IF EXISTS mam_bp_all_tr_bf ON mam_bp_all ;

CREATE TRIGGER mam_bp_all_tr_bf
BEFORE INSERT OR UPDATE
ON mam_bp_all
FOR EACH ROW
EXECUTE PROCEDURE mam_bp_all_tr_bf_body()
;

