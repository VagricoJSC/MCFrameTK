\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_usr_itm_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_usr_itm_all_r';
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
		INSERT INTO mgt_usr_itm_all_r (
			hst_id,
			hst_type,
			usr_cd,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.usr_cd,
				NEW.calc_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.co_cd
		);
		RETURN NEW;
	ELSIF (TG_OP = 'UPDATE') THEN
		IF OLD.usr_cd <> NEW.usr_cd OR OLD.calc_grp_cd <> NEW.calc_grp_cd OR OLD.itm_cd <> NEW.itm_cd OR OLD.itm_sub1 <> NEW.itm_sub1 OR OLD.itm_sub2 <> NEW.itm_sub2 OR OLD.itm_sub3 <> NEW.itm_sub3 OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_usr_itm_all_r (
				hst_id,
				hst_type,
				usr_cd,
				calc_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				co_cd
			)
				VALUES (
					h_id,
					h_typ,
					OLD.usr_cd,
					OLD.calc_grp_cd,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
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
		INSERT INTO mgt_usr_itm_all_r (
			hst_id,
			hst_type,
			usr_cd,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				NEW.usr_cd,
				NEW.calc_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
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
		INSERT INTO mgt_usr_itm_all_r (
			hst_id,
			hst_type,
			usr_cd,
			calc_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			co_cd
		)
			VALUES (
				h_id,
				h_typ,
				OLD.usr_cd,
				OLD.calc_grp_cd,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.co_cd
		);
		RETURN OLD;
	END IF;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mgt_usr_itm_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_usr_itm_all
FOR EACH ROW
EXECUTE FUNCTION mgt_usr_itm_all_tr_r_body();
ALTER TABLE mgt_usr_itm_all DISABLE TRIGGER mgt_usr_itm_all_tr_r;

