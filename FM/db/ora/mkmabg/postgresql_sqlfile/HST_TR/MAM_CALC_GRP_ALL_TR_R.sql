\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_calc_grp_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_calc_grp_all_r';
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
		INSERT INTO mam_calc_grp_all_r (
			hst_id,
			hst_type,
			calc_grp_cd,
			co_cd,
			calc_grp_nm,
			cost_calc_typ,
			eval_typ,
			max_mons,
			calc_cnt,
			sa_typ,
			exp_calc_typ,
			pre_alc_calc_typ,
			alc_calc_typ,
			inpt_calc_flg,
			wk_calc_flg,
			prov_calc_flg,
			xfr_calc_flg,
			xrate_cd,
			calc_seq_grp,
			calc_seq,
			runtime_wg_cd,
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
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				NEW.calc_grp_cd,
				NEW.co_cd,
				NEW.calc_grp_nm,
				NEW.cost_calc_typ,
				NEW.eval_typ,
				NEW.max_mons,
				NEW.calc_cnt,
				NEW.sa_typ,
				NEW.exp_calc_typ,
				NEW.pre_alc_calc_typ,
				NEW.alc_calc_typ,
				NEW.inpt_calc_flg,
				NEW.wk_calc_flg,
				NEW.prov_calc_flg,
				NEW.xfr_calc_flg,
				NEW.xrate_cd,
				NEW.calc_seq_grp,
				NEW.calc_seq,
				NEW.runtime_wg_cd,
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
				NEW.upd_srv_req_no
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.calc_grp_cd <> NEW.calc_grp_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_calc_grp_all_r (
				hst_id,
				hst_type,
				calc_grp_cd,
				co_cd,
				calc_grp_nm,
				cost_calc_typ,
				eval_typ,
				max_mons,
				calc_cnt,
				sa_typ,
				exp_calc_typ,
				pre_alc_calc_typ,
				alc_calc_typ,
				inpt_calc_flg,
				wk_calc_flg,
				prov_calc_flg,
				xfr_calc_flg,
				xrate_cd,
				calc_seq_grp,
				calc_seq,
				runtime_wg_cd,
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
				upd_srv_req_no
			)
				VALUES (
					h_id,
					h_typ,
					OLD.calc_grp_cd,
					OLD.co_cd,
					OLD.calc_grp_nm,
					OLD.cost_calc_typ,
					OLD.eval_typ,
					OLD.max_mons,
					OLD.calc_cnt,
					OLD.sa_typ,
					OLD.exp_calc_typ,
					OLD.pre_alc_calc_typ,
					OLD.alc_calc_typ,
					OLD.inpt_calc_flg,
					OLD.wk_calc_flg,
					OLD.prov_calc_flg,
					OLD.xfr_calc_flg,
					OLD.xrate_cd,
					OLD.calc_seq_grp,
					OLD.calc_seq,
					OLD.runtime_wg_cd,
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
		INSERT INTO mam_calc_grp_all_r (
			hst_id,
			hst_type,
			calc_grp_cd,
			co_cd,
			calc_grp_nm,
			cost_calc_typ,
			eval_typ,
			max_mons,
			calc_cnt,
			sa_typ,
			exp_calc_typ,
			pre_alc_calc_typ,
			alc_calc_typ,
			inpt_calc_flg,
			wk_calc_flg,
			prov_calc_flg,
			xfr_calc_flg,
			xrate_cd,
			calc_seq_grp,
			calc_seq,
			runtime_wg_cd,
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
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				NEW.calc_grp_cd,
				NEW.co_cd,
				NEW.calc_grp_nm,
				NEW.cost_calc_typ,
				NEW.eval_typ,
				NEW.max_mons,
				NEW.calc_cnt,
				NEW.sa_typ,
				NEW.exp_calc_typ,
				NEW.pre_alc_calc_typ,
				NEW.alc_calc_typ,
				NEW.inpt_calc_flg,
				NEW.wk_calc_flg,
				NEW.prov_calc_flg,
				NEW.xfr_calc_flg,
				NEW.xrate_cd,
				NEW.calc_seq_grp,
				NEW.calc_seq,
				NEW.runtime_wg_cd,
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
		INSERT INTO mam_calc_grp_all_r (
			hst_id,
			hst_type,
			calc_grp_cd,
			co_cd,
			calc_grp_nm,
			cost_calc_typ,
			eval_typ,
			max_mons,
			calc_cnt,
			sa_typ,
			exp_calc_typ,
			pre_alc_calc_typ,
			alc_calc_typ,
			inpt_calc_flg,
			wk_calc_flg,
			prov_calc_flg,
			xfr_calc_flg,
			xrate_cd,
			calc_seq_grp,
			calc_seq,
			runtime_wg_cd,
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
			upd_srv_req_no
		)
			VALUES (
				h_id,
				h_typ,
				OLD.calc_grp_cd,
				OLD.co_cd,
				OLD.calc_grp_nm,
				OLD.cost_calc_typ,
				OLD.eval_typ,
				OLD.max_mons,
				OLD.calc_cnt,
				OLD.sa_typ,
				OLD.exp_calc_typ,
				OLD.pre_alc_calc_typ,
				OLD.alc_calc_typ,
				OLD.inpt_calc_flg,
				OLD.wk_calc_flg,
				OLD.prov_calc_flg,
				OLD.xfr_calc_flg,
				OLD.xrate_cd,
				OLD.calc_seq_grp,
				OLD.calc_seq,
				OLD.runtime_wg_cd,
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
				OLD.upd_srv_req_no
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_calc_grp_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_calc_grp_all
FOR EACH ROW
EXECUTE FUNCTION mam_calc_grp_all_tr_r_body();
ALTER TABLE mam_calc_grp_all DISABLE TRIGGER mam_calc_grp_all_tr_r;

