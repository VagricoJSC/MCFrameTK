SELECT
	msvt_io_schd_gr_mst_ord_io_schd_t1.itm_cd,
	msvt_io_schd_gr_mst_ord_io_schd_t1.itm_sub1,
	msvt_io_schd_gr_mst_ord_io_schd_t1.itm_sub2,
	msvt_io_schd_gr_mst_ord_io_schd_t1.itm_sub3,
	msvt_io_schd_gr_mst_ord_io_schd_t1.ver_no,
	msvt_io_schd_gr_mst_ord_io_schd_t1.lot_no,
	msvt_io_schd_gr_mst_ord_io_schd_t1.sublot_no,
	msvt_io_schd_gr_mst_ord_io_schd_t1.io_schd_sub_no1,
	msvt_io_schd_gr_mst_ord_io_schd_t1.loc_cd,
	msvt_io_schd_gr_mst_ord_io_schd_t1.sno1,
	msvt_io_schd_gr_mst_ord_io_schd_t1.sno2,
	msvt_io_schd_gr_mst_ord_io_schd_t1.sno3,
	msvt_io_schd_gr_mst_ord_io_schd_t1.sno4,
	msvt_io_schd_gr_mst_ord_io_schd_t1.io_schd_typ
FROM
	mst_ord_io_schd msvt_io_schd_gr_mst_ord_io_schd_t1
WHERE 0=0
AND msvt_io_schd_gr_mst_ord_io_schd_t1.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GR')
AND msvt_io_schd_gr_mst_ord_io_schd_t1.io_schd_sub_typ1 = fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','ITM_ORD_NO')
UNION ALL
SELECT
	msvt_io_schd_gr_mst_io_schd_t2.itm_cd,
	msvt_io_schd_gr_mst_io_schd_t2.itm_sub1,
	msvt_io_schd_gr_mst_io_schd_t2.itm_sub2,
	msvt_io_schd_gr_mst_io_schd_t2.itm_sub3,
	msvt_io_schd_gr_mst_io_schd_t2.ver_no,
	msvt_io_schd_gr_mst_io_schd_t2.lot_no,
	msvt_io_schd_gr_mst_io_schd_t2.sublot_no,
	msvt_io_schd_gr_mst_io_schd_t2.io_schd_sub_no1,
	msvt_io_schd_gr_mst_io_schd_t2.loc_cd,
	msvt_io_schd_gr_mst_io_schd_t2.sno1,
	msvt_io_schd_gr_mst_io_schd_t2.sno2,
	msvt_io_schd_gr_mst_io_schd_t2.sno3,
	msvt_io_schd_gr_mst_io_schd_t2.sno4,
	msvt_io_schd_gr_mst_io_schd_t2.io_schd_typ
FROM
	mst_io_schd msvt_io_schd_gr_mst_io_schd_t2
WHERE 0=0
AND msvt_io_schd_gr_mst_io_schd_t2.io_typ = fcpa_const$get_const_val('MSC_IO_TYP','GR')
AND msvt_io_schd_gr_mst_io_schd_t2.io_schd_sub_typ1 = fcpa_const$get_const_val('MSC_IO_SCHD_SUB_TYP','ITM_ORD_NO')
;
