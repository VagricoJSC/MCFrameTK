SELECT
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.itm_cd,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.itm_sub1,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.itm_sub2,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.itm_sub3,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.loc_cd,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.st_dt,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.end_dt,
	msvm_mrp_stk_rpl_mam_stk_rpl_t1.buf_qty,
	msvm_mrp_stk_rpl_mam_loc_t2.wg_cd
FROM mam_stk_rpl msvm_mrp_stk_rpl_mam_stk_rpl_t1,
	mam_loc msvm_mrp_stk_rpl_mam_loc_t2
WHERE 0=0
AND msvm_mrp_stk_rpl_mam_stk_rpl_t1.buf_qty > 0
AND msvm_mrp_stk_rpl_mam_stk_rpl_t1.loc_cd = msvm_mrp_stk_rpl_mam_loc_t2.loc_cd
AND msvm_mrp_stk_rpl_mam_stk_rpl_t1.del_flg = '0'
;
