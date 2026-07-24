\encoding UTF-8

CREATE OR REPLACE FUNCTION fct_ref_time_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='fct_ref_time_r';
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
		INSERT INTO fct_ref_time_r (
			hst_id,
			hst_type,
			co_cd,
			ext_attr1,
			ext_attr2,
			ext_attr3,
			req_no,
			thread_no,
			table_name,
			ref_time
		)
			VALUES (
				h_id,
				h_typ,
				NEW.co_cd,
				NEW.ext_attr1,
				NEW.ext_attr2,
				NEW.ext_attr3,
				NEW.req_no,
				NEW.thread_no,
				NEW.table_name,
				NEW.ref_time
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
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
		INSERT INTO fct_ref_time_r (
			hst_id,
			hst_type,
			co_cd,
			ext_attr1,
			ext_attr2,
			ext_attr3,
			req_no,
			thread_no,
			table_name,
			ref_time
		)
			VALUES (
				h_id,
				h_typ,
				OLD.co_cd,
				OLD.ext_attr1,
				OLD.ext_attr2,
				OLD.ext_attr3,
				OLD.req_no,
				OLD.thread_no,
				OLD.table_name,
				OLD.ref_time
		);		h_typ := 'I';
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
		INSERT INTO fct_ref_time_r (
			hst_id,
			hst_type,
			co_cd,
			ext_attr1,
			ext_attr2,
			ext_attr3,
			req_no,
			thread_no,
			table_name,
			ref_time
		)
			VALUES (
				h_id,
				h_typ,
				NEW.co_cd,
				NEW.ext_attr1,
				NEW.ext_attr2,
				NEW.ext_attr3,
				NEW.req_no,
				NEW.thread_no,
				NEW.table_name,
				NEW.ref_time
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
		INSERT INTO fct_ref_time_r (
			hst_id,
			hst_type,
			co_cd,
			ext_attr1,
			ext_attr2,
			ext_attr3,
			req_no,
			thread_no,
			table_name,
			ref_time
		)
			VALUES (
				h_id,
				h_typ,
				OLD.co_cd,
				OLD.ext_attr1,
				OLD.ext_attr2,
				OLD.ext_attr3,
				OLD.req_no,
				OLD.thread_no,
				OLD.table_name,
				OLD.ref_time
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER fct_ref_time_tr_r
AFTER INSERT OR DELETE OR UPDATE ON fct_ref_time
FOR EACH ROW
EXECUTE FUNCTION fct_ref_time_tr_r_body();
ALTER TABLE fct_ref_time DISABLE TRIGGER fct_ref_time_tr_r;

