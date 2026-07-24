\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_alc_other(
alc_ptn_cd,
alc_val_typ,
minus_flg
)
AS
SELECT	mgvm_alc_other_mam_alc_other_m1.alc_ptn_cd,
	mgvm_alc_other_mam_alc_other_m1.alc_val_typ,
	mgvm_alc_other_mam_alc_other_m1.minus_flg
FROM	mgw_arg mgvm_alc_other_mgw_arg_w1, mam_alc_other mgvm_alc_other_mam_alc_other_m1
WHERE	0=0
AND	mgvm_alc_other_mgw_arg_w1.term = mgvm_alc_other_mam_alc_other_m1.term
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule mgvm_alc_other_mgvm_alc_rule_x
		WHERE	0=0
		AND	mgvm_alc_other_mgvm_alc_rule_x.alc_ptn_cd = mgvm_alc_other_mam_alc_other_m1.alc_ptn_cd
		AND	mgvm_alc_other_mgvm_alc_rule_x.alc_rule_typ = fcpa_const$get_const_val('MAC_ALC_RULE_TYP','OTHER_VAL')
	)
;;

