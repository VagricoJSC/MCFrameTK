\encoding UTF-8

CREATE OR REPLACE VIEW mst_ship_stk_rpl_lock_$s(
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
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.loc_cd,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.str_ln_cd,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.ins_usr_id,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.ins_usr_nm,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.ins_ts,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.ins_func_id,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_cntr,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_usr_id,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_usr_nm,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_ts,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_func_id,
	mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.upd_srv_req_no
FROM
	mst_ship_stk_rpl_lock_all mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org
WHERE
	0 = 0
	AND mst_ship_stk_rpl_lock_$s_mst_ship_stk_rpl_lock_all_org.co_cd = (SELECT co_cd FROM fct_context mst_ship_stk_rpl_lock_$s_fct_context WHERE pid = pg_backend_pid())
;

