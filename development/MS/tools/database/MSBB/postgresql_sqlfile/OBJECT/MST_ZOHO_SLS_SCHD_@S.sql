\encoding UTF-8

CREATE OR REPLACE VIEW mst_zoho_sls_schd_$s(
	zoho_sls_schd_no,
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
AS
SELECT
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.zoho_sls_schd_no,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.deal_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.deal_nm,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.cst_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.dlv_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.bcst_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.sls_dpt_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.sls_usr_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.prod_itm_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.prod_itm_sub1,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.prod_itm_sub2,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.prod_itm_sub3,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.mrkt_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.dlv_nm,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.dlv_addr1,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.dlv_addr2,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.dlv_tel,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.ord_dlv_dt,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.post_inst_sls_dt,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.cur_cd,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.amt,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.qty,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.ins_usr_id,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.ins_usr_nm,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.ins_ts,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.ins_func_id,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_cntr,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_usr_id,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_usr_nm,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_ts,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_func_id,
	mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.upd_srv_req_no
FROM
	mst_zoho_sls_schd_all mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org
WHERE
	0 = 0
	AND mst_zoho_sls_schd_$s_mst_zoho_sls_schd_all_org.co_cd = (SELECT co_cd FROM fct_context mst_zoho_sls_schd_$s_fct_context WHERE pid = pg_backend_pid())
;

