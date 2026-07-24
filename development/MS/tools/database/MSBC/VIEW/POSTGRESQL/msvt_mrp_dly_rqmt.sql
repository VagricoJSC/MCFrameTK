SELECT
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.rqmt_no,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub1,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub2,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub3,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.strg_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.mfg_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sppl_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.rqst_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.due_dt,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.rqmt_qty,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno1,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno1_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno2,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno2_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno3,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno3_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno4,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.sno4_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.wg_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.rqmt_typ
FROM
	msvt_mrp_dly_dmnd msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_dly_rqmt_mavm_itm_wg_m1
		ON (msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_cd = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_cd AND msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub1 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub1 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub2 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub2 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.itm_sub3 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub3 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.wg_cd = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.wg_cd)
WHERE 0=0
	AND msvt_mrp_dly_rqmt_mavm_itm_wg_m1.prod_pln_typ = fcpa_const$get_const_val('MAC_PROD_PLN_TYP','DMND_USE')
	AND msvt_mrp_dly_rqmt_mavm_itm_wg_m1.rqmt_typ = fcpa_const$get_const_val('MAC_RQMT_TYP','ALLOC')
	AND msvt_mrp_dly_rqmt_msvt_mrp_dly_dmnd_t1.dmnd_typ = fcpa_const$get_const_val('MSC_DMND_TYP','MISC')
UNION ALL
SELECT
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.rqmt_no,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub1,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub2,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub3,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.strg_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.mfg_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sppl_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.rqst_loc_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.due_dt,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.rqmt_qty,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno1,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno1_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno2,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno2_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno3,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno3_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno4,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.sno4_typ,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.wg_cd,
	msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.rqmt_typ
FROM
	msvt_mrp_dly_sd msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1
	LEFT OUTER JOIN  mavm_itm_wg msvt_mrp_dly_rqmt_mavm_itm_wg_m1
		ON (msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_cd = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_cd AND msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub1 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub1 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub2 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub2 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.itm_sub3 = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.itm_sub3 AND msvt_mrp_dly_rqmt_msvt_mrp_dly_sd_t1.wg_cd = msvt_mrp_dly_rqmt_mavm_itm_wg_m1.wg_cd)
WHERE 0=0
	AND msvt_mrp_dly_rqmt_mavm_itm_wg_m1.prod_pln_typ = fcpa_const$get_const_val('MAC_PROD_PLN_TYP','DMND_USE')
	AND COALESCE(msvt_mrp_dly_rqmt_mavm_itm_wg_m1.rqmt_typ, fcpa_const$get_const_val('MAC_RQMT_TYP','NON')) = fcpa_const$get_const_val('MAC_RQMT_TYP','NON')
;
