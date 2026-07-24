\encoding UTF-8

CREATE OR REPLACE VIEW fcm_co_lcl(
	co_cd,
	co_nm,
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
	fcm_co_lcl_fcm_co_lcl_all_org.co_cd,
	fcm_co_lcl_fcm_co_lcl_all_org.co_nm,
	fcm_co_lcl_fcm_co_lcl_all_org.ins_usr_id,
	fcm_co_lcl_fcm_co_lcl_all_org.ins_usr_nm,
	fcm_co_lcl_fcm_co_lcl_all_org.ins_ts,
	fcm_co_lcl_fcm_co_lcl_all_org.ins_func_id,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_cntr,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_usr_id,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_usr_nm,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_ts,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_func_id,
	fcm_co_lcl_fcm_co_lcl_all_org.upd_srv_req_no,
	fcm_co_lcl_fcm_co_lcl_all_org.lcl_cd
FROM
	fcm_co_lcl_all fcm_co_lcl_fcm_co_lcl_all_org
WHERE
	0 = 0
;

