\encoding UTF-8

CREATE OR REPLACE VIEW msvt_mrp_stk(
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
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.itm_cd,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.itm_sub1,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.itm_sub2,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.itm_sub3,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.lot_no,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.sublot_no,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.loc_cd,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.sno1,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.sno2,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.sno3,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.sno4,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.gd_cd,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.base_unit_qty,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.ver_no,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.first_gr_dt,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.lot_seq,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.avl_schd_dt,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.lmt_dt,
	msvt_mrp_stk_msvt_mrp_valid_stk_t1.wg_cd
FROM
	msvt_mrp_valid_stk msvt_mrp_stk_msvt_mrp_valid_stk_t1
UNION ALL
SELECT
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.itm_cd,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.itm_sub1,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.itm_sub2,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.itm_sub3,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.lot_no,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.sublot_no,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.loc_cd,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.sno1,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.sno2,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.sno3,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.sno4,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.gd_cd,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.base_unit_qty,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.ver_no,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.first_gr_dt,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.lot_seq,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.avl_schd_dt,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.lmt_dt,
	msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2.wg_cd
FROM
	msvt_mrp_minus_stk_gi msvt_mrp_stk_msvt_mrp_minus_stk_gi_t2
;;

