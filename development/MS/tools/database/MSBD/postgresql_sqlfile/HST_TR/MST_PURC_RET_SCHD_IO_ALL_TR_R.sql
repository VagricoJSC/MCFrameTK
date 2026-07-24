\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_purc_ret_schd_io_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_purc_ret_schd_io_all_r';
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
		INSERT INTO mst_purc_ret_schd_io_all_r (
			hst_id,
			hst_type,
			purc_ret_schd_io_no,
			co_cd,
			purc_ret_schd_d_no,
			purc_ret_loc_wg_cd,
			purc_ret_loc_cd,
			str_ln_cd,
			ver_no,
			lot_no,
			sublot_no,
			bp_lot_no,
			stk_id_typ,
			stk_insp_typ,
			quality_typ,
			gd_cd,
			stk_arrv_bp_cd,
			in_xfr_typ,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			purc_cont_qty,
			ref_arr_act_no,
			ref_arr_act_rev,
			ref_purc_act_io_no,
			ref_purc_act_io_seq,
			io_schd_pr_no,
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
				NEW.purc_ret_schd_io_no,
				NEW.co_cd,
				NEW.purc_ret_schd_d_no,
				NEW.purc_ret_loc_wg_cd,
				NEW.purc_ret_loc_cd,
				NEW.str_ln_cd,
				NEW.ver_no,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.bp_lot_no,
				NEW.stk_id_typ,
				NEW.stk_insp_typ,
				NEW.quality_typ,
				NEW.gd_cd,
				NEW.stk_arrv_bp_cd,
				NEW.in_xfr_typ,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.purc_cont_qty,
				NEW.ref_arr_act_no,
				NEW.ref_arr_act_rev,
				NEW.ref_purc_act_io_no,
				NEW.ref_purc_act_io_seq,
				NEW.io_schd_pr_no,
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
		IF OLD.purc_ret_schd_io_no <> NEW.purc_ret_schd_io_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_purc_ret_schd_io_all_r (
				hst_id,
				hst_type,
				purc_ret_schd_io_no,
				co_cd,
				purc_ret_schd_d_no,
				purc_ret_loc_wg_cd,
				purc_ret_loc_cd,
				str_ln_cd,
				ver_no,
				lot_no,
				sublot_no,
				bp_lot_no,
				stk_id_typ,
				stk_insp_typ,
				quality_typ,
				gd_cd,
				stk_arrv_bp_cd,
				in_xfr_typ,
				trd_unit_cd,
				trd_unit_qty,
				base_unit_cd,
				base_unit_qty,
				purc_cont_qty,
				ref_arr_act_no,
				ref_arr_act_rev,
				ref_purc_act_io_no,
				ref_purc_act_io_seq,
				io_schd_pr_no,
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
					OLD.purc_ret_schd_io_no,
					OLD.co_cd,
					OLD.purc_ret_schd_d_no,
					OLD.purc_ret_loc_wg_cd,
					OLD.purc_ret_loc_cd,
					OLD.str_ln_cd,
					OLD.ver_no,
					OLD.lot_no,
					OLD.sublot_no,
					OLD.bp_lot_no,
					OLD.stk_id_typ,
					OLD.stk_insp_typ,
					OLD.quality_typ,
					OLD.gd_cd,
					OLD.stk_arrv_bp_cd,
					OLD.in_xfr_typ,
					OLD.trd_unit_cd,
					OLD.trd_unit_qty,
					OLD.base_unit_cd,
					OLD.base_unit_qty,
					OLD.purc_cont_qty,
					OLD.ref_arr_act_no,
					OLD.ref_arr_act_rev,
					OLD.ref_purc_act_io_no,
					OLD.ref_purc_act_io_seq,
					OLD.io_schd_pr_no,
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
		INSERT INTO mst_purc_ret_schd_io_all_r (
			hst_id,
			hst_type,
			purc_ret_schd_io_no,
			co_cd,
			purc_ret_schd_d_no,
			purc_ret_loc_wg_cd,
			purc_ret_loc_cd,
			str_ln_cd,
			ver_no,
			lot_no,
			sublot_no,
			bp_lot_no,
			stk_id_typ,
			stk_insp_typ,
			quality_typ,
			gd_cd,
			stk_arrv_bp_cd,
			in_xfr_typ,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			purc_cont_qty,
			ref_arr_act_no,
			ref_arr_act_rev,
			ref_purc_act_io_no,
			ref_purc_act_io_seq,
			io_schd_pr_no,
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
				NEW.purc_ret_schd_io_no,
				NEW.co_cd,
				NEW.purc_ret_schd_d_no,
				NEW.purc_ret_loc_wg_cd,
				NEW.purc_ret_loc_cd,
				NEW.str_ln_cd,
				NEW.ver_no,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.bp_lot_no,
				NEW.stk_id_typ,
				NEW.stk_insp_typ,
				NEW.quality_typ,
				NEW.gd_cd,
				NEW.stk_arrv_bp_cd,
				NEW.in_xfr_typ,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.purc_cont_qty,
				NEW.ref_arr_act_no,
				NEW.ref_arr_act_rev,
				NEW.ref_purc_act_io_no,
				NEW.ref_purc_act_io_seq,
				NEW.io_schd_pr_no,
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
		INSERT INTO mst_purc_ret_schd_io_all_r (
			hst_id,
			hst_type,
			purc_ret_schd_io_no,
			co_cd,
			purc_ret_schd_d_no,
			purc_ret_loc_wg_cd,
			purc_ret_loc_cd,
			str_ln_cd,
			ver_no,
			lot_no,
			sublot_no,
			bp_lot_no,
			stk_id_typ,
			stk_insp_typ,
			quality_typ,
			gd_cd,
			stk_arrv_bp_cd,
			in_xfr_typ,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			purc_cont_qty,
			ref_arr_act_no,
			ref_arr_act_rev,
			ref_purc_act_io_no,
			ref_purc_act_io_seq,
			io_schd_pr_no,
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
				OLD.purc_ret_schd_io_no,
				OLD.co_cd,
				OLD.purc_ret_schd_d_no,
				OLD.purc_ret_loc_wg_cd,
				OLD.purc_ret_loc_cd,
				OLD.str_ln_cd,
				OLD.ver_no,
				OLD.lot_no,
				OLD.sublot_no,
				OLD.bp_lot_no,
				OLD.stk_id_typ,
				OLD.stk_insp_typ,
				OLD.quality_typ,
				OLD.gd_cd,
				OLD.stk_arrv_bp_cd,
				OLD.in_xfr_typ,
				OLD.trd_unit_cd,
				OLD.trd_unit_qty,
				OLD.base_unit_cd,
				OLD.base_unit_qty,
				OLD.purc_cont_qty,
				OLD.ref_arr_act_no,
				OLD.ref_arr_act_rev,
				OLD.ref_purc_act_io_no,
				OLD.ref_purc_act_io_seq,
				OLD.io_schd_pr_no,
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

CREATE TRIGGER mst_purc_ret_schd_io_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_purc_ret_schd_io_all
FOR EACH ROW
EXECUTE FUNCTION mst_purc_ret_schd_io_all_tr_r_body();
ALTER TABLE mst_purc_ret_schd_io_all DISABLE TRIGGER mst_purc_ret_schd_io_all_tr_r;

