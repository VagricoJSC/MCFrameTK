\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_cost(
	calc_no,
	calc_grp_cd,
	inpt_rec_no,
	oper_rec_no,
	wk_rec_no,
	expns_cd,
	std_cost,
	the_cost,
	sml_inpt_rec_no,
	sml_oper_rec_no,
	oper_cost_flg,
	expns_typ,
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
	mgt_std_cost_mgt_std_cost_all_org.calc_no,
	mgt_std_cost_mgt_std_cost_all_org.calc_grp_cd,
	mgt_std_cost_mgt_std_cost_all_org.inpt_rec_no,
	mgt_std_cost_mgt_std_cost_all_org.oper_rec_no,
	mgt_std_cost_mgt_std_cost_all_org.wk_rec_no,
	mgt_std_cost_mgt_std_cost_all_org.expns_cd,
	mgt_std_cost_mgt_std_cost_all_org.std_cost,
	mgt_std_cost_mgt_std_cost_all_org.the_cost,
	mgt_std_cost_mgt_std_cost_all_org.sml_inpt_rec_no,
	mgt_std_cost_mgt_std_cost_all_org.sml_oper_rec_no,
	mgt_std_cost_mgt_std_cost_all_org.oper_cost_flg,
	mgt_std_cost_mgt_std_cost_all_org.expns_typ,
	mgt_std_cost_mgt_std_cost_all_org.ins_usr_id,
	mgt_std_cost_mgt_std_cost_all_org.ins_usr_nm,
	mgt_std_cost_mgt_std_cost_all_org.ins_ts,
	mgt_std_cost_mgt_std_cost_all_org.ins_func_id,
	mgt_std_cost_mgt_std_cost_all_org.upd_cntr,
	mgt_std_cost_mgt_std_cost_all_org.upd_usr_id,
	mgt_std_cost_mgt_std_cost_all_org.upd_usr_nm,
	mgt_std_cost_mgt_std_cost_all_org.upd_ts,
	mgt_std_cost_mgt_std_cost_all_org.upd_func_id,
	mgt_std_cost_mgt_std_cost_all_org.upd_srv_req_no
FROM
	mgt_std_cost_all mgt_std_cost_mgt_std_cost_all_org
WHERE
	0 = 0
	AND mgt_std_cost_mgt_std_cost_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_std_cost_fct_context WHERE pid = pg_backend_pid())
;

