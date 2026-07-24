\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_cost_io_conf_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_cost_io_conf_all_r';
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
		INSERT INTO mam_cost_io_conf_all_r (
			hst_id,
			hst_type,
			cost_io_id,
			io_col_cd,
			io_col_nm,
			io_seq,
			io_tgt_typ,
			io_sml_typ,
			unit_flg,
			qty_flg,
			amt_flg,
			std_flg,
			diff_flg,
			bal_calc_typ,
			minus_flg,
			fg_r,
			fg_g,
			fg_b,
			bg_r,
			bg_g,
			bg_b,
			prov_expns_flg,
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
				NEW.cost_io_id,
				NEW.io_col_cd,
				NEW.io_col_nm,
				NEW.io_seq,
				NEW.io_tgt_typ,
				NEW.io_sml_typ,
				NEW.unit_flg,
				NEW.qty_flg,
				NEW.amt_flg,
				NEW.std_flg,
				NEW.diff_flg,
				NEW.bal_calc_typ,
				NEW.minus_flg,
				NEW.fg_r,
				NEW.fg_g,
				NEW.fg_b,
				NEW.bg_r,
				NEW.bg_g,
				NEW.bg_b,
				NEW.prov_expns_flg,
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
		IF OLD.cost_io_id <> NEW.cost_io_id OR OLD.io_col_cd <> NEW.io_col_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_cost_io_conf_all_r (
				hst_id,
				hst_type,
				cost_io_id,
				io_col_cd,
				io_col_nm,
				io_seq,
				io_tgt_typ,
				io_sml_typ,
				unit_flg,
				qty_flg,
				amt_flg,
				std_flg,
				diff_flg,
				bal_calc_typ,
				minus_flg,
				fg_r,
				fg_g,
				fg_b,
				bg_r,
				bg_g,
				bg_b,
				prov_expns_flg,
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
					OLD.cost_io_id,
					OLD.io_col_cd,
					OLD.io_col_nm,
					OLD.io_seq,
					OLD.io_tgt_typ,
					OLD.io_sml_typ,
					OLD.unit_flg,
					OLD.qty_flg,
					OLD.amt_flg,
					OLD.std_flg,
					OLD.diff_flg,
					OLD.bal_calc_typ,
					OLD.minus_flg,
					OLD.fg_r,
					OLD.fg_g,
					OLD.fg_b,
					OLD.bg_r,
					OLD.bg_g,
					OLD.bg_b,
					OLD.prov_expns_flg,
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
		INSERT INTO mam_cost_io_conf_all_r (
			hst_id,
			hst_type,
			cost_io_id,
			io_col_cd,
			io_col_nm,
			io_seq,
			io_tgt_typ,
			io_sml_typ,
			unit_flg,
			qty_flg,
			amt_flg,
			std_flg,
			diff_flg,
			bal_calc_typ,
			minus_flg,
			fg_r,
			fg_g,
			fg_b,
			bg_r,
			bg_g,
			bg_b,
			prov_expns_flg,
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
				NEW.cost_io_id,
				NEW.io_col_cd,
				NEW.io_col_nm,
				NEW.io_seq,
				NEW.io_tgt_typ,
				NEW.io_sml_typ,
				NEW.unit_flg,
				NEW.qty_flg,
				NEW.amt_flg,
				NEW.std_flg,
				NEW.diff_flg,
				NEW.bal_calc_typ,
				NEW.minus_flg,
				NEW.fg_r,
				NEW.fg_g,
				NEW.fg_b,
				NEW.bg_r,
				NEW.bg_g,
				NEW.bg_b,
				NEW.prov_expns_flg,
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
		INSERT INTO mam_cost_io_conf_all_r (
			hst_id,
			hst_type,
			cost_io_id,
			io_col_cd,
			io_col_nm,
			io_seq,
			io_tgt_typ,
			io_sml_typ,
			unit_flg,
			qty_flg,
			amt_flg,
			std_flg,
			diff_flg,
			bal_calc_typ,
			minus_flg,
			fg_r,
			fg_g,
			fg_b,
			bg_r,
			bg_g,
			bg_b,
			prov_expns_flg,
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
				OLD.cost_io_id,
				OLD.io_col_cd,
				OLD.io_col_nm,
				OLD.io_seq,
				OLD.io_tgt_typ,
				OLD.io_sml_typ,
				OLD.unit_flg,
				OLD.qty_flg,
				OLD.amt_flg,
				OLD.std_flg,
				OLD.diff_flg,
				OLD.bal_calc_typ,
				OLD.minus_flg,
				OLD.fg_r,
				OLD.fg_g,
				OLD.fg_b,
				OLD.bg_r,
				OLD.bg_g,
				OLD.bg_b,
				OLD.prov_expns_flg,
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

CREATE TRIGGER mam_cost_io_conf_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_cost_io_conf_all
FOR EACH ROW
EXECUTE FUNCTION mam_cost_io_conf_all_tr_r_body();
ALTER TABLE mam_cost_io_conf_all DISABLE TRIGGER mam_cost_io_conf_all_tr_r;

