\encoding UTF-8

CREATE OR REPLACE VIEW mst_xfr_inst_d(
	xfr_inst_d_no,
	xfr_inst_no,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	base_dlv_slip_no,
	base_prov_act_no,
	base_ac_dt,
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
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.xfr_inst_d_no,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.xfr_inst_no,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.itm_cd,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.itm_sub1,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.itm_sub2,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.itm_sub3,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.base_dlv_slip_no,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.base_prov_act_no,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.base_ac_dt,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.ins_usr_id,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.ins_usr_nm,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.ins_ts,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.ins_func_id,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_cntr,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_usr_id,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_usr_nm,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_ts,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_func_id,
	mst_xfr_inst_d_mst_xfr_inst_d_all_org.upd_srv_req_no
FROM
	mst_xfr_inst_d_all mst_xfr_inst_d_mst_xfr_inst_d_all_org
WHERE
	0 = 0
	AND mst_xfr_inst_d_mst_xfr_inst_d_all_org.co_cd = (SELECT co_cd FROM fct_context mst_xfr_inst_d_fct_context WHERE pid = pg_backend_pid())
;

