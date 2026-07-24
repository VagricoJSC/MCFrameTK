SELECT	mgvm_alc_gp_alc_mam_alc_gp_alc_m1.alc_ptn_cd,
	mgvm_alc_gp_alc_mam_alc_gp_alc_m1.gp_alc_cd
FROM	mgw_arg mgvm_alc_gp_alc_mgw_arg_w1, mam_alc_gp_alc mgvm_alc_gp_alc_mam_alc_gp_alc_m1
WHERE	0=0
AND	mgvm_alc_gp_alc_mgw_arg_w1.term = mgvm_alc_gp_alc_mam_alc_gp_alc_m1.term
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule mgvm_alc_gp_alc_mgvm_alc_rule_x
		WHERE	0=0
		AND	mgvm_alc_gp_alc_mgvm_alc_rule_x.alc_ptn_cd = mgvm_alc_gp_alc_mam_alc_gp_alc_m1.alc_ptn_cd
		AND	mgvm_alc_gp_alc_mgvm_alc_rule_x.alc_tgt_typ = fcpa_const$get_const_val('MAC_ALC_TGT_TYP','ALC')
	)
;
