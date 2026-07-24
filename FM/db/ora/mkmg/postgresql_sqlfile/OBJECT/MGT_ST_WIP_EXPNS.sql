\encoding UTF-8

CREATE OR REPLACE VIEW mgt_st_wip_expns(
	st_wip_key,
	expns_cd,
	wip_amt,
	inpt_amt,
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
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.st_wip_key,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.expns_cd,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.wip_amt,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.inpt_amt,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.ins_usr_id,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.ins_usr_nm,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.ins_ts,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.ins_func_id,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_cntr,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_usr_id,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_usr_nm,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_ts,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_func_id,
	mgt_st_wip_expns_mgt_st_wip_expns_all_org.upd_srv_req_no
FROM
	mgt_st_wip_expns_all mgt_st_wip_expns_mgt_st_wip_expns_all_org
WHERE
	0 = 0
	AND mgt_st_wip_expns_mgt_st_wip_expns_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_st_wip_expns_fct_context WHERE pid = pg_backend_pid())
;

