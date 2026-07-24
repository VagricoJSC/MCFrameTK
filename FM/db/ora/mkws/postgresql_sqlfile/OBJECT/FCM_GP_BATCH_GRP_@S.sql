\encoding UTF-8

CREATE OR REPLACE VIEW fcm_gp_batch_grp_$s(
	gp_batch_grp_cd,
	gp_batch_grp_nm,
	base_gp_batch_grp_nm,
	module_id,
	logic_id,
	func_typ,
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
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.gp_batch_grp_cd,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_lcl_all_lcl.gp_batch_grp_nm,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.gp_batch_grp_nm AS base_gp_batch_grp_nm,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.module_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.logic_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.func_typ,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.ins_usr_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.ins_usr_nm,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.ins_ts,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.ins_func_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_cntr,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_usr_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_usr_nm,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_ts,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_func_id,
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.upd_srv_req_no
FROM
	fcm_gp_batch_grp_all fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org
LEFT OUTER JOIN
	fcm_gp_batch_grp_lcl_all fcm_gp_batch_grp_$s_fcm_gp_batch_grp_lcl_all_lcl
ON
	fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.gp_batch_grp_cd = fcm_gp_batch_grp_$s_fcm_gp_batch_grp_lcl_all_lcl.gp_batch_grp_cd
	AND fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.co_cd = fcm_gp_batch_grp_$s_fcm_gp_batch_grp_lcl_all_lcl.co_cd
	AND fcm_gp_batch_grp_$s_fcm_gp_batch_grp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context fcm_gp_batch_grp_$s_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND fcm_gp_batch_grp_$s_fcm_gp_batch_grp_all_org.co_cd = (SELECT co_cd FROM fct_context fcm_gp_batch_grp_$s_fct_context WHERE pid = pg_backend_pid())
;

