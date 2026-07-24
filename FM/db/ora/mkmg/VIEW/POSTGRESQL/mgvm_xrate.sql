SELECT	mgvm_xrate_mgt_calc_xrate_t1.fr_cur_cd,
	mgvm_xrate_mgt_calc_xrate_t1.to_cur_cd,
	mgvm_xrate_mgt_calc_xrate_t1.xrate
FROM	mgw_arg mgvm_xrate_mgw_arg_w1, mgt_calc_xrate mgvm_xrate_mgt_calc_xrate_t1
WHERE	0=0
AND	mgvm_xrate_mgw_arg_w1.calc_no = mgvm_xrate_mgt_calc_xrate_t1.calc_no
AND	mgvm_xrate_mgw_arg_w1.calc_grp_cd = mgvm_xrate_mgt_calc_xrate_t1.calc_grp_cd
AND	mgvm_xrate_mgw_arg_w1.xrate_cd = mgvm_xrate_mgt_calc_xrate_t1.xrate_cd
;
