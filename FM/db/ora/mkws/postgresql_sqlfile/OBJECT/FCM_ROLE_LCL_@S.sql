\encoding UTF-8

CREATE OR REPLACE VIEW fcm_role_lcl_$s(
	rid,
	rnm,
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
	fcm_role_lcl_$s_fcm_role_lcl_all_org.rid,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.rnm,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.ins_usr_id,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.ins_usr_nm,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.ins_ts,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.ins_func_id,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_cntr,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_usr_id,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_usr_nm,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_ts,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_func_id,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.upd_srv_req_no,
	fcm_role_lcl_$s_fcm_role_lcl_all_org.lcl_cd
FROM
	fcm_role_lcl_all fcm_role_lcl_$s_fcm_role_lcl_all_org
WHERE
	0 = 0
;

