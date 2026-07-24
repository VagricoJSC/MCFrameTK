\encoding UTF-8

CREATE OR REPLACE VIEW mst_sim_prms_rslt_$u(
	wg_cd,
	wg_rqst_no,
	slo_d_no,
	sim_alloc_pln_typ,
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
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.wg_cd,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.wg_rqst_no,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.slo_d_no,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.sim_alloc_pln_typ,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.sub_char1,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.sub_char2,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.sub_char3,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.ins_usr_id,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.ins_usr_nm,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.ins_ts,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.ins_func_id,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_cntr,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_usr_id,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_usr_nm,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_ts,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_func_id,
	mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.upd_srv_req_no
FROM
	mst_sim_prms_rslt_all mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org
WHERE
	0 = 0
	AND mst_sim_prms_rslt_$u_mst_sim_prms_rslt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

