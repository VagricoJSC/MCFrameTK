\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_valid_stk(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
lot_no,
sublot_no,
loc_cd,
sno1,
sno2,
sno3,
sno4,
gd_cd,
base_unit_qty,
ver_no,
first_gr_dt,
lot_seq,
avl_schd_dt,
lmt_dt,
wg_cd
)
AS
SELECT
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_cd,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub1,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub2,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub3,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.lot_no,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sublot_no,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.loc_cd,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno1,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno2,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno3,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno4,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.gd_cd,
	SUM(msvt_mrp_valid_stk_msvt_avl_stk_t1.base_unit_qty) AS base_unit_qty,
	msvt_mrp_valid_stk_msvt_lot_list_t2.ver_no,
	msvt_mrp_valid_stk_msvt_lot_list_t2.first_gr_dt,
	msvt_mrp_valid_stk_msvt_lot_list_t2.lot_seq,
	NULL::TIMESTAMP WITHOUT TIME ZONE AS avl_schd_dt,
	msvt_mrp_valid_stk_msvt_lot_list_t2.lmt_dt,
	msvt_mrp_valid_stk_mam_loc_t3.wg_cd
FROM
	msvt_avl_stk msvt_mrp_valid_stk_msvt_avl_stk_t1
	LEFT OUTER JOIN msvt_lot_list msvt_mrp_valid_stk_msvt_lot_list_t2
		ON (msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_cd = msvt_mrp_valid_stk_msvt_lot_list_t2.itm_cd AND msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub1 = msvt_mrp_valid_stk_msvt_lot_list_t2.itm_sub1 AND msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub2 = msvt_mrp_valid_stk_msvt_lot_list_t2.itm_sub2 AND msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub3 = msvt_mrp_valid_stk_msvt_lot_list_t2.itm_sub3 AND msvt_mrp_valid_stk_msvt_avl_stk_t1.lot_no = msvt_mrp_valid_stk_msvt_lot_list_t2.lot_no AND msvt_mrp_valid_stk_msvt_avl_stk_t1.sublot_no = msvt_mrp_valid_stk_msvt_lot_list_t2.sublot_no)
	LEFT OUTER JOIN mam_loc msvt_mrp_valid_stk_mam_loc_t3
		ON (msvt_mrp_valid_stk_msvt_avl_stk_t1.loc_cd = msvt_mrp_valid_stk_mam_loc_t3.loc_cd)
WHERE 0=0
AND COALESCE(msvt_mrp_valid_stk_msvt_lot_list_t2.quality_typ, msvt_mrp_valid_stk_msvt_avl_stk_t1.quality_typ) = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD')
AND msvt_mrp_valid_stk_msvt_avl_stk_t1.stk_id_typ IN (
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
GROUP BY msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_cd,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub1,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub2,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.itm_sub3,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.lot_no,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sublot_no,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.loc_cd,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno1,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno2,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno3,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.sno4,
	msvt_mrp_valid_stk_msvt_avl_stk_t1.gd_cd,
	msvt_mrp_valid_stk_msvt_lot_list_t2.ver_no,
	msvt_mrp_valid_stk_msvt_lot_list_t2.first_gr_dt,
	msvt_mrp_valid_stk_msvt_lot_list_t2.lot_seq,
	msvt_mrp_valid_stk_msvt_lot_list_t2.lmt_dt,
	msvt_mrp_valid_stk_mam_loc_t3.wg_cd
;;

