\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_jnl_act_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.jnl_act_nm IS NOT NULL AND NEW.jnl_act_nm IS NOT NULL) THEN
			sme := (OLD.jnl_act_nm = NEW.jnl_act_nm);
		ELSE
			sme := (OLD.jnl_act_nm IS NULL AND NEW.jnl_act_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_jnl_act_lcl_all (
			lcl_cd,
			jnl_act_cd,
			jnl_act_nm,
			co_cd,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.jnl_act_cd,
			NEW.jnl_act_nm,
			NEW.co_cd,
			NEW.ins_usr_id,
			NEW.ins_usr_nm,
			NEW.ins_func_id,
			NEW.upd_usr_id,
			NEW.upd_usr_nm,
			NEW.upd_func_id,
			NEW.upd_srv_req_no
		)
		ON CONFLICT(
			lcl_cd,
			jnl_act_cd,
			co_cd
		)
		DO UPDATE SET
			jnl_act_nm= NEW.jnl_act_nm,
			ins_usr_id = NEW.INS_USR_ID,
			ins_usr_nm = NEW.ins_usr_nm,
			ins_func_id = NEW.ins_func_id,
			upd_usr_id = NEW.upd_usr_id,
			upd_usr_nm = NEW.upd_usr_nm,
			upd_func_id = NEW.upd_func_id,
			upd_srv_req_no = NEW.upd_srv_req_no

		;
	END IF;
	RETURN NEW;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_jnl_act_all_tr_l
BEFORE INSERT OR UPDATE ON mam_jnl_act_all
FOR EACH ROW
EXECUTE FUNCTION mam_jnl_act_all_tr_l_body();


