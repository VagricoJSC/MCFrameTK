/* 得意先 */
SELECT
	fcpa_const$get_const_val('MSC_SHIP_RQST_ID_TYP','CST'),
	msvm_ship_rqst_id_mam_bp_m1.bp_cd,
	msvm_ship_rqst_id_mam_bp_m1.bp_nm,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm1,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm2,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm3,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm4,
	msvm_ship_rqst_id_mam_bp_m1.cntry_cd,
	msvm_ship_rqst_id_mam_cntry_m2.cntry_nm,
	NULL,
	NULL,
	NULL,
	NULL,
	msvm_ship_rqst_id_mam_bp_m1.del_flg,
	msvm_ship_rqst_id_mam_bp_m1.del_usr_id,
	msvm_ship_rqst_id_mam_bp_m1.del_usr_nm,
	msvm_ship_rqst_id_mam_bp_m1.del_ts
FROM
	mam_bp msvm_ship_rqst_id_mam_bp_m1
	LEFT OUTER JOIN mam_cntry msvm_ship_rqst_id_mam_cntry_m2 ON (msvm_ship_rqst_id_mam_cntry_m2.cntry_cd = msvm_ship_rqst_id_mam_bp_m1.cntry_cd)
WHERE
	msvm_ship_rqst_id_mam_bp_m1.cst_flg = '1'
UNION ALL
/* 発注先 */
SELECT
	fcpa_const$get_const_val('MSC_SHIP_RQST_ID_TYP','SPPL'),
	msvm_ship_rqst_id_mam_bp_m1.bp_cd,
	msvm_ship_rqst_id_mam_bp_m1.bp_nm,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm1,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm2,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm3,
	msvm_ship_rqst_id_mam_bp_m1.bp_alt_nm4,
	msvm_ship_rqst_id_mam_bp_m1.cntry_cd,
	msvm_ship_rqst_id_mam_cntry_m2.cntry_nm,
	NULL,
	NULL,
	NULL,
	NULL,
	msvm_ship_rqst_id_mam_bp_m1.del_flg,
	msvm_ship_rqst_id_mam_bp_m1.del_usr_id,
	msvm_ship_rqst_id_mam_bp_m1.del_usr_nm,
	msvm_ship_rqst_id_mam_bp_m1.del_ts
FROM
	mam_bp msvm_ship_rqst_id_mam_bp_m1
	LEFT OUTER JOIN mam_cntry msvm_ship_rqst_id_mam_cntry_m2 ON (msvm_ship_rqst_id_mam_cntry_m2.cntry_cd = msvm_ship_rqst_id_mam_bp_m1.cntry_cd)
WHERE
	msvm_ship_rqst_id_mam_bp_m1.sppl_flg = '1'
UNION ALL
/* 場所 */
SELECT
	fcpa_const$get_const_val('MSC_SHIP_RQST_ID_TYP','LOC'),
	msvm_ship_rqst_id_mam_loc_m1.loc_cd,
	msvm_ship_rqst_id_mam_loc_m1.loc_nm,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	msvm_ship_rqst_id_mam_loc_m1.site_cd,
	msvm_ship_rqst_id_mam_site_m2.site_nm,
	msvm_ship_rqst_id_mam_loc_m1.lg_grp_cd,
	msvm_ship_rqst_id_mam_lg_grp_m3.lg_grp_nm,
	msvm_ship_rqst_id_mam_loc_m1.del_flg,
	msvm_ship_rqst_id_mam_loc_m1.del_usr_id,
	msvm_ship_rqst_id_mam_loc_m1.del_usr_nm,
	msvm_ship_rqst_id_mam_loc_m1.del_ts
FROM
	mam_loc msvm_ship_rqst_id_mam_loc_m1
	LEFT OUTER JOIN mam_site msvm_ship_rqst_id_mam_site_m2 ON (msvm_ship_rqst_id_mam_site_m2.site_cd = msvm_ship_rqst_id_mam_loc_m1.site_cd)
	LEFT OUTER JOIN mam_lg_grp msvm_ship_rqst_id_mam_lg_grp_m3 ON (msvm_ship_rqst_id_mam_lg_grp_m3.lg_grp_cd = msvm_ship_rqst_id_mam_loc_m1.lg_grp_cd)
	LEFT OUTER JOIN mam_bp msvm_ship_rqst_id_mam_bp_m4 ON (msvm_ship_rqst_id_mam_bp_m4.bp_cd = msvm_ship_rqst_id_mam_loc_m1.sppl_cd)
WHERE 
	msvm_ship_rqst_id_mam_loc_m1.sppl_cd IS NULL
;
