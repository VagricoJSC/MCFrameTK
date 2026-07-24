\encoding UTF-8

CREATE OR REPLACE FUNCTION fcm_mining_method_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='fcm_mining_method_r';
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
		INSERT INTO fcm_mining_method_r (
			hst_id,
			hst_type,
			mining_id,
			col_id,
			col_nm,
			list_order,
			sum_info_typ,
			sumcond,
			rank_flg,
			rank_typ,
			rank_size,
			date_fmt,
			fill_dt_flg,
			fill_dt_fm,
			fill_dt_to,
			formula,
			dec_place,
			round_mode_typ,
			null_zero,
			sort_order,
			sort_typ,
			graph_typ,
			graph_label_flg,
			graph_color,
			inv_flg,
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
				NEW.mining_id,
				NEW.col_id,
				NEW.col_nm,
				NEW.list_order,
				NEW.sum_info_typ,
				NEW.sumcond,
				NEW.rank_flg,
				NEW.rank_typ,
				NEW.rank_size,
				NEW.date_fmt,
				NEW.fill_dt_flg,
				NEW.fill_dt_fm,
				NEW.fill_dt_to,
				NEW.formula,
				NEW.dec_place,
				NEW.round_mode_typ,
				NEW.null_zero,
				NEW.sort_order,
				NEW.sort_typ,
				NEW.graph_typ,
				NEW.graph_label_flg,
				NEW.graph_color,
				NEW.inv_flg,
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
		INSERT INTO fcm_mining_method_r (
			hst_id,
			hst_type,
			mining_id,
			col_id,
			col_nm,
			list_order,
			sum_info_typ,
			sumcond,
			rank_flg,
			rank_typ,
			rank_size,
			date_fmt,
			fill_dt_flg,
			fill_dt_fm,
			fill_dt_to,
			formula,
			dec_place,
			round_mode_typ,
			null_zero,
			sort_order,
			sort_typ,
			graph_typ,
			graph_label_flg,
			graph_color,
			inv_flg,
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
				OLD.mining_id,
				OLD.col_id,
				OLD.col_nm,
				OLD.list_order,
				OLD.sum_info_typ,
				OLD.sumcond,
				OLD.rank_flg,
				OLD.rank_typ,
				OLD.rank_size,
				OLD.date_fmt,
				OLD.fill_dt_flg,
				OLD.fill_dt_fm,
				OLD.fill_dt_to,
				OLD.formula,
				OLD.dec_place,
				OLD.round_mode_typ,
				OLD.null_zero,
				OLD.sort_order,
				OLD.sort_typ,
				OLD.graph_typ,
				OLD.graph_label_flg,
				OLD.graph_color,
				OLD.inv_flg,
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
		);		h_typ := 'I';
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
		INSERT INTO fcm_mining_method_r (
			hst_id,
			hst_type,
			mining_id,
			col_id,
			col_nm,
			list_order,
			sum_info_typ,
			sumcond,
			rank_flg,
			rank_typ,
			rank_size,
			date_fmt,
			fill_dt_flg,
			fill_dt_fm,
			fill_dt_to,
			formula,
			dec_place,
			round_mode_typ,
			null_zero,
			sort_order,
			sort_typ,
			graph_typ,
			graph_label_flg,
			graph_color,
			inv_flg,
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
				NEW.mining_id,
				NEW.col_id,
				NEW.col_nm,
				NEW.list_order,
				NEW.sum_info_typ,
				NEW.sumcond,
				NEW.rank_flg,
				NEW.rank_typ,
				NEW.rank_size,
				NEW.date_fmt,
				NEW.fill_dt_flg,
				NEW.fill_dt_fm,
				NEW.fill_dt_to,
				NEW.formula,
				NEW.dec_place,
				NEW.round_mode_typ,
				NEW.null_zero,
				NEW.sort_order,
				NEW.sort_typ,
				NEW.graph_typ,
				NEW.graph_label_flg,
				NEW.graph_color,
				NEW.inv_flg,
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
		INSERT INTO fcm_mining_method_r (
			hst_id,
			hst_type,
			mining_id,
			col_id,
			col_nm,
			list_order,
			sum_info_typ,
			sumcond,
			rank_flg,
			rank_typ,
			rank_size,
			date_fmt,
			fill_dt_flg,
			fill_dt_fm,
			fill_dt_to,
			formula,
			dec_place,
			round_mode_typ,
			null_zero,
			sort_order,
			sort_typ,
			graph_typ,
			graph_label_flg,
			graph_color,
			inv_flg,
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
				OLD.mining_id,
				OLD.col_id,
				OLD.col_nm,
				OLD.list_order,
				OLD.sum_info_typ,
				OLD.sumcond,
				OLD.rank_flg,
				OLD.rank_typ,
				OLD.rank_size,
				OLD.date_fmt,
				OLD.fill_dt_flg,
				OLD.fill_dt_fm,
				OLD.fill_dt_to,
				OLD.formula,
				OLD.dec_place,
				OLD.round_mode_typ,
				OLD.null_zero,
				OLD.sort_order,
				OLD.sort_typ,
				OLD.graph_typ,
				OLD.graph_label_flg,
				OLD.graph_color,
				OLD.inv_flg,
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

CREATE TRIGGER fcm_mining_method_tr_r
AFTER INSERT OR DELETE OR UPDATE ON fcm_mining_method
FOR EACH ROW
EXECUTE FUNCTION fcm_mining_method_tr_r_body();
ALTER TABLE fcm_mining_method DISABLE TRIGGER fcm_mining_method_tr_r;

