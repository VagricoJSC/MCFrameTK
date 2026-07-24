\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_sls_anly_cmn_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.sls_anly_nm IS NOT NULL AND NEW.sls_anly_nm IS NOT NULL) THEN
			sme := (OLD.sls_anly_nm = NEW.sls_anly_nm);
		ELSE
			sme := (OLD.sls_anly_nm IS NULL AND NEW.sls_anly_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_sls_anly_lcl_cmn (
			lcl_cd,
			sls_anly_typ,
			sls_anly_cd,
			sls_anly_nm,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.sls_anly_typ,
			NEW.sls_anly_cd,
			NEW.sls_anly_nm,
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
			sls_anly_typ,
			sls_anly_cd
		)
		DO UPDATE SET
			sls_anly_nm= NEW.sls_anly_nm,
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

CREATE TRIGGER mam_sls_anly_cmn_tr_l
BEFORE INSERT OR UPDATE ON mam_sls_anly_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_sls_anly_cmn_tr_l_body();


