\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_auto_jnl_cmn_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_auto_jnl_cmn_r';
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
		INSERT INTO mam_auto_jnl_cmn_r (
			hst_id,
			hst_type,
			ac_slip_typ,
			auto_jnl_key_cd,
			auto_jnl_grp,
			jnl_ptn_cd,
			prio,
			ac_if_typ,
			id_typ,
			slip_cnt_id,
			std_rnd_typ,
			cls_jnl_typ,
			compound_jnl_typ,
			alloc_jnl_flg,
			minus_flg,
			rev_flg,
			minus_rev_flg,
			default_flg,
			abs_typ,
			abstract1,
			st_dt,
			end_dt,
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
				NEW.ac_slip_typ,
				NEW.auto_jnl_key_cd,
				NEW.auto_jnl_grp,
				NEW.jnl_ptn_cd,
				NEW.prio,
				NEW.ac_if_typ,
				NEW.id_typ,
				NEW.slip_cnt_id,
				NEW.std_rnd_typ,
				NEW.cls_jnl_typ,
				NEW.compound_jnl_typ,
				NEW.alloc_jnl_flg,
				NEW.minus_flg,
				NEW.rev_flg,
				NEW.minus_rev_flg,
				NEW.default_flg,
				NEW.abs_typ,
				NEW.abstract1,
				NEW.st_dt,
				NEW.end_dt,
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
		IF OLD.ac_slip_typ <> NEW.ac_slip_typ OR OLD.auto_jnl_key_cd <> NEW.auto_jnl_key_cd OR OLD.auto_jnl_grp <> NEW.auto_jnl_grp OR OLD.jnl_ptn_cd <> NEW.jnl_ptn_cd THEN
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
			INSERT INTO mam_auto_jnl_cmn_r (
				hst_id,
				hst_type,
				ac_slip_typ,
				auto_jnl_key_cd,
				auto_jnl_grp,
				jnl_ptn_cd,
				prio,
				ac_if_typ,
				id_typ,
				slip_cnt_id,
				std_rnd_typ,
				cls_jnl_typ,
				compound_jnl_typ,
				alloc_jnl_flg,
				minus_flg,
				rev_flg,
				minus_rev_flg,
				default_flg,
				abs_typ,
				abstract1,
				st_dt,
				end_dt,
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
					OLD.ac_slip_typ,
					OLD.auto_jnl_key_cd,
					OLD.auto_jnl_grp,
					OLD.jnl_ptn_cd,
					OLD.prio,
					OLD.ac_if_typ,
					OLD.id_typ,
					OLD.slip_cnt_id,
					OLD.std_rnd_typ,
					OLD.cls_jnl_typ,
					OLD.compound_jnl_typ,
					OLD.alloc_jnl_flg,
					OLD.minus_flg,
					OLD.rev_flg,
					OLD.minus_rev_flg,
					OLD.default_flg,
					OLD.abs_typ,
					OLD.abstract1,
					OLD.st_dt,
					OLD.end_dt,
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
		INSERT INTO mam_auto_jnl_cmn_r (
			hst_id,
			hst_type,
			ac_slip_typ,
			auto_jnl_key_cd,
			auto_jnl_grp,
			jnl_ptn_cd,
			prio,
			ac_if_typ,
			id_typ,
			slip_cnt_id,
			std_rnd_typ,
			cls_jnl_typ,
			compound_jnl_typ,
			alloc_jnl_flg,
			minus_flg,
			rev_flg,
			minus_rev_flg,
			default_flg,
			abs_typ,
			abstract1,
			st_dt,
			end_dt,
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
				NEW.ac_slip_typ,
				NEW.auto_jnl_key_cd,
				NEW.auto_jnl_grp,
				NEW.jnl_ptn_cd,
				NEW.prio,
				NEW.ac_if_typ,
				NEW.id_typ,
				NEW.slip_cnt_id,
				NEW.std_rnd_typ,
				NEW.cls_jnl_typ,
				NEW.compound_jnl_typ,
				NEW.alloc_jnl_flg,
				NEW.minus_flg,
				NEW.rev_flg,
				NEW.minus_rev_flg,
				NEW.default_flg,
				NEW.abs_typ,
				NEW.abstract1,
				NEW.st_dt,
				NEW.end_dt,
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
		INSERT INTO mam_auto_jnl_cmn_r (
			hst_id,
			hst_type,
			ac_slip_typ,
			auto_jnl_key_cd,
			auto_jnl_grp,
			jnl_ptn_cd,
			prio,
			ac_if_typ,
			id_typ,
			slip_cnt_id,
			std_rnd_typ,
			cls_jnl_typ,
			compound_jnl_typ,
			alloc_jnl_flg,
			minus_flg,
			rev_flg,
			minus_rev_flg,
			default_flg,
			abs_typ,
			abstract1,
			st_dt,
			end_dt,
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
				OLD.ac_slip_typ,
				OLD.auto_jnl_key_cd,
				OLD.auto_jnl_grp,
				OLD.jnl_ptn_cd,
				OLD.prio,
				OLD.ac_if_typ,
				OLD.id_typ,
				OLD.slip_cnt_id,
				OLD.std_rnd_typ,
				OLD.cls_jnl_typ,
				OLD.compound_jnl_typ,
				OLD.alloc_jnl_flg,
				OLD.minus_flg,
				OLD.rev_flg,
				OLD.minus_rev_flg,
				OLD.default_flg,
				OLD.abs_typ,
				OLD.abstract1,
				OLD.st_dt,
				OLD.end_dt,
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

CREATE TRIGGER mam_auto_jnl_cmn_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_auto_jnl_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_auto_jnl_cmn_tr_r_body();
ALTER TABLE mam_auto_jnl_cmn DISABLE TRIGGER mam_auto_jnl_cmn_tr_r;

