\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_itm_mfg_inst(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
itm_ext,
itm_mfg_inst_no,
mfg_act_no,
wg_cd,
mng_dpt_cd,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
sppl_cd,
po_no,
slo_no,
iv_no,
asst_typ,
qty
)
AS
SELECT	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_cd,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_sub1,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_sub2,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_sub3,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_ext,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.itm_mfg_inst_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.mfg_act_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.wg_cd,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.mng_dpt_cd,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.lot_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sublot_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sno1,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sno2,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sno3,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sno4,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.sppl_cd,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.po_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.slo_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.iv_no,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.asst_typ,
	mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.qty
FROM	mgw_arg mgvt_itm_mfg_inst_mgw_arg_w1, mgt_calc_itm_mfg_inst mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1
WHERE	0=0
AND	mgvt_itm_mfg_inst_mgw_arg_w1.calc_no = mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.calc_no
AND	mgvt_itm_mfg_inst_mgw_arg_w1.calc_grp_cd = mgvt_itm_mfg_inst_mgt_calc_itm_mfg_inst_t1.calc_grp_cd
;;

