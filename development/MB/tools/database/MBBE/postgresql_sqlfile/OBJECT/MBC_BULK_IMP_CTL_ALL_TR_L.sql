\encoding UTF-8

CREATE OR REPLACE FUNCTION mbc_bulk_imp_ctl_all_tr_l_body() RETURNS trigger AS $BODY$
DECLARE
	sme boolean;
BEGIN
	<<MDIFF>>
	LOOP
		IF (OLD.table_nm IS NOT NULL AND NEW.table_nm IS NOT NULL) THEN
			sme := (OLD.table_nm = NEW.table_nm);
		ELSE
			sme := (OLD.table_nm IS NULL AND NEW.table_nm IS NULL);
		END IF;
		IF NOT sme THEN EXIT MDIFF; END IF;
		EXIT MDIFF;
	END LOOP;
	IF TG_OP = 'INSERT' OR (TG_OP = 'UPDATE' AND NOT SME) THEN
		INSERT INTO mbc_bulk_imp_ctl_lcl_all (
			lcl_cd,
			table_id,
			co_cd,
			table_nm,
			ins_usr_id,
			ins_usr_nm,
			ins_func_id,
			upd_usr_id,
			upd_usr_nm,
			upd_func_id,
			upd_srv_req_no
		)VALUES(
			fcpa_context$f_get_def_locale_cd(),
			NEW.table_id,
			NEW.co_cd,
			NEW.table_nm,
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
			table_id,
			co_cd
		)
		DO UPDATE SET
			table_nm= NEW.table_nm,
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

CREATE TRIGGER mbc_bulk_imp_ctl_all_tr_l
BEFORE INSERT OR UPDATE ON mbc_bulk_imp_ctl_all
FOR EACH ROW
EXECUTE FUNCTION mbc_bulk_imp_ctl_all_tr_l_body();


