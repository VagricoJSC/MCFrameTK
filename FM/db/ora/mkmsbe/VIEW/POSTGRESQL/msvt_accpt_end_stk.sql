SELECT
	msvt_accpt_end_stk_mst_mly_stk_dtl_t1.*
FROM
	mst_mly_stk_dtl msvt_accpt_end_stk_mst_mly_stk_dtl_t1
WHERE 0=0
AND msvt_accpt_end_stk_mst_mly_stk_dtl_t1.asst_typ IN (fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS'), fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD'))
AND msvt_accpt_end_stk_mst_mly_stk_dtl_t1.io_act_typ = fcpa_const$get_const_val('MSC_IO_ACT_TYP','END_STK')
;
