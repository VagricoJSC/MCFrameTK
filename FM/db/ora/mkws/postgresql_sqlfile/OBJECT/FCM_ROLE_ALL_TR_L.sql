\encoding UTF-8

CREATE OR REPLACE FUNCTION fcm_role_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.rnm IS NOT NULL AND NEW.rnm IS NOT NULL) THEN
			sme := (OLD.rnm = NEW.rnm);
		ELSE
			sme := (OLD.rnm IS NULL AND NEW.rnm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO fcm_role_lcl_all (
			lcl_cd,
			rid,
			rnm,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.rid,
			NEW.rnm,
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
			rid
		)
		DO UPDATE SET
			rnm= NEW.rnm,
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

CREATE TRIGGER fcm_role_all_tr_l
BEFORE INSERT OR UPDATE ON fcm_role_all
FOR EACH ROW
EXECUTE FUNCTION fcm_role_all_tr_l_body();


