\encoding UTF-8

CREATE OR REPLACE VIEW mst_stk_xfr_act_$s(
	stk_xfr_act_no,
	trd_cd,
	trd_ptn_typ,
	loc_cd,
	wg_cd,
	act_dpt_cd,
	act_usr_cd,
	stk_xfr_act_tm,
	ac_dt,
	intr_rmrks,
	trd_rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	stk_xfr_rsn_cd,
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
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.stk_xfr_act_no,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.trd_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.trd_ptn_typ,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.loc_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.wg_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.act_dpt_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.act_usr_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.stk_xfr_act_tm,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.ac_dt,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.intr_rmrks,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.trd_rmrks,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.sub_char1,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.sub_char2,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.sub_char3,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.stk_xfr_rsn_cd,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.ins_usr_id,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.ins_usr_nm,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.ins_ts,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.ins_func_id,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_cntr,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_usr_id,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_usr_nm,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_ts,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_func_id,
	mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.upd_srv_req_no
FROM
	mst_stk_xfr_act_all mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org
WHERE
	0 = 0
	AND mst_stk_xfr_act_$s_mst_stk_xfr_act_all_org.co_cd = (SELECT co_cd FROM fct_context mst_stk_xfr_act_$s_fct_context WHERE pid = pg_backend_pid())
;

