\encoding UTF-8

CREATE OR REPLACE VIEW mst_ar_xrate_rev_his_$u(
	ar_xrate_rev_his_no,
	ac_ym,
	acst_cd,
	ar_dpt_cd,
	trd_cur_cd,
	iv_no,
	wrk_no,
	ar_typ,
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
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ar_xrate_rev_his_no,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ac_ym,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.acst_cd,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ar_dpt_cd,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.trd_cur_cd,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.iv_no,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.wrk_no,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ar_typ,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.xrate_cd,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.new_xrate,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.old_xrate,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.base_cur_cd,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.exe_dt,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ac_dt,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.sub_char1,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.sub_char2,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.sub_char3,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ins_usr_id,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ins_usr_nm,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ins_ts,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.ins_func_id,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_cntr,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_usr_id,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_usr_nm,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_ts,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_func_id,
	mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.upd_srv_req_no
FROM
	mst_ar_xrate_rev_his_all mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org
WHERE
	0 = 0
	AND mst_ar_xrate_rev_his_$u_mst_ar_xrate_rev_his_all_org.co_cd = fcpa_context$f_get_co_cd()
;

