\encoding UTF-8

DO $$
BEGIN
CREATE OR REPLACE VIEW mgvt_msvt_lot_list
AS
SELECT
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.itm_cd,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.itm_sub1,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.itm_sub2,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.itm_sub3,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_no,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.sublot_no,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.schd_flg,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.ver_no,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.first_gr_dt,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.base_gr_dt,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.unreg_lmt_flg,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.vld_dt,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lmt_dt,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_mng_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.sublot_mng_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.bp_lot_no,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.stk_insp_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.quality_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.mfg_aprv_sts_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.insp_aprv_sts_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.plnt_aprv_sts_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.mrkt_judg_sts_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.first_gr_dt_save_flg,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.act_cont_fctr,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lmt_dt_frm_typ,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lmt_dt_frm,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_seq,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_rmrks,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_char1,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_char2,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_char3,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_char4,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_char5,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_num1,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_num2,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_num3,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_num4,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_num5,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_dt1,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_dt2,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_dt3,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_dt4,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_dt5,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_flg1,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_flg2,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_flg3,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_flg4,
	mgvt_msvt_lot_list_org_msvt_lot_list_t1.lot_sub_flg5
FROM 
	msvt_lot_list mgvt_msvt_lot_list_org_msvt_lot_list_t1
;
EXCEPTION WHEN OTHERS THEN
	null;
END
$$
;


