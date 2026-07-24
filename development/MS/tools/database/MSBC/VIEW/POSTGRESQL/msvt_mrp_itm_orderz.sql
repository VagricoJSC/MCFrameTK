SELECT
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_ord_no,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_ord_typ,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_ord_sts_typ,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub1,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub2,
	msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub3,
	msvt_mrp_itm_orderz_mst_itm_order_t1.ver_no,
	msvt_mrp_itm_orderz_mst_itm_order_t1.strg_loc_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.bom_ptn,
	msvt_mrp_itm_orderz_mst_itm_order_t1.oper_ptn,
	msvt_mrp_itm_orderz_mst_itm_order_t1.mfg_loc_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sppl_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.maker_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.rqst_loc_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.rqst_wg_cd,
	msvt_mrp_itm_orderz_mst_itm_order_t1.yield_schd_qty,
	msvt_mrp_itm_orderz_mst_itm_order_t1.master_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.po_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.gi_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.mfg_st_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.mfg_end_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.strg_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.accpt_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.insp_st_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.insp_end_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.avl_schd_dt - (COALESCE(msvt_mrp_itm_orderz_mavm_itm_wg_t2.mrp_alloc_margin_days, 0)::NUMERIC || ' days')::INTERVAL AS avl_schd_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno1,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno_typ1,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno2,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno_typ2,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno3,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno_typ3,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno4,
	msvt_mrp_itm_orderz_mst_itm_order_t1.sno_typ4,
	msvt_mrp_itm_orderz_mst_itm_order_t1.lmt_dt,
	msvt_mrp_itm_orderz_mst_itm_order_t1.rqmt_no,
	msvt_mrp_itm_orderz_mst_itm_order_t1.wg_cd
FROM
	mst_itm_order msvt_mrp_itm_orderz_mst_itm_order_t1
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_itm_orderz_mavm_itm_wg_t2
		ON (msvt_mrp_itm_orderz_mst_itm_order_t1.itm_cd = msvt_mrp_itm_orderz_mavm_itm_wg_t2.itm_cd AND msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub1 = msvt_mrp_itm_orderz_mavm_itm_wg_t2.itm_sub1 AND msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub2 = msvt_mrp_itm_orderz_mavm_itm_wg_t2.itm_sub2 AND msvt_mrp_itm_orderz_mst_itm_order_t1.itm_sub3 = msvt_mrp_itm_orderz_mavm_itm_wg_t2.itm_sub3 AND msvt_mrp_itm_orderz_mst_itm_order_t1.wg_cd = msvt_mrp_itm_orderz_mavm_itm_wg_t2.wg_cd)
WHERE 0=0
AND msvt_mrp_itm_orderz_mst_itm_order_t1.itm_ord_sts_typ IN (
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','SAV'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','OPN')
	)
;
