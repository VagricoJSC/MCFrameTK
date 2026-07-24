\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_wk_$u(
	calc_no,
	calc_grp_cd,
	wk_rec_no,
	oper_rec_no,
	wk_cost_cd,
	std_wk_cost,
	the_wk_cost,
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
	mgt_std_wk_$u_mgt_std_wk_all_org.calc_no,
	mgt_std_wk_$u_mgt_std_wk_all_org.calc_grp_cd,
	mgt_std_wk_$u_mgt_std_wk_all_org.wk_rec_no,
	mgt_std_wk_$u_mgt_std_wk_all_org.oper_rec_no,
	mgt_std_wk_$u_mgt_std_wk_all_org.wk_cost_cd,
	mgt_std_wk_$u_mgt_std_wk_all_org.std_wk_cost,
	mgt_std_wk_$u_mgt_std_wk_all_org.the_wk_cost,
	mgt_std_wk_$u_mgt_std_wk_all_org.ins_usr_id,
	mgt_std_wk_$u_mgt_std_wk_all_org.ins_usr_nm,
	mgt_std_wk_$u_mgt_std_wk_all_org.ins_ts,
	mgt_std_wk_$u_mgt_std_wk_all_org.ins_func_id,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_cntr,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_usr_id,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_usr_nm,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_ts,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_func_id,
	mgt_std_wk_$u_mgt_std_wk_all_org.upd_srv_req_no
FROM
	mgt_std_wk_all mgt_std_wk_$u_mgt_std_wk_all_org
WHERE
	0 = 0
	AND mgt_std_wk_$u_mgt_std_wk_all_org.co_cd = fcpa_context$f_get_co_cd()
;

