\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_close_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_close_all_r';
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
		INSERT INTO mst_close_all_r (
			hst_id,
			hst_type,
			ym,
			co_cd,
			sls_cl_flg,
			rcv_cl_flg,
			purc_cl_flg,
			pay_cl_flg,
			stk_cl_flg,
			sls_cl_tm,
			rcv_cl_tm,
			purc_cl_tm,
			pay_cl_tm,
			stk_cl_tm,
			ar_pre_cl_tm,
			ap_pre_cl_tm,
			sls_cl_usr_cd,
			rcv_cl_usr_cd,
			purc_cl_usr_cd,
			pay_cl_usr_cd,
			stk_cl_usr_cd,
			ar_pre_cl_usr_cd,
			ap_pre_cl_usr_cd,
			ar_pre_cl_flg,
			ap_pre_cl_flg,
			all_acst_pre_cl_flg,
			all_asppl_pre_cl_flg,
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
				NEW.ym,
				NEW.co_cd,
				NEW.sls_cl_flg,
				NEW.rcv_cl_flg,
				NEW.purc_cl_flg,
				NEW.pay_cl_flg,
				NEW.stk_cl_flg,
				NEW.sls_cl_tm,
				NEW.rcv_cl_tm,
				NEW.purc_cl_tm,
				NEW.pay_cl_tm,
				NEW.stk_cl_tm,
				NEW.ar_pre_cl_tm,
				NEW.ap_pre_cl_tm,
				NEW.sls_cl_usr_cd,
				NEW.rcv_cl_usr_cd,
				NEW.purc_cl_usr_cd,
				NEW.pay_cl_usr_cd,
				NEW.stk_cl_usr_cd,
				NEW.ar_pre_cl_usr_cd,
				NEW.ap_pre_cl_usr_cd,
				NEW.ar_pre_cl_flg,
				NEW.ap_pre_cl_flg,
				NEW.all_acst_pre_cl_flg,
				NEW.all_asppl_pre_cl_flg,
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
		IF OLD.ym <> NEW.ym OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_close_all_r (
				hst_id,
				hst_type,
				ym,
				co_cd,
				sls_cl_flg,
				rcv_cl_flg,
				purc_cl_flg,
				pay_cl_flg,
				stk_cl_flg,
				sls_cl_tm,
				rcv_cl_tm,
				purc_cl_tm,
				pay_cl_tm,
				stk_cl_tm,
				ar_pre_cl_tm,
				ap_pre_cl_tm,
				sls_cl_usr_cd,
				rcv_cl_usr_cd,
				purc_cl_usr_cd,
				pay_cl_usr_cd,
				stk_cl_usr_cd,
				ar_pre_cl_usr_cd,
				ap_pre_cl_usr_cd,
				ar_pre_cl_flg,
				ap_pre_cl_flg,
				all_acst_pre_cl_flg,
				all_asppl_pre_cl_flg,
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
					OLD.ym,
					OLD.co_cd,
					OLD.sls_cl_flg,
					OLD.rcv_cl_flg,
					OLD.purc_cl_flg,
					OLD.pay_cl_flg,
					OLD.stk_cl_flg,
					OLD.sls_cl_tm,
					OLD.rcv_cl_tm,
					OLD.purc_cl_tm,
					OLD.pay_cl_tm,
					OLD.stk_cl_tm,
					OLD.ar_pre_cl_tm,
					OLD.ap_pre_cl_tm,
					OLD.sls_cl_usr_cd,
					OLD.rcv_cl_usr_cd,
					OLD.purc_cl_usr_cd,
					OLD.pay_cl_usr_cd,
					OLD.stk_cl_usr_cd,
					OLD.ar_pre_cl_usr_cd,
					OLD.ap_pre_cl_usr_cd,
					OLD.ar_pre_cl_flg,
					OLD.ap_pre_cl_flg,
					OLD.all_acst_pre_cl_flg,
					OLD.all_asppl_pre_cl_flg,
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
		INSERT INTO mst_close_all_r (
			hst_id,
			hst_type,
			ym,
			co_cd,
			sls_cl_flg,
			rcv_cl_flg,
			purc_cl_flg,
			pay_cl_flg,
			stk_cl_flg,
			sls_cl_tm,
			rcv_cl_tm,
			purc_cl_tm,
			pay_cl_tm,
			stk_cl_tm,
			ar_pre_cl_tm,
			ap_pre_cl_tm,
			sls_cl_usr_cd,
			rcv_cl_usr_cd,
			purc_cl_usr_cd,
			pay_cl_usr_cd,
			stk_cl_usr_cd,
			ar_pre_cl_usr_cd,
			ap_pre_cl_usr_cd,
			ar_pre_cl_flg,
			ap_pre_cl_flg,
			all_acst_pre_cl_flg,
			all_asppl_pre_cl_flg,
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
				NEW.ym,
				NEW.co_cd,
				NEW.sls_cl_flg,
				NEW.rcv_cl_flg,
				NEW.purc_cl_flg,
				NEW.pay_cl_flg,
				NEW.stk_cl_flg,
				NEW.sls_cl_tm,
				NEW.rcv_cl_tm,
				NEW.purc_cl_tm,
				NEW.pay_cl_tm,
				NEW.stk_cl_tm,
				NEW.ar_pre_cl_tm,
				NEW.ap_pre_cl_tm,
				NEW.sls_cl_usr_cd,
				NEW.rcv_cl_usr_cd,
				NEW.purc_cl_usr_cd,
				NEW.pay_cl_usr_cd,
				NEW.stk_cl_usr_cd,
				NEW.ar_pre_cl_usr_cd,
				NEW.ap_pre_cl_usr_cd,
				NEW.ar_pre_cl_flg,
				NEW.ap_pre_cl_flg,
				NEW.all_acst_pre_cl_flg,
				NEW.all_asppl_pre_cl_flg,
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
		INSERT INTO mst_close_all_r (
			hst_id,
			hst_type,
			ym,
			co_cd,
			sls_cl_flg,
			rcv_cl_flg,
			purc_cl_flg,
			pay_cl_flg,
			stk_cl_flg,
			sls_cl_tm,
			rcv_cl_tm,
			purc_cl_tm,
			pay_cl_tm,
			stk_cl_tm,
			ar_pre_cl_tm,
			ap_pre_cl_tm,
			sls_cl_usr_cd,
			rcv_cl_usr_cd,
			purc_cl_usr_cd,
			pay_cl_usr_cd,
			stk_cl_usr_cd,
			ar_pre_cl_usr_cd,
			ap_pre_cl_usr_cd,
			ar_pre_cl_flg,
			ap_pre_cl_flg,
			all_acst_pre_cl_flg,
			all_asppl_pre_cl_flg,
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
				OLD.ym,
				OLD.co_cd,
				OLD.sls_cl_flg,
				OLD.rcv_cl_flg,
				OLD.purc_cl_flg,
				OLD.pay_cl_flg,
				OLD.stk_cl_flg,
				OLD.sls_cl_tm,
				OLD.rcv_cl_tm,
				OLD.purc_cl_tm,
				OLD.pay_cl_tm,
				OLD.stk_cl_tm,
				OLD.ar_pre_cl_tm,
				OLD.ap_pre_cl_tm,
				OLD.sls_cl_usr_cd,
				OLD.rcv_cl_usr_cd,
				OLD.purc_cl_usr_cd,
				OLD.pay_cl_usr_cd,
				OLD.stk_cl_usr_cd,
				OLD.ar_pre_cl_usr_cd,
				OLD.ap_pre_cl_usr_cd,
				OLD.ar_pre_cl_flg,
				OLD.ap_pre_cl_flg,
				OLD.all_acst_pre_cl_flg,
				OLD.all_asppl_pre_cl_flg,
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

CREATE TRIGGER mst_close_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_close_all
FOR EACH ROW
EXECUTE FUNCTION mst_close_all_tr_r_body();
ALTER TABLE mst_close_all DISABLE TRIGGER mst_close_all_tr_r;

