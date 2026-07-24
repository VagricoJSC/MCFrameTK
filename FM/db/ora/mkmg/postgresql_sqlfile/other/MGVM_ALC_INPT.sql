\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_alc_inpt(
alc_ptn_cd,
ctg_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3
)
AS
SELECT	mgvm_alc_inpt_mam_alc_inpt_m1.alc_ptn_cd,
	mgvm_alc_inpt_mam_alc_inpt_m1.ctg_cd,
	mgvm_alc_inpt_mam_alc_inpt_m1.itm_cd,
	mgvm_alc_inpt_mam_alc_inpt_m1.itm_sub1,
	mgvm_alc_inpt_mam_alc_inpt_m1.itm_sub2,
	mgvm_alc_inpt_mam_alc_inpt_m1.itm_sub3
FROM	mgw_arg mgvm_alc_inpt_mgw_arg_w1, mam_alc_inpt mgvm_alc_inpt_mam_alc_inpt_m1
WHERE	0=0
AND	mgvm_alc_inpt_mgw_arg_w1.term = mgvm_alc_inpt_mam_alc_inpt_m1.term
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule mgvm_alc_inpt_mgvm_alc_rule_x
		WHERE	0=0
		AND	mgvm_alc_inpt_mgvm_alc_rule_x.alc_ptn_cd = mgvm_alc_inpt_mam_alc_inpt_m1.alc_ptn_cd
		AND	mgvm_alc_inpt_mgvm_alc_rule_x.alc_rule_typ = fcpa_const$get_const_val('MAC_ALC_RULE_TYP','INPT_QTY')
	)
;;

