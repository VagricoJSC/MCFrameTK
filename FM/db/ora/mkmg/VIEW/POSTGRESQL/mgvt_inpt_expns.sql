SELECT	mgvt_inpt_expns_mgt_act_inpt_expns_t1.act_inpt_id,
	mgvt_inpt_expns_mgt_act_inpt_expns_t1.act_inpt_id_sub,
	mgvt_inpt_expns_mgt_act_inpt_expns_t1.expns_cd,
	mgvt_inpt_expns_mgvt_inpt_t2.par_itm_cd AS itm_cd,
	mgvt_inpt_expns_mgvt_inpt_t2.par_itm_sub1 AS itm_sub1,
	mgvt_inpt_expns_mgvt_inpt_t2.par_itm_sub2 AS itm_sub2,
	mgvt_inpt_expns_mgvt_inpt_t2.par_itm_sub3 AS itm_sub3,
	mgvt_inpt_expns_mgvt_inpt_t2.par_itm_ext AS itm_ext,
	mgvt_inpt_expns_mgvt_inpt_t2.wg_cd,
	mgvt_inpt_expns_mgt_act_inpt_expns_t1.amt
FROM	mgt_act_inpt_expns mgvt_inpt_expns_mgt_act_inpt_expns_t1, mgvt_inpt mgvt_inpt_expns_mgvt_inpt_t2
WHERE	0=0
AND	mgvt_inpt_expns_mgt_act_inpt_expns_t1.act_inpt_id = mgvt_inpt_expns_mgvt_inpt_t2.act_inpt_id
AND	mgvt_inpt_expns_mgt_act_inpt_expns_t1.act_inpt_id_sub = mgvt_inpt_expns_mgvt_inpt_t2.act_inpt_id_sub
AND	mgvt_inpt_expns_mgvt_inpt_t2.rec_eval_typ = fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS')
AND	mgvt_inpt_expns_mgt_act_inpt_expns_t1.amt <> 0
AND EXISTS (
	SELECT	'X'
	FROM	mgw_arg mgvt_inpt_expns_mgw_arg_w1
	WHERE	0=0
	AND	mgvt_inpt_expns_mgw_arg_w1.sa_typ = fcpa_const$get_const_val('MAC_SA_TYP','ACT')
)
;
