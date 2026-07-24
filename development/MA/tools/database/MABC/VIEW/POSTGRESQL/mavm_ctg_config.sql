SELECT
	mavm_ctg_config_mam_ctg_config_m1.par_ctg_cd,
	mavm_ctg_config_mam_ctg_config_m1.ctg_cd,
	mavm_ctg_config_mam_ctg_config_m1.itm_cd,
	mavm_ctg_config_mam_ctg_config_m1.itm_sub1,
	mavm_ctg_config_mam_ctg_config_m1.itm_sub2,
	mavm_ctg_config_mam_ctg_config_m1.itm_sub3,
	mavm_ctg_config_mam_ctg_config_m1.term
FROM	mam_ctg_config mavm_ctg_config_mam_ctg_config_m1, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m2
WHERE	0=0
AND	mavm_ctg_config_mam_ctg_config_m1.par_ctg_cd = mavm_ctg_config_mam_cost_ctg_m2.ctg_cd
AND	mavm_ctg_config_mam_cost_ctg_m2.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','CONFIG')
AND	mavm_ctg_config_mam_ctg_config_m1.del_flg = '0'
AND	mavm_ctg_config_mam_cost_ctg_m2.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_jnl_cd = mavm_ctg_config_mam_itm__m2.itm_jnl_cd
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_JNL')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd1
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP1')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP1')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd2
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP2')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP2')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd3
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP3')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP3')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd4
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP4')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP4')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd5
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP5')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP5')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd6
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP6')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP6')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd7
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP7')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP7')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd8
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP8')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP8')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd9
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP9')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP9')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
UNION ALL
SELECT
	mavm_ctg_config_mam_cost_ctg_m1.ctg_cd AS par_ctg_cd,
	NULL AS ctg_cd,
	mavm_ctg_config_mam_itm__m2.itm_cd,
	mavm_ctg_config_mam_itm__m2.itm_sub1,
	mavm_ctg_config_mam_itm__m2.itm_sub2,
	mavm_ctg_config_mam_itm__m2.itm_sub3,
	mavm_ctg_config_maw_term_w.term
FROM	maw_term mavm_ctg_config_maw_term_w, mam_cost_ctg mavm_ctg_config_mam_cost_ctg_m1, mam_itm_ mavm_ctg_config_mam_itm__m2
WHERE	0=0
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_cd = mavm_ctg_config_mam_itm__m2.itm_grp_cd10
AND	mavm_ctg_config_mam_cost_ctg_m1.itm_grp_typ = fcpa_const$get_const_val('MAC_ITM_GRP_TYP','GRP10')
AND	mavm_ctg_config_mam_cost_ctg_m1.ctg_config_typ = fcpa_const$get_const_val('MAC_CTG_CONFIG_TYP','ITM_GRP10')
AND	mavm_ctg_config_mam_cost_ctg_m1.del_flg = '0'
;
