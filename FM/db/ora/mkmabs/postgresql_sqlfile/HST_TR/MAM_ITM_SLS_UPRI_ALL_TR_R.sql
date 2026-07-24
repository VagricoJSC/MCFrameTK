\encoding UTF-8

CREATE OR REPLACE FUNCTION mam_itm_sls_upri_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mam_itm_sls_upri_all_r';
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
		INSERT INTO mam_itm_sls_upri_all_r (
			hst_id,
			hst_type,
			sls_upri_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_upri_rank_cd,
			unit_cd,
			lot_qty,
			cur_cd,
			wg_cd,
			st_dt,
			co_cd,
			end_dt,
			upri,
			upri_bf,
			interim_flg,
			upri_rate,
			upri_rate_bf,
			sub_upri1,
			sub_upri2,
			sub_upri3,
			not_cost_flg,
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
				NEW.sls_upri_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.sls_upri_rank_cd,
				NEW.unit_cd,
				NEW.lot_qty,
				NEW.cur_cd,
				NEW.wg_cd,
				NEW.st_dt,
				NEW.co_cd,
				NEW.end_dt,
				NEW.upri,
				NEW.upri_bf,
				NEW.interim_flg,
				NEW.upri_rate,
				NEW.upri_rate_bf,
				NEW.sub_upri1,
				NEW.sub_upri2,
				NEW.sub_upri3,
				NEW.not_cost_flg,
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
		IF OLD.sls_upri_grp_cd <> NEW.sls_upri_grp_cd OR OLD.itm_cd <> NEW.itm_cd OR OLD.itm_sub1 <> NEW.itm_sub1 OR OLD.itm_sub2 <> NEW.itm_sub2 OR OLD.itm_sub3 <> NEW.itm_sub3 OR OLD.sls_upri_rank_cd <> NEW.sls_upri_rank_cd OR OLD.unit_cd <> NEW.unit_cd OR OLD.lot_qty <> NEW.lot_qty OR OLD.cur_cd <> NEW.cur_cd OR OLD.wg_cd <> NEW.wg_cd OR OLD.st_dt <> NEW.st_dt OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mam_itm_sls_upri_all_r (
				hst_id,
				hst_type,
				sls_upri_grp_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				sls_upri_rank_cd,
				unit_cd,
				lot_qty,
				cur_cd,
				wg_cd,
				st_dt,
				co_cd,
				end_dt,
				upri,
				upri_bf,
				interim_flg,
				upri_rate,
				upri_rate_bf,
				sub_upri1,
				sub_upri2,
				sub_upri3,
				not_cost_flg,
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
					OLD.sls_upri_grp_cd,
					OLD.itm_cd,
					OLD.itm_sub1,
					OLD.itm_sub2,
					OLD.itm_sub3,
					OLD.sls_upri_rank_cd,
					OLD.unit_cd,
					OLD.lot_qty,
					OLD.cur_cd,
					OLD.wg_cd,
					OLD.st_dt,
					OLD.co_cd,
					OLD.end_dt,
					OLD.upri,
					OLD.upri_bf,
					OLD.interim_flg,
					OLD.upri_rate,
					OLD.upri_rate_bf,
					OLD.sub_upri1,
					OLD.sub_upri2,
					OLD.sub_upri3,
					OLD.not_cost_flg,
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
		INSERT INTO mam_itm_sls_upri_all_r (
			hst_id,
			hst_type,
			sls_upri_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_upri_rank_cd,
			unit_cd,
			lot_qty,
			cur_cd,
			wg_cd,
			st_dt,
			co_cd,
			end_dt,
			upri,
			upri_bf,
			interim_flg,
			upri_rate,
			upri_rate_bf,
			sub_upri1,
			sub_upri2,
			sub_upri3,
			not_cost_flg,
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
				NEW.sls_upri_grp_cd,
				NEW.itm_cd,
				NEW.itm_sub1,
				NEW.itm_sub2,
				NEW.itm_sub3,
				NEW.sls_upri_rank_cd,
				NEW.unit_cd,
				NEW.lot_qty,
				NEW.cur_cd,
				NEW.wg_cd,
				NEW.st_dt,
				NEW.co_cd,
				NEW.end_dt,
				NEW.upri,
				NEW.upri_bf,
				NEW.interim_flg,
				NEW.upri_rate,
				NEW.upri_rate_bf,
				NEW.sub_upri1,
				NEW.sub_upri2,
				NEW.sub_upri3,
				NEW.not_cost_flg,
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
		INSERT INTO mam_itm_sls_upri_all_r (
			hst_id,
			hst_type,
			sls_upri_grp_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			sls_upri_rank_cd,
			unit_cd,
			lot_qty,
			cur_cd,
			wg_cd,
			st_dt,
			co_cd,
			end_dt,
			upri,
			upri_bf,
			interim_flg,
			upri_rate,
			upri_rate_bf,
			sub_upri1,
			sub_upri2,
			sub_upri3,
			not_cost_flg,
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
				OLD.sls_upri_grp_cd,
				OLD.itm_cd,
				OLD.itm_sub1,
				OLD.itm_sub2,
				OLD.itm_sub3,
				OLD.sls_upri_rank_cd,
				OLD.unit_cd,
				OLD.lot_qty,
				OLD.cur_cd,
				OLD.wg_cd,
				OLD.st_dt,
				OLD.co_cd,
				OLD.end_dt,
				OLD.upri,
				OLD.upri_bf,
				OLD.interim_flg,
				OLD.upri_rate,
				OLD.upri_rate_bf,
				OLD.sub_upri1,
				OLD.sub_upri2,
				OLD.sub_upri3,
				OLD.not_cost_flg,
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

CREATE TRIGGER mam_itm_sls_upri_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mam_itm_sls_upri_all
FOR EACH ROW
EXECUTE FUNCTION mam_itm_sls_upri_all_tr_r_body();
ALTER TABLE mam_itm_sls_upri_all DISABLE TRIGGER mam_itm_sls_upri_all_tr_r;

