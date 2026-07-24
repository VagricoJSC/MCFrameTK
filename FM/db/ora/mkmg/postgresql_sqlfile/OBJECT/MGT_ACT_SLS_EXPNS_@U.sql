\encoding UTF-8

CREATE OR REPLACE VIEW mgt_act_sls_expns_$u(
	act_sls_id,
	act_sls_id_sub,
	expns_cd,
	amt,
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
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.act_sls_id,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.act_sls_id_sub,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.expns_cd,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.amt,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.ins_usr_id,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.ins_usr_nm,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.ins_ts,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.ins_func_id,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_cntr,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_usr_id,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_usr_nm,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_ts,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_func_id,
	mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.upd_srv_req_no
FROM
	mgt_act_sls_expns_all mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org
WHERE
	0 = 0
	AND mgt_act_sls_expns_$u_mgt_act_sls_expns_all_org.co_cd = fcpa_context$f_get_co_cd()
;

