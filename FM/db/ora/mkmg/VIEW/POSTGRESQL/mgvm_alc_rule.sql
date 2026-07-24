SELECT	mgvm_alc_rule_mam_alc_rule_m1.alc_ptn_cd,
	mgvm_alc_rule_mam_alc_rule_m1.alc_tgt_typ,
	mgvm_alc_rule_mam_alc_rule_m1.alc_rule_typ,
	mgvm_alc_rule_mam_alc_rule_m1.expns_cd,
	mgvm_alc_rule_mam_alc_rule_m1.diff_calc_typ,
	mgvm_alc_rule_mam_alc_rule_m1.rnd_typ,
	mgvm_alc_rule_mam_alc_rule_m1.dec_place,
	mgvm_alc_rule_mam_alc_rule_m1.alc_coef_cd,
	mgvm_alc_rule_mam_alc_rule_m1.coef_limit_flg,
	mgvm_alc_rule_mam_alc_rule_m1.asst_typ,
	mgvm_alc_rule_mam_alc_rule_m1.non_minus_flg,
	mgvm_alc_rule_mam_alc_rule_m1.non_os_flg,
	mgvm_alc_rule_mam_alc_rule_m1.scst_alc_flg,
	mgvm_alc_rule_mam_alc_rule_m1.std_alc_flg
FROM	mgw_arg mgvm_alc_rule_mgw_arg_w1, mam_alc_rule mgvm_alc_rule_mam_alc_rule_m1
WHERE	0=0
AND	mgvm_alc_rule_mgw_arg_w1.term = mgvm_alc_rule_mam_alc_rule_m1.term
;
