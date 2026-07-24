\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_itm_oper(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
loc_cd,
oper_ptn,
oper_cd,
oper_seq,
st_dt,
end_dt,
disp_seq,
oper_lt,
oper_lt_add_qty,
oper_offst_typ,
oper_offst,
oper_offst_add_qty,
yield_oper_flg,
oper_loc_cd,
sno1,
sno2,
sno3,
sno4,
wg_cd
)
AS
SELECT
	msvm_mrp_itm_oper_mam_itm_oper_t1.itm_cd,
	msvm_mrp_itm_oper_mam_itm_oper_t1.itm_sub1,
	msvm_mrp_itm_oper_mam_itm_oper_t1.itm_sub2,
	msvm_mrp_itm_oper_mam_itm_oper_t1.itm_sub3,
	msvm_mrp_itm_oper_mam_itm_oper_t1.loc_cd,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_ptn,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_cd,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_seq,
	msvm_mrp_itm_oper_mam_itm_oper_t1.st_dt,
	msvm_mrp_itm_oper_mam_itm_oper_t1.end_dt,
	msvm_mrp_itm_oper_mam_itm_oper_t1.disp_seq,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_lt,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_lt_add_qty,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_offst_typ,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_offst,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_offst_add_qty,
	msvm_mrp_itm_oper_mam_itm_oper_t1.yield_oper_flg,
	msvm_mrp_itm_oper_mam_itm_oper_t1.oper_loc_cd,
	msvm_mrp_itm_oper_mam_itm_oper_t1.sno1,
	msvm_mrp_itm_oper_mam_itm_oper_t1.sno2,
	msvm_mrp_itm_oper_mam_itm_oper_t1.sno3,
	msvm_mrp_itm_oper_mam_itm_oper_t1.sno4,
	msvm_mrp_itm_oper_mam_loc_t2.wg_cd
FROM mam_itm_oper msvm_mrp_itm_oper_mam_itm_oper_t1
	LEFT OUTER JOIN mam_loc msvm_mrp_itm_oper_mam_loc_t2 ON (msvm_mrp_itm_oper_mam_itm_oper_t1.loc_cd = msvm_mrp_itm_oper_mam_loc_t2.loc_cd)
WHERE 0=0
AND msvm_mrp_itm_oper_mam_itm_oper_t1.del_flg = '0'
;;

