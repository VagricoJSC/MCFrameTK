SELECT	mgvm_itm_fix_mgt_calc_itm_fix_t1.itm_cd,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.itm_sub1,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.itm_sub2,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.itm_sub3,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.expns_cd,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.wg_cd,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.base_qty,
	mgvm_itm_fix_mgt_calc_itm_fix_t1.std_upri
FROM	mgw_arg mgvm_itm_fix_mgw_arg_w1, mgt_calc_itm_fix mgvm_itm_fix_mgt_calc_itm_fix_t1
WHERE	0=0
AND	mgvm_itm_fix_mgw_arg_w1.calc_no = mgvm_itm_fix_mgt_calc_itm_fix_t1.calc_no
AND	mgvm_itm_fix_mgw_arg_w1.calc_grp_cd = mgvm_itm_fix_mgt_calc_itm_fix_t1.calc_grp_cd
;
