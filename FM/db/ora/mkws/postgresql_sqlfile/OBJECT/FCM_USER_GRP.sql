\encoding UTF-8

CREATE OR REPLACE VIEW fcm_user_grp(
	ugid,
	group_id,
	group_nm,
	co_cd,
	ext_attr1,
	ext_attr2,
	ext_attr3,
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
	fcm_user_grp_fcm_user_grp_all_org.ugid,
	fcm_user_grp_fcm_user_grp_all_org.group_id,
	fcm_user_grp_fcm_user_grp_lcl_all_lcl.group_nm,
	fcm_user_grp_fcm_user_grp_all_org.co_cd,
	fcm_user_grp_fcm_user_grp_all_org.ext_attr1,
	fcm_user_grp_fcm_user_grp_all_org.ext_attr2,
	fcm_user_grp_fcm_user_grp_all_org.ext_attr3,
	fcm_user_grp_fcm_user_grp_all_org.ins_usr_id,
	fcm_user_grp_fcm_user_grp_all_org.ins_usr_nm,
	fcm_user_grp_fcm_user_grp_all_org.ins_ts,
	fcm_user_grp_fcm_user_grp_all_org.ins_func_id,
	fcm_user_grp_fcm_user_grp_all_org.upd_cntr,
	fcm_user_grp_fcm_user_grp_all_org.upd_usr_id,
	fcm_user_grp_fcm_user_grp_all_org.upd_usr_nm,
	fcm_user_grp_fcm_user_grp_all_org.upd_ts,
	fcm_user_grp_fcm_user_grp_all_org.upd_func_id,
	fcm_user_grp_fcm_user_grp_all_org.upd_srv_req_no
FROM
	fcm_user_grp_all fcm_user_grp_fcm_user_grp_all_org
LEFT OUTER JOIN
	fcm_user_grp_lcl_all fcm_user_grp_fcm_user_grp_lcl_all_lcl
ON
	fcm_user_grp_fcm_user_grp_all_org.ugid = fcm_user_grp_fcm_user_grp_lcl_all_lcl.ugid
	AND fcm_user_grp_fcm_user_grp_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context fcm_user_grp_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
;

