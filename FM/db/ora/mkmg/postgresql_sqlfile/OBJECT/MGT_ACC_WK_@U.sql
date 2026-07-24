\encoding UTF-8

CREATE OR REPLACE VIEW mgt_acc_wk_$u(
	calc_no,
	calc_grp_cd,
	wk_rec_no,
	inpt_rec_no,
	loc_cd,
	str_ln_cd,
	oper_act_no,
	oper_cd,
	oper_seq,
	wk_cost_cd,
	wk_rsn_cd,
	act_wk_cost,
	std_wk_cost,
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
	mgt_acc_wk_$u_mgt_acc_wk_all_org.calc_no,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.calc_grp_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.wk_rec_no,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.inpt_rec_no,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.loc_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.str_ln_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.oper_act_no,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.oper_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.oper_seq,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.wk_cost_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.wk_rsn_cd,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.act_wk_cost,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.std_wk_cost,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.ins_usr_id,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.ins_usr_nm,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.ins_ts,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.ins_func_id,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_cntr,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_usr_id,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_usr_nm,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_ts,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_func_id,
	mgt_acc_wk_$u_mgt_acc_wk_all_org.upd_srv_req_no
FROM
	mgt_acc_wk_all mgt_acc_wk_$u_mgt_acc_wk_all_org
WHERE
	0 = 0
	AND mgt_acc_wk_$u_mgt_acc_wk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

