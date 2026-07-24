SELECT
	msvt_accrual_stk_mst_stk_t1.*
FROM
	mst_stk msvt_accrual_stk_mst_stk_t1
WHERE 0=0
AND msvt_accrual_stk_mst_stk_t1.in_xfr_typ = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC')
AND (msvt_accrual_stk_mst_stk_t1.stk_arrv_bp_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL')
	OR EXISTS (
		SELECT	'X'
		FROM mam_loc msvt_accrual_stk_mam_loc_m1
		WHERE 0=0
		AND msvt_accrual_stk_mam_loc_m1.loc_cd = msvt_accrual_stk_mst_stk_t1.loc_cd AND msvt_accrual_stk_mam_loc_m1.sppl_cd IS NOT NULL))
;
