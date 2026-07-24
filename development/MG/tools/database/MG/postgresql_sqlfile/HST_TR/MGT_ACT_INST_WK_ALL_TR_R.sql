\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_act_inst_wk_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_act_inst_wk_all_r';
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
		INSERT INTO mgt_act_inst_wk_all_r (
			hst_id,
			hst_type,
			act_inst_wk_id,
			co_cd,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			rmrks,
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
				NEW.act_inst_wk_id,
				NEW.co_cd,
				NEW.calc_ctg_cd,
				NEW.wg_cd,
				NEW.ym,
				NEW.ac_dt,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.itm_mfg_inst_no,
				NEW.mfg_act_no,
				NEW.oper_act_no,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.wk_cost_cd,
				NEW.wk_rsn_cd,
				NEW.wk_cost,
				NEW.rmrks,
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
		IF OLD.act_inst_wk_id <> NEW.act_inst_wk_id OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_act_inst_wk_all_r (
				hst_id,
				hst_type,
				act_inst_wk_id,
				co_cd,
				calc_ctg_cd,
				wg_cd,
				ym,
				ac_dt,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				itm_mfg_inst_no,
				mfg_act_no,
				oper_act_no,
				loc_cd,
				str_ln_cd,
				wk_cost_cd,
				wk_rsn_cd,
				wk_cost,
				rmrks,
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
					OLD.act_inst_wk_id,
					OLD.co_cd,
					OLD.calc_ctg_cd,
					OLD.wg_cd,
					OLD.ym,
					OLD.ac_dt,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.itm_mfg_inst_no,
					OLD.mfg_act_no,
					OLD.oper_act_no,
					OLD.loc_cd,
					OLD.str_ln_cd,
					OLD.wk_cost_cd,
					OLD.wk_rsn_cd,
					OLD.wk_cost,
					OLD.rmrks,
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
		INSERT INTO mgt_act_inst_wk_all_r (
			hst_id,
			hst_type,
			act_inst_wk_id,
			co_cd,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			rmrks,
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
				NEW.act_inst_wk_id,
				NEW.co_cd,
				NEW.calc_ctg_cd,
				NEW.wg_cd,
				NEW.ym,
				NEW.ac_dt,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.itm_mfg_inst_no,
				NEW.mfg_act_no,
				NEW.oper_act_no,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.wk_cost_cd,
				NEW.wk_rsn_cd,
				NEW.wk_cost,
				NEW.rmrks,
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
		INSERT INTO mgt_act_inst_wk_all_r (
			hst_id,
			hst_type,
			act_inst_wk_id,
			co_cd,
			calc_ctg_cd,
			wg_cd,
			ym,
			ac_dt,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			itm_mfg_inst_no,
			mfg_act_no,
			oper_act_no,
			loc_cd,
			str_ln_cd,
			wk_cost_cd,
			wk_rsn_cd,
			wk_cost,
			rmrks,
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
				OLD.act_inst_wk_id,
				OLD.co_cd,
				OLD.calc_ctg_cd,
				OLD.wg_cd,
				OLD.ym,
				OLD.ac_dt,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.itm_mfg_inst_no,
				OLD.mfg_act_no,
				OLD.oper_act_no,
				OLD.loc_cd,
				OLD.str_ln_cd,
				OLD.wk_cost_cd,
				OLD.wk_rsn_cd,
				OLD.wk_cost,
				OLD.rmrks,
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

CREATE TRIGGER mgt_act_inst_wk_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_act_inst_wk_all
FOR EACH ROW
EXECUTE FUNCTION mgt_act_inst_wk_all_tr_r_body();
ALTER TABLE mgt_act_inst_wk_all DISABLE TRIGGER mgt_act_inst_wk_all_tr_r;

