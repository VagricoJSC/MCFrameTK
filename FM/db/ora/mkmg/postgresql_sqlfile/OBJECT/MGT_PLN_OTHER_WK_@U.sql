\encoding UTF-8

CREATE OR REPLACE VIEW mgt_pln_other_wk_$u(
	pln_other_wk_key,
	calc_ctg_cd,
	wg_cd,
	ym,
	dpt_cd,
	ctg_cd,
	loc_cd,
	oper_cd,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	wk_cost_cd,
	wk_cost,
	rmrks,
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
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.pln_other_wk_key,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.calc_ctg_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.wg_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ym,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.dpt_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ctg_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.loc_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.oper_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.lot_no,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sublot_no,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sno1,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sno2,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sno3,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sno4,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.wk_cost_cd,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.wk_cost,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.rmrks,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sub_char1,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sub_char2,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.sub_char3,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ins_usr_id,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ins_usr_nm,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ins_ts,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.ins_func_id,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_cntr,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_usr_id,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_usr_nm,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_ts,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_func_id,
	mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.upd_srv_req_no
FROM
	mgt_pln_other_wk_all mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org
WHERE
	0 = 0
	AND mgt_pln_other_wk_$u_mgt_pln_other_wk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

