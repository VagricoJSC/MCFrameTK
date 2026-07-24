\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_scm_if_ctl_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_scm_if_ctl_all_r';
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
		INSERT INTO mam_scm_if_ctl_all_r (
			hst_id,
			hst_type,
			if_proc_typ,
			loc_cd,
			lg_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			oper_cd,
			wk_cost_cd,
			dlv_cd,
			gr_loc_cd,
			st_dt,
			co_cd,
			end_dt,
			ext_sys_cd,
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
				NEW.if_proc_typ,
				NEW.loc_cd,
				NEW.lg_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.oper_cd,
				NEW.wk_cost_cd,
				NEW.dlv_cd,
				NEW.gr_loc_cd,
				NEW.st_dt,
				NEW.co_cd,
				NEW.end_dt,
				NEW.ext_sys_cd,
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
		IF OLD.if_proc_typ <> NEW.if_proc_typ OR OLD.loc_cd <> NEW.loc_cd OR OLD.lg_grp_cd <> NEW.lg_grp_cd OR OLD.itm_cd <> NEW.itm_cd OR OLD.itm_sub1 <> NEW.itm_sub1 OR OLD.itm_sub2 <> NEW.itm_sub2 OR OLD.itm_sub3 <> NEW.itm_sub3 OR OLD.oper_cd <> NEW.oper_cd OR OLD.wk_cost_cd <> NEW.wk_cost_cd OR OLD.dlv_cd <> NEW.dlv_cd OR OLD.gr_loc_cd <> NEW.gr_loc_cd OR OLD.st_dt <> NEW.st_dt OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_scm_if_ctl_all_r (
				hst_id,
				hst_type,
				if_proc_typ,
				loc_cd,
				lg_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				oper_cd,
				wk_cost_cd,
				dlv_cd,
				gr_loc_cd,
				st_dt,
				co_cd,
				end_dt,
				ext_sys_cd,
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
					OLD.if_proc_typ,
					OLD.loc_cd,
					OLD.lg_grp_cd,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.oper_cd,
					OLD.wk_cost_cd,
					OLD.dlv_cd,
					OLD.gr_loc_cd,
					OLD.st_dt,
					OLD.co_cd,
					OLD.end_dt,
					OLD.ext_sys_cd,
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
		INSERT INTO mam_scm_if_ctl_all_r (
			hst_id,
			hst_type,
			if_proc_typ,
			loc_cd,
			lg_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			oper_cd,
			wk_cost_cd,
			dlv_cd,
			gr_loc_cd,
			st_dt,
			co_cd,
			end_dt,
			ext_sys_cd,
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
				NEW.if_proc_typ,
				NEW.loc_cd,
				NEW.lg_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.oper_cd,
				NEW.wk_cost_cd,
				NEW.dlv_cd,
				NEW.gr_loc_cd,
				NEW.st_dt,
				NEW.co_cd,
				NEW.end_dt,
				NEW.ext_sys_cd,
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
		INSERT INTO mam_scm_if_ctl_all_r (
			hst_id,
			hst_type,
			if_proc_typ,
			loc_cd,
			lg_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			oper_cd,
			wk_cost_cd,
			dlv_cd,
			gr_loc_cd,
			st_dt,
			co_cd,
			end_dt,
			ext_sys_cd,
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
				OLD.if_proc_typ,
				OLD.loc_cd,
				OLD.lg_grp_cd,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.oper_cd,
				OLD.wk_cost_cd,
				OLD.dlv_cd,
				OLD.gr_loc_cd,
				OLD.st_dt,
				OLD.co_cd,
				OLD.end_dt,
				OLD.ext_sys_cd,
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

CREATE TRIGGER mam_scm_if_ctl_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_scm_if_ctl_all
FOR EACH ROW
EXECUTE FUNCTION mam_scm_if_ctl_all_tr_r_body();
ALTER TABLE mam_scm_if_ctl_all DISABLE TRIGGER mam_scm_if_ctl_all_tr_r;

