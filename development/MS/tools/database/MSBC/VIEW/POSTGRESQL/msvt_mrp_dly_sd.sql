SELECT
	msvt_mrp_dly_sd_mst_dly_sd_t1.dly_sd_no AS rqmt_no,
	msvt_mrp_dly_sd_mst_dly_sd_t1.itm_cd,
	msvt_mrp_dly_sd_mst_dly_sd_t1.itm_sub1,
	msvt_mrp_dly_sd_mst_dly_sd_t1.itm_sub2,
	msvt_mrp_dly_sd_mst_dly_sd_t1.itm_sub3,
	msvt_mrp_dly_sd_mst_dly_sd_t1.strg_loc_cd,
	msvt_mrp_dly_sd_mst_dly_sd_t1.mfg_loc_cd,
	msvt_mrp_dly_sd_mst_dly_sd_t1.sppl_cd,
	msvt_mrp_dly_sd_mst_dly_sd_t1.rqst_loc_cd,
	msvt_mrp_dly_sd_mst_dly_sd_t1.due_dt,
	msvt_mrp_dly_sd_mst_dly_sd_t1.rqmt_qty,
	msvt_mrp_dly_sd_mst_dly_sd_t1.sno1,
	CAST (CASE msvt_mrp_dly_sd_mst_dly_sd_t1.sno1
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno1_typ,
	msvt_mrp_dly_sd_mst_dly_sd_t1.sno2,
	CAST (CASE msvt_mrp_dly_sd_mst_dly_sd_t1.sno2
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno2_typ,
	msvt_mrp_dly_sd_mst_dly_sd_t1.sno3,
	CAST (CASE msvt_mrp_dly_sd_mst_dly_sd_t1.sno3
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno3_typ,
	msvt_mrp_dly_sd_mst_dly_sd_t1.sno4,
	CAST (CASE msvt_mrp_dly_sd_mst_dly_sd_t1.sno4
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno4_typ,
	msvt_mrp_dly_sd_mst_dly_sd_t1.wg_cd,
	CAST (fcpa_const$get_const_val('MAC_RQMT_TYP','NON') AS VARCHAR(1)) AS rqmt_typ
FROM
	mst_dly_sd msvt_mrp_dly_sd_mst_dly_sd_t1
WHERE 0=0
;
