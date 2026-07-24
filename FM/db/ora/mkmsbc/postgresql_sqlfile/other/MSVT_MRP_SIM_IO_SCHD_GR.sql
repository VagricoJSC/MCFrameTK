\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_sim_io_schd_gr(
itm_ord_no,
io_schd_no,
io_schd_typ,
io_schd_sts_typ,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
ver_no,
loc_cd,
base_unit_qty,
avl_schd_dt,
lot_no,
sublot_no,
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
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.itm_ord_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.io_schd_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.io_schd_typ,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.io_schd_sts_typ,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.itm_cd,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.itm_sub1,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.itm_sub2,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.itm_sub3,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.ver_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.loc_cd,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.base_unit_qty,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.avl_schd_dt,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.lot_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.sublot_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.sno1,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.sno2,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.sno3,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.sno4,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.gd_cd,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.lmt_dt,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1.wg_cd
FROM
	msvt_mrp_io_schd_gr msvt_mrp_sim_io_schd_gr_msvt_mrp_io_schd_gr_t1
UNION ALL
SELECT
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.rqmt_no AS itm_ord_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.rqmt_no AS io_schd_no,
	NULL AS io_schd_typ,
	NULL AS io_schd_sts_typ,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.itm_cd,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.itm_sub1,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.itm_sub2,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.itm_sub3,
	NULL AS ver_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.strg_loc_cd AS loc_cd,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.rqmt_qty AS base_unit_qty,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.due_dt AS avl_schd_dt,
	NULL AS lot_no,
	NULL AS sublot_no,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.sno1,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.sno2,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.sno3,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.sno4,
	t2.gd_cd,
	NULL AS lmt_dt,
	msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.wg_cd
FROM
	msvt_mrp_dly_sd AS msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1,
 	(SELECT mapa_util$f_get_def_gd_cd() AS gd_cd) t2
WHERE 0=0
AND NOT EXISTS (
	SELECT NULL
	FROM mst_itm_order AS msvt_mrp_sim_io_schd_gr_mst_itm_order_tmp
	WHERE 0=0
	AND msvt_mrp_sim_io_schd_gr_mst_itm_order_tmp.rqmt_no = msvt_mrp_sim_io_schd_gr_msvt_mrp_dly_sd_t1.rqmt_no
	)
;;

