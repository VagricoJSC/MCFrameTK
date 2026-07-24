\encoding UTF-8

CREATE OR REPLACE VIEW fcm_user_grp_lcl(
	ugid,
	group_nm,
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
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.ugid,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.group_nm,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.ins_usr_id,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.ins_usr_nm,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.ins_ts,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.ins_func_id,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_cntr,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_usr_id,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_usr_nm,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_ts,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_func_id,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.upd_srv_req_no,
	fcm_user_grp_lcl_fcm_user_grp_lcl_all_org.lcl_cd
FROM
	fcm_user_grp_lcl_all fcm_user_grp_lcl_fcm_user_grp_lcl_all_org
WHERE
	0 = 0
;

