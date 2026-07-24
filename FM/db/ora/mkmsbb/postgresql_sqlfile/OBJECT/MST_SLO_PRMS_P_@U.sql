\encoding UTF-8

CREATE OR REPLACE VIEW mst_slo_prms_p_$u(
	slo_prms_no,
	slo_prms_rev,
	slo_no,
	slo_d_no,
	slo_prms_h_no,
	dlv_inst_rcpt_no,
	prms_dlv_tm,
	trd_unit_prms_qty,
	base_unit_prms_qty,
	can_flg,
	prms_rmrks,
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
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.slo_prms_no,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.slo_prms_rev,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.slo_no,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.slo_d_no,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.slo_prms_h_no,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.dlv_inst_rcpt_no,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.prms_dlv_tm,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.trd_unit_prms_qty,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.base_unit_prms_qty,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.can_flg,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.prms_rmrks,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.intr_rmrks,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.sub_char1,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.sub_char2,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.sub_char3,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.ins_usr_id,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.ins_usr_nm,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.ins_ts,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.ins_func_id,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_cntr,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_usr_id,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_usr_nm,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_ts,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_func_id,
	mst_slo_prms_p_$u_mst_slo_prms_p_all_org.upd_srv_req_no
FROM
	mst_slo_prms_p_all mst_slo_prms_p_$u_mst_slo_prms_p_all_org
WHERE
	0 = 0
	AND mst_slo_prms_p_$u_mst_slo_prms_p_all_org.co_cd = fcpa_context$f_get_co_cd()
;

