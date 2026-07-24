\encoding UTF-8

CREATE OR REPLACE FUNCTION mgt_non_mov_stk_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mgt_non_mov_stk_all_r';
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
		INSERT INTO mgt_non_mov_stk_all_r (
			hst_id,
			hst_type,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			co_cd,
			non_mov_base_ym,
			non_mov_gi_ym,
			non_mov_gr_ym,
			calc_ym,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.sno1,
				NEW.sno2,
				NEW.sno3,
				NEW.sno4,
				NEW.wg_cd,
				NEW.co_cd,
				NEW.non_mov_base_ym,
				NEW.non_mov_gi_ym,
				NEW.non_mov_gr_ym,
				NEW.calc_ym,
				NEW.rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
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
		IF OLD.itm_cd <> NEW.itm_cd OR OLD.itm_sub1 <> NEW.itm_sub1 OR OLD.itm_sub2 <> NEW.itm_sub2 OR OLD.itm_sub3 <> NEW.itm_sub3 OR OLD.lot_no <> NEW.lot_no OR OLD.sublot_no <> NEW.sublot_no OR OLD.sno1 <> NEW.sno1 OR OLD.sno2 <> NEW.sno2 OR OLD.sno3 <> NEW.sno3 OR OLD.sno4 <> NEW.sno4 OR OLD.wg_cd <> NEW.wg_cd OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mgt_non_mov_stk_all_r (
				hst_id,
				hst_type,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				wg_cd,
				co_cd,
				non_mov_base_ym,
				non_mov_gi_ym,
				non_mov_gr_ym,
				calc_ym,
				rmrks,
				sub_char1,
				sub_char2,
				sub_char3,
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
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.lot_no,
					OLD.sublot_no,
					OLD.sno1,
					OLD.sno2,
					OLD.sno3,
					OLD.sno4,
					OLD.wg_cd,
					OLD.co_cd,
					OLD.non_mov_base_ym,
					OLD.non_mov_gi_ym,
					OLD.non_mov_gr_ym,
					OLD.calc_ym,
					OLD.rmrks,
					OLD.sub_char1,
					OLD.sub_char2,
					OLD.sub_char3,
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
		INSERT INTO mgt_non_mov_stk_all_r (
			hst_id,
			hst_type,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			co_cd,
			non_mov_base_ym,
			non_mov_gi_ym,
			non_mov_gr_ym,
			calc_ym,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.lot_no,
				NEW.sublot_no,
				NEW.sno1,
				NEW.sno2,
				NEW.sno3,
				NEW.sno4,
				NEW.wg_cd,
				NEW.co_cd,
				NEW.non_mov_base_ym,
				NEW.non_mov_gi_ym,
				NEW.non_mov_gr_ym,
				NEW.calc_ym,
				NEW.rmrks,
				NEW.sub_char1,
				NEW.sub_char2,
				NEW.sub_char3,
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
		INSERT INTO mgt_non_mov_stk_all_r (
			hst_id,
			hst_type,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			wg_cd,
			co_cd,
			non_mov_base_ym,
			non_mov_gi_ym,
			non_mov_gr_ym,
			calc_ym,
			rmrks,
			sub_char1,
			sub_char2,
			sub_char3,
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
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.lot_no,
				OLD.sublot_no,
				OLD.sno1,
				OLD.sno2,
				OLD.sno3,
				OLD.sno4,
				OLD.wg_cd,
				OLD.co_cd,
				OLD.non_mov_base_ym,
				OLD.non_mov_gi_ym,
				OLD.non_mov_gr_ym,
				OLD.calc_ym,
				OLD.rmrks,
				OLD.sub_char1,
				OLD.sub_char2,
				OLD.sub_char3,
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

CREATE TRIGGER mgt_non_mov_stk_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mgt_non_mov_stk_all
FOR EACH ROW
EXECUTE FUNCTION mgt_non_mov_stk_all_tr_r_body();
ALTER TABLE mgt_non_mov_stk_all DISABLE TRIGGER mgt_non_mov_stk_all_tr_r;

