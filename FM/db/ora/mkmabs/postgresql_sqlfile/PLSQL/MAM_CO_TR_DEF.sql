\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_co_tr_def_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	IF TG_OP = 'INSERT' THEN
		CALL mapa_co$p_init_sys_parm(new.co_cd);

		CALL mapa_co$p_init_gp_batch_grp(new.co_cd);

		CALL mapa_num$p_init_num_ptn(new.co_cd);

		CALL mapa_co$p_init_stk_anly_ctl(new.co_cd);

		CALL mapa_co$p_init_non_mov_schd_ctl(new.co_cd);

	ELSIF TG_OP = 'UPDATE' THEN
		IF new.co_cd <> old.co_cd THEN
			CALL mapa_co$p_init_sys_parm(new.co_cd);

			CALL mapa_co$p_init_gp_batch_grp(new.co_cd);

			CALL mapa_num$p_init_num_ptn(new.co_cd);

			CALL mapa_co$p_init_stk_anly_ctl(new.co_cd);

			CALL mapa_co$p_init_non_mov_schd_ctl(new.co_cd);
		END IF;

	ELSIF TG_OP = 'DELETE' THEN
		CALL mapa_co$p_del_sys_parm(old.co_cd);

		CALL mapa_co$p_del_gp_batch_grp(old.co_cd);

		CALL mapa_num$p_del_num_ptn(old.co_cd);

		CALL mapa_co$p_del_stk_anly_ctl(old.co_cd);

		CALL mapa_co$p_del_non_mov_schd_ctl(old.co_cd);
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

DROP TRIGGER IF EXISTS mam_co_tr_def ON mam_co_all ;

CREATE TRIGGER mam_co_tr_def
BEFORE INSERT OR UPDATE OR DELETE
ON mam_co_all
FOR EACH ROW
EXECUTE PROCEDURE mam_co_tr_def_body()
;

