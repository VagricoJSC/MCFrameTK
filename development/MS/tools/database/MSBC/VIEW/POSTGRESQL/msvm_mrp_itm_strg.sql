SELECT
	msvm_mrp_itm_strg_mam_itm_strg_t1.itm_cd,
	msvm_mrp_itm_strg_mam_itm_strg_t1.itm_sub1,
	msvm_mrp_itm_strg_mam_itm_strg_t1.itm_sub2,
	msvm_mrp_itm_strg_mam_itm_strg_t1.itm_sub3,
	msvm_mrp_itm_strg_mam_itm_strg_t1.loc_cd,
	msvm_mrp_itm_strg_mam_itm_strg_t1.prio,
	msvm_mrp_itm_strg_mam_loc_t2.wg_cd
FROM mam_itm_strg msvm_mrp_itm_strg_mam_itm_strg_t1,
	mam_loc msvm_mrp_itm_strg_mam_loc_t2
WHERE 0=0
AND msvm_mrp_itm_strg_mam_itm_strg_t1.loc_cd = msvm_mrp_itm_strg_mam_loc_t2.loc_cd
AND msvm_mrp_itm_strg_mam_itm_strg_t1.del_flg = '0'
;
