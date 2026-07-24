\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_wk_cost_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.wk_cost_nm IS NOT NULL AND NEW.wk_cost_nm IS NOT NULL) THEN
			sme := (OLD.wk_cost_nm = NEW.wk_cost_nm);
		ELSE
			sme := (OLD.wk_cost_nm IS NULL AND NEW.wk_cost_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		IF (OLD.wk_cost_unit_nm IS NOT NULL AND NEW.wk_cost_unit_nm IS NOT NULL) THEN
			sme := (OLD.wk_cost_unit_nm = NEW.wk_cost_unit_nm);
		ELSE
			sme := (OLD.wk_cost_unit_nm IS NULL AND NEW.wk_cost_unit_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mam_wk_cost_lcl_all (
			lcl_cd,
			wk_cost_cd,
			wk_cost_nm,
			wk_cost_unit_nm,
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
			NEW.wk_cost_cd,
			NEW.wk_cost_nm,
			NEW.wk_cost_unit_nm,
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
			wk_cost_cd,
			co_cd
		)
		DO UPDATE SET
			wk_cost_nm= NEW.wk_cost_nm,
			wk_cost_unit_nm= NEW.wk_cost_unit_nm,
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

CREATE TRIGGER mam_wk_cost_all_tr_l
BEFORE INSERT OR UPDATE ON mam_wk_cost_all
FOR EACH ROW
EXECUTE FUNCTION mam_wk_cost_all_tr_l_body();


