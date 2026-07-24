\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_bom_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_bom_all_r';
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
		INSERT INTO mgt_bom_all_r (
			hst_id,
			hst_type,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			co_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg,
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
				NEW.par_itm_cd,
				NEW.par_itm_sub1,
				NEW.par_itm_sub2,
				NEW.par_itm_sub3,
				NEW.bom_ptn,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.chd_itm_cd,
				NEW.chd_itm_sub1,
				NEW.chd_itm_sub2,
				NEW.chd_itm_sub3,
				NEW.alt_grp_cd,
				NEW.expns_cd,
				NEW.term,
				NEW.calc_ctg_cd,
				NEW.wg_cd,
				NEW.co_cd,
				NEW.disp_seq,
				NEW.par_rqmt_qty,
				NEW.chd_rqmt_qty,
				NEW.chd_base_qty,
				NEW.fxd_chd_rqmt_qty,
				NEW.chd_min_qty,
				NEW.chd_batch_qty,
				NEW.alt_itm_ratio,
				NEW.rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
				NEW.non_calc_flg,
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
		IF OLD.par_itm_cd <> NEW.par_itm_cd OR OLD.par_itm_sub1 <> NEW.par_itm_sub1 OR OLD.par_itm_sub2 <> NEW.par_itm_sub2 OR OLD.par_itm_sub3 <> NEW.par_itm_sub3 OR OLD.bom_ptn <> NEW.bom_ptn OR OLD.oper_cd <> NEW.oper_cd OR OLD.oper_seq <> NEW.oper_seq OR OLD.chd_itm_cd <> NEW.chd_itm_cd OR OLD.chd_itm_sub1 <> NEW.chd_itm_sub1 OR OLD.chd_itm_sub2 <> NEW.chd_itm_sub2 OR OLD.chd_itm_sub3 <> NEW.chd_itm_sub3 OR OLD.alt_grp_cd <> NEW.alt_grp_cd OR OLD.expns_cd <> NEW.expns_cd OR OLD.term <> NEW.term OR OLD.calc_ctg_cd <> NEW.calc_ctg_cd OR OLD.wg_cd <> NEW.wg_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_bom_all_r (
				hst_id,
				hst_type,
				par_itm_cd,
				par_itm_sub1,
				par_itm_sub2,
				par_itm_sub3,
				bom_ptn,
				oper_cd,
				oper_seq,
				chd_itm_cd,
				chd_itm_sub1,
				chd_itm_sub2,
				chd_itm_sub3,
				alt_grp_cd,
				expns_cd,
				term,
				calc_ctg_cd,
				wg_cd,
				co_cd,
				disp_seq,
				par_rqmt_qty,
				chd_rqmt_qty,
				chd_base_qty,
				fxd_chd_rqmt_qty,
				chd_min_qty,
				chd_batch_qty,
				alt_itm_ratio,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
				non_calc_flg,
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
					OLD.par_itm_cd,
					OLD.par_itm_sub1,
					OLD.par_itm_sub2,
					OLD.par_itm_sub3,
					OLD.bom_ptn,
					OLD.oper_cd,
					OLD.oper_seq,
					OLD.chd_itm_cd,
					OLD.chd_itm_sub1,
					OLD.chd_itm_sub2,
					OLD.chd_itm_sub3,
					OLD.alt_grp_cd,
					OLD.expns_cd,
					OLD.term,
					OLD.calc_ctg_cd,
					OLD.wg_cd,
					OLD.co_cd,
					OLD.disp_seq,
					OLD.par_rqmt_qty,
					OLD.chd_rqmt_qty,
					OLD.chd_base_qty,
					OLD.fxd_chd_rqmt_qty,
					OLD.chd_min_qty,
					OLD.chd_batch_qty,
					OLD.alt_itm_ratio,
					OLD.rmrks,
					OLD.sub_char1,
					OLD.sub_char2,
					OLD.sub_char3,
					OLD.non_calc_flg,
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
		INSERT INTO mgt_bom_all_r (
			hst_id,
			hst_type,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			co_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg,
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
				NEW.par_itm_cd,
				NEW.par_itm_sub1,
				NEW.par_itm_sub2,
				NEW.par_itm_sub3,
				NEW.bom_ptn,
				NEW.oper_cd,
				NEW.oper_seq,
				NEW.chd_itm_cd,
				NEW.chd_itm_sub1,
				NEW.chd_itm_sub2,
				NEW.chd_itm_sub3,
				NEW.alt_grp_cd,
				NEW.expns_cd,
				NEW.term,
				NEW.calc_ctg_cd,
				NEW.wg_cd,
				NEW.co_cd,
				NEW.disp_seq,
				NEW.par_rqmt_qty,
				NEW.chd_rqmt_qty,
				NEW.chd_base_qty,
				NEW.fxd_chd_rqmt_qty,
				NEW.chd_min_qty,
				NEW.chd_batch_qty,
				NEW.alt_itm_ratio,
				NEW.rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
				NEW.non_calc_flg,
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
		INSERT INTO mgt_bom_all_r (
			hst_id,
			hst_type,
			par_itm_cd,
			par_itm_sub1,
			par_itm_sub2,
			par_itm_sub3,
			bom_ptn,
			oper_cd,
			oper_seq,
			chd_itm_cd,
			chd_itm_sub1,
			chd_itm_sub2,
			chd_itm_sub3,
			alt_grp_cd,
			expns_cd,
			term,
			calc_ctg_cd,
			wg_cd,
			co_cd,
			disp_seq,
			par_rqmt_qty,
			chd_rqmt_qty,
			chd_base_qty,
			fxd_chd_rqmt_qty,
			chd_min_qty,
			chd_batch_qty,
			alt_itm_ratio,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
			non_calc_flg,
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
				OLD.par_itm_cd,
				OLD.par_itm_sub1,
				OLD.par_itm_sub2,
				OLD.par_itm_sub3,
				OLD.bom_ptn,
				OLD.oper_cd,
				OLD.oper_seq,
				OLD.chd_itm_cd,
				OLD.chd_itm_sub1,
				OLD.chd_itm_sub2,
				OLD.chd_itm_sub3,
				OLD.alt_grp_cd,
				OLD.expns_cd,
				OLD.term,
				OLD.calc_ctg_cd,
				OLD.wg_cd,
				OLD.co_cd,
				OLD.disp_seq,
				OLD.par_rqmt_qty,
				OLD.chd_rqmt_qty,
				OLD.chd_base_qty,
				OLD.fxd_chd_rqmt_qty,
				OLD.chd_min_qty,
				OLD.chd_batch_qty,
				OLD.alt_itm_ratio,
				OLD.rmrks,
				OLD.sub_char1,
				OLD.sub_char2,
				OLD.sub_char3,
				OLD.non_calc_flg,
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

CREATE TRIGGER mgt_bom_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_bom_all
FOR EACH ROW
EXECUTE FUNCTION mgt_bom_all_tr_r_body();
ALTER TABLE mgt_bom_all DISABLE TRIGGER mgt_bom_all_tr_r;

