\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_co_tr_bulk_imp_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF TG_OP = 'INSERT' THEN
		CALL mbpa_bulk_imp$p_init_bulk_imp(new.co_cd);
	ELSIF TG_OP = 'UPDATE' THEN
		IF old.co_cd <> new.co_cd THEN
			CALL mbpa_bulk_imp$p_init_bulk_imp(new.co_cd);
		END IF;
	ELSIF TG_OP = 'DELETE' THEN
		CALL mbpa_bulk_imp$p_del_bulk_imp(old.co_cd);
	END IF;

	IF TG_OP = 'INSERT' THEN
		RETURN NEW;
	ELSIF TG_OP = 'UPDATE' THEN
		RETURN NEW;
	ELSIF TG_OP = 'DELETE' THEN
		RETURN OLD;
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;

DROP TRIGGER IF EXISTS mam_co_tr_bulk_imp ON mam_co_all ;

CREATE TRIGGER mam_co_tr_bulk_imp
BEFORE INSERT OR UPDATE OR DELETE
ON mam_co_all
FOR EACH ROW
EXECUTE PROCEDURE mam_co_tr_bulk_imp_body()
;

