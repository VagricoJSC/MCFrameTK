SELECT
	msvt_accpt_stk_mst_stk_t1.*
FROM
	mst_stk msvt_accpt_stk_mst_stk_t1
WHERE 0=0
AND msvt_accpt_stk_mst_stk_t1.asst_typ IN (fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS'), fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD'))
;
