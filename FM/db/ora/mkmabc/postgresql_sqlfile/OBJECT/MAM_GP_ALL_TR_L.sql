\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_gp_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.char1 IS NOT NULL AND NEW.char1 IS NOT NULL) THEN
			sme := (OLD.char1 = NEW.char1);
		ELSE
			sme := (OLD.char1 IS NULL AND NEW.char1 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char2 IS NOT NULL AND NEW.char2 IS NOT NULL) THEN
			sme := (OLD.char2 = NEW.char2);
		ELSE
			sme := (OLD.char2 IS NULL AND NEW.char2 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char3 IS NOT NULL AND NEW.char3 IS NOT NULL) THEN
			sme := (OLD.char3 = NEW.char3);
		ELSE
			sme := (OLD.char3 IS NULL AND NEW.char3 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char4 IS NOT NULL AND NEW.char4 IS NOT NULL) THEN
			sme := (OLD.char4 = NEW.char4);
		ELSE
			sme := (OLD.char4 IS NULL AND NEW.char4 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char5 IS NOT NULL AND NEW.char5 IS NOT NULL) THEN
			sme := (OLD.char5 = NEW.char5);
		ELSE
			sme := (OLD.char5 IS NULL AND NEW.char5 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char6 IS NOT NULL AND NEW.char6 IS NOT NULL) THEN
			sme := (OLD.char6 = NEW.char6);
		ELSE
			sme := (OLD.char6 IS NULL AND NEW.char6 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char7 IS NOT NULL AND NEW.char7 IS NOT NULL) THEN
			sme := (OLD.char7 = NEW.char7);
		ELSE
			sme := (OLD.char7 IS NULL AND NEW.char7 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char8 IS NOT NULL AND NEW.char8 IS NOT NULL) THEN
			sme := (OLD.char8 = NEW.char8);
		ELSE
			sme := (OLD.char8 IS NULL AND NEW.char8 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char9 IS NOT NULL AND NEW.char9 IS NOT NULL) THEN
			sme := (OLD.char9 = NEW.char9);
		ELSE
			sme := (OLD.char9 IS NULL AND NEW.char9 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.char10 IS NOT NULL AND NEW.char10 IS NOT NULL) THEN
			sme := (OLD.char10 = NEW.char10);
		ELSE
			sme := (OLD.char10 IS NULL AND NEW.char10 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_gp_lcl_all (
			lcl_cd,
			gp_grp_cd,
			key1,
			key2,
			key3,
			key4,
			key5,
			key6,
			key7,
			key8,
			key9,
			key10,
			co_cd,
			char1,
			char2,
			char3,
			char4,
			char5,
			char6,
			char7,
			char8,
			char9,
			char10,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.gp_grp_cd,
			NEW.key1,
			NEW.key2,
			NEW.key3,
			NEW.key4,
			NEW.key5,
			NEW.key6,
			NEW.key7,
			NEW.key8,
			NEW.key9,
			NEW.key10,
			NEW.co_cd,
			NEW.char1,
			NEW.char2,
			NEW.char3,
			NEW.char4,
			NEW.char5,
			NEW.char6,
			NEW.char7,
			NEW.char8,
			NEW.char9,
			NEW.char10,
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
			gp_grp_cd,
			key1,
			key2,
			key3,
			key4,
			key5,
			key6,
			key7,
			key8,
			key9,
			key10,
			co_cd
		)
		DO UPDATE SET
			char1= NEW.char1,
			char2= NEW.char2,
			char3= NEW.char3,
			char4= NEW.char4,
			char5= NEW.char5,
			char6= NEW.char6,
			char7= NEW.char7,
			char8= NEW.char8,
			char9= NEW.char9,
			char10= NEW.char10,
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

CREATE TRIGGER mam_gp_all_tr_l
BEFORE INSERT OR UPDATE ON mam_gp_all
FOR EACH ROW
EXECUTE FUNCTION mam_gp_all_tr_l_body();


