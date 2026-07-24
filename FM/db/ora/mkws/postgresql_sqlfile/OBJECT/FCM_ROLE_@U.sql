\encoding UTF-8

CREATE OR REPLACE VIEW fcm_role_$u(
	rid,
	rnm,
	history,
	co_cd,
	ext_attr1,
	ext_attr2,
	ext_attr3,
	admin_flg,
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
	fcm_role_$u_fcm_role_all_org.rid,
	fcm_role_$u_fcm_role_all_org.rnm,
	fcm_role_$u_fcm_role_all_org.history,
	fcm_role_$u_fcm_role_all_org.co_cd,
	fcm_role_$u_fcm_role_all_org.ext_attr1,
	fcm_role_$u_fcm_role_all_org.ext_attr2,
	fcm_role_$u_fcm_role_all_org.ext_attr3,
	fcm_role_$u_fcm_role_all_org.admin_flg,
	fcm_role_$u_fcm_role_all_org.ins_usr_id,
	fcm_role_$u_fcm_role_all_org.ins_usr_nm,
	fcm_role_$u_fcm_role_all_org.ins_ts,
	fcm_role_$u_fcm_role_all_org.ins_func_id,
	fcm_role_$u_fcm_role_all_org.upd_cntr,
	fcm_role_$u_fcm_role_all_org.upd_usr_id,
	fcm_role_$u_fcm_role_all_org.upd_usr_nm,
	fcm_role_$u_fcm_role_all_org.upd_ts,
	fcm_role_$u_fcm_role_all_org.upd_func_id,
	fcm_role_$u_fcm_role_all_org.upd_srv_req_no
FROM
	fcm_role_all fcm_role_$u_fcm_role_all_org
WHERE
	0 = 0
;

