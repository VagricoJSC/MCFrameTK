\encoding UTF-8

CREATE OR REPLACE VIEW mst_cst_frcst_lock_$u(
	cst_cd,
	dlv_cd,
	frcst_dpt_cd,
	wrk_no,
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
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.cst_cd,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.dlv_cd,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.frcst_dpt_cd,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.wrk_no,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.ins_usr_id,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.ins_usr_nm,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.ins_ts,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.ins_func_id,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_cntr,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_usr_id,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_usr_nm,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_ts,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_func_id,
	mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.upd_srv_req_no
FROM
	mst_cst_frcst_lock_all mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org
WHERE
	0 = 0
	AND mst_cst_frcst_lock_$u_mst_cst_frcst_lock_all_org.co_cd = fcpa_context$f_get_co_cd()
;

