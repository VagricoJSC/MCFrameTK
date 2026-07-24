\encoding UTF-8

CREATE OR REPLACE VIEW mst_stktk_$u(
	ctrl_tgt_dt,
	loc_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	stktk_typ,
	wg_cd,
	stktk_sts_typ,
	stktk_st_tm,
	diff_upd_tm,
	act_dpt_cd,
	act_usr_cd,
	io_ctrl_flg,
	act_qty_keep_flg,
	stktk_rpt_prnt_flg,
	diff_rpt_prnt_flg,
	stktk_rpt_rmrks,
	intr_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mst_stktk_$u_mst_stktk_all_org.ctrl_tgt_dt,
	mst_stktk_$u_mst_stktk_all_org.loc_cd,
	mst_stktk_$u_mst_stktk_all_org.itm_cd,
	mst_stktk_$u_mst_stktk_all_org.itm_sub1,
	mst_stktk_$u_mst_stktk_all_org.itm_sub2,
	mst_stktk_$u_mst_stktk_all_org.itm_sub3,
	mst_stktk_$u_mst_stktk_all_org.stktk_typ,
	mst_stktk_$u_mst_stktk_all_org.wg_cd,
	mst_stktk_$u_mst_stktk_all_org.stktk_sts_typ,
	mst_stktk_$u_mst_stktk_all_org.stktk_st_tm,
	mst_stktk_$u_mst_stktk_all_org.diff_upd_tm,
	mst_stktk_$u_mst_stktk_all_org.act_dpt_cd,
	mst_stktk_$u_mst_stktk_all_org.act_usr_cd,
	mst_stktk_$u_mst_stktk_all_org.io_ctrl_flg,
	mst_stktk_$u_mst_stktk_all_org.act_qty_keep_flg,
	mst_stktk_$u_mst_stktk_all_org.stktk_rpt_prnt_flg,
	mst_stktk_$u_mst_stktk_all_org.diff_rpt_prnt_flg,
	mst_stktk_$u_mst_stktk_all_org.stktk_rpt_rmrks,
	mst_stktk_$u_mst_stktk_all_org.intr_rmrks,
	mst_stktk_$u_mst_stktk_all_org.sub_char1,
	mst_stktk_$u_mst_stktk_all_org.sub_char2,
	mst_stktk_$u_mst_stktk_all_org.sub_char3,
	mst_stktk_$u_mst_stktk_all_org.ins_usr_id,
	mst_stktk_$u_mst_stktk_all_org.ins_usr_nm,
	mst_stktk_$u_mst_stktk_all_org.ins_ts,
	mst_stktk_$u_mst_stktk_all_org.ins_func_id,
	mst_stktk_$u_mst_stktk_all_org.upd_cntr,
	mst_stktk_$u_mst_stktk_all_org.upd_usr_id,
	mst_stktk_$u_mst_stktk_all_org.upd_usr_nm,
	mst_stktk_$u_mst_stktk_all_org.upd_ts,
	mst_stktk_$u_mst_stktk_all_org.upd_func_id,
	mst_stktk_$u_mst_stktk_all_org.upd_srv_req_no
FROM
	mst_stktk_all mst_stktk_$u_mst_stktk_all_org
WHERE
	0 = 0
	AND mst_stktk_$u_mst_stktk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

