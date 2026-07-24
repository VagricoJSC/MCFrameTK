\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_std_top_all_tr_u_body() RETURNS trigger AS $BODY$
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
	ELSIF (TG_OP = 'UPDATE') THEN
		NEW.upd_cntr := OLD.upd_cntr + 1;
		NEW.upd_ts := fcpa_date_util$f_mcsystimestamp();
		IF NEW.upd_srv_req_no IS NULL OR NEW.upd_srv_req_no = OLD.upd_srv_req_no THEN
			NEW.upd_usr_id := fcpa_context$f_get_userid();
			NEW.upd_usr_nm := fcpa_context$f_get_usernm();
			NEW.upd_func_id := fcpa_context$f_get_call_pg_id();
			NEW.upd_srv_req_no := fcpa_context$f_get_processid();
		END IF;
	END IF;
	RETURN NEW;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgt_std_top_all_tr_u
BEFORE INSERT OR UPDATE ON mgt_std_top_all
FOR EACH ROW
EXECUTE FUNCTION mgt_std_top_all_tr_u_body();


