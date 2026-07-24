SELECT
	msvt_avl_stk_mst_stk_t1.*
FROM
	mst_stk AS msvt_avl_stk_mst_stk_t1
WHERE 0=0
AND msvt_avl_stk_mst_stk_t1.in_xfr_typ = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC')
AND msvt_avl_stk_mst_stk_t1.stk_insp_typ = fcpa_const$get_const_val('MSC_STK_INSP_TYP','FIN')
AND msvt_avl_stk_mst_stk_t1.stk_id_typ IN
	(
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','CSTSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ACCPT_DFCT'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
AND (msvt_avl_stk_mst_stk_t1.stk_arrv_bp_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	OR EXISTS (
		SELECT	'X'
		FROM mam_loc msvt_avl_stk_mam_loc_m1
		WHERE 0=0
		AND msvt_avl_stk_mam_loc_m1.loc_cd = msvt_avl_stk_mst_stk_t1.loc_cd AND msvt_avl_stk_mam_loc_m1.sppl_cd IS NOT NULL))
;
