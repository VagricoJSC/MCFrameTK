\encoding UTF-8

DO $$
BEGIN
CREATE OR REPLACE VIEW mgvt_mst_sim_mrp
AS
SELECT
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sim_mrp_no,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.wg_cd,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sim_mrp_typ,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sim_usr_cd,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.dly_rqmt_flg,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.stk_flg,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.gr_flg,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.gi_flg,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.ship_flg,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.tree_lvl,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.mrp_proc_dt,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.intr_rmrks,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sub_char1,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sub_char2,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.sub_char3,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.ins_usr_id,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.ins_usr_nm,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.ins_ts,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.ins_func_id,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_cntr,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_usr_id,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_usr_nm,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_ts,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_func_id,
	mgvt_mst_sim_mrp_org_mst_sim_mrp_t1.upd_srv_req_no
FROM 
	mst_sim_mrp mgvt_mst_sim_mrp_org_mst_sim_mrp_t1
;
EXCEPTION WHEN OTHERS THEN
	null;
END
$$
;


