\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_alc_wk(
alc_ptn_cd,
wk_cost_cd,
tr_alc_ac_cd,
tr_alc_ptn_cd,
tr_expns_cd
)
AS
SELECT	mgvm_alc_wk_mam_alc_wk_m1.alc_ptn_cd,
	mgvm_alc_wk_mam_alc_wk_m1.wk_cost_cd,
	mgvm_alc_wk_mam_alc_wk_m1.alc_ac_cd AS tr_alc_ac_cd,
	mgvm_alc_wk_mam_alc_ac_m2.alc_ptn_cd AS tr_alc_ptn_cd,
	mgvm_alc_wk_mam_alc_ac_m2.expns_cd AS tr_expns_cd
FROM	mgw_arg mgvm_alc_wk_mgw_arg_w1, 
	mam_alc_wk mgvm_alc_wk_mam_alc_wk_m1
	LEFT OUTER JOIN mam_alc_ac mgvm_alc_wk_mam_alc_ac_m2 ON (mgvm_alc_wk_mam_alc_wk_m1.alc_ac_cd = mgvm_alc_wk_mam_alc_ac_m2.alc_ac_cd)
WHERE	0=0
AND	mgvm_alc_wk_mgw_arg_w1.term = mgvm_alc_wk_mam_alc_wk_m1.term
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule mgvm_alc_wk_mgvm_alc_rule_x
		WHERE	0=0
		AND	mgvm_alc_wk_mgvm_alc_rule_x.alc_ptn_cd = mgvm_alc_wk_mam_alc_wk_m1.alc_ptn_cd
		AND	mgvm_alc_wk_mgvm_alc_rule_x.alc_rule_typ = fcpa_const$get_const_val('MAC_ALC_RULE_TYP','WK')
	)
;;

