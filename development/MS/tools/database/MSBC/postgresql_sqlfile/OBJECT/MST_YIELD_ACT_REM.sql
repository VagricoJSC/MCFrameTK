\encoding UTF-8

CREATE OR REPLACE VIEW mst_yield_act_rem(
	yield_schd_no,
	div_seq,
	mfg_sts_typ,
	mfg_inst_no,
	itm_mfg_inst_no,
	oper_inst_no,
	yield_typ,
	trd_unit_yield_qty,
	trd_unit_yield_rem_qty,
	trd_unit_yield_abort_qty,
	base_unit_yield_qty,
	base_unit_yield_rem_qty,
	base_unit_yield_abort_qty,
	stk_lst_prnt_flg,
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
	mst_yield_act_rem_mst_yield_act_rem_all_org.yield_schd_no,
	mst_yield_act_rem_mst_yield_act_rem_all_org.div_seq,
	mst_yield_act_rem_mst_yield_act_rem_all_org.mfg_sts_typ,
	mst_yield_act_rem_mst_yield_act_rem_all_org.mfg_inst_no,
	mst_yield_act_rem_mst_yield_act_rem_all_org.itm_mfg_inst_no,
	mst_yield_act_rem_mst_yield_act_rem_all_org.oper_inst_no,
	mst_yield_act_rem_mst_yield_act_rem_all_org.yield_typ,
	mst_yield_act_rem_mst_yield_act_rem_all_org.trd_unit_yield_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.trd_unit_yield_rem_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.trd_unit_yield_abort_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.base_unit_yield_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.base_unit_yield_rem_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.base_unit_yield_abort_qty,
	mst_yield_act_rem_mst_yield_act_rem_all_org.stk_lst_prnt_flg,
	mst_yield_act_rem_mst_yield_act_rem_all_org.sub_char1,
	mst_yield_act_rem_mst_yield_act_rem_all_org.sub_char2,
	mst_yield_act_rem_mst_yield_act_rem_all_org.sub_char3,
	mst_yield_act_rem_mst_yield_act_rem_all_org.ins_usr_id,
	mst_yield_act_rem_mst_yield_act_rem_all_org.ins_usr_nm,
	mst_yield_act_rem_mst_yield_act_rem_all_org.ins_ts,
	mst_yield_act_rem_mst_yield_act_rem_all_org.ins_func_id,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_cntr,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_usr_id,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_usr_nm,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_ts,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_func_id,
	mst_yield_act_rem_mst_yield_act_rem_all_org.upd_srv_req_no
FROM
	mst_yield_act_rem_all mst_yield_act_rem_mst_yield_act_rem_all_org
WHERE
	0 = 0
	AND mst_yield_act_rem_mst_yield_act_rem_all_org.co_cd = (SELECT co_cd FROM fct_context mst_yield_act_rem_fct_context WHERE pid = pg_backend_pid())
;

