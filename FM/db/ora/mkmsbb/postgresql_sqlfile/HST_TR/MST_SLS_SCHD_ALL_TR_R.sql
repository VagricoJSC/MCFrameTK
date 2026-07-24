\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_sls_schd_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_sls_schd_all_r';
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
		INSERT INTO mst_sls_schd_all_r (
			hst_id,
			hst_type,
			sls_schd_no,
			co_cd,
			sls_schd_src_typ,
			slo_d_no,
			dlv_inst_rcpt_no,
			ship_schd_no,
			ship_inst_d_no,
			dlv_slip_d_no,
			iv_no,
			iv_d_no,
			wg_rqst_no,
			po_schd_no,
			purc_schd_no,
			purc_act_d_no,
			sls_schd_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			lot_no,
			sublot_no,
			cmpl_flg,
			not_auto_sls_flg,
			abort_flg,
			sls_ac_abl_flg,
			base_unit_abort_qty,
			base_unit_sls_qty,
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
				NEW.sls_schd_no,
				NEW.co_cd,
				NEW.sls_schd_src_typ,
				NEW.slo_d_no,
				NEW.dlv_inst_rcpt_no,
				NEW.ship_schd_no,
				NEW.ship_inst_d_no,
				NEW.dlv_slip_d_no,
				NEW.iv_no,
				NEW.iv_d_no,
				NEW.wg_rqst_no,
				NEW.po_schd_no,
				NEW.purc_schd_no,
				NEW.purc_act_d_no,
				NEW.sls_schd_dt,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.cmpl_flg,
				NEW.not_auto_sls_flg,
				NEW.abort_flg,
				NEW.sls_ac_abl_flg,
				NEW.base_unit_abort_qty,
				NEW.base_unit_sls_qty,
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
		IF OLD.sls_schd_no <> NEW.sls_schd_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_sls_schd_all_r (
				hst_id,
				hst_type,
				sls_schd_no,
				co_cd,
				sls_schd_src_typ,
				slo_d_no,
				dlv_inst_rcpt_no,
				ship_schd_no,
				ship_inst_d_no,
				dlv_slip_d_no,
				iv_no,
				iv_d_no,
				wg_rqst_no,
				po_schd_no,
				purc_schd_no,
				purc_act_d_no,
				sls_schd_dt,
				trd_unit_cd,
				trd_unit_qty,
				base_unit_cd,
				base_unit_qty,
				lot_no,
				sublot_no,
				cmpl_flg,
				not_auto_sls_flg,
				abort_flg,
				sls_ac_abl_flg,
				base_unit_abort_qty,
				base_unit_sls_qty,
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
					OLD.sls_schd_no,
					OLD.co_cd,
					OLD.sls_schd_src_typ,
					OLD.slo_d_no,
					OLD.dlv_inst_rcpt_no,
					OLD.ship_schd_no,
					OLD.ship_inst_d_no,
					OLD.dlv_slip_d_no,
					OLD.iv_no,
					OLD.iv_d_no,
					OLD.wg_rqst_no,
					OLD.po_schd_no,
					OLD.purc_schd_no,
					OLD.purc_act_d_no,
					OLD.sls_schd_dt,
					OLD.trd_unit_cd,
					OLD.trd_unit_qty,
					OLD.base_unit_cd,
					OLD.base_unit_qty,
					OLD.lot_no,
					OLD.sublot_no,
					OLD.cmpl_flg,
					OLD.not_auto_sls_flg,
					OLD.abort_flg,
					OLD.sls_ac_abl_flg,
					OLD.base_unit_abort_qty,
					OLD.base_unit_sls_qty,
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
		INSERT INTO mst_sls_schd_all_r (
			hst_id,
			hst_type,
			sls_schd_no,
			co_cd,
			sls_schd_src_typ,
			slo_d_no,
			dlv_inst_rcpt_no,
			ship_schd_no,
			ship_inst_d_no,
			dlv_slip_d_no,
			iv_no,
			iv_d_no,
			wg_rqst_no,
			po_schd_no,
			purc_schd_no,
			purc_act_d_no,
			sls_schd_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			lot_no,
			sublot_no,
			cmpl_flg,
			not_auto_sls_flg,
			abort_flg,
			sls_ac_abl_flg,
			base_unit_abort_qty,
			base_unit_sls_qty,
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
				NEW.sls_schd_no,
				NEW.co_cd,
				NEW.sls_schd_src_typ,
				NEW.slo_d_no,
				NEW.dlv_inst_rcpt_no,
				NEW.ship_schd_no,
				NEW.ship_inst_d_no,
				NEW.dlv_slip_d_no,
				NEW.iv_no,
				NEW.iv_d_no,
				NEW.wg_rqst_no,
				NEW.po_schd_no,
				NEW.purc_schd_no,
				NEW.purc_act_d_no,
				NEW.sls_schd_dt,
				NEW.trd_unit_cd,
				NEW.trd_unit_qty,
				NEW.base_unit_cd,
				NEW.base_unit_qty,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.cmpl_flg,
				NEW.not_auto_sls_flg,
				NEW.abort_flg,
				NEW.sls_ac_abl_flg,
				NEW.base_unit_abort_qty,
				NEW.base_unit_sls_qty,
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
		INSERT INTO mst_sls_schd_all_r (
			hst_id,
			hst_type,
			sls_schd_no,
			co_cd,
			sls_schd_src_typ,
			slo_d_no,
			dlv_inst_rcpt_no,
			ship_schd_no,
			ship_inst_d_no,
			dlv_slip_d_no,
			iv_no,
			iv_d_no,
			wg_rqst_no,
			po_schd_no,
			purc_schd_no,
			purc_act_d_no,
			sls_schd_dt,
			trd_unit_cd,
			trd_unit_qty,
			base_unit_cd,
			base_unit_qty,
			lot_no,
			sublot_no,
			cmpl_flg,
			not_auto_sls_flg,
			abort_flg,
			sls_ac_abl_flg,
			base_unit_abort_qty,
			base_unit_sls_qty,
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
				OLD.sls_schd_no,
				OLD.co_cd,
				OLD.sls_schd_src_typ,
				OLD.slo_d_no,
				OLD.dlv_inst_rcpt_no,
				OLD.ship_schd_no,
				OLD.ship_inst_d_no,
				OLD.dlv_slip_d_no,
				OLD.iv_no,
				OLD.iv_d_no,
				OLD.wg_rqst_no,
				OLD.po_schd_no,
				OLD.purc_schd_no,
				OLD.purc_act_d_no,
				OLD.sls_schd_dt,
				OLD.trd_unit_cd,
				OLD.trd_unit_qty,
				OLD.base_unit_cd,
				OLD.base_unit_qty,
				OLD.lot_no,
				OLD.sublot_no,
				OLD.cmpl_flg,
				OLD.not_auto_sls_flg,
				OLD.abort_flg,
				OLD.sls_ac_abl_flg,
				OLD.base_unit_abort_qty,
				OLD.base_unit_sls_qty,
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

CREATE TRIGGER mst_sls_schd_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_sls_schd_all
FOR EACH ROW
EXECUTE FUNCTION mst_sls_schd_all_tr_r_body();
ALTER TABLE mst_sls_schd_all DISABLE TRIGGER mst_sls_schd_all_tr_r;

