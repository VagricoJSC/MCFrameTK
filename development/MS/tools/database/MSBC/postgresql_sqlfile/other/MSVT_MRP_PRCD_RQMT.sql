\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_prcd_rqmt(
rqmt_no,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
strg_loc_cd,
mfg_loc_cd,
sppl_cd,
rqst_loc_cd,
due_dt,
rqmt_qty,
sno1,
sno1_typ,
sno2,
sno2_typ,
sno3,
sno3_typ,
sno4,
sno4_typ,
wg_cd,
rqmt_typ
)
AS
SELECT
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.rqmt_no,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.itm_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.itm_sub1,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.itm_sub2,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.itm_sub3,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.strg_loc_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.mfg_loc_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sppl_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.rqst_loc_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.due_dt,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.rqmt_qty,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno1,
	CAST (CASE msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno1
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno1_typ,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno2,
	CAST (CASE msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno2
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno2_typ,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno3,
	CAST (CASE msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno3
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno3_typ,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno4,
	CAST (CASE msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.sno4
		WHEN fcpa_const$get_const_val('MAC_STR','NULL_VAL') THEN fcpa_const$get_const_val('MAC_SNO_TYP','NO_EXTND')
		ELSE fcpa_const$get_const_val('MAC_SNO_TYP','EXTND')
	END AS VARCHAR(1)) AS sno4_typ,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.wg_cd,
	msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.rqmt_typ
FROM
	mst_prcd_rqmt msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1
WHERE 0=0
AND msvt_mrp_prcd_rqmt_mst_prcd_rqmt_t1.fix_flg = '0'
UNION ALL
SELECT
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.rqmt_no,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.itm_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.itm_sub1,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.itm_sub2,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.itm_sub3,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.strg_loc_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.mfg_loc_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sppl_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.rqst_loc_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.due_dt,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.rqmt_qty,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno1,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno1_typ,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno2,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno2_typ,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno3,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno3_typ,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno4,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.sno4_typ,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.wg_cd,
	msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2.rqmt_typ
FROM
	msvt_mrp_rqmt msvt_mrp_prcd_rqmt_msvt_mrp_rqmt_t2
;;

