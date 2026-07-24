\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_purc_ddlv_lt(
sppl_cd,
lg_grp_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
st_dt,
end_dt,
purc_lt,
purc_lt_add_qty
)
AS
SELECT
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.sppl_cd,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.lg_grp_cd,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.itm_cd,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.itm_sub1,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.itm_sub2,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.itm_sub3,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.st_dt,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.end_dt,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.purc_lt,
	msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.purc_lt_add_qty
FROM mam_purc_ddlv_lt msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1
WHERE 0=0
AND msvm_mrp_purc_ddlv_lt_mam_purc_ddlv_lt_t1.del_flg = '0'
;;

