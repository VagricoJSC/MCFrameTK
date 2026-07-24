SELECT	mgvm_parm_mgt_calc_parm_t1.parm_key,
	mgvm_parm_mgt_calc_parm_t1.parm_val
FROM	mgw_arg mgvm_parm_mgw_arg_w1, mgt_calc_parm mgvm_parm_mgt_calc_parm_t1
WHERE	0=0
AND	mgvm_parm_mgw_arg_w1.calc_no = mgvm_parm_mgt_calc_parm_t1.calc_no
AND	mgvm_parm_mgw_arg_w1.calc_grp_cd = mgvm_parm_mgt_calc_parm_t1.calc_grp_cd
AND	mgvm_parm_mgt_calc_parm_t1.parm_key LIKE 'SCA_%'
;
