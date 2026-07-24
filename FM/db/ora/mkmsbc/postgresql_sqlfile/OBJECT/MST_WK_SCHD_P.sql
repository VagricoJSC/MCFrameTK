\encoding UTF-8

CREATE OR REPLACE VIEW mst_wk_schd_p(
	wk_schd_no,
	mfg_inst_rev,
	mfg_inst_no,
	itm_mfg_inst_no,
	oper_inst_no,
	wk_cost_cd,
	wk_cost_calc_flg,
	fxd_wk_cost,
	wk_cost,
	mst_fxd_wk_cost,
	mst_wk_cost,
	disp_seq,
	can_flg,
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
	mst_wk_schd_p_mst_wk_schd_p_all_org.wk_schd_no,
	mst_wk_schd_p_mst_wk_schd_p_all_org.mfg_inst_rev,
	mst_wk_schd_p_mst_wk_schd_p_all_org.mfg_inst_no,
	mst_wk_schd_p_mst_wk_schd_p_all_org.itm_mfg_inst_no,
	mst_wk_schd_p_mst_wk_schd_p_all_org.oper_inst_no,
	mst_wk_schd_p_mst_wk_schd_p_all_org.wk_cost_cd,
	mst_wk_schd_p_mst_wk_schd_p_all_org.wk_cost_calc_flg,
	mst_wk_schd_p_mst_wk_schd_p_all_org.fxd_wk_cost,
	mst_wk_schd_p_mst_wk_schd_p_all_org.wk_cost,
	mst_wk_schd_p_mst_wk_schd_p_all_org.mst_fxd_wk_cost,
	mst_wk_schd_p_mst_wk_schd_p_all_org.mst_wk_cost,
	mst_wk_schd_p_mst_wk_schd_p_all_org.disp_seq,
	mst_wk_schd_p_mst_wk_schd_p_all_org.can_flg,
	mst_wk_schd_p_mst_wk_schd_p_all_org.intr_rmrks,
	mst_wk_schd_p_mst_wk_schd_p_all_org.sub_char1,
	mst_wk_schd_p_mst_wk_schd_p_all_org.sub_char2,
	mst_wk_schd_p_mst_wk_schd_p_all_org.sub_char3,
	mst_wk_schd_p_mst_wk_schd_p_all_org.ins_usr_id,
	mst_wk_schd_p_mst_wk_schd_p_all_org.ins_usr_nm,
	mst_wk_schd_p_mst_wk_schd_p_all_org.ins_ts,
	mst_wk_schd_p_mst_wk_schd_p_all_org.ins_func_id,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_cntr,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_usr_id,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_usr_nm,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_ts,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_func_id,
	mst_wk_schd_p_mst_wk_schd_p_all_org.upd_srv_req_no
FROM
	mst_wk_schd_p_all mst_wk_schd_p_mst_wk_schd_p_all_org
WHERE
	0 = 0
	AND mst_wk_schd_p_mst_wk_schd_p_all_org.co_cd = (SELECT co_cd FROM fct_context mst_wk_schd_p_fct_context WHERE pid = pg_backend_pid())
;

