\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_rpt_ptn_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.rpt_ptn_nm IS NOT NULL AND NEW.rpt_ptn_nm IS NOT NULL) THEN
			sme := (OLD.rpt_ptn_nm = NEW.rpt_ptn_nm);
		ELSE
			sme := (OLD.rpt_ptn_nm IS NULL AND NEW.rpt_ptn_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_rpt_ptn_lcl_all (
			lcl_cd,
			rpt_ptn_cd,
			rpt_ptn_nm,
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
			NEW.rpt_ptn_cd,
			NEW.rpt_ptn_nm,
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
			rpt_ptn_cd,
			co_cd
		)
		DO UPDATE SET
			rpt_ptn_nm= NEW.rpt_ptn_nm,
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

CREATE TRIGGER mam_rpt_ptn_all_tr_l
BEFORE INSERT OR UPDATE ON mam_rpt_ptn_all
FOR EACH ROW
EXECUTE FUNCTION mam_rpt_ptn_all_tr_l_body();


