\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_co_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.co_alt_nm1 IS NOT NULL AND NEW.co_alt_nm1 IS NOT NULL) THEN
			sme := (OLD.co_alt_nm1 = NEW.co_alt_nm1);
		ELSE
			sme := (OLD.co_alt_nm1 IS NULL AND NEW.co_alt_nm1 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.co_alt_nm2 IS NOT NULL AND NEW.co_alt_nm2 IS NOT NULL) THEN
			sme := (OLD.co_alt_nm2 = NEW.co_alt_nm2);
		ELSE
			sme := (OLD.co_alt_nm2 IS NULL AND NEW.co_alt_nm2 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.co_alt_nm3 IS NOT NULL AND NEW.co_alt_nm3 IS NOT NULL) THEN
			sme := (OLD.co_alt_nm3 = NEW.co_alt_nm3);
		ELSE
			sme := (OLD.co_alt_nm3 IS NULL AND NEW.co_alt_nm3 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.co_alt_nm4 IS NOT NULL AND NEW.co_alt_nm4 IS NOT NULL) THEN
			sme := (OLD.co_alt_nm4 = NEW.co_alt_nm4);
		ELSE
			sme := (OLD.co_alt_nm4 IS NULL AND NEW.co_alt_nm4 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.zip_cd IS NOT NULL AND NEW.zip_cd IS NOT NULL) THEN
			sme := (OLD.zip_cd = NEW.zip_cd);
		ELSE
			sme := (OLD.zip_cd IS NULL AND NEW.zip_cd IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.addr1 IS NOT NULL AND NEW.addr1 IS NOT NULL) THEN
			sme := (OLD.addr1 = NEW.addr1);
		ELSE
			sme := (OLD.addr1 IS NULL AND NEW.addr1 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.addr2 IS NOT NULL AND NEW.addr2 IS NOT NULL) THEN
			sme := (OLD.addr2 = NEW.addr2);
		ELSE
			sme := (OLD.addr2 IS NULL AND NEW.addr2 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.addr3 IS NOT NULL AND NEW.addr3 IS NOT NULL) THEN
			sme := (OLD.addr3 = NEW.addr3);
		ELSE
			sme := (OLD.addr3 IS NULL AND NEW.addr3 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.addr4 IS NOT NULL AND NEW.addr4 IS NOT NULL) THEN
			sme := (OLD.addr4 = NEW.addr4);
		ELSE
			sme := (OLD.addr4 IS NULL AND NEW.addr4 IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.tel IS NOT NULL AND NEW.tel IS NOT NULL) THEN
			sme := (OLD.tel = NEW.tel);
		ELSE
			sme := (OLD.tel IS NULL AND NEW.tel IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.fax IS NOT NULL AND NEW.fax IS NOT NULL) THEN
			sme := (OLD.fax = NEW.fax);
		ELSE
			sme := (OLD.fax IS NULL AND NEW.fax IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.co_repl_nm IS NOT NULL AND NEW.co_repl_nm IS NOT NULL) THEN
			sme := (OLD.co_repl_nm = NEW.co_repl_nm);
		ELSE
			sme := (OLD.co_repl_nm IS NULL AND NEW.co_repl_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_co_lcl_all (
			lcl_cd,
			co_cd,
			co_alt_nm1,
			co_alt_nm2,
			co_alt_nm3,
			co_alt_nm4,
			zip_cd,
			addr1,
			addr2,
			addr3,
			addr4,
			tel,
			fax,
			co_repl_nm,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.co_cd,
			NEW.co_alt_nm1,
			NEW.co_alt_nm2,
			NEW.co_alt_nm3,
			NEW.co_alt_nm4,
			NEW.zip_cd,
			NEW.addr1,
			NEW.addr2,
			NEW.addr3,
			NEW.addr4,
			NEW.tel,
			NEW.fax,
			NEW.co_repl_nm,
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
			co_cd
		)
		DO UPDATE SET
			co_alt_nm1= NEW.co_alt_nm1,
			co_alt_nm2= NEW.co_alt_nm2,
			co_alt_nm3= NEW.co_alt_nm3,
			co_alt_nm4= NEW.co_alt_nm4,
			zip_cd= NEW.zip_cd,
			addr1= NEW.addr1,
			addr2= NEW.addr2,
			addr3= NEW.addr3,
			addr4= NEW.addr4,
			tel= NEW.tel,
			fax= NEW.fax,
			co_repl_nm= NEW.co_repl_nm,
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

CREATE TRIGGER mam_co_all_tr_l
BEFORE INSERT OR UPDATE ON mam_co_all
FOR EACH ROW
EXECUTE FUNCTION mam_co_all_tr_l_body();


