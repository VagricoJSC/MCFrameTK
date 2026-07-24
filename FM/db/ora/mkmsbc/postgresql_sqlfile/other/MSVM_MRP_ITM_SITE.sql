\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_itm_site(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
site_cd,
in_prmt_insp_flg
)
AS
SELECT
	msvm_mrp_itm_site_mam_itm_site_t1.itm_cd,
	msvm_mrp_itm_site_mam_itm_site_t1.itm_sub1,
	msvm_mrp_itm_site_mam_itm_site_t1.itm_sub2,
	msvm_mrp_itm_site_mam_itm_site_t1.itm_sub3,
	msvm_mrp_itm_site_mam_itm_site_t1.site_cd,
	msvm_mrp_itm_site_mam_itm_site_t1.in_prmt_insp_flg
FROM mam_itm_site msvm_mrp_itm_site_mam_itm_site_t1
WHERE 0=0
AND msvm_mrp_itm_site_mam_itm_site_t1.in_prmt_insp_flg = '1'
AND msvm_mrp_itm_site_mam_itm_site_t1.del_flg = '0'
;;

