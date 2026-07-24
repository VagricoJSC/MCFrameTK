/* 納品先 */
SELECT
	fcpa_const$get_const_val('MSC_IN_TO_ID_TYP','SCST'),
	msvm_in_to_id_mam_bp_m1.bp_cd,
	msvm_in_to_id_mam_bp_m1.bp_nm,
	msvm_in_to_id_mam_bp_m1.bp_alt_nm1,
	msvm_in_to_id_mam_bp_m1.bp_alt_nm2,
	msvm_in_to_id_mam_bp_m1.bp_alt_nm3,
	msvm_in_to_id_mam_bp_m1.bp_alt_nm4,
	msvm_in_to_id_mam_bp_m1.dlv_sundry_flg,
	msvm_in_to_id_mam_bp_m1.cntry_cd,
	msvm_in_to_id_mam_cntry_m2.cntry_nm,
	msvm_in_to_id_mam_bp_m1.del_flg,
	msvm_in_to_id_mam_bp_m1.del_usr_id,
	msvm_in_to_id_mam_bp_m1.del_usr_nm,
	msvm_in_to_id_mam_bp_m1.del_ts
FROM
	mam_bp msvm_in_to_id_mam_bp_m1
	LEFT OUTER JOIN mam_cntry msvm_in_to_id_mam_cntry_m2 ON (msvm_in_to_id_mam_cntry_m2.cntry_cd = msvm_in_to_id_mam_bp_m1.cntry_cd)
WHERE
	msvm_in_to_id_mam_bp_m1.dlv_flg = '1'
UNION ALL
/* 場所 */
SELECT
	fcpa_const$get_const_val('MSC_IN_TO_ID_TYP','LOC'),
	msvm_in_to_id_mam_loc_m1.loc_cd,
	msvm_in_to_id_mam_loc_m1.loc_nm,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	NULL,
	msvm_in_to_id_mam_loc_m1.del_flg,
	msvm_in_to_id_mam_loc_m1.del_usr_id,
	msvm_in_to_id_mam_loc_m1.del_usr_nm,
	msvm_in_to_id_mam_loc_m1.del_ts
FROM
	mam_loc msvm_in_to_id_mam_loc_m1
;
