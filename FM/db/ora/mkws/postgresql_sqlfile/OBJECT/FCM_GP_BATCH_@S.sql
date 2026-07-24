\encoding UTF-8

CREATE OR REPLACE VIEW fcm_gp_batch_$s(
	gp_batch_no,
	gp_batch_grp_cd,
	gp_batch_order,
	module_id,
	logic_id,
	operation_id,
	version,
	err_continue,
	rmrks,
	rmrks2,
	rmrks3,
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
	fcm_gp_batch_$s_fcm_gp_batch_all_org.gp_batch_no,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.gp_batch_grp_cd,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.gp_batch_order,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.module_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.logic_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.operation_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.version,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.err_continue,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.rmrks,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.rmrks2,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.rmrks3,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.ins_usr_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.ins_usr_nm,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.ins_ts,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.ins_func_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_cntr,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_usr_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_usr_nm,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_ts,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_func_id,
	fcm_gp_batch_$s_fcm_gp_batch_all_org.upd_srv_req_no
FROM
	fcm_gp_batch_all fcm_gp_batch_$s_fcm_gp_batch_all_org
WHERE
	0 = 0
	AND fcm_gp_batch_$s_fcm_gp_batch_all_org.co_cd = (SELECT co_cd FROM fct_context fcm_gp_batch_$s_fct_context WHERE pid = pg_backend_pid())
;

