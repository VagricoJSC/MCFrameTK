\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_cost_io_cmn_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_cost_io_cmn_r';
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
		INSERT INTO mam_cost_io_cmn_r (
			hst_id,
			hst_type,
			cost_io_id,
			cost_io_nm,
			itm_jnl_cd,
			itm_grp_cd1,
			itm_grp_cd2,
			itm_grp_cd3,
			itm_grp_cd4,
			itm_grp_cd5,
			itm_grp_cd6,
			itm_grp_cd7,
			itm_grp_cd8,
			itm_grp_cd9,
			itm_grp_cd10,
			prod_flg,
			sls_flg,
			other_flg,
			in_flg,
			out_flg,
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
				NEW.cost_io_id,
				NEW.cost_io_nm,
				NEW.itm_jnl_cd,
				NEW.itm_grp_cd1,
				NEW.itm_grp_cd2,
				NEW.itm_grp_cd3,
				NEW.itm_grp_cd4,
				NEW.itm_grp_cd5,
				NEW.itm_grp_cd6,
				NEW.itm_grp_cd7,
				NEW.itm_grp_cd8,
				NEW.itm_grp_cd9,
				NEW.itm_grp_cd10,
				NEW.prod_flg,
				NEW.sls_flg,
				NEW.other_flg,
				NEW.in_flg,
				NEW.out_flg,
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
		IF OLD.cost_io_id <> NEW.cost_io_id THEN
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
			INSERT INTO mam_cost_io_cmn_r (
				hst_id,
				hst_type,
				cost_io_id,
				cost_io_nm,
				itm_jnl_cd,
				itm_grp_cd1,
				itm_grp_cd2,
				itm_grp_cd3,
				itm_grp_cd4,
				itm_grp_cd5,
				itm_grp_cd6,
				itm_grp_cd7,
				itm_grp_cd8,
				itm_grp_cd9,
				itm_grp_cd10,
				prod_flg,
				sls_flg,
				other_flg,
				in_flg,
				out_flg,
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
					OLD.cost_io_id,
					OLD.cost_io_nm,
					OLD.itm_jnl_cd,
					OLD.itm_grp_cd1,
					OLD.itm_grp_cd2,
					OLD.itm_grp_cd3,
					OLD.itm_grp_cd4,
					OLD.itm_grp_cd5,
					OLD.itm_grp_cd6,
					OLD.itm_grp_cd7,
					OLD.itm_grp_cd8,
					OLD.itm_grp_cd9,
					OLD.itm_grp_cd10,
					OLD.prod_flg,
					OLD.sls_flg,
					OLD.other_flg,
					OLD.in_flg,
					OLD.out_flg,
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
		INSERT INTO mam_cost_io_cmn_r (
			hst_id,
			hst_type,
			cost_io_id,
			cost_io_nm,
			itm_jnl_cd,
			itm_grp_cd1,
			itm_grp_cd2,
			itm_grp_cd3,
			itm_grp_cd4,
			itm_grp_cd5,
			itm_grp_cd6,
			itm_grp_cd7,
			itm_grp_cd8,
			itm_grp_cd9,
			itm_grp_cd10,
			prod_flg,
			sls_flg,
			other_flg,
			in_flg,
			out_flg,
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
				NEW.cost_io_id,
				NEW.cost_io_nm,
				NEW.itm_jnl_cd,
				NEW.itm_grp_cd1,
				NEW.itm_grp_cd2,
				NEW.itm_grp_cd3,
				NEW.itm_grp_cd4,
				NEW.itm_grp_cd5,
				NEW.itm_grp_cd6,
				NEW.itm_grp_cd7,
				NEW.itm_grp_cd8,
				NEW.itm_grp_cd9,
				NEW.itm_grp_cd10,
				NEW.prod_flg,
				NEW.sls_flg,
				NEW.other_flg,
				NEW.in_flg,
				NEW.out_flg,
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
		INSERT INTO mam_cost_io_cmn_r (
			hst_id,
			hst_type,
			cost_io_id,
			cost_io_nm,
			itm_jnl_cd,
			itm_grp_cd1,
			itm_grp_cd2,
			itm_grp_cd3,
			itm_grp_cd4,
			itm_grp_cd5,
			itm_grp_cd6,
			itm_grp_cd7,
			itm_grp_cd8,
			itm_grp_cd9,
			itm_grp_cd10,
			prod_flg,
			sls_flg,
			other_flg,
			in_flg,
			out_flg,
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
				OLD.cost_io_id,
				OLD.cost_io_nm,
				OLD.itm_jnl_cd,
				OLD.itm_grp_cd1,
				OLD.itm_grp_cd2,
				OLD.itm_grp_cd3,
				OLD.itm_grp_cd4,
				OLD.itm_grp_cd5,
				OLD.itm_grp_cd6,
				OLD.itm_grp_cd7,
				OLD.itm_grp_cd8,
				OLD.itm_grp_cd9,
				OLD.itm_grp_cd10,
				OLD.prod_flg,
				OLD.sls_flg,
				OLD.other_flg,
				OLD.in_flg,
				OLD.out_flg,
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

CREATE TRIGGER mam_cost_io_cmn_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_cost_io_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_cost_io_cmn_tr_r_body();
ALTER TABLE mam_cost_io_cmn DISABLE TRIGGER mam_cost_io_cmn_tr_r;

