\encoding UTF-8

DO $$
BEGIN
CREATE OR REPLACE VIEW mgvt_mst_mly_wip
AS
SELECT
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.ym,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_mfg_inst_no,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.mfg_act_no,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_ord_no,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_cd,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_sub1,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_sub2,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.itm_sub3,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.loc_cd,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.str_ln_cd,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.asst_typ,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.in_xfr_typ,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.quality_typ,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.stk_insp_typ,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.stk_id_typ,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.gd_cd,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.lot_no,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sublot_no,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sno1,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sno2,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sno3,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sno4,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.st_ac_dt,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.base_unit_schd_qty,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.base_unit_act_qty,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.end_ac_dt,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.base_unit_cd,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.base_unit_wip_qty,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.wip_rate,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.cmpl_flg,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.closing_flg,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sub_char1,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sub_char2,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.sub_char3,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.ins_usr_id,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.ins_usr_nm,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.ins_ts,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.ins_func_id,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_cntr,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_usr_id,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_usr_nm,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_ts,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_func_id,
	mgvt_mst_mly_wip_org_mst_mly_wip_t1.upd_srv_req_no
FROM 
	mst_mly_wip mgvt_mst_mly_wip_org_mst_mly_wip_t1
;
EXCEPTION WHEN OTHERS THEN
	null;
END
$$
;


