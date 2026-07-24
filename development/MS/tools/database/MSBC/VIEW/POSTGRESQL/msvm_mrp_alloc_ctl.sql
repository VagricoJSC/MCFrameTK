SELECT
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.to_loc_cd,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.fr_loc_cd,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.itm_cd,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.itm_sub1,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.itm_sub2,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.itm_sub3,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.prio,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.xfr_lot_unit_qty,
	msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.in_loc_flg,
	msvm_mrp_alloc_ctl_mam_loc_t2.wg_cd
FROM
	mam_alloc_ctl msvm_mrp_alloc_ctl_mam_alloc_ctl_t1,
	mam_loc msvm_mrp_alloc_ctl_mam_loc_t2,
	mam_loc msvm_mrp_alloc_ctl_mam_loc_t3
WHERE 0 = 0
AND msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.to_loc_cd = msvm_mrp_alloc_ctl_mam_loc_t2.loc_cd 
AND msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.fr_loc_cd = msvm_mrp_alloc_ctl_mam_loc_t3.loc_cd 
AND msvm_mrp_alloc_ctl_mam_loc_t2.wg_cd = msvm_mrp_alloc_ctl_mam_loc_t3.wg_cd 
AND msvm_mrp_alloc_ctl_mam_alloc_ctl_t1.del_flg = '0'
;
