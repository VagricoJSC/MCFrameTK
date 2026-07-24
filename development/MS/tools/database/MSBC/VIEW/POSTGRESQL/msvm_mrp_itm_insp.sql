SELECT
	msvm_mrp_itm_insp_mam_itm_insp_t1.itm_cd,
	msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub1,
	msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub2,
	msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub3,
	msvm_mrp_itm_insp_mam_itm_insp_t1.mfg_loc_cd,
	msvm_mrp_itm_insp_mam_itm_insp_t1.sppl_cd,
	msvm_mrp_itm_insp_mam_itm_insp_t1.maker_cd,
	msvm_mrp_itm_insp_mam_itm_insp_t1.from_site_cd,
	msvm_mrp_itm_insp_mam_itm_insp_t1.to_site_cd,
	msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.insp_lt,
	msvm_mrp_itm_insp_mam_itm_insp_t1.insp_offst,
	fcpa_postgres_util$greatest(msvm_mrp_itm_insp_mam_itm_insp_t1.st_dt, COALESCE(msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.st_dt, msvm_mrp_itm_insp_mam_itm_insp_t1.st_dt)) AS st_dt,
	fcpa_postgres_util$least(msvm_mrp_itm_insp_mam_itm_insp_t1.end_dt, COALESCE(msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.end_dt, msvm_mrp_itm_insp_mam_itm_insp_t1.end_dt)) AS end_dt,
	msvm_mrp_itm_insp_mam_loc_t3.wg_cd
FROM	mam_itm_insp msvm_mrp_itm_insp_mam_itm_insp_t1
	JOIN mam_itm_insp_ptn msvm_mrp_itm_insp_mam_itm_insp_ptn_t2 ON (0=0
		AND msvm_mrp_itm_insp_mam_itm_insp_t1.itm_cd = msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.itm_cd 
		AND msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub1 = msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.itm_sub1 
		AND msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub2 = msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.itm_sub2 
		AND msvm_mrp_itm_insp_mam_itm_insp_t1.itm_sub3 = msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.itm_sub3 
		AND msvm_mrp_itm_insp_mam_itm_insp_t1.insp_ptn_cd = msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.insp_ptn_cd
		AND msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.del_flg = '0'
		AND fcpa_postgres_util$greatest(msvm_mrp_itm_insp_mam_itm_insp_t1.st_dt, COALESCE(msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.st_dt, msvm_mrp_itm_insp_mam_itm_insp_t1.st_dt)) <= fcpa_postgres_util$least(msvm_mrp_itm_insp_mam_itm_insp_t1.end_dt, COALESCE(msvm_mrp_itm_insp_mam_itm_insp_ptn_t2.end_dt, msvm_mrp_itm_insp_mam_itm_insp_t1.end_dt))
		)
	LEFT OUTER JOIN mam_loc msvm_mrp_itm_insp_mam_loc_t3 ON (msvm_mrp_itm_insp_mam_itm_insp_t1.mfg_loc_cd = msvm_mrp_itm_insp_mam_loc_t3.loc_cd)
WHERE	0=0
AND	msvm_mrp_itm_insp_mam_itm_insp_t1.del_flg = '0'
;
