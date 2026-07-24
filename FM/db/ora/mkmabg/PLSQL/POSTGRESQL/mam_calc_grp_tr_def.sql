CREATE OR REPLACE FUNCTION mam_calc_grp_tr_def_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF TG_OP = 'INSERT' THEN
		CALL mapa_cost_sys$p_init_calc_parm(new.calc_grp_cd, new.co_cd);
	ELSIF TG_OP = 'UPDATE' THEN
		IF old.calc_grp_cd <> new.calc_grp_cd THEN
			CALL mapa_cost_sys$p_del_calc_parm(old.calc_grp_cd, old.co_cd);
			CALL mapa_cost_sys$p_init_calc_parm(new.calc_grp_cd, new.co_cd);
		END IF;
	ELSIF TG_OP = 'DELETE' THEN
		CALL mapa_cost_sys$p_del_calc_parm(old.calc_grp_cd, old.co_cd);
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

DROP TRIGGER IF EXISTS mam_calc_grp_tr_def ON mam_calc_grp_all ;

CREATE TRIGGER mam_calc_grp_tr_def
BEFORE INSERT OR UPDATE OF CALC_GRP_CD OR DELETE
ON mam_calc_grp_all
FOR EACH ROW
EXECUTE PROCEDURE mam_calc_grp_tr_def_body()
;
