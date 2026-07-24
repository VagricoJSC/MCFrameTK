SELECT	mgvt_io_expns_mgt_act_io_expns_t1.act_io_id,
	mgvt_io_expns_mgt_act_io_expns_t1.act_io_id_sub,
	mgvt_io_expns_mgt_act_io_expns_t1.expns_cd,
	mgvt_io_expns_mgvt_io_t2.itm_cd,
	mgvt_io_expns_mgvt_io_t2.itm_sub1,
	mgvt_io_expns_mgvt_io_t2.itm_sub2,
	mgvt_io_expns_mgvt_io_t2.itm_sub3,
	mgvt_io_expns_mgvt_io_t2.itm_ext,
	mgvt_io_expns_mgvt_io_t2.wg_cd,
	mgvt_io_expns_mgt_act_io_expns_t1.amt
FROM	mgw_arg mgvt_io_expns_mgw_arg_w1, mgt_act_io_expns mgvt_io_expns_mgt_act_io_expns_t1, mgvt_io mgvt_io_expns_mgvt_io_t2
WHERE	0=0
AND	mgvt_io_expns_mgw_arg_w1.sa_typ = fcpa_const$get_const_val('MAC_SA_TYP','ACT')
AND	mgvt_io_expns_mgt_act_io_expns_t1.act_io_id = mgvt_io_expns_mgvt_io_t2.act_io_id
AND	mgvt_io_expns_mgt_act_io_expns_t1.act_io_id_sub = mgvt_io_expns_mgvt_io_t2.act_io_id_sub
AND	mgvt_io_expns_mgvt_io_t2.rec_eval_typ = fcpa_const$get_const_val('MGC_REC_EVAL_TYP','EXPNS')
AND	mgvt_io_expns_mgt_act_io_expns_t1.amt <> 0
AND	NOT EXISTS (
		SELECT	'X'
		FROM	mgt_calc_io_expns_amt mgvt_io_expns_mgt_calc_io_expns_amt_x
		WHERE	0=0
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.calc_no = mgvt_io_expns_mgw_arg_w1.calc_no
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.calc_grp_cd = mgvt_io_expns_mgw_arg_w1.calc_grp_cd
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.itm_cd = mgvt_io_expns_mgvt_io_t2.itm_cd
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.itm_sub1 = mgvt_io_expns_mgvt_io_t2.itm_sub1
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.itm_sub2 = mgvt_io_expns_mgvt_io_t2.itm_sub2
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.itm_sub3 = mgvt_io_expns_mgvt_io_t2.itm_sub3
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.itm_ext = mgvt_io_expns_mgvt_io_t2.itm_ext
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.act_io_id = mgvt_io_expns_mgvt_io_t2.act_io_id
		AND	mgvt_io_expns_mgt_calc_io_expns_amt_x.act_io_id_sub = mgvt_io_expns_mgvt_io_t2.act_io_id_sub
	)
UNION ALL
SELECT	mgvt_io_expns_mgt_calc_io_expns_amt_t1.act_io_id,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.act_io_id_sub,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.expns_cd,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.itm_cd,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.itm_sub1,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.itm_sub2,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.itm_sub3,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.itm_ext,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.wg_cd,
	mgvt_io_expns_mgt_calc_io_expns_amt_t1.amt
FROM	mgw_arg mgvt_io_expns_mgw_arg_w1, mgt_calc_io_expns_amt mgvt_io_expns_mgt_calc_io_expns_amt_t1
WHERE	0=0
AND	mgvt_io_expns_mgw_arg_w1.sa_typ = fcpa_const$get_const_val('MAC_SA_TYP','ACT')
AND	mgvt_io_expns_mgw_arg_w1.calc_no = mgvt_io_expns_mgt_calc_io_expns_amt_t1.calc_no
AND	mgvt_io_expns_mgw_arg_w1.calc_grp_cd = mgvt_io_expns_mgt_calc_io_expns_amt_t1.calc_grp_cd
AND	mgvt_io_expns_mgt_calc_io_expns_amt_t1.amt <> 0
;
