\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_loc(
loc_cd,
loc_grp_cd,
cal_cd,
site_cd,
lg_grp_cd,
lg_cal_cd,
sppl_cd,
sppl_cal_cd,
loc_mng_typ,
alloc_lmt_flg,
wg_cd
)
AS
SELECT
	msvm_mrp_loc_mam_loc_t1.loc_cd,
	msvm_mrp_loc_mam_loc_t1.loc_grp_cd,
	COALESCE(msvm_mrp_loc_mam_loc_t1.cal_cd, msvm_mrp_loc_mam_co_t4.std_cal_cd) AS cal_cd,
	msvm_mrp_loc_mam_loc_t1.site_cd,
	msvm_mrp_loc_mam_loc_t1.lg_grp_cd,
	COALESCE(msvm_mrp_loc_mam_lg_grp_t2.cal_cd, msvm_mrp_loc_mam_co_t4.std_cal_cd) AS lg_cal_cd,
	msvm_mrp_loc_mam_loc_t1.sppl_cd,
	msvm_mrp_loc_mam_bp_t3.sppl_cal_cd,
	msvm_mrp_loc_mam_loc_t1.loc_mng_typ,
	msvm_mrp_loc_mam_loc_t1.alloc_lmt_flg,
	msvm_mrp_loc_mam_loc_t1.wg_cd
FROM mam_co msvm_mrp_loc_mam_co_t4,
	mam_loc msvm_mrp_loc_mam_loc_t1
	LEFT OUTER JOIN mam_lg_grp msvm_mrp_loc_mam_lg_grp_t2 ON (msvm_mrp_loc_mam_loc_t1.lg_grp_cd = msvm_mrp_loc_mam_lg_grp_t2.lg_grp_cd)
	LEFT OUTER JOIN mam_bp AS msvm_mrp_loc_mam_bp_t3 ON (msvm_mrp_loc_mam_loc_t1.sppl_cd = msvm_mrp_loc_mam_bp_t3.bp_cd)
WHERE 0=0
AND msvm_mrp_loc_mam_loc_t1.del_flg = '0'
;;

