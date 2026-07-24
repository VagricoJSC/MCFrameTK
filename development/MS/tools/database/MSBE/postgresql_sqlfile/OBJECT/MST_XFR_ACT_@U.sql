\encoding UTF-8

CREATE OR REPLACE VIEW mst_xfr_act_$u(
	xfr_act_no,
	xfr_inst_no,
	trd_cd,
	trd_ptn_typ,
	wg_cd,
	lg_grp_cd,
	gr_loc_cd,
	gr_stk_arrv_bp_cd,
	xfr_dt,
	ac_dt,
	act_usr_cd,
	act_dpt_cd,
	dlv_prnt_flg,
	dlv_prnt_tm,
	intr_rmrks,
	trd_rmrks,
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
	mst_xfr_act_$u_mst_xfr_act_all_org.xfr_act_no,
	mst_xfr_act_$u_mst_xfr_act_all_org.xfr_inst_no,
	mst_xfr_act_$u_mst_xfr_act_all_org.trd_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.trd_ptn_typ,
	mst_xfr_act_$u_mst_xfr_act_all_org.wg_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.lg_grp_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.gr_loc_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.gr_stk_arrv_bp_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.xfr_dt,
	mst_xfr_act_$u_mst_xfr_act_all_org.ac_dt,
	mst_xfr_act_$u_mst_xfr_act_all_org.act_usr_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.act_dpt_cd,
	mst_xfr_act_$u_mst_xfr_act_all_org.dlv_prnt_flg,
	mst_xfr_act_$u_mst_xfr_act_all_org.dlv_prnt_tm,
	mst_xfr_act_$u_mst_xfr_act_all_org.intr_rmrks,
	mst_xfr_act_$u_mst_xfr_act_all_org.trd_rmrks,
	mst_xfr_act_$u_mst_xfr_act_all_org.sub_char1,
	mst_xfr_act_$u_mst_xfr_act_all_org.sub_char2,
	mst_xfr_act_$u_mst_xfr_act_all_org.sub_char3,
	mst_xfr_act_$u_mst_xfr_act_all_org.ins_usr_id,
	mst_xfr_act_$u_mst_xfr_act_all_org.ins_usr_nm,
	mst_xfr_act_$u_mst_xfr_act_all_org.ins_ts,
	mst_xfr_act_$u_mst_xfr_act_all_org.ins_func_id,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_cntr,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_usr_id,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_usr_nm,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_ts,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_func_id,
	mst_xfr_act_$u_mst_xfr_act_all_org.upd_srv_req_no
FROM
	mst_xfr_act_all mst_xfr_act_$u_mst_xfr_act_all_org
WHERE
	0 = 0
	AND mst_xfr_act_$u_mst_xfr_act_all_org.co_cd = fcpa_context$f_get_co_cd()
;

