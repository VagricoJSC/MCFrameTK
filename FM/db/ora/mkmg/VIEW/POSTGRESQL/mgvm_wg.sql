SELECT	mgvm_wg_mam_grp_wg_m1.wg_cd,
	COALESCE(mgvm_wg_mam_grp_wg_m1.wg_prio, 0) AS wg_prio
FROM	mgw_arg mgvm_wg_mgw_arg_w1, mam_grp_wg mgvm_wg_mam_grp_wg_m1
WHERE	0=0
AND	mgvm_wg_mgw_arg_w1.calc_grp_cd = mgvm_wg_mam_grp_wg_m1.calc_grp_cd
;
