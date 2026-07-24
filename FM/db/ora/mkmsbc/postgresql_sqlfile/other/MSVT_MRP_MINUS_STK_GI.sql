\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_minus_stk_gi(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
ver_no,
lot_no,
sublot_no,
loc_cd,
base_unit_qty,
first_gr_dt,
lot_seq,
avl_schd_dt,
sno1,
sno2,
sno3,
sno4,
gd_cd,
lmt_dt,
wg_cd
)
AS
SELECT
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_cd,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub1,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub2,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub3,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.ver_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.lot_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sublot_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.loc_cd,
	SUM(- 1 * msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.base_unit_qty) AS base_unit_qty,
	NULL::TIMESTAMP WITHOUT TIME ZONE AS first_gr_dt,
	NULL::TEXT AS lot_seq,
	NULL::TIMESTAMP WITHOUT TIME ZONE AS avl_schd_dt,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno1,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno2,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno3,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno4,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.gd_cd,
	NULL::TIMESTAMP WITHOUT TIME ZONE AS lmt_dt,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.wg_cd
FROM
	msvt_avl_io_schd msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1
WHERE 0=0
AND msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GI')
/* 以下の受払予定からオーダ生成されないようにマイナス在庫としてIFする */
/* ※良品在庫かつ検収不良でない在庫を仕入返品または廃棄しようとした場合の考慮 */
/* 不良品の在庫はMRPにIFしていないため、出庫予定もIFしない */
AND msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.io_schd_typ IN 
	(
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','ARR_RTN'),	/* 入荷返品 */
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','ARR_RTN_PROV'),	/* 入荷返品（支給） */
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','SCRP')	/* 廃棄 */
	)
AND msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.quality_typ = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD')
AND msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.stk_id_typ IN (
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
GROUP BY
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_cd,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub1,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub2,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.itm_sub3,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.ver_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.lot_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sublot_no,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.loc_cd,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno1,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno2,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno3,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.sno4,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.gd_cd,
	msvt_mrp_minus_stk_gi_msvt_avl_io_schd_t1.wg_cd
;;

