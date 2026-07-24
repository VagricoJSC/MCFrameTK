\encoding UTF-8

CREATE OR REPLACE VIEW mst_wrk_act_hist_$u(
	wrk_no,
	hist_no,
	act_sts_cd,
	act_hist,
	act_schd_dt,
	act_schd,
	act_act_dt,
	act_act,
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
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.wrk_no,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.hist_no,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_sts_cd,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_hist,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_schd_dt,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_schd,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_act_dt,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.act_act,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.sub_char1,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.sub_char2,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.sub_char3,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.ins_usr_id,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.ins_usr_nm,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.ins_ts,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.ins_func_id,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_cntr,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_usr_id,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_usr_nm,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_ts,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_func_id,
	mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.upd_srv_req_no
FROM
	mst_wrk_act_hist_all mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org
WHERE
	0 = 0
	AND mst_wrk_act_hist_$u_mst_wrk_act_hist_all_org.co_cd = fcpa_context$f_get_co_cd()
;

