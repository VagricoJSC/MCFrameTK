\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_log_$s(
	calc_no,
	calc_grp_cd,
	seq_no,
	msg_id,
	msg,
	log_time,
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
	mgt_calc_log_$s_mgt_calc_log_all_org.calc_no,
	mgt_calc_log_$s_mgt_calc_log_all_org.calc_grp_cd,
	mgt_calc_log_$s_mgt_calc_log_all_org.seq_no,
	mgt_calc_log_$s_mgt_calc_log_all_org.msg_id,
	mgt_calc_log_$s_mgt_calc_log_all_org.msg,
	mgt_calc_log_$s_mgt_calc_log_all_org.log_time,
	mgt_calc_log_$s_mgt_calc_log_all_org.ins_usr_id,
	mgt_calc_log_$s_mgt_calc_log_all_org.ins_usr_nm,
	mgt_calc_log_$s_mgt_calc_log_all_org.ins_ts,
	mgt_calc_log_$s_mgt_calc_log_all_org.ins_func_id,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_cntr,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_usr_id,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_usr_nm,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_ts,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_func_id,
	mgt_calc_log_$s_mgt_calc_log_all_org.upd_srv_req_no
FROM
	mgt_calc_log_all mgt_calc_log_$s_mgt_calc_log_all_org
WHERE
	0 = 0
	AND mgt_calc_log_$s_mgt_calc_log_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_log_$s_fct_context WHERE pid = pg_backend_pid())
;

