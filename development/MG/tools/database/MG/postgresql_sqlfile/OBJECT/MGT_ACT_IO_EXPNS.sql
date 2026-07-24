\encoding UTF-8

CREATE OR REPLACE VIEW mgt_act_io_expns(
	act_io_id,
	act_io_id_sub,
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
	mgt_act_io_expns_mgt_act_io_expns_all_org.act_io_id,
	mgt_act_io_expns_mgt_act_io_expns_all_org.act_io_id_sub,
	mgt_act_io_expns_mgt_act_io_expns_all_org.expns_cd,
	mgt_act_io_expns_mgt_act_io_expns_all_org.amt,
	mgt_act_io_expns_mgt_act_io_expns_all_org.ins_usr_id,
	mgt_act_io_expns_mgt_act_io_expns_all_org.ins_usr_nm,
	mgt_act_io_expns_mgt_act_io_expns_all_org.ins_ts,
	mgt_act_io_expns_mgt_act_io_expns_all_org.ins_func_id,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_cntr,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_usr_id,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_usr_nm,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_ts,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_func_id,
	mgt_act_io_expns_mgt_act_io_expns_all_org.upd_srv_req_no
FROM
	mgt_act_io_expns_all mgt_act_io_expns_mgt_act_io_expns_all_org
WHERE
	0 = 0
	AND mgt_act_io_expns_mgt_act_io_expns_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_act_io_expns_fct_context WHERE pid = pg_backend_pid())
;

