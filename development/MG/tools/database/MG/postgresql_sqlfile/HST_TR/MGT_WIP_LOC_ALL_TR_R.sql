\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_wip_loc_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_wip_loc_all_r';
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
		INSERT INTO mgt_wip_loc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
			loc_cd,
			str_ln_cd,
			oper_cd,
			oper_seq,
			expns_cd,
			co_cd,
			st_wip_amt,
			prod_amt,
			inpt_amt,
			comp_amt,
			end_wip_amt,
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
				NEW.wg_cd,
				NEW.ym,
				NEW.mng_dpt_cd,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.expns_cd,
				NEW.co_cd,
				NEW.st_wip_amt,
				NEW.prod_amt,
				NEW.inpt_amt,
				NEW.comp_amt,
				NEW.end_wip_amt,
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
		IF OLD.calc_no <> NEW.calc_no OR OLD.calc_grp_cd <> NEW.calc_grp_cd OR OLD.wg_cd <> NEW.wg_cd OR OLD.ym <> NEW.ym OR OLD.mng_dpt_cd <> NEW.mng_dpt_cd OR OLD.loc_cd <> NEW.loc_cd OR OLD.str_ln_cd <> NEW.str_ln_cd OR OLD.oper_cd <> NEW.oper_cd OR OLD.oper_seq <> NEW.oper_seq OR OLD.expns_cd <> NEW.expns_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_wip_loc_all_r (
				hst_id,
				hst_type,
				calc_no,
				calc_grp_cd,
				wg_cd,
				ym,
				mng_dpt_cd,
				loc_cd,
				str_ln_cd,
				oper_cd,
				oper_seq,
				expns_cd,
				co_cd,
				st_wip_amt,
				prod_amt,
				inpt_amt,
				comp_amt,
				end_wip_amt,
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
					OLD.wg_cd,
					OLD.ym,
					OLD.mng_dpt_cd,
					OLD.loc_cd,
					OLD.str_ln_cd,
					OLD.oper_cd,
					OLD.oper_seq,
					OLD.expns_cd,
					OLD.co_cd,
					OLD.st_wip_amt,
					OLD.prod_amt,
					OLD.inpt_amt,
					OLD.comp_amt,
					OLD.end_wip_amt,
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
		INSERT INTO mgt_wip_loc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
			loc_cd,
			str_ln_cd,
			oper_cd,
			oper_seq,
			expns_cd,
			co_cd,
			st_wip_amt,
			prod_amt,
			inpt_amt,
			comp_amt,
			end_wip_amt,
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
				NEW.wg_cd,
				NEW.ym,
				NEW.mng_dpt_cd,
				NEW.loc_cd,
				NEW.str_ln_cd,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.expns_cd,
				NEW.co_cd,
				NEW.st_wip_amt,
				NEW.prod_amt,
				NEW.inpt_amt,
				NEW.comp_amt,
				NEW.end_wip_amt,
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
		INSERT INTO mgt_wip_loc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			mng_dpt_cd,
			loc_cd,
			str_ln_cd,
			oper_cd,
			oper_seq,
			expns_cd,
			co_cd,
			st_wip_amt,
			prod_amt,
			inpt_amt,
			comp_amt,
			end_wip_amt,
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
				OLD.wg_cd,
				OLD.ym,
				OLD.mng_dpt_cd,
				OLD.loc_cd,
				OLD.str_ln_cd,
				OLD.oper_cd,
				OLD.oper_seq,
				OLD.expns_cd,
				OLD.co_cd,
				OLD.st_wip_amt,
				OLD.prod_amt,
				OLD.inpt_amt,
				OLD.comp_amt,
				OLD.end_wip_amt,
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

CREATE TRIGGER mgt_wip_loc_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_wip_loc_all
FOR EACH ROW
EXECUTE FUNCTION mgt_wip_loc_all_tr_r_body();
ALTER TABLE mgt_wip_loc_all DISABLE TRIGGER mgt_wip_loc_all_tr_r;

