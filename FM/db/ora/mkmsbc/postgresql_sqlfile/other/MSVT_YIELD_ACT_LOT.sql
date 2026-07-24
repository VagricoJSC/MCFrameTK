\encoding UTF-8

CREATE OR REPLACE VIEW msvt_yield_act_lot(
yield_act_no,
arr_act_no,
mfg_act_no,
itm_mfg_inst_no,
mfg_mtd_typ,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
trd_unit_qty,
trd_unit_cd,
base_unit_qty,
base_unit_cd,
lot_no,
sublot_no,
sno1,
sno2,
sno3,
sno4,
act_tm,
ac_dt
)
AS
SELECT
	msvt_yield_act_lot_mst_yield_act_t1.yield_act_no,
	NULL AS arr_act_no,
	msvt_yield_act_lot_mst_yield_act_t1.mfg_act_no,
	msvt_yield_act_lot_mst_yield_act_t1.itm_mfg_inst_no,
	msvt_yield_act_lot_mst_yield_act_t1.mfg_mtd_typ,
	msvt_yield_act_lot_mst_yield_act_t1.itm_cd,
	msvt_yield_act_lot_mst_yield_act_t1.itm_sub1,
	msvt_yield_act_lot_mst_yield_act_t1.itm_sub2,
	msvt_yield_act_lot_mst_yield_act_t1.itm_sub3,
	msvt_yield_act_lot_mst_yield_act_t1.trd_unit_qty,
	msvt_yield_act_lot_mst_yield_act_t1.trd_unit_cd,
	msvt_yield_act_lot_mst_yield_act_t1.base_unit_qty,
	msvt_yield_act_lot_mst_yield_act_t1.base_unit_cd,
	msvt_yield_act_lot_mst_yield_act_t1.lot_no,
	msvt_yield_act_lot_mst_yield_act_t1.sublot_no,
	msvt_yield_act_lot_mst_yield_act_t1.sno1,
	msvt_yield_act_lot_mst_yield_act_t1.sno2,
	msvt_yield_act_lot_mst_yield_act_t1.sno3,
	msvt_yield_act_lot_mst_yield_act_t1.sno4,
	msvt_yield_act_lot_mst_yield_act_t1.act_tm,
	msvt_yield_act_lot_mst_yield_act_t1.ac_dt
FROM
	mst_yield_act msvt_yield_act_lot_mst_yield_act_t1
WHERE 0=0
AND	msvt_yield_act_lot_mst_yield_act_t1.mfg_mtd_typ = fcpa_const$get_const_val('MSC_MFG_MTD_TYP','INTNL')
AND	msvt_yield_act_lot_mst_yield_act_t1.yield_typ IN (fcpa_const$get_const_val('MAC_YIELD_TYP','GOOD'), fcpa_const$get_const_val('MAC_YIELD_TYP','DFCT'))
UNION ALL
SELECT
	NULL AS yield_act_no,
	msvt_yield_act_lot_mst_arr_act_t1.arr_act_no,
	msvt_yield_act_lot_mst_mfg_act_t3.mfg_act_no,
	msvt_yield_act_lot_mst_mfg_act_t3.itm_mfg_inst_no,
	fcpa_const$get_const_val('MSC_MFG_MTD_TYP','EXTNL'),
	msvt_yield_act_lot_mst_arr_act_t1.itm_cd,
	msvt_yield_act_lot_mst_arr_act_t1.itm_sub1,
	msvt_yield_act_lot_mst_arr_act_t1.itm_sub2,
	msvt_yield_act_lot_mst_arr_act_t1.itm_sub3,
	msvt_yield_act_lot_mst_arr_act_t1.trd_unit_qty,
	msvt_yield_act_lot_mst_arr_act_t1.trd_unit_cd,
	msvt_yield_act_lot_mst_arr_act_t1.base_unit_qty,
	msvt_yield_act_lot_mst_arr_act_t1.base_unit_cd,
	msvt_yield_act_lot_mst_arr_act_t1.lot_no,
	msvt_yield_act_lot_mst_arr_act_t1.sublot_no,
	msvt_yield_act_lot_mst_arr_act_t1.sno1,
	msvt_yield_act_lot_mst_arr_act_t1.sno2,
	msvt_yield_act_lot_mst_arr_act_t1.sno3,
	msvt_yield_act_lot_mst_arr_act_t1.sno4,
	msvt_yield_act_lot_mst_arr_act_t1.arr_tm AS act_tm,
	msvt_yield_act_lot_mst_arr_act_t1.ac_dt
FROM
	mst_arr_act msvt_yield_act_lot_mst_arr_act_t1
	JOIN mst_arr_schd msvt_yield_act_lot_mst_arr_schd_t2 ON (msvt_yield_act_lot_mst_arr_act_t1.arr_schd_no = msvt_yield_act_lot_mst_arr_schd_t2.arr_schd_no)
	JOIN mst_mfg_act msvt_yield_act_lot_mst_mfg_act_t3 ON (msvt_yield_act_lot_mst_arr_schd_t2.mfg_inst_no = msvt_yield_act_lot_mst_mfg_act_t3.mfg_inst_no)
WHERE 0=0
AND msvt_yield_act_lot_mst_arr_act_t1.can_flg = '0'
;;

