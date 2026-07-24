SELECT	mgvm_alc_expns_mam_alc_expns_m1.alc_ptn_cd,
	mgvm_alc_expns_mam_alc_expns_m1.expns_cd,
	mgvm_alc_expns_mam_alc_expns_m1.self_oper_flg,
	mgvm_alc_expns_mam_alc_expns_m1.inpt_itm_typ,
	mgvm_alc_expns_mam_alc_expns_m1.ctg_cd,
	mgvm_alc_expns_mam_alc_expns_m1.itm_cd,
	mgvm_alc_expns_mam_alc_expns_m1.itm_sub1,
	mgvm_alc_expns_mam_alc_expns_m1.itm_sub2,
	mgvm_alc_expns_mam_alc_expns_m1.itm_sub3
FROM	mgw_arg mgvm_alc_expns_mgw_arg_w1, mam_alc_expns mgvm_alc_expns_mam_alc_expns_m1
WHERE	0=0
AND	mgvm_alc_expns_mgw_arg_w1.term = mgvm_alc_expns_mam_alc_expns_m1.term
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule mgvm_alc_expns_mgvm_alc_rule_x
		WHERE	0=0
		AND	mgvm_alc_expns_mgvm_alc_rule_x.alc_ptn_cd = mgvm_alc_expns_mam_alc_expns_m1.alc_ptn_cd
		AND	mgvm_alc_expns_mgvm_alc_rule_x.alc_rule_typ IN (fcpa_const$get_const_val('MAC_ALC_RULE_TYP','EXPNS_COST'), fcpa_const$get_const_val('MAC_ALC_RULE_TYP','PROFIT'))
	)
;
