\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_pre_alc_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_pre_alc_all_r';
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
		INSERT INTO mgt_pre_alc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			alc_ac_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			bp_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			itm_mfg_inst_no,
			iv_no,
			po_no,
			slo_no,
			src_wg_cd,
			co_cd,
			amt,
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
				NEW.alc_ac_cd,
				NEW.dpt_cd,
				NEW.loc_cd,
				NEW.oper_cd,
				NEW.bp_cd,
				NEW.ctg_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.sno1,
				NEW.sno2,
				NEW.sno3,
				NEW.sno4,
				NEW.itm_mfg_inst_no,
				NEW.iv_no,
				NEW.po_no,
				NEW.slo_no,
				NEW.src_wg_cd,
				NEW.co_cd,
				NEW.amt,
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
		IF OLD.calc_no <> NEW.calc_no OR OLD.calc_grp_cd <> NEW.calc_grp_cd OR OLD.wg_cd <> NEW.wg_cd OR OLD.ym <> NEW.ym OR OLD.alc_ac_cd <> NEW.alc_ac_cd OR OLD.dpt_cd <> NEW.dpt_cd OR OLD.loc_cd <> NEW.loc_cd OR OLD.oper_cd <> NEW.oper_cd OR OLD.bp_cd <> NEW.bp_cd OR OLD.ctg_cd <> NEW.ctg_cd OR OLD.itm_cd <> NEW.itm_cd OR OLD.itm_sub1 <> NEW.itm_sub1 OR OLD.itm_sub2 <> NEW.itm_sub2 OR OLD.itm_sub3 <> NEW.itm_sub3 OR OLD.lot_no <> NEW.lot_no OR OLD.sublot_no <> NEW.sublot_no OR OLD.sno1 <> NEW.sno1 OR OLD.sno2 <> NEW.sno2 OR OLD.sno3 <> NEW.sno3 OR OLD.sno4 <> NEW.sno4 OR OLD.itm_mfg_inst_no <> NEW.itm_mfg_inst_no OR OLD.iv_no <> NEW.iv_no OR OLD.po_no <> NEW.po_no OR OLD.slo_no <> NEW.slo_no OR OLD.src_wg_cd <> NEW.src_wg_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_pre_alc_all_r (
				hst_id,
				hst_type,
				calc_no,
				calc_grp_cd,
				wg_cd,
				ym,
				alc_ac_cd,
				dpt_cd,
				loc_cd,
				oper_cd,
				bp_cd,
				ctg_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				itm_mfg_inst_no,
				iv_no,
				po_no,
				slo_no,
				src_wg_cd,
				co_cd,
				amt,
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
					OLD.alc_ac_cd,
					OLD.dpt_cd,
					OLD.loc_cd,
					OLD.oper_cd,
					OLD.bp_cd,
					OLD.ctg_cd,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.lot_no,
					OLD.sublot_no,
					OLD.sno1,
					OLD.sno2,
					OLD.sno3,
					OLD.sno4,
					OLD.itm_mfg_inst_no,
					OLD.iv_no,
					OLD.po_no,
					OLD.slo_no,
					OLD.src_wg_cd,
					OLD.co_cd,
					OLD.amt,
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
		INSERT INTO mgt_pre_alc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			alc_ac_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			bp_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			itm_mfg_inst_no,
			iv_no,
			po_no,
			slo_no,
			src_wg_cd,
			co_cd,
			amt,
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
				NEW.alc_ac_cd,
				NEW.dpt_cd,
				NEW.loc_cd,
				NEW.oper_cd,
				NEW.bp_cd,
				NEW.ctg_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.sno1,
				NEW.sno2,
				NEW.sno3,
				NEW.sno4,
				NEW.itm_mfg_inst_no,
				NEW.iv_no,
				NEW.po_no,
				NEW.slo_no,
				NEW.src_wg_cd,
				NEW.co_cd,
				NEW.amt,
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
		INSERT INTO mgt_pre_alc_all_r (
			hst_id,
			hst_type,
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			alc_ac_cd,
			dpt_cd,
			loc_cd,
			oper_cd,
			bp_cd,
			ctg_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			itm_mfg_inst_no,
			iv_no,
			po_no,
			slo_no,
			src_wg_cd,
			co_cd,
			amt,
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
				OLD.alc_ac_cd,
				OLD.dpt_cd,
				OLD.loc_cd,
				OLD.oper_cd,
				OLD.bp_cd,
				OLD.ctg_cd,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.lot_no,
				OLD.sublot_no,
				OLD.sno1,
				OLD.sno2,
				OLD.sno3,
				OLD.sno4,
				OLD.itm_mfg_inst_no,
				OLD.iv_no,
				OLD.po_no,
				OLD.slo_no,
				OLD.src_wg_cd,
				OLD.co_cd,
				OLD.amt,
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

CREATE TRIGGER mgt_pre_alc_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_pre_alc_all
FOR EACH ROW
EXECUTE FUNCTION mgt_pre_alc_all_tr_r_body();
ALTER TABLE mgt_pre_alc_all DISABLE TRIGGER mgt_pre_alc_all_tr_r;

