\encoding UTF-8

CREATE OR REPLACE VIEW mbt_schd_pay_history_$s(
	proc_no,
	ac_ym,
	wg_cd,
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
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.proc_no,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.ac_ym,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.wg_cd,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.ins_usr_id,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.ins_usr_nm,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.ins_ts,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.ins_func_id,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_cntr,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_usr_id,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_usr_nm,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_ts,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_func_id,
	mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.upd_srv_req_no
FROM
	mbt_schd_pay_history_all mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org
WHERE
	0 = 0
	AND mbt_schd_pay_history_$s_mbt_schd_pay_history_all_org.co_cd = (SELECT co_cd FROM fct_context mbt_schd_pay_history_$s_fct_context WHERE pid = pg_backend_pid())
;

