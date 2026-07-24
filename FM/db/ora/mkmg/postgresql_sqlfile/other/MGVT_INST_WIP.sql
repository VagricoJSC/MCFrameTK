\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_inst_wip(
wg_cd,
ym,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
itm_ext,
itm_mfg_inst_no,
mfg_act_no,
oper_act_no,
oper_cd,
oper_seq,
loc_cd,
str_ln_cd,
ac_rsn_cd,
wip_qty,
wip_per
)
AS
SELECT	mgvt_inst_wip_mgt_calc_inst_wip_t1.wg_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.ym,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_sub1,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_sub2,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_sub3,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_ext,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.itm_mfg_inst_no,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.mfg_act_no,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.oper_act_no,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.oper_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.oper_seq,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.loc_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.str_ln_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.ac_rsn_cd,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.wip_qty,
	mgvt_inst_wip_mgt_calc_inst_wip_t1.wip_per
FROM	mgw_arg mgvt_inst_wip_mgw_arg_w1, mgt_calc_inst_wip mgvt_inst_wip_mgt_calc_inst_wip_t1
WHERE	0=0
AND	mgvt_inst_wip_mgw_arg_w1.calc_no = mgvt_inst_wip_mgt_calc_inst_wip_t1.calc_no
AND	mgvt_inst_wip_mgw_arg_w1.calc_grp_cd = mgvt_inst_wip_mgt_calc_inst_wip_t1.calc_grp_cd
;;

