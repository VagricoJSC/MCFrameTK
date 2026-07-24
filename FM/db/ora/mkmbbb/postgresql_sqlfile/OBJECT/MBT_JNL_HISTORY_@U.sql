\encoding UTF-8

CREATE OR REPLACE VIEW mbt_jnl_history_$u(
	jnl_grp_no,
	ac_ym,
	st_dt,
	end_dt,
	ac_slip_dt,
	jnl_act_cd,
	data_typ,
	rerun_flg,
	jnl_rmrks,
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
	mbt_jnl_history_$u_mbt_jnl_history_all_org.jnl_grp_no,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ac_ym,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.st_dt,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.end_dt,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ac_slip_dt,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.jnl_act_cd,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.data_typ,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.rerun_flg,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.jnl_rmrks,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ins_usr_id,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ins_usr_nm,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ins_ts,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.ins_func_id,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_cntr,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_usr_id,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_usr_nm,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_ts,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_func_id,
	mbt_jnl_history_$u_mbt_jnl_history_all_org.upd_srv_req_no
FROM
	mbt_jnl_history_all mbt_jnl_history_$u_mbt_jnl_history_all_org
WHERE
	0 = 0
	AND mbt_jnl_history_$u_mbt_jnl_history_all_org.co_cd = fcpa_context$f_get_co_cd()
;

