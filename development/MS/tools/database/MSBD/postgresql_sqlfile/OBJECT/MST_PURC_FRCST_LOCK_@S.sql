\encoding UTF-8

CREATE OR REPLACE VIEW mst_purc_frcst_lock_$s(
	sppl_cd,
	wg_cd,
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
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.sppl_cd,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.wg_cd,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.ins_usr_id,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.ins_usr_nm,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.ins_ts,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.ins_func_id,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_cntr,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_usr_id,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_usr_nm,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_ts,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_func_id,
	mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.upd_srv_req_no
FROM
	mst_purc_frcst_lock_all mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org
WHERE
	0 = 0
	AND mst_purc_frcst_lock_$s_mst_purc_frcst_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_purc_frcst_lock_$s_fct_context WHERE pid = pg_backend_pid())
;

