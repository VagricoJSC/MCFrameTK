SELECT
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_ord_no,
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_ord_sts_typ,
	msvt_mrp_oper_orderz_mst_oper_order_t1.itm_ord_no,
	msvt_mrp_oper_orderz_mst_oper_order_t1.loc_cd,
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_schd_qty,
	msvt_mrp_oper_orderz_mst_oper_order_t1.st_schd_tm,
	msvt_mrp_oper_orderz_mst_oper_order_t1.end_schd_tm,
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_ptn,
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_cd,
	msvt_mrp_oper_orderz_mst_oper_order_t1.oper_seq,
	msvt_mrp_oper_orderz_mst_oper_order_t1.disp_seq,
	msvt_mrp_oper_orderz_mst_oper_order_t1.wg_cd
FROM
	mst_oper_order msvt_mrp_oper_orderz_mst_oper_order_t1,
	mst_itm_order msvt_mrp_oper_orderz_mst_itm_order_t2
WHERE 0=0
AND msvt_mrp_oper_orderz_mst_oper_order_t1.itm_ord_no = msvt_mrp_oper_orderz_mst_itm_order_t2.itm_ord_no
AND msvt_mrp_oper_orderz_mst_oper_order_t1.itm_ord_sts_typ IN (
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','SAV'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','OPN')
	)
;
