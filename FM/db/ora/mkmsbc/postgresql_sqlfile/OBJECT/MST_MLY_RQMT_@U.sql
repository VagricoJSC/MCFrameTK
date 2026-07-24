\encoding UTF-8

CREATE OR REPLACE VIEW mst_mly_rqmt_$u(
	ym,
	prod_ym,
	mps_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	strg_loc_cd,
	mfg_loc_cd,
	sppl_cd,
	rqst_loc_cd,
	qty,
	wg_cd,
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
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.ym,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.prod_ym,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.mps_grp_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.itm_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.itm_sub1,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.itm_sub2,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.itm_sub3,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.strg_loc_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.mfg_loc_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.sppl_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.rqst_loc_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.qty,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.wg_cd,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.intr_rmrks,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.sub_char1,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.sub_char2,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.sub_char3,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.ins_usr_id,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.ins_usr_nm,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.ins_ts,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.ins_func_id,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_cntr,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_usr_id,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_usr_nm,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_ts,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_func_id,
	mst_mly_rqmt_$u_mst_mly_rqmt_all_org.upd_srv_req_no
FROM
	mst_mly_rqmt_all mst_mly_rqmt_$u_mst_mly_rqmt_all_org
WHERE
	0 = 0
	AND mst_mly_rqmt_$u_mst_mly_rqmt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

