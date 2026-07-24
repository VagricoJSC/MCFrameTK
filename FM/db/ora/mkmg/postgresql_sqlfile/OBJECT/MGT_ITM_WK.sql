\encoding UTF-8

CREATE OR REPLACE VIEW mgt_itm_wk(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
	oper_ptn,
	oper_cd,
	oper_seq,
	wk_cost_cd,
	term,
	calc_ctg_cd,
	wg_cd,
	base_qty,
	fxd_wk_cost,
	wk_cost,
	min_wk_cost,
	batch_wk_cost,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	non_calc_flg,
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
	mgt_itm_wk_mgt_itm_wk_all_org.itm_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.itm_sub1,
	mgt_itm_wk_mgt_itm_wk_all_org.itm_sub2,
	mgt_itm_wk_mgt_itm_wk_all_org.itm_sub3,
	mgt_itm_wk_mgt_itm_wk_all_org.loc_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.oper_ptn,
	mgt_itm_wk_mgt_itm_wk_all_org.oper_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.oper_seq,
	mgt_itm_wk_mgt_itm_wk_all_org.wk_cost_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.term,
	mgt_itm_wk_mgt_itm_wk_all_org.calc_ctg_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.wg_cd,
	mgt_itm_wk_mgt_itm_wk_all_org.base_qty,
	mgt_itm_wk_mgt_itm_wk_all_org.fxd_wk_cost,
	mgt_itm_wk_mgt_itm_wk_all_org.wk_cost,
	mgt_itm_wk_mgt_itm_wk_all_org.min_wk_cost,
	mgt_itm_wk_mgt_itm_wk_all_org.batch_wk_cost,
	mgt_itm_wk_mgt_itm_wk_all_org.rmrks,
	mgt_itm_wk_mgt_itm_wk_all_org.sub_char1,
	mgt_itm_wk_mgt_itm_wk_all_org.sub_char2,
	mgt_itm_wk_mgt_itm_wk_all_org.sub_char3,
	mgt_itm_wk_mgt_itm_wk_all_org.non_calc_flg,
	mgt_itm_wk_mgt_itm_wk_all_org.ins_usr_id,
	mgt_itm_wk_mgt_itm_wk_all_org.ins_usr_nm,
	mgt_itm_wk_mgt_itm_wk_all_org.ins_ts,
	mgt_itm_wk_mgt_itm_wk_all_org.ins_func_id,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_cntr,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_usr_id,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_usr_nm,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_ts,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_func_id,
	mgt_itm_wk_mgt_itm_wk_all_org.upd_srv_req_no
FROM
	mgt_itm_wk_all mgt_itm_wk_mgt_itm_wk_all_org
WHERE
	0 = 0
	AND mgt_itm_wk_mgt_itm_wk_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_itm_wk_fct_context WHERE pid = pg_backend_pid())
;

