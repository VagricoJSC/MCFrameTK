\encoding UTF-8

CREATE OR REPLACE VIEW msvt_outsrc_info(
purc_act_d_no,
purc_act_d_seq,
itm_mfg_inst_no,
itm_inst_qty,
mfg_inst_no,
mfg_act_no,
mfg_st_qty,
outsrc_mfg_loc_cd,
outsrc_mfg_loc_wg_cd,
par_lot_no,
par_sublot_no
)
AS
SELECT
	msvt_outsrc_info_mst_purc_act_d_t1.purc_act_d_no,
	msvt_outsrc_info_mst_purc_act_d_t1.purc_act_d_seq,
	msvt_outsrc_info_mst_mfg_act_t4.itm_mfg_inst_no,
	msvt_outsrc_info_mst_itm_mfg_inst_t5.base_unit_inst_qty AS itm_inst_qty,
	msvt_outsrc_info_mst_purc_act_d_t1.mfg_inst_no,
	msvt_outsrc_info_mst_mfg_act_t4.mfg_act_no,
	msvt_outsrc_info_mst_mfg_act_rem_t6.base_unit_mfg_qty AS mfg_st_qty,
	msvt_outsrc_info_mst_itm_mfg_inst_t5.mfg_loc_cd AS outsrc_mfg_loc_cd,
	msvt_outsrc_info_mst_itm_mfg_inst_t5.wg_cd AS outsrc_mfg_loc_wg_cd,
	msvt_outsrc_info_mst_itm_mfg_inst_t5.lot_no AS par_lot_no,
	msvt_outsrc_info_mst_itm_mfg_inst_t5.sublot_no AS par_sublot_no
FROM
	mst_purc_act_d msvt_outsrc_info_mst_purc_act_d_t1
	JOIN mst_purc_schd msvt_outsrc_info_mst_purc_schd_t2 ON (msvt_outsrc_info_mst_purc_act_d_t1.purc_schd_no = msvt_outsrc_info_mst_purc_schd_t2.purc_schd_no)
	JOIN mst_arr_schd msvt_outsrc_info_mst_arr_schd_t3 ON (msvt_outsrc_info_mst_purc_schd_t2.arr_schd_no = msvt_outsrc_info_mst_arr_schd_t3.arr_schd_no)
	JOIN mst_mfg_act msvt_outsrc_info_mst_mfg_act_t4 ON (msvt_outsrc_info_mst_purc_act_d_t1.mfg_inst_no = msvt_outsrc_info_mst_mfg_act_t4.mfg_inst_no)
	JOIN mst_itm_mfg_inst msvt_outsrc_info_mst_itm_mfg_inst_t5 ON (msvt_outsrc_info_mst_mfg_act_t4.itm_mfg_inst_no = msvt_outsrc_info_mst_itm_mfg_inst_t5.itm_mfg_inst_no)
	JOIN mst_mfg_act_rem msvt_outsrc_info_mst_mfg_act_rem_t6 ON (msvt_outsrc_info_mst_mfg_act_t4.mfg_inst_no = msvt_outsrc_info_mst_mfg_act_rem_t6.mfg_inst_no AND msvt_outsrc_info_mst_mfg_act_t4.div_seq = msvt_outsrc_info_mst_mfg_act_rem_t6.div_seq)
	JOIN mst_purc_act msvt_outsrc_info_mst_purc_act_t7 ON (msvt_outsrc_info_mst_purc_act_d_t1.purc_act_no = msvt_outsrc_info_mst_purc_act_t7.purc_act_no AND msvt_outsrc_info_mst_purc_act_d_t1.purc_act_seq = msvt_outsrc_info_mst_purc_act_t7.purc_act_seq)
WHERE 0=0
AND msvt_outsrc_info_mst_purc_act_t7.slip_sts_typ = fcpa_const$get_const_val('MAC_SLIP_STS_TYP','CRT')
;;

