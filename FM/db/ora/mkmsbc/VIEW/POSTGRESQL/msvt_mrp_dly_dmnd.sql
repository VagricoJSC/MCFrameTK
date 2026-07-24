SELECT
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dly_dmnd_no AS rqmt_no,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.itm_cd,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.itm_sub1,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.itm_sub2,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.itm_sub3,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_loc_cd AS strg_loc_cd,
	CAST (fcpa_const$get_const_val('MAC_STR','NULL_VAL') AS VARCHAR(1)) AS mfg_loc_cd,
	CAST (fcpa_const$get_const_val('MAC_STR','NULL_VAL') AS VARCHAR(1)) AS sppl_cd,
	CAST (fcpa_const$get_const_val('MAC_STR','NULL_VAL') AS VARCHAR(1)) AS rqst_loc_cd,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_dt AS due_dt,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_qty AS rqmt_qty,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno1,
	CAST (CASE msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno1
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno1_typ,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno2,
	CAST (CASE msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno2
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno2_typ,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno3,
	CAST (CASE msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno3
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno3_typ,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno4,
	CAST (CASE msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.sno4
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno4_typ,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.wg_cd,
	CAST (fcpa_const$get_const_val('MAC_RQMT_TYP','ALLOC') AS VARCHAR(1)) AS rqmt_typ,
	msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_typ
FROM
	mst_dly_dmnd msvt_mrp_dly_dmnd_mst_dly_dmnd_t1
WHERE 0=0
AND msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_dt >= fcpa_date_util$f_get_today()
AND msvt_mrp_dly_dmnd_mst_dly_dmnd_t1.dmnd_typ IN (
	fcpa_const$get_const_val('MSC_DMND_TYP','CST_FRCST'),
	fcpa_const$get_const_val('MSC_DMND_TYP','PLN_SLS'),
	fcpa_const$get_const_val('MSC_DMND_TYP','MISC')
)
;
