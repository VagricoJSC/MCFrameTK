SELECT
	msvt_accrual_end_stk_mst_mly_stk_dtl_t1.*
FROM
	mst_mly_stk_dtl msvt_accrual_end_stk_mst_mly_stk_dtl_t1
WHERE 0=0
AND msvt_accrual_end_stk_mst_mly_stk_dtl_t1.in_xfr_typ = fcpa_const$get_const_val('MSC_IN_XFR_TYP','IN_LOC')
AND (msvt_accrual_end_stk_mst_mly_stk_dtl_t1.stk_arrv_bp_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	OR EXISTS (
		SELECT 'X'
		FROM mam_loc m1
		WHERE 0=0
		AND m1.loc_cd = msvt_accrual_end_stk_mst_mly_stk_dtl_t1.loc_cd AND m1.sppl_cd IS NOT NULL))
AND msvt_accrual_end_stk_mst_mly_stk_dtl_t1.io_act_typ = fcpa_const$get_const_val('MSC_IO_ACT_TYP','END_STK')
;
