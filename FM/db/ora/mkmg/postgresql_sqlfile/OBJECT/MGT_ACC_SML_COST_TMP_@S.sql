\encoding UTF-8

CREATE OR REPLACE VIEW mgt_acc_sml_cost_tmp_$s(
	calc_no,
	calc_grp_cd,
	top_rec_no,
	expns_cd,
	act_cost,
	std_cost,
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
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.calc_no,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.calc_grp_cd,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.top_rec_no,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.expns_cd,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.act_cost,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.std_cost,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.ins_usr_id,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.ins_usr_nm,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.ins_ts,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.ins_func_id,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_cntr,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_usr_id,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_usr_nm,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_ts,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_func_id,
	mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.upd_srv_req_no
FROM
	mgt_acc_sml_cost_tmp_all mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org
WHERE
	0 = 0
	AND mgt_acc_sml_cost_tmp_$s_mgt_acc_sml_cost_tmp_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_acc_sml_cost_tmp_$s_fct_context WHERE pid = pg_backend_pid())
;

