\encoding UTF-8

CREATE OR REPLACE VIEW fcm_co_$u(
	co_cd,
	co_nm,
	def_locale_cd,
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
	fcm_co_$u_fcm_co_all_org.co_cd,
	fcm_co_$u_fcm_co_all_org.co_nm,
	fcm_co_$u_fcm_co_all_org.def_locale_cd,
	fcm_co_$u_fcm_co_all_org.ins_usr_id,
	fcm_co_$u_fcm_co_all_org.ins_usr_nm,
	fcm_co_$u_fcm_co_all_org.ins_ts,
	fcm_co_$u_fcm_co_all_org.ins_func_id,
	fcm_co_$u_fcm_co_all_org.upd_cntr,
	fcm_co_$u_fcm_co_all_org.upd_usr_id,
	fcm_co_$u_fcm_co_all_org.upd_usr_nm,
	fcm_co_$u_fcm_co_all_org.upd_ts,
	fcm_co_$u_fcm_co_all_org.upd_func_id,
	fcm_co_$u_fcm_co_all_org.upd_srv_req_no
FROM
	fcm_co_all fcm_co_$u_fcm_co_all_org
WHERE
	0 = 0
;

