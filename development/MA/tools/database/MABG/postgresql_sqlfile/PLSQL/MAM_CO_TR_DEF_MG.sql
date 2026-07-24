\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_co_tr_def_mg_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF TG_OP = 'INSERT' THEN
		CALL mapa_cost_sys$p_init_non_mov_ctl(new.co_cd);
	ELSIF TG_OP = 'UPDATE' THEN
		IF old.co_cd <> new.co_cd THEN
			CALL mapa_cost_sys$p_del_non_mov_ctl(old.co_cd);
			CALL mapa_cost_sys$p_init_non_mov_ctl(new.co_cd);
		END IF;
	ELSIF TG_OP = 'DELETE' THEN
		CALL mapa_cost_sys$p_del_non_mov_ctl(old.co_cd);
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

DROP TRIGGER IF EXISTS mam_co_tr_def_mg ON mam_co_all ;

CREATE TRIGGER mam_co_tr_def_mg
BEFORE INSERT OR UPDATE OF CO_CD OR DELETE
ON mam_co_all
FOR EACH ROW
EXECUTE PROCEDURE mam_co_tr_def_mg_body()
;

