CREATE OR REPLACE FUNCTION mam_itm_all_tr_k_body()
RETURNS TRIGGER
AS
$BODY$
DECLARE
	t$key2 VARCHAR ;
BEGIN
	t$key2 := fcpa_context$f_get_co_cd() ;

	IF t$key2 IS NOT NULL AND new.co_cd IS NULL THEN
		new.co_cd := t$key2 ;
	END IF ;

	RETURN NEW ;
END ;
$BODY$
LANGUAGE plpgsql
;

DROP TRIGGER IF EXISTS mam_itm_all_tr_k ON mam_itm_all ;

CREATE TRIGGER mam_itm_all_tr_k
BEFORE INSERT
ON mam_itm_all
FOR EACH ROW
EXECUTE PROCEDURE mam_itm_all_tr_k_body()
;
