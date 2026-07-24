\encoding UTF-8

CREATE OR REPLACE VIEW mbt_jnl_no_ctl(
	ac_ym,
	ac_if_typ,
	slip_cnt_id,
	jnl_no,
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
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ac_ym,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ac_if_typ,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.slip_cnt_id,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.jnl_no,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ins_usr_id,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ins_usr_nm,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ins_ts,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.ins_func_id,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_cntr,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_usr_id,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_usr_nm,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_ts,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_func_id,
	mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.upd_srv_req_no
FROM
	mbt_jnl_no_ctl_all mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org
WHERE
	0 = 0
	AND mbt_jnl_no_ctl_mbt_jnl_no_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mbt_jnl_no_ctl_fct_context WHERE pid = pg_backend_pid())
;

