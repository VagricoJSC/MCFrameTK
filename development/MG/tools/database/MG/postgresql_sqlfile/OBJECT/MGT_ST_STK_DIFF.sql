\encoding UTF-8

CREATE OR REPLACE VIEW mgt_st_stk_diff(
	st_stk_key,
	expns_cd,
	diff_amt,
	bf_amt,
	af_amt,
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
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.st_stk_key,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.expns_cd,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.diff_amt,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.bf_amt,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.af_amt,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.ins_usr_id,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.ins_usr_nm,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.ins_ts,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.ins_func_id,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_cntr,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_usr_id,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_usr_nm,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_ts,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_func_id,
	mgt_st_stk_diff_mgt_st_stk_diff_all_org.upd_srv_req_no
FROM
	mgt_st_stk_diff_all mgt_st_stk_diff_mgt_st_stk_diff_all_org
WHERE
	0 = 0
	AND mgt_st_stk_diff_mgt_st_stk_diff_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_st_stk_diff_fct_context WHERE pid = pg_backend_pid())
;

