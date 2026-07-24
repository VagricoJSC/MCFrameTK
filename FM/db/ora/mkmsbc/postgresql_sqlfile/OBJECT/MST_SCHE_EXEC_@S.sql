\encoding UTF-8

CREATE OR REPLACE VIEW mst_sche_exec_$s(
	wg_cd,
	exec_flg,
	from_dt,
	to_dt,
	master_dt,
	intr_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
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
	mst_sche_exec_$s_mst_sche_exec_all_org.wg_cd,
	mst_sche_exec_$s_mst_sche_exec_all_org.exec_flg,
	mst_sche_exec_$s_mst_sche_exec_all_org.from_dt,
	mst_sche_exec_$s_mst_sche_exec_all_org.to_dt,
	mst_sche_exec_$s_mst_sche_exec_all_org.master_dt,
	mst_sche_exec_$s_mst_sche_exec_all_org.intr_rmrks,
	mst_sche_exec_$s_mst_sche_exec_all_org.sub_char1,
	mst_sche_exec_$s_mst_sche_exec_all_org.sub_char2,
	mst_sche_exec_$s_mst_sche_exec_all_org.sub_char3,
	mst_sche_exec_$s_mst_sche_exec_all_org.ins_usr_id,
	mst_sche_exec_$s_mst_sche_exec_all_org.ins_usr_nm,
	mst_sche_exec_$s_mst_sche_exec_all_org.ins_ts,
	mst_sche_exec_$s_mst_sche_exec_all_org.ins_func_id,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_cntr,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_usr_id,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_usr_nm,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_ts,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_func_id,
	mst_sche_exec_$s_mst_sche_exec_all_org.upd_srv_req_no
FROM
	mst_sche_exec_all mst_sche_exec_$s_mst_sche_exec_all_org
WHERE
	0 = 0
	AND mst_sche_exec_$s_mst_sche_exec_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sche_exec_$s_fct_context WHERE pid = pg_backend_pid())
;

