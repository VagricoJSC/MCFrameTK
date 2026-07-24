\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_oper_cmn_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.oper_nm IS NOT NULL AND NEW.oper_nm IS NOT NULL) THEN
			sme := (OLD.oper_nm = NEW.oper_nm);
		ELSE
			sme := (OLD.oper_nm IS NULL AND NEW.oper_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_oper_lcl_cmn (
			lcl_cd,
			oper_cd,
			oper_nm,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.oper_cd,
			NEW.oper_nm,
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
			oper_cd
		)
		DO UPDATE SET
			oper_nm= NEW.oper_nm,
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

CREATE TRIGGER mam_oper_cmn_tr_l
BEFORE INSERT OR UPDATE ON mam_oper_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_oper_cmn_tr_l_body();


