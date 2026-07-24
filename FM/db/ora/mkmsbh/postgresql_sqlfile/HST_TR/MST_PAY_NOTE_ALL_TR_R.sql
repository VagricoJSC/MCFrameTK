\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_pay_note_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_pay_note_all_r';
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
		INSERT INTO mst_pay_note_all_r (
			hst_id,
			hst_type,
			pay_note_mng_no,
			pay_note_mng_seq,
			co_cd,
			slip_sts_typ,
			note_no,
			note_typ,
			note_rsn_cd,
			draw_dt,
			due_dt,
			note_days,
			drawer_nm,
			draw_bank_cd,
			draw_branch_cd,
			endrsr,
			accptr,
			note_amt,
			cur_cd,
			pay_act_no,
			pay_act_seq,
			adv_pay_act_no,
			adv_pay_act_seq,
			a_imp_flg,
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
				NEW.pay_note_mng_no,
				NEW.pay_note_mng_seq,
				NEW.co_cd,
				NEW.slip_sts_typ,
				NEW.note_no,
				NEW.note_typ,
				NEW.note_rsn_cd,
				NEW.draw_dt,
				NEW.due_dt,
				NEW.note_days,
				NEW.drawer_nm,
				NEW.draw_bank_cd,
				NEW.draw_branch_cd,
				NEW.endrsr,
				NEW.accptr,
				NEW.note_amt,
				NEW.cur_cd,
				NEW.pay_act_no,
				NEW.pay_act_seq,
				NEW.adv_pay_act_no,
				NEW.adv_pay_act_seq,
				NEW.a_imp_flg,
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
		IF OLD.pay_note_mng_no <> NEW.pay_note_mng_no OR OLD.pay_note_mng_seq <> NEW.pay_note_mng_seq OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_pay_note_all_r (
				hst_id,
				hst_type,
				pay_note_mng_no,
				pay_note_mng_seq,
				co_cd,
				slip_sts_typ,
				note_no,
				note_typ,
				note_rsn_cd,
				draw_dt,
				due_dt,
				note_days,
				drawer_nm,
				draw_bank_cd,
				draw_branch_cd,
				endrsr,
				accptr,
				note_amt,
				cur_cd,
				pay_act_no,
				pay_act_seq,
				adv_pay_act_no,
				adv_pay_act_seq,
				a_imp_flg,
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
					OLD.pay_note_mng_no,
					OLD.pay_note_mng_seq,
					OLD.co_cd,
					OLD.slip_sts_typ,
					OLD.note_no,
					OLD.note_typ,
					OLD.note_rsn_cd,
					OLD.draw_dt,
					OLD.due_dt,
					OLD.note_days,
					OLD.drawer_nm,
					OLD.draw_bank_cd,
					OLD.draw_branch_cd,
					OLD.endrsr,
					OLD.accptr,
					OLD.note_amt,
					OLD.cur_cd,
					OLD.pay_act_no,
					OLD.pay_act_seq,
					OLD.adv_pay_act_no,
					OLD.adv_pay_act_seq,
					OLD.a_imp_flg,
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
		INSERT INTO mst_pay_note_all_r (
			hst_id,
			hst_type,
			pay_note_mng_no,
			pay_note_mng_seq,
			co_cd,
			slip_sts_typ,
			note_no,
			note_typ,
			note_rsn_cd,
			draw_dt,
			due_dt,
			note_days,
			drawer_nm,
			draw_bank_cd,
			draw_branch_cd,
			endrsr,
			accptr,
			note_amt,
			cur_cd,
			pay_act_no,
			pay_act_seq,
			adv_pay_act_no,
			adv_pay_act_seq,
			a_imp_flg,
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
				NEW.pay_note_mng_no,
				NEW.pay_note_mng_seq,
				NEW.co_cd,
				NEW.slip_sts_typ,
				NEW.note_no,
				NEW.note_typ,
				NEW.note_rsn_cd,
				NEW.draw_dt,
				NEW.due_dt,
				NEW.note_days,
				NEW.drawer_nm,
				NEW.draw_bank_cd,
				NEW.draw_branch_cd,
				NEW.endrsr,
				NEW.accptr,
				NEW.note_amt,
				NEW.cur_cd,
				NEW.pay_act_no,
				NEW.pay_act_seq,
				NEW.adv_pay_act_no,
				NEW.adv_pay_act_seq,
				NEW.a_imp_flg,
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
		INSERT INTO mst_pay_note_all_r (
			hst_id,
			hst_type,
			pay_note_mng_no,
			pay_note_mng_seq,
			co_cd,
			slip_sts_typ,
			note_no,
			note_typ,
			note_rsn_cd,
			draw_dt,
			due_dt,
			note_days,
			drawer_nm,
			draw_bank_cd,
			draw_branch_cd,
			endrsr,
			accptr,
			note_amt,
			cur_cd,
			pay_act_no,
			pay_act_seq,
			adv_pay_act_no,
			adv_pay_act_seq,
			a_imp_flg,
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
				OLD.pay_note_mng_no,
				OLD.pay_note_mng_seq,
				OLD.co_cd,
				OLD.slip_sts_typ,
				OLD.note_no,
				OLD.note_typ,
				OLD.note_rsn_cd,
				OLD.draw_dt,
				OLD.due_dt,
				OLD.note_days,
				OLD.drawer_nm,
				OLD.draw_bank_cd,
				OLD.draw_branch_cd,
				OLD.endrsr,
				OLD.accptr,
				OLD.note_amt,
				OLD.cur_cd,
				OLD.pay_act_no,
				OLD.pay_act_seq,
				OLD.adv_pay_act_no,
				OLD.adv_pay_act_seq,
				OLD.a_imp_flg,
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

CREATE TRIGGER mst_pay_note_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_pay_note_all
FOR EACH ROW
EXECUTE FUNCTION mst_pay_note_all_tr_r_body();
ALTER TABLE mst_pay_note_all DISABLE TRIGGER mst_pay_note_all_tr_r;

