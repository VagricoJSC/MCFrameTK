SELECT
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_loc_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sppl_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.maker_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rqst_loc_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.wg_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.bom_ptn,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.st_dt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.end_dt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.oper_ptn,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_lt_add_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_lt_add_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_basis_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.accpt_insp_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.buf_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ord_fix_pd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sz_day_week_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sz_week,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.lot_sz_pd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.min_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.batch_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.max_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.max_order,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.prio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.order_ratio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.yield_schd_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_inst_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.fxd_rqmt_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.lot_issue_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.bkf_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ln_stk_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.pre_po_tgt_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.inst_rec_issue_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.no_mfg_aprv_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_lower_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_std_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_upper_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_id_typ,
	COALESCE(mavm_itm_dtl_purc_mam_itm_dtl_all_org.rqst_wg_cd, mavm_itm_dtl_purc_mam_itm_dtl_all_org.wg_cd) AS rqst_wg_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.po_batch_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_std_qty1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_unit_qty1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_std_qty2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_unit_qty2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno4,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.not_mrp_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.cost_ratio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_func_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_cntr,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_func_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_srv_req_no
FROM 
	mam_itm_dtl_all mavm_itm_dtl_purc_mam_itm_dtl_all_org
WHERE 
	0 = 0
AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_flg = '0' 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.wg_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.sppl_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL')
UNION ALL
SELECT
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_loc_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sppl_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.maker_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rqst_loc_cd,
	mavm_itm_dtl_purc_mam_wg_wg.wg_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.bom_ptn,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.st_dt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.end_dt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.oper_ptn,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_lt_add_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_lt_add_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_basis_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.accpt_insp_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.buf_lt,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ord_fix_pd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sz_day_week_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sz_week,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.lot_sz_pd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.min_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.batch_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.max_lot_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.max_order,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.prio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.order_ratio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.yield_schd_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.mfg_inst_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.fxd_rqmt_qty,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.lot_issue_typ,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.bkf_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ln_stk_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.pre_po_tgt_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.inst_rec_issue_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.no_mfg_aprv_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_lower_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_std_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_upper_yield,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.purc_id_typ,
	COALESCE(mavm_itm_dtl_purc_mam_itm_dtl_all_org.rqst_wg_cd, mavm_itm_dtl_purc_mam_wg_wg.wg_cd) AS rqst_wg_cd,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.po_batch_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_std_qty1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_unit_qty1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_std_qty2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.rsrc_unit_qty2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.sno4,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.not_mrp_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.cost_ratio,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo1,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo2,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.memo3,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_flg,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.ins_func_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_cntr,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_usr_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_usr_nm,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_ts,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_func_id,
	mavm_itm_dtl_purc_mam_itm_dtl_all_org.upd_srv_req_no
FROM 
	mam_wg mavm_itm_dtl_purc_mam_wg_wg,
	mam_itm_dtl_all mavm_itm_dtl_purc_mam_itm_dtl_all_org
WHERE 
	0 = 0
AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.del_flg = '0' 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.co_cd = fcpa_context$f_get_co_cd() 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.wg_cd = fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	AND (mavm_itm_dtl_purc_mam_wg_wg.lg_flg = '1' OR mavm_itm_dtl_purc_mam_wg_wg.mfg_flg = '1' OR mavm_itm_dtl_purc_mam_wg_wg.sls_flg = '1') 
	AND mavm_itm_dtl_purc_mam_itm_dtl_all_org.sppl_cd <> fcpa_const$get_const_val('MAC_STR','NULL_VAL') 
	AND NOT EXISTS (
		SELECT	'X'
		FROM mam_itm_dtl_all AS mavm_itm_dtl_purc_mam_itm_dtl_all_x
		WHERE	0=0
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.co_cd = mavm_itm_dtl_purc_mam_itm_dtl_all_org.co_cd 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.itm_cd = mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_cd 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.itm_sub1 = mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub1 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.itm_sub2 = mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub2 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.itm_sub3 = mavm_itm_dtl_purc_mam_itm_dtl_all_org.itm_sub3 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.wg_cd = mavm_itm_dtl_purc_mam_wg_wg.wg_cd 
		AND	mavm_itm_dtl_purc_mam_itm_dtl_all_x.del_flg = '0'
		)
;
