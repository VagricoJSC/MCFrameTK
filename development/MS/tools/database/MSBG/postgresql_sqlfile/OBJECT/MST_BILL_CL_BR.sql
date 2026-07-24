\encoding UTF-8

CREATE OR REPLACE VIEW mst_bill_cl_br(
	batch_data_no,
	bcst_cd,
	bill_dpt_cd,
	iv_no,
	trd_cur_cd,
	wrk_no,
	bill_cl_dt,
	exe_sts_typ,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
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
	mst_bill_cl_br_mst_bill_cl_br_all_org.batch_data_no,
	mst_bill_cl_br_mst_bill_cl_br_all_org.bcst_cd,
	mst_bill_cl_br_mst_bill_cl_br_all_org.bill_dpt_cd,
	mst_bill_cl_br_mst_bill_cl_br_all_org.iv_no,
	mst_bill_cl_br_mst_bill_cl_br_all_org.trd_cur_cd,
	mst_bill_cl_br_mst_bill_cl_br_all_org.wrk_no,
	mst_bill_cl_br_mst_bill_cl_br_all_org.bill_cl_dt,
	mst_bill_cl_br_mst_bill_cl_br_all_org.exe_sts_typ,
	mst_bill_cl_br_mst_bill_cl_br_all_org.batch_log_no,
	mst_bill_cl_br_mst_bill_cl_br_all_org.log_sub_key1,
	mst_bill_cl_br_mst_bill_cl_br_all_org.log_sub_key2,
	mst_bill_cl_br_mst_bill_cl_br_all_org.ins_usr_id,
	mst_bill_cl_br_mst_bill_cl_br_all_org.ins_usr_nm,
	mst_bill_cl_br_mst_bill_cl_br_all_org.ins_ts,
	mst_bill_cl_br_mst_bill_cl_br_all_org.ins_func_id,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_cntr,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_usr_id,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_usr_nm,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_ts,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_func_id,
	mst_bill_cl_br_mst_bill_cl_br_all_org.upd_srv_req_no
FROM
	mst_bill_cl_br_all mst_bill_cl_br_mst_bill_cl_br_all_org
WHERE
	0 = 0
	AND mst_bill_cl_br_mst_bill_cl_br_all_org.co_cd = (SELECT co_cd FROM fct_context mst_bill_cl_br_fct_context WHERE pid = pg_backend_pid())
;

