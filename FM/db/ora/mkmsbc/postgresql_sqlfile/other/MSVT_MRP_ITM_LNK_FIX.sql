\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_itm_lnk_fix(
itm_ord_no,
par_itm_ord_no,
par_oper_ord_no,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
wg_cd
)
AS
SELECT
	 mst_itm_lnk_fix_t1.itm_ord_no
	,mst_itm_lnk_fix_t1.par_itm_ord_no
	,mst_oper_order_t4.oper_ord_no
	,mst_itm_order_t2.itm_cd
	,mst_itm_order_t2.itm_sub1
	,mst_itm_order_t2.itm_sub2
	,mst_itm_order_t2.itm_sub3
	,mst_itm_lnk_fix_t1.wg_cd
FROM  mst_itm_lnk_fix mst_itm_lnk_fix_t1
	INNER JOIN mst_itm_order mst_itm_order_t2 ON (mst_itm_lnk_fix_t1.itm_ord_no = mst_itm_order_t2.itm_ord_no and mst_itm_lnk_fix_t1.wg_cd = mst_itm_order_t2.wg_cd)
	INNER JOIN mst_itm_order mst_itm_order_t3 ON (mst_itm_lnk_fix_t1.par_itm_ord_no = mst_itm_order_t3.itm_ord_no and mst_itm_lnk_fix_t1.wg_cd = mst_itm_order_t3.wg_cd)
	LEFT OUTER JOIN mst_oper_order mst_oper_order_t4 ON (mst_itm_lnk_fix_t1.par_itm_ord_no = mst_oper_order_t4.itm_ord_no AND mst_itm_lnk_fix_t1.oper_ptn = mst_oper_order_t4.oper_ptn AND mst_itm_lnk_fix_t1.oper_cd = mst_oper_order_t4.oper_cd AND mst_itm_lnk_fix_t1.oper_seq = mst_oper_order_t4.oper_seq AND mst_itm_lnk_fix_t1.wg_cd = mst_oper_order_t4.wg_cd)
WHERE 0=0
AND mst_itm_order_t2.itm_ord_sts_typ in (
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','SAV'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','FIX'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','PART_INST'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','INST')
	)
AND mst_itm_order_t3.itm_ord_sts_typ in (
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','SAV'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','FIX'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','PART_INST'),
	fcpa_const$get_const_val('MSC_ITM_ORD_STS_TYP','INST')
	)
;;

