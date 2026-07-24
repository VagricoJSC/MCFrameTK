\encoding UTF-8

CREATE OR REPLACE VIEW mst_rcpt_iv_map_$u(
	rcpt_iv_d_no,
	rcpt_iv_no,
	arr_schd_no,
	arr_act_no,
	trd_unit_qty,
	base_unit_qty,
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
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.rcpt_iv_d_no,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.rcpt_iv_no,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.arr_schd_no,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.arr_act_no,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.trd_unit_qty,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.base_unit_qty,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.ins_usr_id,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.ins_usr_nm,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.ins_ts,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.ins_func_id,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_cntr,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_usr_id,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_usr_nm,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_ts,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_func_id,
	mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.upd_srv_req_no
FROM
	mst_rcpt_iv_map_all mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org
WHERE
	0 = 0
	AND mst_rcpt_iv_map_$u_mst_rcpt_iv_map_all_org.co_cd = fcpa_context$f_get_co_cd()
;

