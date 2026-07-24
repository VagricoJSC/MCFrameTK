\encoding UTF-8

CREATE OR REPLACE VIEW mst_wrk_$u(
	wrk_no,
	wrk_nm,
	st_dt,
	end_dt,
	wrk_desc,
	term_cond,
	prj_no,
	wrk_sts_cd,
	slo_acc_cd,
	cur_cd,
	budget,
	slo_rsn,
	fail_rsn,
	wrk_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	wrk_ar_flg,
	wrk_ap_flg,
	can_flg,
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
	mst_wrk_$u_mst_wrk_all_org.wrk_no,
	mst_wrk_$u_mst_wrk_all_org.wrk_nm,
	mst_wrk_$u_mst_wrk_all_org.st_dt,
	mst_wrk_$u_mst_wrk_all_org.end_dt,
	mst_wrk_$u_mst_wrk_all_org.wrk_desc,
	mst_wrk_$u_mst_wrk_all_org.term_cond,
	mst_wrk_$u_mst_wrk_all_org.prj_no,
	mst_wrk_$u_mst_wrk_all_org.wrk_sts_cd,
	mst_wrk_$u_mst_wrk_all_org.slo_acc_cd,
	mst_wrk_$u_mst_wrk_all_org.cur_cd,
	mst_wrk_$u_mst_wrk_all_org.budget,
	mst_wrk_$u_mst_wrk_all_org.slo_rsn,
	mst_wrk_$u_mst_wrk_all_org.fail_rsn,
	mst_wrk_$u_mst_wrk_all_org.wrk_rmrks,
	mst_wrk_$u_mst_wrk_all_org.sub_char1,
	mst_wrk_$u_mst_wrk_all_org.sub_char2,
	mst_wrk_$u_mst_wrk_all_org.sub_char3,
	mst_wrk_$u_mst_wrk_all_org.wrk_ar_flg,
	mst_wrk_$u_mst_wrk_all_org.wrk_ap_flg,
	mst_wrk_$u_mst_wrk_all_org.can_flg,
	mst_wrk_$u_mst_wrk_all_org.ins_usr_id,
	mst_wrk_$u_mst_wrk_all_org.ins_usr_nm,
	mst_wrk_$u_mst_wrk_all_org.ins_ts,
	mst_wrk_$u_mst_wrk_all_org.ins_func_id,
	mst_wrk_$u_mst_wrk_all_org.upd_cntr,
	mst_wrk_$u_mst_wrk_all_org.upd_usr_id,
	mst_wrk_$u_mst_wrk_all_org.upd_usr_nm,
	mst_wrk_$u_mst_wrk_all_org.upd_ts,
	mst_wrk_$u_mst_wrk_all_org.upd_func_id,
	mst_wrk_$u_mst_wrk_all_org.upd_srv_req_no
FROM
	mst_wrk_all mst_wrk_$u_mst_wrk_all_org
WHERE
	0 = 0
	AND mst_wrk_$u_mst_wrk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

