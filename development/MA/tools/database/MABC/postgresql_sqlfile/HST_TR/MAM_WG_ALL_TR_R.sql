\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_wg_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_wg_all_r';
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
		INSERT INTO mam_wg_all_r (
			hst_id,
			hst_type,
			wg_cd,
			wg_nm,
			sls_flg,
			lg_flg,
			mfg_flg,
			purc_flg,
			ar_flg,
			ap_flg,
			sd_flg,
			mrp_prefix,
			mfg_inst_unit_typ,
			mrp_proc_typ,
			alloc_margin_days,
			not_xfr_flg,
			mrp_alloc_margin_days,
			mrp_opn_xfr_days,
			rqmt_typ,
			prod_pln_typ,
			dmnd_date_div_mons,
			plm_flg,
			calc_seq,
			cmn_upri_flg,
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
				NEW.wg_cd,
				NEW.wg_nm,
				NEW.sls_flg,
				NEW.lg_flg,
				NEW.mfg_flg,
				NEW.purc_flg,
				NEW.ar_flg,
				NEW.ap_flg,
				NEW.sd_flg,
				NEW.mrp_prefix,
				NEW.mfg_inst_unit_typ,
				NEW.mrp_proc_typ,
				NEW.alloc_margin_days,
				NEW.not_xfr_flg,
				NEW.mrp_alloc_margin_days,
				NEW.mrp_opn_xfr_days,
				NEW.rqmt_typ,
				NEW.prod_pln_typ,
				NEW.dmnd_date_div_mons,
				NEW.plm_flg,
				NEW.calc_seq,
				NEW.cmn_upri_flg,
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
		IF OLD.wg_cd <> NEW.wg_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_wg_all_r (
				hst_id,
				hst_type,
				wg_cd,
				wg_nm,
				sls_flg,
				lg_flg,
				mfg_flg,
				purc_flg,
				ar_flg,
				ap_flg,
				sd_flg,
				mrp_prefix,
				mfg_inst_unit_typ,
				mrp_proc_typ,
				alloc_margin_days,
				not_xfr_flg,
				mrp_alloc_margin_days,
				mrp_opn_xfr_days,
				rqmt_typ,
				prod_pln_typ,
				dmnd_date_div_mons,
				plm_flg,
				calc_seq,
				cmn_upri_flg,
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
					OLD.wg_cd,
					OLD.wg_nm,
					OLD.sls_flg,
					OLD.lg_flg,
					OLD.mfg_flg,
					OLD.purc_flg,
					OLD.ar_flg,
					OLD.ap_flg,
					OLD.sd_flg,
					OLD.mrp_prefix,
					OLD.mfg_inst_unit_typ,
					OLD.mrp_proc_typ,
					OLD.alloc_margin_days,
					OLD.not_xfr_flg,
					OLD.mrp_alloc_margin_days,
					OLD.mrp_opn_xfr_days,
					OLD.rqmt_typ,
					OLD.prod_pln_typ,
					OLD.dmnd_date_div_mons,
					OLD.plm_flg,
					OLD.calc_seq,
					OLD.cmn_upri_flg,
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
		INSERT INTO mam_wg_all_r (
			hst_id,
			hst_type,
			wg_cd,
			wg_nm,
			sls_flg,
			lg_flg,
			mfg_flg,
			purc_flg,
			ar_flg,
			ap_flg,
			sd_flg,
			mrp_prefix,
			mfg_inst_unit_typ,
			mrp_proc_typ,
			alloc_margin_days,
			not_xfr_flg,
			mrp_alloc_margin_days,
			mrp_opn_xfr_days,
			rqmt_typ,
			prod_pln_typ,
			dmnd_date_div_mons,
			plm_flg,
			calc_seq,
			cmn_upri_flg,
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
				NEW.wg_cd,
				NEW.wg_nm,
				NEW.sls_flg,
				NEW.lg_flg,
				NEW.mfg_flg,
				NEW.purc_flg,
				NEW.ar_flg,
				NEW.ap_flg,
				NEW.sd_flg,
				NEW.mrp_prefix,
				NEW.mfg_inst_unit_typ,
				NEW.mrp_proc_typ,
				NEW.alloc_margin_days,
				NEW.not_xfr_flg,
				NEW.mrp_alloc_margin_days,
				NEW.mrp_opn_xfr_days,
				NEW.rqmt_typ,
				NEW.prod_pln_typ,
				NEW.dmnd_date_div_mons,
				NEW.plm_flg,
				NEW.calc_seq,
				NEW.cmn_upri_flg,
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
		INSERT INTO mam_wg_all_r (
			hst_id,
			hst_type,
			wg_cd,
			wg_nm,
			sls_flg,
			lg_flg,
			mfg_flg,
			purc_flg,
			ar_flg,
			ap_flg,
			sd_flg,
			mrp_prefix,
			mfg_inst_unit_typ,
			mrp_proc_typ,
			alloc_margin_days,
			not_xfr_flg,
			mrp_alloc_margin_days,
			mrp_opn_xfr_days,
			rqmt_typ,
			prod_pln_typ,
			dmnd_date_div_mons,
			plm_flg,
			calc_seq,
			cmn_upri_flg,
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
				OLD.wg_cd,
				OLD.wg_nm,
				OLD.sls_flg,
				OLD.lg_flg,
				OLD.mfg_flg,
				OLD.purc_flg,
				OLD.ar_flg,
				OLD.ap_flg,
				OLD.sd_flg,
				OLD.mrp_prefix,
				OLD.mfg_inst_unit_typ,
				OLD.mrp_proc_typ,
				OLD.alloc_margin_days,
				OLD.not_xfr_flg,
				OLD.mrp_alloc_margin_days,
				OLD.mrp_opn_xfr_days,
				OLD.rqmt_typ,
				OLD.prod_pln_typ,
				OLD.dmnd_date_div_mons,
				OLD.plm_flg,
				OLD.calc_seq,
				OLD.cmn_upri_flg,
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

CREATE TRIGGER mam_wg_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_wg_all
FOR EACH ROW
EXECUTE FUNCTION mam_wg_all_tr_r_body();
ALTER TABLE mam_wg_all DISABLE TRIGGER mam_wg_all_tr_r;

