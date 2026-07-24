SELECT	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.itm_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.itm_sub1,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.itm_sub2,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.itm_sub3,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.loc_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.sppl_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.rqst_wg_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.wg_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.cost_ratio,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.oper_ptn,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.bom_ptn,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.min_lot_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.batch_lot_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.fxd_lot_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.fxd_yield_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.nmr_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.dnm_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_dpt_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.exp_dpt_cd,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.exp_prio,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.max_qty,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_val1,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_val2,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_val3,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_val4,
	mgvm_itm_dtl_mgt_calc_itm_dtl_t1.alc_val5
FROM	mgw_arg mgvm_itm_dtl_mgw_arg_w1, mgt_calc_itm_dtl mgvm_itm_dtl_mgt_calc_itm_dtl_t1
WHERE	0=0
AND	mgvm_itm_dtl_mgw_arg_w1.calc_no = mgvm_itm_dtl_mgt_calc_itm_dtl_t1.calc_no
AND	mgvm_itm_dtl_mgw_arg_w1.calc_grp_cd = mgvm_itm_dtl_mgt_calc_itm_dtl_t1.calc_grp_cd
;
