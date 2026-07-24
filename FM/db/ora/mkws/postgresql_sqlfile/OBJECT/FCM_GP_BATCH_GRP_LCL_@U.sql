\encoding UTF-8

CREATE OR REPLACE VIEW fcm_gp_batch_grp_lcl_$u(
	gp_batch_grp_cd,
	gp_batch_grp_nm,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no,
	lcl_cd
	)
AS
SELECT
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.gp_batch_grp_cd,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.gp_batch_grp_nm,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.ins_usr_id,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.ins_usr_nm,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.ins_ts,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.ins_func_id,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_cntr,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_usr_id,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_usr_nm,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_ts,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_func_id,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.upd_srv_req_no,
	fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.lcl_cd
FROM
	fcm_gp_batch_grp_lcl_all fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org
WHERE
	0 = 0
	AND fcm_gp_batch_grp_lcl_$u_fcm_gp_batch_grp_lcl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

