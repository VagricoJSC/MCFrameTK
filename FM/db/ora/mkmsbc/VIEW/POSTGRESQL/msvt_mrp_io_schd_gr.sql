SELECT
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_pr_no AS itm_ord_no,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_no,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_typ,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_sts_typ,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_cd,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub1,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub2,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub3,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.ver_no,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.loc_cd,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.base_unit_qty,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.schd_dt - (COALESCE(msvt_mrp_io_schd_gr_mavm_itm_wg_t3.mrp_alloc_margin_days, 0)::NUMERIC || ' days')::INTERVAL AS avl_schd_dt,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.lot_no,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sublot_no,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sno1,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sno2,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sno3,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sno4,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.gd_cd,
	msvt_mrp_io_schd_gr_msvt_lot_list_t2.lmt_dt,
	msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.wg_cd
FROM
	msvt_avl_io_schd msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1
	LEFT OUTER JOIN msvt_lot_list msvt_mrp_io_schd_gr_msvt_lot_list_t2
		ON (msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_cd = msvt_mrp_io_schd_gr_msvt_lot_list_t2.itm_cd AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub1 = msvt_mrp_io_schd_gr_msvt_lot_list_t2.itm_sub1 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub2 = msvt_mrp_io_schd_gr_msvt_lot_list_t2.itm_sub2 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub3 = msvt_mrp_io_schd_gr_msvt_lot_list_t2.itm_sub3 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.lot_no = msvt_mrp_io_schd_gr_msvt_lot_list_t2.lot_no AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.sublot_no = msvt_mrp_io_schd_gr_msvt_lot_list_t2.sublot_no)
	LEFT OUTER JOIN mavm_itm_wg msvt_mrp_io_schd_gr_mavm_itm_wg_t3
		ON (msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_cd = msvt_mrp_io_schd_gr_mavm_itm_wg_t3.itm_cd AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub1 = msvt_mrp_io_schd_gr_mavm_itm_wg_t3.itm_sub1 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub2 = msvt_mrp_io_schd_gr_mavm_itm_wg_t3.itm_sub2 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.itm_sub3 = msvt_mrp_io_schd_gr_mavm_itm_wg_t3.itm_sub3 AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.wg_cd = msvt_mrp_io_schd_gr_mavm_itm_wg_t3.wg_cd)
WHERE 0=0
AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.quality_typ = fcpa_const$get_const_val('MAC_QUALITY_TYP','GOOD')
AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GR')
/* 仕入直送の受払予定は出庫、入庫とも対象外とする */
AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_typ NOT IN (
	fcpa_const$get_const_val('MSC_IO_SCHD_TYP','PURC_GR_DDLV')	/* 仕入入庫（直送） */
	)
AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.stk_id_typ IN (
	fcpa_const$get_const_val('MSC_STK_ID_TYP','COSTK'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','RNT_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','NCV_RCV'),
	fcpa_const$get_const_val('MSC_STK_ID_TYP','ONR_PROV')
	)
AND msvt_mrp_io_schd_gr_msvt_avl_io_schd_t1.io_schd_pr_no IS NOT NULL
;
