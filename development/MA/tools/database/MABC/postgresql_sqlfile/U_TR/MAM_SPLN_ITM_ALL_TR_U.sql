\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_spln_itm_all_tr_u_body() RETURNS trigger AS $BODY$
DECLARE
BEGIN
	IF (TG_OP = 'INSERT') THEN
		NEW.ins_ts := fcpa_date_util$f_mcsystimestamp();
		NEW.ins_usr_id := COALESCE(NEW.ins_usr_id,fcpa_context$f_get_userid());
		NEW.ins_usr_nm := COALESCE(NEW.ins_usr_nm, fcpa_context$f_get_usernm());
		NEW.ins_func_id := COALESCE(NEW.ins_func_id, fcpa_context$f_get_call_pg_id());
		NEW.upd_cntr := 0;
		NEW.upd_ts := NEW.ins_ts;
		NEW.upd_usr_id := NEW.ins_usr_id;
		NEW.upd_usr_nm := NEW.ins_usr_nm;
		NEW.upd_func_id := NEW.ins_func_id;
		NEW.upd_srv_req_no := COALESCE(NEW.upd_srv_req_no, fcpa_context$f_get_processid());
		IF NEW.del_flg = '1' THEN
			NEW.del_ts := NEW.ins_ts;
			NEW.del_usr_id := NEW.ins_usr_id;
			NEW.del_usr_nm := NEW.ins_usr_nm;
		END IF;
	ELSIF (TG_OP = 'UPDATE') THEN
		NEW.upd_cntr := OLD.upd_cntr + 1;
		NEW.upd_ts := fcpa_date_util$f_mcsystimestamp();
		IF NEW.upd_srv_req_no IS NULL OR NEW.upd_srv_req_no = OLD.upd_srv_req_no THEN
			NEW.upd_usr_id := fcpa_context$f_get_userid();
			NEW.upd_usr_nm := fcpa_context$f_get_usernm();
			NEW.upd_func_id := fcpa_context$f_get_call_pg_id();
			NEW.upd_srv_req_no := fcpa_context$f_get_processid();
		END IF;
		IF NEW.del_flg <> OLD.del_flg THEN
			IF NEW.del_flg = '0' THEN
				NEW.del_ts := NULL;
				NEW.del_usr_id := NULL;
				NEW.del_usr_nm := NULL;
			END IF;
			IF NEW.del_flg = '1' THEN
				NEW.del_ts := NEW.upd_ts;
				NEW.del_usr_id := NEW.upd_usr_id;
				NEW.del_usr_nm := NEW.upd_usr_nm;
			END IF;
		END IF;
	END IF;
	RETURN NEW;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_spln_itm_all_tr_u
BEFORE INSERT OR UPDATE ON mam_spln_itm_all
FOR EACH ROW
EXECUTE FUNCTION mam_spln_itm_all_tr_u_body();


