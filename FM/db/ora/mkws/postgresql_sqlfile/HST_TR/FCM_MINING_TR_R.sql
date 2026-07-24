\encoding UTF-8

CREATE OR REPLACE FUNCTION fcm_mining_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='fcm_mining_r';
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
		INSERT INTO fcm_mining_r (
			hst_id,
			hst_type,
			mining_id,
			mining_nm,
			user_id,
			co_cd,
			public_lv,
			description_text,
			module_id,
			logic_id,
			operation_id,
			func_typ,
			scr_module_id,
			screen_id,
			gadget_size,
			gadget_icon,
			gadget_cache_flg,
			md_module_id,
			md_screen_id,
			md_gadget_size,
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
				NEW.mining_id,
				NEW.mining_nm,
				NEW.user_id,
				NEW.co_cd,
				NEW.public_lv,
				NEW.description_text,
				NEW.module_id,
				NEW.logic_id,
				NEW.operation_id,
				NEW.func_typ,
				NEW.scr_module_id,
				NEW.screen_id,
				NEW.gadget_size,
				NEW.gadget_icon,
				NEW.gadget_cache_flg,
				NEW.md_module_id,
				NEW.md_screen_id,
				NEW.md_gadget_size,
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
		IF OLD.mining_id <> NEW.mining_id THEN
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
			INSERT INTO fcm_mining_r (
				hst_id,
				hst_type,
				mining_id,
				mining_nm,
				user_id,
				co_cd,
				public_lv,
				description_text,
				module_id,
				logic_id,
				operation_id,
				func_typ,
				scr_module_id,
				screen_id,
				gadget_size,
				gadget_icon,
				gadget_cache_flg,
				md_module_id,
				md_screen_id,
				md_gadget_size,
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
					OLD.mining_id,
					OLD.mining_nm,
					OLD.user_id,
					OLD.co_cd,
					OLD.public_lv,
					OLD.description_text,
					OLD.module_id,
					OLD.logic_id,
					OLD.operation_id,
					OLD.func_typ,
					OLD.scr_module_id,
					OLD.screen_id,
					OLD.gadget_size,
					OLD.gadget_icon,
					OLD.gadget_cache_flg,
					OLD.md_module_id,
					OLD.md_screen_id,
					OLD.md_gadget_size,
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
		INSERT INTO fcm_mining_r (
			hst_id,
			hst_type,
			mining_id,
			mining_nm,
			user_id,
			co_cd,
			public_lv,
			description_text,
			module_id,
			logic_id,
			operation_id,
			func_typ,
			scr_module_id,
			screen_id,
			gadget_size,
			gadget_icon,
			gadget_cache_flg,
			md_module_id,
			md_screen_id,
			md_gadget_size,
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
				NEW.mining_id,
				NEW.mining_nm,
				NEW.user_id,
				NEW.co_cd,
				NEW.public_lv,
				NEW.description_text,
				NEW.module_id,
				NEW.logic_id,
				NEW.operation_id,
				NEW.func_typ,
				NEW.scr_module_id,
				NEW.screen_id,
				NEW.gadget_size,
				NEW.gadget_icon,
				NEW.gadget_cache_flg,
				NEW.md_module_id,
				NEW.md_screen_id,
				NEW.md_gadget_size,
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
		INSERT INTO fcm_mining_r (
			hst_id,
			hst_type,
			mining_id,
			mining_nm,
			user_id,
			co_cd,
			public_lv,
			description_text,
			module_id,
			logic_id,
			operation_id,
			func_typ,
			scr_module_id,
			screen_id,
			gadget_size,
			gadget_icon,
			gadget_cache_flg,
			md_module_id,
			md_screen_id,
			md_gadget_size,
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
				OLD.mining_id,
				OLD.mining_nm,
				OLD.user_id,
				OLD.co_cd,
				OLD.public_lv,
				OLD.description_text,
				OLD.module_id,
				OLD.logic_id,
				OLD.operation_id,
				OLD.func_typ,
				OLD.scr_module_id,
				OLD.screen_id,
				OLD.gadget_size,
				OLD.gadget_icon,
				OLD.gadget_cache_flg,
				OLD.md_module_id,
				OLD.md_screen_id,
				OLD.md_gadget_size,
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

CREATE TRIGGER fcm_mining_tr_r
AFTER INSERT OR DELETE OR UPDATE ON fcm_mining
FOR EACH ROW
EXECUTE FUNCTION fcm_mining_tr_r_body();
ALTER TABLE fcm_mining DISABLE TRIGGER fcm_mining_tr_r;

