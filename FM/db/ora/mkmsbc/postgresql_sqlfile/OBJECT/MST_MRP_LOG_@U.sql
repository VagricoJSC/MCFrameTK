\encoding UTF-8

CREATE OR REPLACE VIEW mst_mrp_log_$u(
	wg_cd,
	mrp_calc_no,
	seq_no,
	mrp_typ,
	log_time,
	msg_id,
	msg,
	gp_batch_grp_cd,
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
	mst_mrp_log_$u_mst_mrp_log_all_org.wg_cd,
	mst_mrp_log_$u_mst_mrp_log_all_org.mrp_calc_no,
	mst_mrp_log_$u_mst_mrp_log_all_org.seq_no,
	mst_mrp_log_$u_mst_mrp_log_all_org.mrp_typ,
	mst_mrp_log_$u_mst_mrp_log_all_org.log_time,
	mst_mrp_log_$u_mst_mrp_log_all_org.msg_id,
	mst_mrp_log_$u_mst_mrp_log_all_org.msg,
	mst_mrp_log_$u_mst_mrp_log_all_org.gp_batch_grp_cd,
	mst_mrp_log_$u_mst_mrp_log_all_org.sub_char1,
	mst_mrp_log_$u_mst_mrp_log_all_org.sub_char2,
	mst_mrp_log_$u_mst_mrp_log_all_org.sub_char3,
	mst_mrp_log_$u_mst_mrp_log_all_org.ins_usr_id,
	mst_mrp_log_$u_mst_mrp_log_all_org.ins_usr_nm,
	mst_mrp_log_$u_mst_mrp_log_all_org.ins_ts,
	mst_mrp_log_$u_mst_mrp_log_all_org.ins_func_id,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_cntr,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_usr_id,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_usr_nm,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_ts,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_func_id,
	mst_mrp_log_$u_mst_mrp_log_all_org.upd_srv_req_no
FROM
	mst_mrp_log_all mst_mrp_log_$u_mst_mrp_log_all_org
WHERE
	0 = 0
	AND mst_mrp_log_$u_mst_mrp_log_all_org.co_cd = fcpa_context$f_get_co_cd()
;

