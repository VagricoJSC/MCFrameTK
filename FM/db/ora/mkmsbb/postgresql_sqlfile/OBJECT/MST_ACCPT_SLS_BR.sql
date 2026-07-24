\encoding UTF-8

CREATE OR REPLACE VIEW mst_accpt_sls_br(
	batch_data_no,
	batch_log_no,
	log_sub_key1,
	log_sub_key2,
	exe_sts_typ,
	sls_schd_no,
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
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.batch_data_no,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.batch_log_no,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.log_sub_key1,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.log_sub_key2,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.exe_sts_typ,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.sls_schd_no,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.ins_usr_id,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.ins_usr_nm,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.ins_ts,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.ins_func_id,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_cntr,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_usr_id,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_usr_nm,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_ts,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_func_id,
	mst_accpt_sls_br_mst_accpt_sls_br_all_org.upd_srv_req_no
FROM
	mst_accpt_sls_br_all mst_accpt_sls_br_mst_accpt_sls_br_all_org
WHERE
	0 = 0
	AND mst_accpt_sls_br_mst_accpt_sls_br_all_org.co_cd = (SELECT co_cd FROM fct_context mst_accpt_sls_br_fct_context WHERE pid = pg_backend_pid())
;

