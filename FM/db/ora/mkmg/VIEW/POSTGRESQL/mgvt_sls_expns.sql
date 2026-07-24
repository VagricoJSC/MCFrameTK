SELECT	mgvt_sls_expns_mgt_act_sls_expns_t1.act_sls_id,
	mgvt_sls_expns_mgt_act_sls_expns_t1.act_sls_id_sub,
	mgvt_sls_expns_mgt_act_sls_expns_t1.expns_cd,
	mgvt_sls_expns_mgvt_sls_t2.itm_cd,
	mgvt_sls_expns_mgvt_sls_t2.itm_sub1,
	mgvt_sls_expns_mgvt_sls_t2.itm_sub2,
	mgvt_sls_expns_mgvt_sls_t2.itm_sub3,
	mgvt_sls_expns_mgvt_sls_t2.itm_ext,
	mgvt_sls_expns_mgvt_sls_t2.wg_cd,
	mgvt_sls_expns_mgt_act_sls_expns_t1.amt
FROM	mgt_act_sls_expns mgvt_sls_expns_mgt_act_sls_expns_t1, mgvt_sls mgvt_sls_expns_mgvt_sls_t2
WHERE	0=0
AND	mgvt_sls_expns_mgt_act_sls_expns_t1.act_sls_id = mgvt_sls_expns_mgvt_sls_t2.act_sls_id
AND	mgvt_sls_expns_mgt_act_sls_expns_t1.act_sls_id_sub = mgvt_sls_expns_mgvt_sls_t2.act_sls_id_sub
AND	mgvt_sls_expns_mgvt_sls_t2.rec_eval_typ = fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS')
AND	mgvt_sls_expns_mgt_act_sls_expns_t1.amt <> 0
AND EXISTS (
	SELECT	'X'
	FROM	mgw_arg mgvt_sls_expns_mgw_arg_w1
	WHERE	0=0
	AND	mgvt_sls_expns_mgw_arg_w1.sa_typ = fcpa_const$get_const_val('MAC_SA_TYP','ACT')
)
;
