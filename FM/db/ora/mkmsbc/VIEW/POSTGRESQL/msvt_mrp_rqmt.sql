SELECT
	msvt_mrp_rqmt_mst_rqmt_t1.rqmt_no,
	msvt_mrp_rqmt_mst_rqmt_t1.itm_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.itm_sub1,
	msvt_mrp_rqmt_mst_rqmt_t1.itm_sub2,
	msvt_mrp_rqmt_mst_rqmt_t1.itm_sub3,
	msvt_mrp_rqmt_mst_rqmt_t1.strg_loc_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.mfg_loc_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.sppl_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.rqst_loc_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.due_dt,
	msvt_mrp_rqmt_mst_rqmt_t1.rqmt_qty - COALESCE(t2.yield_schd_qty,0) AS rqmt_qty,
	msvt_mrp_rqmt_mst_rqmt_t1.sno1,
	CAST (CASE msvt_mrp_rqmt_mst_rqmt_t1.sno1
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno1_typ,
	msvt_mrp_rqmt_mst_rqmt_t1.sno2,
	CAST (CASE msvt_mrp_rqmt_mst_rqmt_t1.sno2
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno2_typ,
	msvt_mrp_rqmt_mst_rqmt_t1.sno3,
	CAST (CASE msvt_mrp_rqmt_mst_rqmt_t1.sno3
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno3_typ,
	msvt_mrp_rqmt_mst_rqmt_t1.sno4,
	CAST (CASE msvt_mrp_rqmt_mst_rqmt_t1.sno4
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno4_typ,
	msvt_mrp_rqmt_mst_rqmt_t1.wg_cd,
	msvt_mrp_rqmt_mst_rqmt_t1.rqmt_typ
FROM
	mst_rqmt msvt_mrp_rqmt_mst_rqmt_t1
	LEFT OUTER JOIN 
		(
		SELECT msvt_mrp_rqmt_mst_itm_order_t3.rqmt_no, SUM(msvt_mrp_rqmt_mst_itm_order_t3.yield_schd_qty) AS yield_schd_qty 
		FROM mst_itm_order msvt_mrp_rqmt_mst_itm_order_t3
		WHERE msvt_mrp_rqmt_mst_itm_order_t3.itm_ord_sts_typ IN (
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','FIX'), 
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','INST'), 
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','CMPL')
			) 
		AND msvt_mrp_rqmt_mst_itm_order_t3.rqmt_no IS NOT NULL
		GROUP BY rqmt_no
		) t2
		ON (msvt_mrp_rqmt_mst_rqmt_t1.rqmt_no = t2.rqmt_no)
WHERE 0=0
AND msvt_mrp_rqmt_mst_rqmt_t1.fix_flg = '0' 
AND msvt_mrp_rqmt_mst_rqmt_t1.rqmt_qty - COALESCE(t2.yield_schd_qty,0) > 0
UNION ALL
SELECT
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqmt_no,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.itm_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.itm_sub1,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.itm_sub2,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.itm_sub3,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.strg_loc_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.mfg_loc_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sppl_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqst_loc_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.due_dt,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqmt_qty - COALESCE(t2.yield_schd_qty, 0) AS rqmt_qty,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno1,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno1_typ,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno2,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno2_typ,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno3,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno3_typ,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno4,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.sno4_typ,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.wg_cd,
	msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqmt_typ
FROM
	msvt_mrp_dly_rqmt msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1
	LEFT OUTER JOIN 
		(
		SELECT msvt_mrp_rqmt_mst_itm_order_t3.rqmt_no, SUM(msvt_mrp_rqmt_mst_itm_order_t3.yield_schd_qty) AS yield_schd_qty
		FROM mst_itm_order msvt_mrp_rqmt_mst_itm_order_t3
		WHERE msvt_mrp_rqmt_mst_itm_order_t3.itm_ord_sts_typ IN (
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','FIX'),
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','INST'),
			fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','CMPL')
			)
		AND msvt_mrp_rqmt_mst_itm_order_t3.rqmt_no IS NOT NULL
		GROUP BY rqmt_no
		) t2
		ON (msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqmt_no = t2.rqmt_no)
WHERE 0=0
AND msvt_mrp_rqmt_msvt_mrp_dly_rqmt_t1.rqmt_qty - COALESCE(t2.yield_schd_qty,0) > 0
;
