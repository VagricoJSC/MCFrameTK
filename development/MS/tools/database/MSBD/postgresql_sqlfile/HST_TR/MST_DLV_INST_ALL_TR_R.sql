\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_dlv_inst_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_dlv_inst_all_r';
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
		INSERT INTO mst_dlv_inst_all_r (
			hst_id,
			hst_type,
			dlv_inst_no,
			co_cd,
			dlv_inst_rev,
			dlv_inst_seq,
			dlv_inst_grp_no,
			po_d_no,
			dlv_inst_print_dt,
			dlv_inst_print_flg,
			last_dlv_inst_rev,
			dlv_inst_dt,
			edi_flg,
			can_flg,
			dlv_inst_print_rmrks,
			intr_rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				NEW.dlv_inst_no,
				NEW.co_cd,
				NEW.dlv_inst_rev,
				NEW.dlv_inst_seq,
				NEW.dlv_inst_grp_no,
				NEW.po_d_no,
				NEW.dlv_inst_print_dt,
				NEW.dlv_inst_print_flg,
				NEW.last_dlv_inst_rev,
				NEW.dlv_inst_dt,
				NEW.edi_flg,
				NEW.can_flg,
				NEW.dlv_inst_print_rmrks,
				NEW.intr_rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
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
		IF OLD.dlv_inst_no <> NEW.dlv_inst_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_dlv_inst_all_r (
				hst_id,
				hst_type,
				dlv_inst_no,
				co_cd,
				dlv_inst_rev,
				dlv_inst_seq,
				dlv_inst_grp_no,
				po_d_no,
				dlv_inst_print_dt,
				dlv_inst_print_flg,
				last_dlv_inst_rev,
				dlv_inst_dt,
				edi_flg,
				can_flg,
				dlv_inst_print_rmrks,
				intr_rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
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
					OLD.dlv_inst_no,
					OLD.co_cd,
					OLD.dlv_inst_rev,
					OLD.dlv_inst_seq,
					OLD.dlv_inst_grp_no,
					OLD.po_d_no,
					OLD.dlv_inst_print_dt,
					OLD.dlv_inst_print_flg,
					OLD.last_dlv_inst_rev,
					OLD.dlv_inst_dt,
					OLD.edi_flg,
					OLD.can_flg,
					OLD.dlv_inst_print_rmrks,
					OLD.intr_rmrks,
					OLD.sub_char1,
					OLD.sub_char2,
					OLD.sub_char3,
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
		INSERT INTO mst_dlv_inst_all_r (
			hst_id,
			hst_type,
			dlv_inst_no,
			co_cd,
			dlv_inst_rev,
			dlv_inst_seq,
			dlv_inst_grp_no,
			po_d_no,
			dlv_inst_print_dt,
			dlv_inst_print_flg,
			last_dlv_inst_rev,
			dlv_inst_dt,
			edi_flg,
			can_flg,
			dlv_inst_print_rmrks,
			intr_rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				NEW.dlv_inst_no,
				NEW.co_cd,
				NEW.dlv_inst_rev,
				NEW.dlv_inst_seq,
				NEW.dlv_inst_grp_no,
				NEW.po_d_no,
				NEW.dlv_inst_print_dt,
				NEW.dlv_inst_print_flg,
				NEW.last_dlv_inst_rev,
				NEW.dlv_inst_dt,
				NEW.edi_flg,
				NEW.can_flg,
				NEW.dlv_inst_print_rmrks,
				NEW.intr_rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
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
		INSERT INTO mst_dlv_inst_all_r (
			hst_id,
			hst_type,
			dlv_inst_no,
			co_cd,
			dlv_inst_rev,
			dlv_inst_seq,
			dlv_inst_grp_no,
			po_d_no,
			dlv_inst_print_dt,
			dlv_inst_print_flg,
			last_dlv_inst_rev,
			dlv_inst_dt,
			edi_flg,
			can_flg,
			dlv_inst_print_rmrks,
			intr_rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				OLD.dlv_inst_no,
				OLD.co_cd,
				OLD.dlv_inst_rev,
				OLD.dlv_inst_seq,
				OLD.dlv_inst_grp_no,
				OLD.po_d_no,
				OLD.dlv_inst_print_dt,
				OLD.dlv_inst_print_flg,
				OLD.last_dlv_inst_rev,
				OLD.dlv_inst_dt,
				OLD.edi_flg,
				OLD.can_flg,
				OLD.dlv_inst_print_rmrks,
				OLD.intr_rmrks,
				OLD.sub_char1,
				OLD.sub_char2,
				OLD.sub_char3,
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

CREATE TRIGGER mst_dlv_inst_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_dlv_inst_all
FOR EACH ROW
EXECUTE FUNCTION mst_dlv_inst_all_tr_r_body();
ALTER TABLE mst_dlv_inst_all DISABLE TRIGGER mst_dlv_inst_all_tr_r;

