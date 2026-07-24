\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_coef_config(
alc_coef_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
loc_cd,
oper_cd,
bp_cd,
coef_val
)
AS
SELECT	mgvm_coef_config_mavm_coef_config_m1.alc_coef_cd,
	mgvm_coef_config_mavm_coef_config_m1.itm_cd,
	mgvm_coef_config_mavm_coef_config_m1.itm_sub1,
	mgvm_coef_config_mavm_coef_config_m1.itm_sub2,
	mgvm_coef_config_mavm_coef_config_m1.itm_sub3,
	mgvm_coef_config_mavm_coef_config_m1.lot_no,
	mgvm_coef_config_mavm_coef_config_m1.sublot_no,
	mgvm_coef_config_mavm_coef_config_m1.sno1,
	mgvm_coef_config_mavm_coef_config_m1.sno2,
	mgvm_coef_config_mavm_coef_config_m1.sno3,
	mgvm_coef_config_mavm_coef_config_m1.sno4,
	mgvm_coef_config_mavm_coef_config_m1.loc_cd,
	mgvm_coef_config_mavm_coef_config_m1.oper_cd,
	mgvm_coef_config_mavm_coef_config_m1.bp_cd,
	mgvm_coef_config_mavm_coef_config_m1.coef_val
FROM	mgw_arg mgvm_coef_config_mgw_arg_w1, mavm_coef_config mgvm_coef_config_mavm_coef_config_m1
WHERE	0=0
AND	mgvm_coef_config_mgw_arg_w1.term = mgvm_coef_config_mavm_coef_config_m1.term
AND	mgvm_coef_config_mavm_coef_config_m1.del_flg = '0'
AND	EXISTS (
		SELECT	'X'
		FROM	mgvm_alc_rule AS mgvm_coef_config_mgvm_alc_rule_x1
		WHERE	0=0
		AND	mgvm_coef_config_mgvm_alc_rule_x1.alc_coef_cd = mgvm_coef_config_mavm_coef_config_m1.alc_coef_cd
	)
AND	EXISTS (
		SELECT	'X'
		FROM	mgt_calc_itm mgvm_coef_config_mgt_calc_itm_x2
		WHERE	0=0
		AND	mgvm_coef_config_mgt_calc_itm_x2.calc_no = mgvm_coef_config_mgw_arg_w1.calc_no
		AND	mgvm_coef_config_mgt_calc_itm_x2.calc_grp_cd = mgvm_coef_config_mgw_arg_w1.calc_grp_cd
		AND	mgvm_coef_config_mgt_calc_itm_x2.itm_cd = mgvm_coef_config_mavm_coef_config_m1.itm_cd
		AND	mgvm_coef_config_mgt_calc_itm_x2.itm_sub1 = mgvm_coef_config_mavm_coef_config_m1.itm_sub1
		AND	mgvm_coef_config_mgt_calc_itm_x2.itm_sub2 = mgvm_coef_config_mavm_coef_config_m1.itm_sub2
		AND	mgvm_coef_config_mgt_calc_itm_x2.itm_sub3 = mgvm_coef_config_mavm_coef_config_m1.itm_sub3
	)
;;

