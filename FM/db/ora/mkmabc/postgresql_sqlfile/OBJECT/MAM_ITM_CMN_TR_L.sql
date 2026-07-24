\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_itm_cmn_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.itm_nm IS NOT NULL AND NEW.itm_nm IS NOT NULL) THEN
			sme := (OLD.itm_nm = NEW.itm_nm);
		ELSE
			sme := (OLD.itm_nm IS NULL AND NEW.itm_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.itm_alt_nm1 IS NOT NULL AND NEW.itm_alt_nm1 IS NOT NULL) THEN
			sme := (OLD.itm_alt_nm1 = NEW.itm_alt_nm1);
		ELSE
			sme := (OLD.itm_alt_nm1 IS NULL AND NEW.itm_alt_nm1 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.itm_alt_nm2 IS NOT NULL AND NEW.itm_alt_nm2 IS NOT NULL) THEN
			sme := (OLD.itm_alt_nm2 = NEW.itm_alt_nm2);
		ELSE
			sme := (OLD.itm_alt_nm2 IS NULL AND NEW.itm_alt_nm2 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.itm_alt_nm3 IS NOT NULL AND NEW.itm_alt_nm3 IS NOT NULL) THEN
			sme := (OLD.itm_alt_nm3 = NEW.itm_alt_nm3);
		ELSE
			sme := (OLD.itm_alt_nm3 IS NULL AND NEW.itm_alt_nm3 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.itm_alt_nm4 IS NOT NULL AND NEW.itm_alt_nm4 IS NOT NULL) THEN
			sme := (OLD.itm_alt_nm4 = NEW.itm_alt_nm4);
		ELSE
			sme := (OLD.itm_alt_nm4 IS NULL AND NEW.itm_alt_nm4 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_itm_lcl_cmn (
			lcl_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			itm_alt_nm1,
			itm_alt_nm2,
			itm_alt_nm3,
			itm_alt_nm4,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.itm_cd,
			NEW.itm_sub1,
			NEW.itm_sub2,
			NEW.itm_sub3,
			NEW.itm_nm,
			NEW.itm_alt_nm1,
			NEW.itm_alt_nm2,
			NEW.itm_alt_nm3,
			NEW.itm_alt_nm4,
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
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3
		)
		DO UPDATE SET
			itm_nm= NEW.itm_nm,
			itm_alt_nm1= NEW.itm_alt_nm1,
			itm_alt_nm2= NEW.itm_alt_nm2,
			itm_alt_nm3= NEW.itm_alt_nm3,
			itm_alt_nm4= NEW.itm_alt_nm4,
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

CREATE TRIGGER mam_itm_cmn_tr_l
BEFORE INSERT OR UPDATE ON mam_itm_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_itm_cmn_tr_l_body();


