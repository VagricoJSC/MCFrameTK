\encoding UTF-8

CREATE OR REPLACE VIEW mst_mly_ar_bal_lock(
	acst_cd,
	ar_dpt_cd,
	trd_cur_cd,
	iv_no,
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
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.acst_cd,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.ar_dpt_cd,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.trd_cur_cd,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.iv_no,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.wrk_no,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.ins_usr_id,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.ins_usr_nm,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.ins_ts,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.ins_func_id,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_cntr,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_usr_id,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_usr_nm,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_ts,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_func_id,
	mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.upd_srv_req_no
FROM
	mst_mly_ar_bal_lock_all mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org
WHERE
	0 = 0
	AND mst_mly_ar_bal_lock_mst_mly_ar_bal_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_mly_ar_bal_lock_fct_context WHERE pid = pg_backend_pid())
;

