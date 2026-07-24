\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_oper_act_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_oper_act_all_r';
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
		INSERT INTO mst_oper_act_all_r (
			hst_id,
			hst_type,
			oper_act_no,
			co_cd,
			mfg_act_no,
			itm_mfg_inst_no,
			oper_inst_no,
			div_seq,
			arr_act_no,
			purc_act_io_no,
			disp_seq,
			st_act_tm,
			end_act_tm,
			base_unit_qty,
			base_unit_cd,
			oper_unit_qty,
			oper_unit_cd,
			bkf_ctl_flg,
			wk_cost_calc_ctl_flg,
			oper_yield,
			bkf_not_ref_flg,
			data_no,
			mes_id,
			mes_flg,
			ext_sys_cd,
			ext_oper_act_no,
			if_auto_reg_flg,
			intr_rmrks,
			act_rpt_rmrks,
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
				NEW.oper_act_no,
				NEW.co_cd,
				NEW.mfg_act_no,
				NEW.itm_mfg_inst_no,
				NEW.oper_inst_no,
				NEW.div_seq,
				NEW.arr_act_no,
				NEW.purc_act_io_no,
				NEW.disp_seq,
				NEW.st_act_tm,
				NEW.end_act_tm,
				NEW.base_unit_qty,
				NEW.base_unit_cd,
				NEW.oper_unit_qty,
				NEW.oper_unit_cd,
				NEW.bkf_ctl_flg,
				NEW.wk_cost_calc_ctl_flg,
				NEW.oper_yield,
				NEW.bkf_not_ref_flg,
				NEW.data_no,
				NEW.mes_id,
				NEW.mes_flg,
				NEW.ext_sys_cd,
				NEW.ext_oper_act_no,
				NEW.if_auto_reg_flg,
				NEW.intr_rmrks,
				NEW.act_rpt_rmrks,
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
		IF OLD.oper_act_no <> NEW.oper_act_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_oper_act_all_r (
				hst_id,
				hst_type,
				oper_act_no,
				co_cd,
				mfg_act_no,
				itm_mfg_inst_no,
				oper_inst_no,
				div_seq,
				arr_act_no,
				purc_act_io_no,
				disp_seq,
				st_act_tm,
				end_act_tm,
				base_unit_qty,
				base_unit_cd,
				oper_unit_qty,
				oper_unit_cd,
				bkf_ctl_flg,
				wk_cost_calc_ctl_flg,
				oper_yield,
				bkf_not_ref_flg,
				data_no,
				mes_id,
				mes_flg,
				ext_sys_cd,
				ext_oper_act_no,
				if_auto_reg_flg,
				intr_rmrks,
				act_rpt_rmrks,
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
					OLD.oper_act_no,
					OLD.co_cd,
					OLD.mfg_act_no,
					OLD.itm_mfg_inst_no,
					OLD.oper_inst_no,
					OLD.div_seq,
					OLD.arr_act_no,
					OLD.purc_act_io_no,
					OLD.disp_seq,
					OLD.st_act_tm,
					OLD.end_act_tm,
					OLD.base_unit_qty,
					OLD.base_unit_cd,
					OLD.oper_unit_qty,
					OLD.oper_unit_cd,
					OLD.bkf_ctl_flg,
					OLD.wk_cost_calc_ctl_flg,
					OLD.oper_yield,
					OLD.bkf_not_ref_flg,
					OLD.data_no,
					OLD.mes_id,
					OLD.mes_flg,
					OLD.ext_sys_cd,
					OLD.ext_oper_act_no,
					OLD.if_auto_reg_flg,
					OLD.intr_rmrks,
					OLD.act_rpt_rmrks,
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
		INSERT INTO mst_oper_act_all_r (
			hst_id,
			hst_type,
			oper_act_no,
			co_cd,
			mfg_act_no,
			itm_mfg_inst_no,
			oper_inst_no,
			div_seq,
			arr_act_no,
			purc_act_io_no,
			disp_seq,
			st_act_tm,
			end_act_tm,
			base_unit_qty,
			base_unit_cd,
			oper_unit_qty,
			oper_unit_cd,
			bkf_ctl_flg,
			wk_cost_calc_ctl_flg,
			oper_yield,
			bkf_not_ref_flg,
			data_no,
			mes_id,
			mes_flg,
			ext_sys_cd,
			ext_oper_act_no,
			if_auto_reg_flg,
			intr_rmrks,
			act_rpt_rmrks,
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
				NEW.oper_act_no,
				NEW.co_cd,
				NEW.mfg_act_no,
				NEW.itm_mfg_inst_no,
				NEW.oper_inst_no,
				NEW.div_seq,
				NEW.arr_act_no,
				NEW.purc_act_io_no,
				NEW.disp_seq,
				NEW.st_act_tm,
				NEW.end_act_tm,
				NEW.base_unit_qty,
				NEW.base_unit_cd,
				NEW.oper_unit_qty,
				NEW.oper_unit_cd,
				NEW.bkf_ctl_flg,
				NEW.wk_cost_calc_ctl_flg,
				NEW.oper_yield,
				NEW.bkf_not_ref_flg,
				NEW.data_no,
				NEW.mes_id,
				NEW.mes_flg,
				NEW.ext_sys_cd,
				NEW.ext_oper_act_no,
				NEW.if_auto_reg_flg,
				NEW.intr_rmrks,
				NEW.act_rpt_rmrks,
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
		INSERT INTO mst_oper_act_all_r (
			hst_id,
			hst_type,
			oper_act_no,
			co_cd,
			mfg_act_no,
			itm_mfg_inst_no,
			oper_inst_no,
			div_seq,
			arr_act_no,
			purc_act_io_no,
			disp_seq,
			st_act_tm,
			end_act_tm,
			base_unit_qty,
			base_unit_cd,
			oper_unit_qty,
			oper_unit_cd,
			bkf_ctl_flg,
			wk_cost_calc_ctl_flg,
			oper_yield,
			bkf_not_ref_flg,
			data_no,
			mes_id,
			mes_flg,
			ext_sys_cd,
			ext_oper_act_no,
			if_auto_reg_flg,
			intr_rmrks,
			act_rpt_rmrks,
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
				OLD.oper_act_no,
				OLD.co_cd,
				OLD.mfg_act_no,
				OLD.itm_mfg_inst_no,
				OLD.oper_inst_no,
				OLD.div_seq,
				OLD.arr_act_no,
				OLD.purc_act_io_no,
				OLD.disp_seq,
				OLD.st_act_tm,
				OLD.end_act_tm,
				OLD.base_unit_qty,
				OLD.base_unit_cd,
				OLD.oper_unit_qty,
				OLD.oper_unit_cd,
				OLD.bkf_ctl_flg,
				OLD.wk_cost_calc_ctl_flg,
				OLD.oper_yield,
				OLD.bkf_not_ref_flg,
				OLD.data_no,
				OLD.mes_id,
				OLD.mes_flg,
				OLD.ext_sys_cd,
				OLD.ext_oper_act_no,
				OLD.if_auto_reg_flg,
				OLD.intr_rmrks,
				OLD.act_rpt_rmrks,
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

CREATE TRIGGER mst_oper_act_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_oper_act_all
FOR EACH ROW
EXECUTE FUNCTION mst_oper_act_all_tr_r_body();
ALTER TABLE mst_oper_act_all DISABLE TRIGGER mst_oper_act_all_tr_r;

