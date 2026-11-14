\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_collat_exp_all_tr_r_body() RETURNS trigger AS $BODY$
DECLARE
	h_id fct_hst_header.hst_id%TYPE;
	a_id fct_oprhistory.action_id%TYPE;
	h_typ fct_hst_header.hst_type%TYPE;
	h_tab fct_hst_header.table_name%TYPE;
	u_id fcm_user.user_id%TYPE;
	cocd fct_hst_header.co_cd%TYPE;
	ex_1 fct_hst_header.ext_attr1%TYPE;
	ex_2 fct_hst_header.ext_attr2%TYPE;
	ex_3 fct_hst_header.ext_attr3%TYPE;
	rdate timestamp(0);
BEGIN
	h_tab :='mam_collat_exp_all_r';
	a_id := fcpa_context$f_get_action_id();
	u_id := fcpa_context$f_get_userid();
	cocd := fcpa_context$f_get_co_cd();
	ex_1 := fcpa_context$f_get_ext_attr1();
	ex_2 := fcpa_context$f_get_ext_attr2();
	ex_3 := fcpa_context$f_get_ext_attr3();
	rdate := fcpa_date_util$f_mcsysdate();
	IF (TG_OP = 'INSERT') THEN
		SELECT NEXTVAL('fcs_history') INTO STRICT h_id;
		h_typ := 'I'; 
		INSERT INTO fct_hst_header (hst_id, table_name, key_id, action_id, hst_type, hst_time, hst_user_id, co_cd, ext_attr1, ext_attr2, ext_attr3)
			values (
				h_id,
				h_tab,
				h_id,
				a_id,
				h_typ,
				rdate,
				u_id,
				cocd,
				ex_1,
				ex_2,
				ex_3
		);
		INSERT INTO mam_collat_exp_all_r (
			hst_id,
			hst_type,
			match_key,
			sub,
			typ,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			itm_alt_nm1,
			match_d_key,
			itm_qty,
			work_proc_no,
			fill_color,
			nm_plate,
			rmrks1,
			rmrks2,
			rmrks3,
			rmrks4,
			rmrks5,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				NEW.match_key,
				NEW.sub,
				NEW.typ,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.itm_nm,
				NEW.itm_alt_nm1,
				NEW.match_d_key,
				NEW.itm_qty,
				NEW.work_proc_no,
				NEW.fill_color,
				NEW.nm_plate,
				NEW.rmrks1,
				NEW.rmrks2,
				NEW.rmrks3,
				NEW.rmrks4,
				NEW.rmrks5,
				NEW.ins_usr_id,
				NEW.ins_usr_nm,
				NEW.ins_ts,
				NEW.ins_func_id,
				NEW.upd_cntr,
				NEW.upd_usr_id,
				NEW.upd_usr_nm,
				NEW.upd_ts,
				NEW.upd_func_id,
				NEW.upd_srv_req_no
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.match_key <> NEW.match_key OR OLD.sub <> NEW.sub OR OLD.typ <> NEW.typ OR OLD.itm_cd <> NEW.itm_cd THEN
			SELECT NEXTVAL('fcs_history') INTO STRICT h_id;
			h_typ := 'D';
			INSERT INTO fct_hst_header (hst_id,table_name,key_id,action_id,hst_type,hst_time,hst_user_id,co_cd,ext_attr1,ext_attr2,ext_attr3)
				VALUES (
					h_id,
					h_tab,
					h_id,
					a_id,
					h_typ,
					rdate,
					u_id,
					cocd,
					ex_1,
					ex_2,
					ex_3
			);
			INSERT INTO mam_collat_exp_all_r (
				hst_id,
				hst_type,
				match_key,
				sub,
				typ,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_nm,
				itm_alt_nm1,
				match_d_key,
				itm_qty,
				work_proc_no,
				fill_color,
				nm_plate,
				rmrks1,
				rmrks2,
				rmrks3,
				rmrks4,
				rmrks5,
				ins_usr_id,
				ins_usr_nm,
				ins_ts,
				ins_func_id,
				upd_cntr,
				upd_usr_id,
				upd_usr_nm,
				upd_ts,
				upd_func_id,
				upd_srv_req_no
			)
				VALUES (
					h_id,
					h_typ,
					OLD.match_key,
					OLD.sub,
					OLD.typ,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.itm_nm,
					OLD.itm_alt_nm1,
					OLD.match_d_key,
					OLD.itm_qty,
					OLD.work_proc_no,
					OLD.fill_color,
					OLD.nm_plate,
					OLD.rmrks1,
					OLD.rmrks2,
					OLD.rmrks3,
					OLD.rmrks4,
					OLD.rmrks5,
					OLD.ins_usr_id,
					OLD.ins_usr_nm,
					OLD.ins_ts,
					OLD.ins_func_id,
					OLD.upd_cntr,
					OLD.upd_usr_id,
					OLD.upd_usr_nm,
					OLD.upd_ts,
					OLD.upd_func_id,
					OLD.upd_srv_req_no
			);
			h_typ := 'I';
		ELSE
			h_typ := 'U';
		END IF;
		SELECT NEXTVAL('fcs_history') INTO STRICT h_id;
		INSERT INTO fct_hst_header (hst_id,table_name,key_id,action_id,hst_type,hst_time,hst_user_id,co_cd,ext_attr1,ext_attr2,ext_attr3)
			VALUES (
				h_id,
				h_tab,
				h_id,
				a_id,
				h_typ,
				rdate,
				u_id,
				cocd,
				ex_1,
				ex_2,
				ex_3
		);
		INSERT INTO mam_collat_exp_all_r (
			hst_id,
			hst_type,
			match_key,
			sub,
			typ,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			itm_alt_nm1,
			match_d_key,
			itm_qty,
			work_proc_no,
			fill_color,
			nm_plate,
			rmrks1,
			rmrks2,
			rmrks3,
			rmrks4,
			rmrks5,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				NEW.match_key,
				NEW.sub,
				NEW.typ,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.itm_nm,
				NEW.itm_alt_nm1,
				NEW.match_d_key,
				NEW.itm_qty,
				NEW.work_proc_no,
				NEW.fill_color,
				NEW.nm_plate,
				NEW.rmrks1,
				NEW.rmrks2,
				NEW.rmrks3,
				NEW.rmrks4,
				NEW.rmrks5,
				NEW.ins_usr_id,
				NEW.ins_usr_nm,
				NEW.ins_ts,
				NEW.ins_func_id,
				NEW.upd_cntr,
				NEW.upd_usr_id,
				NEW.upd_usr_nm,
				NEW.upd_ts,
				NEW.upd_func_id,
				NEW.upd_srv_req_no
		);
		RETURN NEW;
	ELSIF (TG_OP = 'DELETE') THEN
		SELECT NEXTVAL('fcs_history') INTO STRICT h_id;
		h_typ := 'D';
		INSERT INTO fct_hst_header (hst_id,table_name,key_id,action_id,hst_type,hst_time,hst_user_id,co_cd,ext_attr1,ext_attr2,ext_attr3)
			VALUES (
				h_id,
				h_tab,
				h_id,
				a_id,
				h_typ,
				rdate,
				u_id,
				cocd,
				ex_1,
				ex_2,
				ex_3
		);
		INSERT INTO mam_collat_exp_all_r (
			hst_id,
			hst_type,
			match_key,
			sub,
			typ,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_nm,
			itm_alt_nm1,
			match_d_key,
			itm_qty,
			work_proc_no,
			fill_color,
			nm_plate,
			rmrks1,
			rmrks2,
			rmrks3,
			rmrks4,
			rmrks5,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				OLD.match_key,
				OLD.sub,
				OLD.typ,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.itm_nm,
				OLD.itm_alt_nm1,
				OLD.match_d_key,
				OLD.itm_qty,
				OLD.work_proc_no,
				OLD.fill_color,
				OLD.nm_plate,
				OLD.rmrks1,
				OLD.rmrks2,
				OLD.rmrks3,
				OLD.rmrks4,
				OLD.rmrks5,
				OLD.ins_usr_id,
				OLD.ins_usr_nm,
				OLD.ins_ts,
				OLD.ins_func_id,
				OLD.upd_cntr,
				OLD.upd_usr_id,
				OLD.upd_usr_nm,
				OLD.upd_ts,
				OLD.upd_func_id,
				OLD.upd_srv_req_no
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_collat_exp_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_collat_exp_all
FOR EACH ROW
EXECUTE FUNCTION mam_collat_exp_all_tr_r_body();
ALTER TABLE mam_collat_exp_all DISABLE TRIGGER mam_collat_exp_all_tr_r;

