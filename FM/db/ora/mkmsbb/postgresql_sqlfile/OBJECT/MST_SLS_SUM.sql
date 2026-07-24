\encoding UTF-8

CREATE OR REPLACE VIEW mst_sls_sum(
	ym,
	sls_dpt_cd,
	sls_usr_cd,
	cst_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	cur_cd,
	wrk_no,
	base_unit_sls_qty,
	trd_cur_sls_amt,
	base_cur_sls_amt,
	cost_amt,
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
	mst_sls_sum_mst_sls_sum_all_org.ym,
	mst_sls_sum_mst_sls_sum_all_org.sls_dpt_cd,
	mst_sls_sum_mst_sls_sum_all_org.sls_usr_cd,
	mst_sls_sum_mst_sls_sum_all_org.cst_cd,
	mst_sls_sum_mst_sls_sum_all_org.itm_cd,
	mst_sls_sum_mst_sls_sum_all_org.itm_sub1,
	mst_sls_sum_mst_sls_sum_all_org.itm_sub2,
	mst_sls_sum_mst_sls_sum_all_org.itm_sub3,
	mst_sls_sum_mst_sls_sum_all_org.cur_cd,
	mst_sls_sum_mst_sls_sum_all_org.wrk_no,
	mst_sls_sum_mst_sls_sum_all_org.base_unit_sls_qty,
	mst_sls_sum_mst_sls_sum_all_org.trd_cur_sls_amt,
	mst_sls_sum_mst_sls_sum_all_org.base_cur_sls_amt,
	mst_sls_sum_mst_sls_sum_all_org.cost_amt,
	mst_sls_sum_mst_sls_sum_all_org.ins_usr_id,
	mst_sls_sum_mst_sls_sum_all_org.ins_usr_nm,
	mst_sls_sum_mst_sls_sum_all_org.ins_ts,
	mst_sls_sum_mst_sls_sum_all_org.ins_func_id,
	mst_sls_sum_mst_sls_sum_all_org.upd_cntr,
	mst_sls_sum_mst_sls_sum_all_org.upd_usr_id,
	mst_sls_sum_mst_sls_sum_all_org.upd_usr_nm,
	mst_sls_sum_mst_sls_sum_all_org.upd_ts,
	mst_sls_sum_mst_sls_sum_all_org.upd_func_id,
	mst_sls_sum_mst_sls_sum_all_org.upd_srv_req_no
FROM
	mst_sls_sum_all mst_sls_sum_mst_sls_sum_all_org
WHERE
	0 = 0
	AND mst_sls_sum_mst_sls_sum_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sls_sum_fct_context WHERE pid = pg_backend_pid())
;

