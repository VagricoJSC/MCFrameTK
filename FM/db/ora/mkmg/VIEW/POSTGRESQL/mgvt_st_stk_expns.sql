SELECT	mgvt_st_stk_expns_mgvt_st_stk_t2.wg_cd,
	mgvt_st_stk_expns_mgt_st_stk_expns_t1.st_stk_key,
	mgvt_st_stk_expns_mgt_st_stk_expns_t1.expns_cd,
	mgvt_st_stk_expns_mgvt_st_stk_t2.itm_cd,
	mgvt_st_stk_expns_mgvt_st_stk_t2.itm_sub1,
	mgvt_st_stk_expns_mgvt_st_stk_t2.itm_sub2,
	mgvt_st_stk_expns_mgvt_st_stk_t2.itm_sub3,
	mgvt_st_stk_expns_mgvt_st_stk_t2.itm_ext,
	mgvt_st_stk_expns_mgt_st_stk_expns_t1.amt
FROM	mgvt_st_stk mgvt_st_stk_expns_mgvt_st_stk_t2, mgt_st_stk_expns mgvt_st_stk_expns_mgt_st_stk_expns_t1
WHERE	0=0
AND	mgvt_st_stk_expns_mgt_st_stk_expns_t1.st_stk_key = mgvt_st_stk_expns_mgvt_st_stk_t2.st_stk_key
AND	mgvt_st_stk_expns_mgt_st_stk_expns_t1.amt <> 0
AND EXISTS (
	SELECT	'X'
	FROM	mgw_arg mgvt_st_stk_expns_mgw_arg_w1
	WHERE	0=0
	AND	mgvt_st_stk_expns_mgw_arg_w1.cost_calc_typ = fcpa_const$get_const_val('MAC_COST_CALC_TYP','CALC_STK')
)
;
