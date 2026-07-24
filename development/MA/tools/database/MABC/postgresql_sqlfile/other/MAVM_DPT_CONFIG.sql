\encoding UTF-8

CREATE OR REPLACE VIEW mavm_dpt_config(
par_dpt_cd,
dpt_cd,
loc_cd,
oper_cd,
oper_null_flg,
term
)
AS
SELECT
	mavm_dpt_config_mam_dpt_config_$s_m1.par_dpt_cd,
	mavm_dpt_config_mam_dpt_config_$s_m1.dpt_cd,
	mavm_dpt_config_mam_dpt_config_$s_m1.loc_cd,
	mavm_dpt_config_mam_dpt_config_$s_m1.oper_cd,
	mavm_dpt_config_mam_dpt_config_$s_m1.oper_null_flg,
	mavm_dpt_config_mam_dpt_config_$s_m1.term
FROM	mam_dpt_config_$s mavm_dpt_config_mam_dpt_config_$s_m1, mam_cost_dpt_$s mavm_dpt_config_mam_cost_dpt_$s_m2
WHERE	0=0
AND	mavm_dpt_config_mam_dpt_config_$s_m1.par_dpt_cd = mavm_dpt_config_mam_cost_dpt_$s_m2.dpt_cd
AND	mavm_dpt_config_mam_dpt_config_$s_m1.term = mavm_dpt_config_mam_cost_dpt_$s_m2.term
AND	mavm_dpt_config_mam_cost_dpt_$s_m2.dpt_config_typ = fcpa_const$get_const_val('MAC_DPT_CONFIG_TYP','CONFIG')
AND	mavm_dpt_config_mam_dpt_config_$s_m1.del_flg = '0'
AND	mavm_dpt_config_mam_cost_dpt_$s_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_cd AS par_dpt_cd,
	NULL AS dpt_cd,
	mavm_dpt_config_mam_loc_$s_m2.loc_cd,
	NULL AS oper_cd,
	'0' AS oper_null_flg,
	mavm_dpt_config_mam_cost_dpt_$s_m1.term
FROM	mam_cost_dpt_$s mavm_dpt_config_mam_cost_dpt_$s_m1, mam_loc_$s mavm_dpt_config_mam_loc_$s_m2
WHERE	0=0
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.lg_grp_cd = mavm_dpt_config_mam_loc_$s_m2.lg_grp_cd
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_config_typ = fcpa_const$get_const_val('MAC_DPT_CONFIG_TYP','LG_GRP')
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.del_flg = '0'
AND	mavm_dpt_config_mam_loc_$s_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_cd AS par_dpt_cd,
	NULL AS dpt_cd,
	mavm_dpt_config_mam_loc_$s_m2.loc_cd,
	NULL AS oper_cd,
	'0' AS oper_null_flg,
	mavm_dpt_config_mam_cost_dpt_$s_m1.term
FROM	mam_cost_dpt_$s mavm_dpt_config_mam_cost_dpt_$s_m1, mam_loc_$s mavm_dpt_config_mam_loc_$s_m2
WHERE	0=0
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.loc_grp_cd = mavm_dpt_config_mam_loc_$s_m2.loc_grp_cd
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_config_typ = fcpa_const$get_const_val('MAC_DPT_CONFIG_TYP','LOC_GRP')
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.del_flg = '0'
AND	mavm_dpt_config_mam_loc_$s_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_cd AS par_dpt_cd,
	NULL AS dpt_cd,
	mavm_dpt_config_mam_loc_$s_m2.loc_cd,
	NULL AS oper_cd,
	'0' AS oper_null_flg,
	mavm_dpt_config_mam_cost_dpt_$s_m1.term
FROM	mam_cost_dpt_$s mavm_dpt_config_mam_cost_dpt_$s_m1, mam_loc_$s mavm_dpt_config_mam_loc_$s_m2
WHERE	0=0
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.wg_cd = mavm_dpt_config_mam_loc_$s_m2.wg_cd
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_config_typ = fcpa_const$get_const_val('MAC_DPT_CONFIG_TYP','WG')
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.del_flg = '0'
AND	mavm_dpt_config_mam_loc_$s_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_cd AS par_dpt_cd,
	NULL AS dpt_cd,
	mavm_dpt_config_mam_loc_$s_m2.loc_cd,
	NULL AS oper_cd,
	'0' AS oper_null_flg,
	mavm_dpt_config_mam_cost_dpt_$s_m1.term
FROM	mam_cost_dpt_$s mavm_dpt_config_mam_cost_dpt_$s_m1, mam_loc_$s mavm_dpt_config_mam_loc_$s_m2
WHERE	0=0
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.site_cd = mavm_dpt_config_mam_loc_$s_m2.site_cd
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.dpt_config_typ = fcpa_const$get_const_val('MAC_DPT_CONFIG_TYP','SITE')
AND	mavm_dpt_config_mam_cost_dpt_$s_m1.del_flg = '0'
AND	mavm_dpt_config_mam_loc_$s_m2.del_flg = '0'
;;

