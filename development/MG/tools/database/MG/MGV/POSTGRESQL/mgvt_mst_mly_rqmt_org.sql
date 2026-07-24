DO $$
BEGIN
CREATE OR REPLACE VIEW mgvt_mst_mly_rqmt
AS
SELECT
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.ym,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.prod_ym,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.mps_grp_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.itm_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.itm_sub1,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.itm_sub2,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.itm_sub3,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.strg_loc_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.mfg_loc_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.sppl_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.rqst_loc_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.qty,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.wg_cd,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.intr_rmrks,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.sub_char1,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.sub_char2,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.sub_char3,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.ins_usr_id,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.ins_usr_nm,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.ins_ts,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.ins_func_id,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_cntr,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_usr_id,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_usr_nm,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_ts,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_func_id,
	mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1.upd_srv_req_no
FROM 
	mst_mly_rqmt mgvt_mst_mly_rqmt_org_mst_mly_rqmt_t1
;
EXCEPTION WHEN OTHERS THEN
	null;
END
$$
;
