\encoding UTF-8

CREATE OR REPLACE VIEW mst_ap_pre_close_$s(
	ym,
	asppl_cd,
	pre_cl_tm,
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
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.ym,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.asppl_cd,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.pre_cl_tm,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.sub_char1,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.sub_char2,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.sub_char3,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.ins_usr_id,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.ins_usr_nm,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.ins_ts,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.ins_func_id,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_cntr,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_usr_id,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_usr_nm,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_ts,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_func_id,
	mst_ap_pre_close_$s_mst_ap_pre_close_all_org.upd_srv_req_no
FROM
	mst_ap_pre_close_all mst_ap_pre_close_$s_mst_ap_pre_close_all_org
WHERE
	0 = 0
	AND mst_ap_pre_close_$s_mst_ap_pre_close_all_org.co_cd = (SELECT co_cd FROM fct_context mst_ap_pre_close_$s_fct_context WHERE pid = pg_backend_pid())
;

