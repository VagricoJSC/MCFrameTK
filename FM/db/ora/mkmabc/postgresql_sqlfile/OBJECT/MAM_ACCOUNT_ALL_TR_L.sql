\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_account_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.ac_nm IS NOT NULL AND NEW.ac_nm IS NOT NULL) THEN
			sme := (OLD.ac_nm = NEW.ac_nm);
		ELSE
			sme := (OLD.ac_nm IS NULL AND NEW.ac_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.ac_nm2 IS NOT NULL AND NEW.ac_nm2 IS NOT NULL) THEN
			sme := (OLD.ac_nm2 = NEW.ac_nm2);
		ELSE
			sme := (OLD.ac_nm2 IS NULL AND NEW.ac_nm2 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_account_lcl_all (
			lcl_cd,
			ac_cd,
			ac_nm,
			ac_nm2,
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
			NEW.ac_cd,
			NEW.ac_nm,
			NEW.ac_nm2,
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
			ac_cd,
			co_cd
		)
		DO UPDATE SET
			ac_nm= NEW.ac_nm,
			ac_nm2= NEW.ac_nm2,
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

CREATE TRIGGER mam_account_all_tr_l
BEFORE INSERT OR UPDATE ON mam_account_all
FOR EACH ROW
EXECUTE FUNCTION mam_account_all_tr_l_body();


