\encoding UTF-8

CREATE OR REPLACE VIEW mst_po_reg_br_$u(
	batch_data_no,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
	exe_sts_typ,
	po_schd_no,
	wg_cd,
	sppl_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_nm,
	po_schd_dt,
	dlv_rqst_tm,
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
	mst_po_reg_br_$u_mst_po_reg_br_all_org.batch_data_no,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.batch_log_no,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.log_sub_key1,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.log_sub_key2,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.exe_sts_typ,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.po_schd_no,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.wg_cd,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.sppl_cd,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.itm_cd,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.itm_sub1,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.itm_sub2,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.itm_sub3,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.itm_nm,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.po_schd_dt,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.dlv_rqst_tm,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.ins_usr_id,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.ins_usr_nm,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.ins_ts,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.ins_func_id,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_cntr,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_usr_id,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_usr_nm,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_ts,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_func_id,
	mst_po_reg_br_$u_mst_po_reg_br_all_org.upd_srv_req_no
FROM
	mst_po_reg_br_all mst_po_reg_br_$u_mst_po_reg_br_all_org
WHERE
	0 = 0
	AND mst_po_reg_br_$u_mst_po_reg_br_all_org.co_cd = fcpa_context$f_get_co_cd()
;

