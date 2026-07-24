\encoding UTF-8

CREATE OR REPLACE VIEW mam_cal_ext_$u(
	cal_cd,
	dt,
	off_flg,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mam_cal_ext_$u_mam_cal_ext_all_org.cal_cd,
	mam_cal_ext_$u_mam_cal_ext_all_org.dt,
	mam_cal_ext_$u_mam_cal_ext_all_org.off_flg,
	mam_cal_ext_$u_mam_cal_ext_all_org.memo1,
	mam_cal_ext_$u_mam_cal_ext_all_org.memo2,
	mam_cal_ext_$u_mam_cal_ext_all_org.memo3,
	mam_cal_ext_$u_mam_cal_ext_all_org.del_flg,
	mam_cal_ext_$u_mam_cal_ext_all_org.del_usr_id,
	mam_cal_ext_$u_mam_cal_ext_all_org.del_usr_nm,
	mam_cal_ext_$u_mam_cal_ext_all_org.del_ts,
	mam_cal_ext_$u_mam_cal_ext_all_org.ins_usr_id,
	mam_cal_ext_$u_mam_cal_ext_all_org.ins_usr_nm,
	mam_cal_ext_$u_mam_cal_ext_all_org.ins_ts,
	mam_cal_ext_$u_mam_cal_ext_all_org.ins_func_id,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_cntr,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_usr_id,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_usr_nm,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_ts,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_func_id,
	mam_cal_ext_$u_mam_cal_ext_all_org.upd_srv_req_no
FROM
	mam_cal_ext_all mam_cal_ext_$u_mam_cal_ext_all_org
WHERE
	0 = 0
	AND mam_cal_ext_$u_mam_cal_ext_all_org.co_cd = fcpa_context$f_get_co_cd()
;

