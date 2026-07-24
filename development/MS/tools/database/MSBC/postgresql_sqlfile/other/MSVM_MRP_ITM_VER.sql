\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_itm_ver(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
ver_no,
site_cd
)
AS
SELECT
	msvm_mrp_itm_ver_mam_itm_ver_t1.itm_cd,
	msvm_mrp_itm_ver_mam_itm_ver_t1.itm_sub1,
	msvm_mrp_itm_ver_mam_itm_ver_t1.itm_sub2,
	msvm_mrp_itm_ver_mam_itm_ver_t1.itm_sub3,
	msvm_mrp_itm_ver_mam_itm_ver_t1.ver_no,
	msvm_mrp_itm_ver_mam_itm_ver_t1.site_cd
FROM mam_itm_ver msvm_mrp_itm_ver_mam_itm_ver_t1
WHERE 0=0
AND msvm_mrp_itm_ver_mam_itm_ver_t1.del_flg = '0'
;;

