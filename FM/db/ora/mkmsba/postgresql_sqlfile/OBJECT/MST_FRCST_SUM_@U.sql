\encoding UTF-8

CREATE OR REPLACE VIEW mst_frcst_sum_$u(
	sls_dpt_cd,
	sls_usr_cd,
	cst_cd,
	wrk_no,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	ym,
	cst_frcst_qty,
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
	mst_frcst_sum_$u_mst_frcst_sum_all_org.sls_dpt_cd,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.sls_usr_cd,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.cst_cd,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.wrk_no,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.itm_cd,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.itm_sub1,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.itm_sub2,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.itm_sub3,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.ym,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.cst_frcst_qty,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.ins_usr_id,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.ins_usr_nm,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.ins_ts,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.ins_func_id,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_cntr,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_usr_id,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_usr_nm,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_ts,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_func_id,
	mst_frcst_sum_$u_mst_frcst_sum_all_org.upd_srv_req_no
FROM
	mst_frcst_sum_all mst_frcst_sum_$u_mst_frcst_sum_all_org
WHERE
	0 = 0
	AND mst_frcst_sum_$u_mst_frcst_sum_all_org.co_cd = fcpa_context$f_get_co_cd()
;

