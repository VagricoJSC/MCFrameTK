\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_rpt_conf_lcl_cmn_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_rpt_conf_lcl_cmn_r';
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
		INSERT INTO mam_rpt_conf_lcl_cmn_r (
			hst_id,
			hst_type,
			rpt_ptn_cd,
			rpt_row_cd,
			rpt_row_nm,
			memo1,
			memo2,
			memo3,
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
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.rpt_ptn_cd,
				NEW.rpt_row_cd,
				NEW.rpt_row_nm,
				NEW.memo1,
				NEW.memo2,
				NEW.memo3,
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
				NEW.lcl_cd
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.rpt_ptn_cd <> NEW.rpt_ptn_cd OR OLD.rpt_row_cd <> NEW.rpt_row_cd OR OLD.lcl_cd <> NEW.lcl_cd THEN
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
			INSERT INTO mam_rpt_conf_lcl_cmn_r (
				hst_id,
				hst_type,
				rpt_ptn_cd,
				rpt_row_cd,
				rpt_row_nm,
				memo1,
				memo2,
				memo3,
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
				lcl_cd
			)
				VALUES (
					h_id,
					h_typ,
					OLD.rpt_ptn_cd,
					OLD.rpt_row_cd,
					OLD.rpt_row_nm,
					OLD.memo1,
					OLD.memo2,
					OLD.memo3,
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
					OLD.lcl_cd
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
		INSERT INTO mam_rpt_conf_lcl_cmn_r (
			hst_id,
			hst_type,
			rpt_ptn_cd,
			rpt_row_cd,
			rpt_row_nm,
			memo1,
			memo2,
			memo3,
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
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.rpt_ptn_cd,
				NEW.rpt_row_cd,
				NEW.rpt_row_nm,
				NEW.memo1,
				NEW.memo2,
				NEW.memo3,
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
				NEW.lcl_cd
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
		INSERT INTO mam_rpt_conf_lcl_cmn_r (
			hst_id,
			hst_type,
			rpt_ptn_cd,
			rpt_row_cd,
			rpt_row_nm,
			memo1,
			memo2,
			memo3,
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
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				OLD.rpt_ptn_cd,
				OLD.rpt_row_cd,
				OLD.rpt_row_nm,
				OLD.memo1,
				OLD.memo2,
				OLD.memo3,
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
				OLD.lcl_cd
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_rpt_conf_lcl_cmn_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_rpt_conf_lcl_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_rpt_conf_lcl_cmn_tr_r_body();
ALTER TABLE mam_rpt_conf_lcl_cmn DISABLE TRIGGER mam_rpt_conf_lcl_cmn_tr_r;

