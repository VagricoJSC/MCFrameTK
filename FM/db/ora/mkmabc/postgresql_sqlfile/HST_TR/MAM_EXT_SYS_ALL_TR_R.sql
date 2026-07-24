\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_ext_sys_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_ext_sys_all_r';
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
		INSERT INTO mam_ext_sys_all_r (
			hst_id,
			hst_type,
			ext_sys_cd,
			ext_sys_nm,
			ext_sys_typ,
			web_api_flg,
			cmd_exec_flg,
			real_imp_flg,
			not_send_upd_flg,
			not_dup_imp_flg,
			if_upd_typ,
			dlv_slip_split_flg,
			null_val_if_flg,
			upri_not_chk_flg,
			amt_not_chk_flg,
			tax_not_chk_flg,
			memo1,
			memo2,
			memo3,
			del_flg,
			del_usr_id,
			del_usr_nm,
			del_ts,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.ext_sys_cd,
				NEW.ext_sys_nm,
				NEW.ext_sys_typ,
				NEW.web_api_flg,
				NEW.cmd_exec_flg,
				NEW.real_imp_flg,
				NEW.not_send_upd_flg,
				NEW.not_dup_imp_flg,
				NEW.if_upd_typ,
				NEW.dlv_slip_split_flg,
				NEW.null_val_if_flg,
				NEW.upri_not_chk_flg,
				NEW.amt_not_chk_flg,
				NEW.tax_not_chk_flg,
				NEW.memo1,
				NEW.memo2,
				NEW.memo3,
				NEW.del_flg,
				NEW.del_usr_id,
				NEW.del_usr_nm,
				NEW.del_ts,
				NEW.ins_usr_id,
				NEW.ins_usr_nm,
				NEW.ins_ts,
				NEW.ins_func_id,
				NEW.upd_cntr,
				NEW.upd_usr_id,
				NEW.upd_usr_nm,
				NEW.upd_ts,
				NEW.upd_func_id,
				NEW.upd_srv_req_no,
				NEW.co_cd
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.ext_sys_cd <> NEW.ext_sys_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_ext_sys_all_r (
				hst_id,
				hst_type,
				ext_sys_cd,
				ext_sys_nm,
				ext_sys_typ,
				web_api_flg,
				cmd_exec_flg,
				real_imp_flg,
				not_send_upd_flg,
				not_dup_imp_flg,
				if_upd_typ,
				dlv_slip_split_flg,
				null_val_if_flg,
				upri_not_chk_flg,
				amt_not_chk_flg,
				tax_not_chk_flg,
				memo1,
				memo2,
				memo3,
				del_flg,
				del_usr_id,
				del_usr_nm,
				del_ts,
				ins_usr_id,
				ins_usr_nm,
				ins_ts,
				ins_func_id,
				upd_cntr,
				upd_usr_id,
				upd_usr_nm,
				upd_ts,
				upd_func_id,
				upd_srv_req_no,
				co_cd
			)
				VALUES (
					h_id,
					h_typ,
					OLD.ext_sys_cd,
					OLD.ext_sys_nm,
					OLD.ext_sys_typ,
					OLD.web_api_flg,
					OLD.cmd_exec_flg,
					OLD.real_imp_flg,
					OLD.not_send_upd_flg,
					OLD.not_dup_imp_flg,
					OLD.if_upd_typ,
					OLD.dlv_slip_split_flg,
					OLD.null_val_if_flg,
					OLD.upri_not_chk_flg,
					OLD.amt_not_chk_flg,
					OLD.tax_not_chk_flg,
					OLD.memo1,
					OLD.memo2,
					OLD.memo3,
					OLD.del_flg,
					OLD.del_usr_id,
					OLD.del_usr_nm,
					OLD.del_ts,
					OLD.ins_usr_id,
					OLD.ins_usr_nm,
					OLD.ins_ts,
					OLD.ins_func_id,
					OLD.upd_cntr,
					OLD.upd_usr_id,
					OLD.upd_usr_nm,
					OLD.upd_ts,
					OLD.upd_func_id,
					OLD.upd_srv_req_no,
					OLD.co_cd
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
		INSERT INTO mam_ext_sys_all_r (
			hst_id,
			hst_type,
			ext_sys_cd,
			ext_sys_nm,
			ext_sys_typ,
			web_api_flg,
			cmd_exec_flg,
			real_imp_flg,
			not_send_upd_flg,
			not_dup_imp_flg,
			if_upd_typ,
			dlv_slip_split_flg,
			null_val_if_flg,
			upri_not_chk_flg,
			amt_not_chk_flg,
			tax_not_chk_flg,
			memo1,
			memo2,
			memo3,
			del_flg,
			del_usr_id,
			del_usr_nm,
			del_ts,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.ext_sys_cd,
				NEW.ext_sys_nm,
				NEW.ext_sys_typ,
				NEW.web_api_flg,
				NEW.cmd_exec_flg,
				NEW.real_imp_flg,
				NEW.not_send_upd_flg,
				NEW.not_dup_imp_flg,
				NEW.if_upd_typ,
				NEW.dlv_slip_split_flg,
				NEW.null_val_if_flg,
				NEW.upri_not_chk_flg,
				NEW.amt_not_chk_flg,
				NEW.tax_not_chk_flg,
				NEW.memo1,
				NEW.memo2,
				NEW.memo3,
				NEW.del_flg,
				NEW.del_usr_id,
				NEW.del_usr_nm,
				NEW.del_ts,
				NEW.ins_usr_id,
				NEW.ins_usr_nm,
				NEW.ins_ts,
				NEW.ins_func_id,
				NEW.upd_cntr,
				NEW.upd_usr_id,
				NEW.upd_usr_nm,
				NEW.upd_ts,
				NEW.upd_func_id,
				NEW.upd_srv_req_no,
				NEW.co_cd
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
		INSERT INTO mam_ext_sys_all_r (
			hst_id,
			hst_type,
			ext_sys_cd,
			ext_sys_nm,
			ext_sys_typ,
			web_api_flg,
			cmd_exec_flg,
			real_imp_flg,
			not_send_upd_flg,
			not_dup_imp_flg,
			if_upd_typ,
			dlv_slip_split_flg,
			null_val_if_flg,
			upri_not_chk_flg,
			amt_not_chk_flg,
			tax_not_chk_flg,
			memo1,
			memo2,
			memo3,
			del_flg,
			del_usr_id,
			del_usr_nm,
			del_ts,
			ins_usr_id,
			ins_usr_nm,
			ins_ts,
			ins_func_id,
			upd_cntr,
			upd_usr_id,
			upd_usr_nm,
			upd_ts,
			upd_func_id,
			upd_srv_req_no,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				OLD.ext_sys_cd,
				OLD.ext_sys_nm,
				OLD.ext_sys_typ,
				OLD.web_api_flg,
				OLD.cmd_exec_flg,
				OLD.real_imp_flg,
				OLD.not_send_upd_flg,
				OLD.not_dup_imp_flg,
				OLD.if_upd_typ,
				OLD.dlv_slip_split_flg,
				OLD.null_val_if_flg,
				OLD.upri_not_chk_flg,
				OLD.amt_not_chk_flg,
				OLD.tax_not_chk_flg,
				OLD.memo1,
				OLD.memo2,
				OLD.memo3,
				OLD.del_flg,
				OLD.del_usr_id,
				OLD.del_usr_nm,
				OLD.del_ts,
				OLD.ins_usr_id,
				OLD.ins_usr_nm,
				OLD.ins_ts,
				OLD.ins_func_id,
				OLD.upd_cntr,
				OLD.upd_usr_id,
				OLD.upd_usr_nm,
				OLD.upd_ts,
				OLD.upd_func_id,
				OLD.upd_srv_req_no,
				OLD.co_cd
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_ext_sys_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_ext_sys_all
FOR EACH ROW
EXECUTE FUNCTION mam_ext_sys_all_tr_r_body();
ALTER TABLE mam_ext_sys_all DISABLE TRIGGER mam_ext_sys_all_tr_r;

