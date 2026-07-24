\encoding UTF-8

CREATE OR REPLACE VIEW mst_cst_frcst_h_$u(
	cst_frcst_no,
	cst_cd,
	dlv_cd,
	cst_frcst_prnt_dt,
	cst_frcst_slip_no,
	frcst_dpt_cd,
	frcst_usr_cd,
	wrk_no,
	rcpt_dt,
	can_rsn_cd,
	can_flg,
	can_rmrks,
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
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.cst_frcst_no,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.cst_cd,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.dlv_cd,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.cst_frcst_prnt_dt,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.cst_frcst_slip_no,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.frcst_dpt_cd,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.frcst_usr_cd,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.wrk_no,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.rcpt_dt,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.can_rsn_cd,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.can_flg,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.can_rmrks,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.intr_rmrks,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.sub_char1,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.sub_char2,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.sub_char3,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.ins_usr_id,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.ins_usr_nm,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.ins_ts,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.ins_func_id,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_cntr,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_usr_id,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_usr_nm,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_ts,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_func_id,
	mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.upd_srv_req_no
FROM
	mst_cst_frcst_h_all mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org
WHERE
	0 = 0
	AND mst_cst_frcst_h_$u_mst_cst_frcst_h_all_org.co_cd = fcpa_context$f_get_co_cd()
;

