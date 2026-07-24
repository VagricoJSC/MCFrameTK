SELECT	mgvm_itm_oper_mgt_calc_itm_oper_t1.itm_cd,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.itm_sub1,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.itm_sub2,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.itm_sub3,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.loc_cd,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_ptn,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_cd,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_seq,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.wg_cd,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.disp_seq,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.nmr_qty,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.dnm_qty,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.yield_oper_flg,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_unit_cd,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_std_qty,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.oper_conv_qty,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.dec_place,
	mgvm_itm_oper_mgt_calc_itm_oper_t1.unit_conv_rnd_typ
FROM	mgw_arg mgvm_itm_oper_mgw_arg_w1, mgt_calc_itm_oper mgvm_itm_oper_mgt_calc_itm_oper_t1
WHERE	0=0
AND	mgvm_itm_oper_mgw_arg_w1.calc_no = mgvm_itm_oper_mgt_calc_itm_oper_t1.calc_no
AND	mgvm_itm_oper_mgw_arg_w1.calc_grp_cd = mgvm_itm_oper_mgt_calc_itm_oper_t1.calc_grp_cd
;
