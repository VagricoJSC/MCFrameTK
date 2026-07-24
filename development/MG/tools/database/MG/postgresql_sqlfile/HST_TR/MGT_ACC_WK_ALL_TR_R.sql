\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_acc_wk_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_acc_wk_all_r';
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
		INSERT INTO mgt_acc_wk_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wk_rec_no,
			co_cd,
			inpt_rec_no,
			loc_cd,
			str_ln_cd,
			oper_act_no,
			oper_cd,
			oper_seq,
			wk_cost_cd,
			wk_rsn_cd,
			act_wk_cost,
			std_wk_cost,
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
				NEW.calc_no,
				NEW.calc_grp_cd,
				NEW.wk_rec_no,
				NEW.co_cd,
				NEW.inpt_rec_no,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.oper_act_no,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.wk_cost_cd,
				NEW.wk_rsn_cd,
				NEW.act_wk_cost,
				NEW.std_wk_cost,
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
		IF OLD.calc_no <> NEW.calc_no OR OLD.calc_grp_cd <> NEW.calc_grp_cd OR OLD.wk_rec_no <> NEW.wk_rec_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_acc_wk_all_r (
				hst_id,
				hst_type,
				calc_no,
				calc_grp_cd,
				wk_rec_no,
				co_cd,
				inpt_rec_no,
				loc_cd,
				str_ln_cd,
				oper_act_no,
				oper_cd,
				oper_seq,
				wk_cost_cd,
				wk_rsn_cd,
				act_wk_cost,
				std_wk_cost,
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
					OLD.calc_no,
					OLD.calc_grp_cd,
					OLD.wk_rec_no,
					OLD.co_cd,
					OLD.inpt_rec_no,
					OLD.loc_cd,
					OLD.str_ln_cd,
					OLD.oper_act_no,
					OLD.oper_cd,
					OLD.oper_seq,
					OLD.wk_cost_cd,
					OLD.wk_rsn_cd,
					OLD.act_wk_cost,
					OLD.std_wk_cost,
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
		INSERT INTO mgt_acc_wk_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wk_rec_no,
			co_cd,
			inpt_rec_no,
			loc_cd,
			str_ln_cd,
			oper_act_no,
			oper_cd,
			oper_seq,
			wk_cost_cd,
			wk_rsn_cd,
			act_wk_cost,
			std_wk_cost,
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
				NEW.calc_no,
				NEW.calc_grp_cd,
				NEW.wk_rec_no,
				NEW.co_cd,
				NEW.inpt_rec_no,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.oper_act_no,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.wk_cost_cd,
				NEW.wk_rsn_cd,
				NEW.act_wk_cost,
				NEW.std_wk_cost,
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
		INSERT INTO mgt_acc_wk_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wk_rec_no,
			co_cd,
			inpt_rec_no,
			loc_cd,
			str_ln_cd,
			oper_act_no,
			oper_cd,
			oper_seq,
			wk_cost_cd,
			wk_rsn_cd,
			act_wk_cost,
			std_wk_cost,
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
				OLD.calc_no,
				OLD.calc_grp_cd,
				OLD.wk_rec_no,
				OLD.co_cd,
				OLD.inpt_rec_no,
				OLD.loc_cd,
				OLD.str_ln_cd,
				OLD.oper_act_no,
				OLD.oper_cd,
				OLD.oper_seq,
				OLD.wk_cost_cd,
				OLD.wk_rsn_cd,
				OLD.act_wk_cost,
				OLD.std_wk_cost,
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

CREATE TRIGGER mgt_acc_wk_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_acc_wk_all
FOR EACH ROW
EXECUTE FUNCTION mgt_acc_wk_all_tr_r_body();
ALTER TABLE mgt_acc_wk_all DISABLE TRIGGER mgt_acc_wk_all_tr_r;

