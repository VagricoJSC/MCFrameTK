\encoding UTF-8

CREATE OR REPLACE VIEW mst_sim_mrp(
	sim_mrp_no,
	wg_cd,
	sim_mrp_typ,
	sim_usr_cd,
	dly_rqmt_flg,
	stk_flg,
	gr_flg,
	gi_flg,
	ship_flg,
	tree_lvl,
	mrp_proc_dt,
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
	mst_sim_mrp_mst_sim_mrp_all_org.sim_mrp_no,
	mst_sim_mrp_mst_sim_mrp_all_org.wg_cd,
	mst_sim_mrp_mst_sim_mrp_all_org.sim_mrp_typ,
	mst_sim_mrp_mst_sim_mrp_all_org.sim_usr_cd,
	mst_sim_mrp_mst_sim_mrp_all_org.dly_rqmt_flg,
	mst_sim_mrp_mst_sim_mrp_all_org.stk_flg,
	mst_sim_mrp_mst_sim_mrp_all_org.gr_flg,
	mst_sim_mrp_mst_sim_mrp_all_org.gi_flg,
	mst_sim_mrp_mst_sim_mrp_all_org.ship_flg,
	mst_sim_mrp_mst_sim_mrp_all_org.tree_lvl,
	mst_sim_mrp_mst_sim_mrp_all_org.mrp_proc_dt,
	mst_sim_mrp_mst_sim_mrp_all_org.intr_rmrks,
	mst_sim_mrp_mst_sim_mrp_all_org.sub_char1,
	mst_sim_mrp_mst_sim_mrp_all_org.sub_char2,
	mst_sim_mrp_mst_sim_mrp_all_org.sub_char3,
	mst_sim_mrp_mst_sim_mrp_all_org.ins_usr_id,
	mst_sim_mrp_mst_sim_mrp_all_org.ins_usr_nm,
	mst_sim_mrp_mst_sim_mrp_all_org.ins_ts,
	mst_sim_mrp_mst_sim_mrp_all_org.ins_func_id,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_cntr,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_usr_id,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_usr_nm,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_ts,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_func_id,
	mst_sim_mrp_mst_sim_mrp_all_org.upd_srv_req_no
FROM
	mst_sim_mrp_all mst_sim_mrp_mst_sim_mrp_all_org
WHERE
	0 = 0
	AND mst_sim_mrp_mst_sim_mrp_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sim_mrp_fct_context WHERE pid = pg_backend_pid())
;

