\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_bp_lcl_cmn_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_bp_lcl_cmn_r';
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
		INSERT INTO mam_bp_lcl_cmn_r (
			hst_id,
			hst_type,
			bp_cd,
			bp_nm,
			bp_alt_nm1,
			bp_alt_nm2,
			bp_alt_nm3,
			bp_alt_nm4,
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
			memo4,
			memo5,
			memo6,
			memo7,
			memo8,
			memo9,
			memo10,
			memo11,
			memo12,
			memo13,
			memo14,
			memo15,
			memo16,
			memo17,
			memo18,
			memo19,
			memo20,
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.bp_cd,
				NEW.bp_nm,
				NEW.bp_alt_nm1,
				NEW.bp_alt_nm2,
				NEW.bp_alt_nm3,
				NEW.bp_alt_nm4,
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
				NEW.memo4,
				NEW.memo5,
				NEW.memo6,
				NEW.memo7,
				NEW.memo8,
				NEW.memo9,
				NEW.memo10,
				NEW.memo11,
				NEW.memo12,
				NEW.memo13,
				NEW.memo14,
				NEW.memo15,
				NEW.memo16,
				NEW.memo17,
				NEW.memo18,
				NEW.memo19,
				NEW.memo20,
				NEW.lcl_cd
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.bp_cd <> NEW.bp_cd OR OLD.lcl_cd <> NEW.lcl_cd THEN
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
			INSERT INTO mam_bp_lcl_cmn_r (
				hst_id,
				hst_type,
				bp_cd,
				bp_nm,
				bp_alt_nm1,
				bp_alt_nm2,
				bp_alt_nm3,
				bp_alt_nm4,
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
				memo4,
				memo5,
				memo6,
				memo7,
				memo8,
				memo9,
				memo10,
				memo11,
				memo12,
				memo13,
				memo14,
				memo15,
				memo16,
				memo17,
				memo18,
				memo19,
				memo20,
				lcl_cd
			)
				VALUES (
					h_id,
					h_typ,
					OLD.bp_cd,
					OLD.bp_nm,
					OLD.bp_alt_nm1,
					OLD.bp_alt_nm2,
					OLD.bp_alt_nm3,
					OLD.bp_alt_nm4,
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
					OLD.memo4,
					OLD.memo5,
					OLD.memo6,
					OLD.memo7,
					OLD.memo8,
					OLD.memo9,
					OLD.memo10,
					OLD.memo11,
					OLD.memo12,
					OLD.memo13,
					OLD.memo14,
					OLD.memo15,
					OLD.memo16,
					OLD.memo17,
					OLD.memo18,
					OLD.memo19,
					OLD.memo20,
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
		INSERT INTO mam_bp_lcl_cmn_r (
			hst_id,
			hst_type,
			bp_cd,
			bp_nm,
			bp_alt_nm1,
			bp_alt_nm2,
			bp_alt_nm3,
			bp_alt_nm4,
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
			memo4,
			memo5,
			memo6,
			memo7,
			memo8,
			memo9,
			memo10,
			memo11,
			memo12,
			memo13,
			memo14,
			memo15,
			memo16,
			memo17,
			memo18,
			memo19,
			memo20,
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.bp_cd,
				NEW.bp_nm,
				NEW.bp_alt_nm1,
				NEW.bp_alt_nm2,
				NEW.bp_alt_nm3,
				NEW.bp_alt_nm4,
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
				NEW.memo4,
				NEW.memo5,
				NEW.memo6,
				NEW.memo7,
				NEW.memo8,
				NEW.memo9,
				NEW.memo10,
				NEW.memo11,
				NEW.memo12,
				NEW.memo13,
				NEW.memo14,
				NEW.memo15,
				NEW.memo16,
				NEW.memo17,
				NEW.memo18,
				NEW.memo19,
				NEW.memo20,
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
		INSERT INTO mam_bp_lcl_cmn_r (
			hst_id,
			hst_type,
			bp_cd,
			bp_nm,
			bp_alt_nm1,
			bp_alt_nm2,
			bp_alt_nm3,
			bp_alt_nm4,
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
			memo4,
			memo5,
			memo6,
			memo7,
			memo8,
			memo9,
			memo10,
			memo11,
			memo12,
			memo13,
			memo14,
			memo15,
			memo16,
			memo17,
			memo18,
			memo19,
			memo20,
			lcl_cd
		)
			VALUES (
				h_id,
				h_typ,
				OLD.bp_cd,
				OLD.bp_nm,
				OLD.bp_alt_nm1,
				OLD.bp_alt_nm2,
				OLD.bp_alt_nm3,
				OLD.bp_alt_nm4,
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
				OLD.memo4,
				OLD.memo5,
				OLD.memo6,
				OLD.memo7,
				OLD.memo8,
				OLD.memo9,
				OLD.memo10,
				OLD.memo11,
				OLD.memo12,
				OLD.memo13,
				OLD.memo14,
				OLD.memo15,
				OLD.memo16,
				OLD.memo17,
				OLD.memo18,
				OLD.memo19,
				OLD.memo20,
				OLD.lcl_cd
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mam_bp_lcl_cmn_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_bp_lcl_cmn
FOR EACH ROW
EXECUTE FUNCTION mam_bp_lcl_cmn_tr_r_body();
ALTER TABLE mam_bp_lcl_cmn DISABLE TRIGGER mam_bp_lcl_cmn_tr_r;

