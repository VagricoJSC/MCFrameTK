\encoding UTF-8

CREATE OR REPLACE VIEW mst_alloc_lock_$s(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
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
	mst_alloc_lock_$s_mst_alloc_lock_all_org.itm_cd,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.itm_sub1,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.itm_sub2,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.itm_sub3,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.loc_cd,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.ins_usr_id,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.ins_usr_nm,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.ins_ts,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.ins_func_id,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_cntr,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_usr_id,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_usr_nm,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_ts,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_func_id,
	mst_alloc_lock_$s_mst_alloc_lock_all_org.upd_srv_req_no
FROM
	mst_alloc_lock_all mst_alloc_lock_$s_mst_alloc_lock_all_org
WHERE
	0 = 0
	AND mst_alloc_lock_$s_mst_alloc_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_alloc_lock_$s_fct_context WHERE pid = pg_backend_pid())
;

