SELECT
	msvt_lot_list_mst_lot_list_t1.itm_cd,
	msvt_lot_list_mst_lot_list_t1.itm_sub1,
	msvt_lot_list_mst_lot_list_t1.itm_sub2,
	msvt_lot_list_mst_lot_list_t1.itm_sub3,
	msvt_lot_list_mst_lot_list_t1.lot_no,
	msvt_lot_list_mst_lot_list_t1.sublot_no,
	msvt_lot_list_mst_lot_t2.schd_flg,
	msvt_lot_list_mst_lot_t2.ver_no,
	msvt_lot_list_mst_lot_t2.first_gr_dt,
	msvt_lot_list_mst_lot_t2.base_gr_dt,
	msvt_lot_list_mst_lot_t2.unreg_lmt_flg,
	msvt_lot_list_mst_lot_t2.vld_dt,
	msvt_lot_list_mst_lot_t2.lmt_dt,
	msvt_lot_list_mst_lot_t2.lot_mng_typ,
	msvt_lot_list_mst_lot_t2.sublot_mng_typ,
	msvt_lot_list_mst_lot_t2.bp_lot_no,
	msvt_lot_list_mst_lot_t2.stk_insp_typ,
	msvt_lot_list_mst_lot_t2.quality_typ,
	msvt_lot_list_mst_lot_t2.mfg_aprv_sts_typ,
	msvt_lot_list_mst_lot_t2.insp_aprv_sts_typ,
	msvt_lot_list_mst_lot_t2.plnt_aprv_sts_typ,
	msvt_lot_list_mst_lot_t2.mrkt_judg_sts_typ,
	msvt_lot_list_mst_lot_t2.first_gr_dt_save_flg,
	msvt_lot_list_mst_lot_t2.act_cont_fctr,
	msvt_lot_list_mst_lot_t2.lmt_dt_frm_typ,
	msvt_lot_list_mst_lot_t2.lmt_dt_frm,
	msvt_lot_list_mst_lot_t2.lot_seq,
	msvt_lot_list_mst_lot_t2.lot_rmrks,
	msvt_lot_list_mst_lot_t2.lot_sub_char1,
	msvt_lot_list_mst_lot_t2.lot_sub_char2,
	msvt_lot_list_mst_lot_t2.lot_sub_char3,
	msvt_lot_list_mst_lot_t2.lot_sub_char4,
	msvt_lot_list_mst_lot_t2.lot_sub_char5,
	msvt_lot_list_mst_lot_t2.lot_sub_num1,
	msvt_lot_list_mst_lot_t2.lot_sub_num2,
	msvt_lot_list_mst_lot_t2.lot_sub_num3,
	msvt_lot_list_mst_lot_t2.lot_sub_num4,
	msvt_lot_list_mst_lot_t2.lot_sub_num5,
	msvt_lot_list_mst_lot_t2.lot_sub_dt1,
	msvt_lot_list_mst_lot_t2.lot_sub_dt2,
	msvt_lot_list_mst_lot_t2.lot_sub_dt3,
	msvt_lot_list_mst_lot_t2.lot_sub_dt4,
	msvt_lot_list_mst_lot_t2.lot_sub_dt5,
	msvt_lot_list_mst_lot_t2.lot_sub_flg1,
	msvt_lot_list_mst_lot_t2.lot_sub_flg2,
	msvt_lot_list_mst_lot_t2.lot_sub_flg3,
	msvt_lot_list_mst_lot_t2.lot_sub_flg4,
	msvt_lot_list_mst_lot_t2.lot_sub_flg5
FROM
	mst_lot_list msvt_lot_list_mst_lot_list_t1
	LEFT OUTER JOIN mst_lot msvt_lot_list_mst_lot_t2 ON 
		(msvt_lot_list_mst_lot_t2.itm_cd = msvt_lot_list_mst_lot_list_t1.itm_cd
		AND msvt_lot_list_mst_lot_t2.itm_sub1 = msvt_lot_list_mst_lot_list_t1.itm_sub1
		AND msvt_lot_list_mst_lot_t2.itm_sub2 = msvt_lot_list_mst_lot_list_t1.itm_sub2
		AND msvt_lot_list_mst_lot_t2.itm_sub3 = msvt_lot_list_mst_lot_list_t1.itm_sub3
		AND msvt_lot_list_mst_lot_t2.lot_no = msvt_lot_list_mst_lot_list_t1.lot_no
		AND msvt_lot_list_mst_lot_t2.sublot_no = msvt_lot_list_mst_lot_list_t1.lot_tbl_sublot_no
		)
;
