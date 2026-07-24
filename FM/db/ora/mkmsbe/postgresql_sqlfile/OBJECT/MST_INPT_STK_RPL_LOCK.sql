\encoding UTF-8

CREATE OR REPLACE VIEW mst_inpt_stk_rpl_lock(
	loc_cd,
	str_ln_cd,
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
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.loc_cd,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.str_ln_cd,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.ins_usr_id,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.ins_usr_nm,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.ins_ts,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.ins_func_id,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_cntr,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_usr_id,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_usr_nm,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_ts,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_func_id,
	mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.upd_srv_req_no
FROM
	mst_inpt_stk_rpl_lock_all mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org
WHERE
	0 = 0
	AND mst_inpt_stk_rpl_lock_mst_inpt_stk_rpl_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_inpt_stk_rpl_lock_fct_context WHERE pid = pg_backend_pid())
;

