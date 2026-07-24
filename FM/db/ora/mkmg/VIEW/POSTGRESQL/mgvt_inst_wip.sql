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
;
