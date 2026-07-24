\encoding UTF-8

CREATE OR REPLACE VIEW mst_ap_xrate_rev_his_$u(
	ap_xrate_rev_his_no,
	ac_ym,
	asppl_cd,
	ap_dpt_cd,
	trd_cur_cd,
	purc_act_no,
	rcpt_iv_mng_no,
	wrk_no,
	ap_typ,
	xrate_cd,
	new_xrate,
	old_xrate,
	base_cur_cd,
	exe_dt,
	ac_dt,
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
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ap_xrate_rev_his_no,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ac_ym,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.asppl_cd,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ap_dpt_cd,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.trd_cur_cd,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.purc_act_no,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.rcpt_iv_mng_no,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.wrk_no,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ap_typ,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.xrate_cd,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.new_xrate,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.old_xrate,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.base_cur_cd,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.exe_dt,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ac_dt,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.sub_char1,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.sub_char2,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.sub_char3,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ins_usr_id,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ins_usr_nm,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ins_ts,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.ins_func_id,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_cntr,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_usr_id,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_usr_nm,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_ts,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_func_id,
	mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.upd_srv_req_no
FROM
	mst_ap_xrate_rev_his_all mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org
WHERE
	0 = 0
	AND mst_ap_xrate_rev_his_$u_mst_ap_xrate_rev_his_all_org.co_cd = fcpa_context$f_get_co_cd()
;

