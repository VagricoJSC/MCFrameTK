SELECT
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.wg_rqst_no AS rqmt_no,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.itm_cd,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.itm_sub1,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.itm_sub2,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.itm_sub3,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.gr_loc_cd AS strg_loc_cd,
	CAST (fcpa_const$get_const_val('MAC_STR','NULL_VAL') AS VARCHAR(1)) AS mfg_loc_cd,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sppl_cd,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.gi_loc_cd AS rqst_loc_cd,
	DATE_TRUNC('DAY', msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.gr_rqst_tm) AS due_dt,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.not_cmpl_qty AS rqmt_qty,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno1,
	CAST (CASE msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno1
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno1_typ,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno2,
	CAST (CASE msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno2
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno2_typ,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno3,
	CAST (CASE msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno3
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno3_typ,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno4,
	CAST (CASE msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.sno4
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno4_typ,
	msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.rqst_to_wg_cd AS wg_cd,
	CAST (fcpa_const$get_const_val('MAC_RQMT_TYP','ALLOC') AS VARCHAR(1)) AS rqmt_typ
FROM
	mst_wg_rqst msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1
WHERE 0=0
AND wg_rqst_sts_typ IN (
	fcpa_const$get_const_val('MSC_WG_RQST_STS_TYP','RQST'),
	fcpa_const$get_const_val('MSC_WG_RQST_STS_TYP','PRMS'),
	fcpa_const$get_const_val('MSC_WG_RQST_STS_TYP','INST')
	)
AND msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.can_flg = '0'
AND msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.not_cmpl_qty <> 0
AND msvt_mrp_wg_rqst_prms_mst_wg_rqst_t1.wg_rqst_typ = fcpa_const$get_const_val('MSC_WG_RQST_TYP','PURC')
;
