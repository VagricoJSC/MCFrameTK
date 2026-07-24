\encoding UTF-8

CREATE OR REPLACE VIEW mst_sche_ord_exec_$u(
	itm_ord_no,
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
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.itm_ord_no,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.wg_cd,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.ins_usr_id,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.ins_usr_nm,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.ins_ts,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.ins_func_id,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_cntr,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_usr_id,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_usr_nm,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_ts,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_func_id,
	mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.upd_srv_req_no
FROM
	mst_sche_ord_exec_all mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org
WHERE
	0 = 0
	AND mst_sche_ord_exec_$u_mst_sche_ord_exec_all_org.co_cd = fcpa_context$f_get_co_cd()
;

