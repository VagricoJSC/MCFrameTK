\encoding UTF-8

CREATE OR REPLACE VIEW fcm_today_$s(
	today,
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
	fcm_today_$s_fcm_today_all_org.today,
	fcm_today_$s_fcm_today_all_org.ins_usr_id,
	fcm_today_$s_fcm_today_all_org.ins_usr_nm,
	fcm_today_$s_fcm_today_all_org.ins_ts,
	fcm_today_$s_fcm_today_all_org.ins_func_id,
	fcm_today_$s_fcm_today_all_org.upd_cntr,
	fcm_today_$s_fcm_today_all_org.upd_usr_id,
	fcm_today_$s_fcm_today_all_org.upd_usr_nm,
	fcm_today_$s_fcm_today_all_org.upd_ts,
	fcm_today_$s_fcm_today_all_org.upd_func_id,
	fcm_today_$s_fcm_today_all_org.upd_srv_req_no
FROM
	fcm_today_all fcm_today_$s_fcm_today_all_org
WHERE
	0 = 0
	AND fcm_today_$s_fcm_today_all_org.co_cd = (SELECT co_cd FROM fct_context fcm_today_$s_fct_context WHERE pid = pg_backend_pid())
;

