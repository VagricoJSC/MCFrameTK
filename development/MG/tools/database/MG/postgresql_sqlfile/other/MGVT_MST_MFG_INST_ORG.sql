\encoding UTF-8

DO $$
BEGIN
CREATE OR REPLACE VIEW mgvt_mst_mfg_inst
AS
SELECT
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.mfg_inst_no,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.mfg_inst_rev,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.itm_mfg_inst_no,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.po_d_no,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.base_unit_yield_qty,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.base_unit_inst_qty,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.base_unit_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.st_schd_tm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.end_schd_tm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.rqst_dlv_rqst_tm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_dt,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_prnt_tm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_prnt_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.mfg_aprv_sts_typ,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_dt,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_dpt_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_usr_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_tm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.aprv_rsn,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.mfg_aprv_role_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.disp_pd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_dpt_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_usr_cd,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.can_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.abort_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.schd_chg_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.po_locked_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.po_auto_reg_flg,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.mfg_inst_unit_typ,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.intr_rmrks,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_rpt_rmrks,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.inst_po_cnt_rmrks,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.sub_char1,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.sub_char2,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.sub_char3,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.ins_usr_id,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.ins_usr_nm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.ins_ts,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.ins_func_id,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_cntr,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_usr_id,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_usr_nm,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_ts,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_func_id,
	mgvt_mst_mfg_inst_org_mst_mfg_inst_t1.upd_srv_req_no
FROM 
	mst_mfg_inst mgvt_mst_mfg_inst_org_mst_mfg_inst_t1
;
EXCEPTION WHEN OTHERS THEN
	null;
END
$$
;


