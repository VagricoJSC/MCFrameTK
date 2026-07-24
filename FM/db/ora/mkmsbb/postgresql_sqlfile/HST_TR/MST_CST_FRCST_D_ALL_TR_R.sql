\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_cst_frcst_d_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_cst_frcst_d_all_r';
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
		INSERT INTO mst_cst_frcst_d_all_r (
			hst_id,
			hst_type,
			cst_frcst_d_no,
			co_cd,
			cst_frcst_no,
			fix_flg,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			frcst_period_typ,
			frcst_st_dt,
			frcst_end_dt,
			frcst_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			gi_loc_cd,
			cst_itm_cd,
			cst_itm_nm,
			cst_frcst_slip_d_no,
			prms_qty,
			frcst_stop_flg,
			disp_seq,
			dmnd_cnt_rmrks,
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
				NEW.cst_frcst_d_no,
				NEW.co_cd,
				NEW.cst_frcst_no,
				NEW.fix_flg,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.frcst_period_typ,
				NEW.frcst_st_dt,
				NEW.frcst_end_dt,
				NEW.frcst_dt,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.gi_loc_cd,
				NEW.cst_itm_cd,
				NEW.cst_itm_nm,
				NEW.cst_frcst_slip_d_no,
				NEW.prms_qty,
				NEW.frcst_stop_flg,
				NEW.disp_seq,
				NEW.dmnd_cnt_rmrks,
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
		IF OLD.cst_frcst_d_no <> NEW.cst_frcst_d_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_cst_frcst_d_all_r (
				hst_id,
				hst_type,
				cst_frcst_d_no,
				co_cd,
				cst_frcst_no,
				fix_flg,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				frcst_period_typ,
				frcst_st_dt,
				frcst_end_dt,
				frcst_dt,
				trd_unit_cd,
				trd_unit_qty,
				base_unit_cd,
				base_unit_qty,
				gi_loc_cd,
				cst_itm_cd,
				cst_itm_nm,
				cst_frcst_slip_d_no,
				prms_qty,
				frcst_stop_flg,
				disp_seq,
				dmnd_cnt_rmrks,
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
					OLD.cst_frcst_d_no,
					OLD.co_cd,
					OLD.cst_frcst_no,
					OLD.fix_flg,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.frcst_period_typ,
					OLD.frcst_st_dt,
					OLD.frcst_end_dt,
					OLD.frcst_dt,
					OLD.trd_unit_cd,
					OLD.trd_unit_qty,
					OLD.base_unit_cd,
					OLD.base_unit_qty,
					OLD.gi_loc_cd,
					OLD.cst_itm_cd,
					OLD.cst_itm_nm,
					OLD.cst_frcst_slip_d_no,
					OLD.prms_qty,
					OLD.frcst_stop_flg,
					OLD.disp_seq,
					OLD.dmnd_cnt_rmrks,
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
		INSERT INTO mst_cst_frcst_d_all_r (
			hst_id,
			hst_type,
			cst_frcst_d_no,
			co_cd,
			cst_frcst_no,
			fix_flg,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			frcst_period_typ,
			frcst_st_dt,
			frcst_end_dt,
			frcst_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			gi_loc_cd,
			cst_itm_cd,
			cst_itm_nm,
			cst_frcst_slip_d_no,
			prms_qty,
			frcst_stop_flg,
			disp_seq,
			dmnd_cnt_rmrks,
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
				NEW.cst_frcst_d_no,
				NEW.co_cd,
				NEW.cst_frcst_no,
				NEW.fix_flg,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.frcst_period_typ,
				NEW.frcst_st_dt,
				NEW.frcst_end_dt,
				NEW.frcst_dt,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.gi_loc_cd,
				NEW.cst_itm_cd,
				NEW.cst_itm_nm,
				NEW.cst_frcst_slip_d_no,
				NEW.prms_qty,
				NEW.frcst_stop_flg,
				NEW.disp_seq,
				NEW.dmnd_cnt_rmrks,
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
		INSERT INTO mst_cst_frcst_d_all_r (
			hst_id,
			hst_type,
			cst_frcst_d_no,
			co_cd,
			cst_frcst_no,
			fix_flg,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			frcst_period_typ,
			frcst_st_dt,
			frcst_end_dt,
			frcst_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			gi_loc_cd,
			cst_itm_cd,
			cst_itm_nm,
			cst_frcst_slip_d_no,
			prms_qty,
			frcst_stop_flg,
			disp_seq,
			dmnd_cnt_rmrks,
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
				OLD.cst_frcst_d_no,
				OLD.co_cd,
				OLD.cst_frcst_no,
				OLD.fix_flg,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.frcst_period_typ,
				OLD.frcst_st_dt,
				OLD.frcst_end_dt,
				OLD.frcst_dt,
				OLD.trd_unit_cd,
				OLD.trd_unit_qty,
				OLD.base_unit_cd,
				OLD.base_unit_qty,
				OLD.gi_loc_cd,
				OLD.cst_itm_cd,
				OLD.cst_itm_nm,
				OLD.cst_frcst_slip_d_no,
				OLD.prms_qty,
				OLD.frcst_stop_flg,
				OLD.disp_seq,
				OLD.dmnd_cnt_rmrks,
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

CREATE TRIGGER mst_cst_frcst_d_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_cst_frcst_d_all
FOR EACH ROW
EXECUTE FUNCTION mst_cst_frcst_d_all_tr_r_body();
ALTER TABLE mst_cst_frcst_d_all DISABLE TRIGGER mst_cst_frcst_d_all_tr_r;

