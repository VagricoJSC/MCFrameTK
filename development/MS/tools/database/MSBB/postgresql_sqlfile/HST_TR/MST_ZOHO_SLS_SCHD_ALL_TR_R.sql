\encoding UTF-8

CREATE OR REPLACE FUNCTION mst_zoho_sls_schd_all_tr_r_body() RETURNS trigger AS $BODY$
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
	h_tab :='mst_zoho_sls_schd_all_r';
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
		INSERT INTO mst_zoho_sls_schd_all_r (
			hst_id,
			hst_type,
			zoho_sls_schd_no,
			co_cd,
			deal_cd,
			deal_nm,
			cst_cd,
			dlv_cd,
			bcst_cd,
			sls_dpt_cd,
			sls_usr_cd,
			prod_itm_cd,
			prod_itm_sub1,
			prod_itm_sub2,
			prod_itm_sub3,
			mrkt_cd,
			dlv_nm,
			dlv_addr1,
			dlv_addr2,
			dlv_tel,
			ord_dlv_dt,
			post_inst_sls_dt,
			cur_cd,
			amt,
			qty,
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
				NEW.zoho_sls_schd_no,
				NEW.co_cd,
				NEW.deal_cd,
				NEW.deal_nm,
				NEW.cst_cd,
				NEW.dlv_cd,
				NEW.bcst_cd,
				NEW.sls_dpt_cd,
				NEW.sls_usr_cd,
				NEW.prod_itm_cd,
				NEW.prod_itm_sub1,
				NEW.prod_itm_sub2,
				NEW.prod_itm_sub3,
				NEW.mrkt_cd,
				NEW.dlv_nm,
				NEW.dlv_addr1,
				NEW.dlv_addr2,
				NEW.dlv_tel,
				NEW.ord_dlv_dt,
				NEW.post_inst_sls_dt,
				NEW.cur_cd,
				NEW.amt,
				NEW.qty,
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
		IF OLD.zoho_sls_schd_no <> NEW.zoho_sls_schd_no OR OLD.co_cd <> NEW.co_cd THEN
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
			INSERT INTO mst_zoho_sls_schd_all_r (
				hst_id,
				hst_type,
				zoho_sls_schd_no,
				co_cd,
				deal_cd,
				deal_nm,
				cst_cd,
				dlv_cd,
				bcst_cd,
				sls_dpt_cd,
				sls_usr_cd,
				prod_itm_cd,
				prod_itm_sub1,
				prod_itm_sub2,
				prod_itm_sub3,
				mrkt_cd,
				dlv_nm,
				dlv_addr1,
				dlv_addr2,
				dlv_tel,
				ord_dlv_dt,
				post_inst_sls_dt,
				cur_cd,
				amt,
				qty,
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
					OLD.zoho_sls_schd_no,
					OLD.co_cd,
					OLD.deal_cd,
					OLD.deal_nm,
					OLD.cst_cd,
					OLD.dlv_cd,
					OLD.bcst_cd,
					OLD.sls_dpt_cd,
					OLD.sls_usr_cd,
					OLD.prod_itm_cd,
					OLD.prod_itm_sub1,
					OLD.prod_itm_sub2,
					OLD.prod_itm_sub3,
					OLD.mrkt_cd,
					OLD.dlv_nm,
					OLD.dlv_addr1,
					OLD.dlv_addr2,
					OLD.dlv_tel,
					OLD.ord_dlv_dt,
					OLD.post_inst_sls_dt,
					OLD.cur_cd,
					OLD.amt,
					OLD.qty,
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
		INSERT INTO mst_zoho_sls_schd_all_r (
			hst_id,
			hst_type,
			zoho_sls_schd_no,
			co_cd,
			deal_cd,
			deal_nm,
			cst_cd,
			dlv_cd,
			bcst_cd,
			sls_dpt_cd,
			sls_usr_cd,
			prod_itm_cd,
			prod_itm_sub1,
			prod_itm_sub2,
			prod_itm_sub3,
			mrkt_cd,
			dlv_nm,
			dlv_addr1,
			dlv_addr2,
			dlv_tel,
			ord_dlv_dt,
			post_inst_sls_dt,
			cur_cd,
			amt,
			qty,
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
				NEW.zoho_sls_schd_no,
				NEW.co_cd,
				NEW.deal_cd,
				NEW.deal_nm,
				NEW.cst_cd,
				NEW.dlv_cd,
				NEW.bcst_cd,
				NEW.sls_dpt_cd,
				NEW.sls_usr_cd,
				NEW.prod_itm_cd,
				NEW.prod_itm_sub1,
				NEW.prod_itm_sub2,
				NEW.prod_itm_sub3,
				NEW.mrkt_cd,
				NEW.dlv_nm,
				NEW.dlv_addr1,
				NEW.dlv_addr2,
				NEW.dlv_tel,
				NEW.ord_dlv_dt,
				NEW.post_inst_sls_dt,
				NEW.cur_cd,
				NEW.amt,
				NEW.qty,
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
		INSERT INTO mst_zoho_sls_schd_all_r (
			hst_id,
			hst_type,
			zoho_sls_schd_no,
			co_cd,
			deal_cd,
			deal_nm,
			cst_cd,
			dlv_cd,
			bcst_cd,
			sls_dpt_cd,
			sls_usr_cd,
			prod_itm_cd,
			prod_itm_sub1,
			prod_itm_sub2,
			prod_itm_sub3,
			mrkt_cd,
			dlv_nm,
			dlv_addr1,
			dlv_addr2,
			dlv_tel,
			ord_dlv_dt,
			post_inst_sls_dt,
			cur_cd,
			amt,
			qty,
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
				OLD.zoho_sls_schd_no,
				OLD.co_cd,
				OLD.deal_cd,
				OLD.deal_nm,
				OLD.cst_cd,
				OLD.dlv_cd,
				OLD.bcst_cd,
				OLD.sls_dpt_cd,
				OLD.sls_usr_cd,
				OLD.prod_itm_cd,
				OLD.prod_itm_sub1,
				OLD.prod_itm_sub2,
				OLD.prod_itm_sub3,
				OLD.mrkt_cd,
				OLD.dlv_nm,
				OLD.dlv_addr1,
				OLD.dlv_addr2,
				OLD.dlv_tel,
				OLD.ord_dlv_dt,
				OLD.post_inst_sls_dt,
				OLD.cur_cd,
				OLD.amt,
				OLD.qty,
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

CREATE TRIGGER mst_zoho_sls_schd_all_tr_r
AFTER INSERT OR DELETE OR UPDATE ON mst_zoho_sls_schd_all
FOR EACH ROW
EXECUTE FUNCTION mst_zoho_sls_schd_all_tr_r_body();
ALTER TABLE mst_zoho_sls_schd_all DISABLE TRIGGER mst_zoho_sls_schd_all_tr_r;

