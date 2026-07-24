\encoding UTF-8

CREATE OR REPLACE VIEW mam_cal_$u(
	cal_cd,
	st_dt,
	end_dt,
	sun_off_flg,
	mon_off_flg,
	tue_off_flg,
	wed_off_flg,
	thu_off_flg,
	fri_off_flg,
	sat_off_flg,
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
	mam_cal_$u_mam_cal_all_org.cal_cd,
	mam_cal_$u_mam_cal_all_org.st_dt,
	mam_cal_$u_mam_cal_all_org.end_dt,
	mam_cal_$u_mam_cal_all_org.sun_off_flg,
	mam_cal_$u_mam_cal_all_org.mon_off_flg,
	mam_cal_$u_mam_cal_all_org.tue_off_flg,
	mam_cal_$u_mam_cal_all_org.wed_off_flg,
	mam_cal_$u_mam_cal_all_org.thu_off_flg,
	mam_cal_$u_mam_cal_all_org.fri_off_flg,
	mam_cal_$u_mam_cal_all_org.sat_off_flg,
	mam_cal_$u_mam_cal_all_org.memo1,
	mam_cal_$u_mam_cal_all_org.memo2,
	mam_cal_$u_mam_cal_all_org.memo3,
	mam_cal_$u_mam_cal_all_org.del_flg,
	mam_cal_$u_mam_cal_all_org.del_usr_id,
	mam_cal_$u_mam_cal_all_org.del_usr_nm,
	mam_cal_$u_mam_cal_all_org.del_ts,
	mam_cal_$u_mam_cal_all_org.ins_usr_id,
	mam_cal_$u_mam_cal_all_org.ins_usr_nm,
	mam_cal_$u_mam_cal_all_org.ins_ts,
	mam_cal_$u_mam_cal_all_org.ins_func_id,
	mam_cal_$u_mam_cal_all_org.upd_cntr,
	mam_cal_$u_mam_cal_all_org.upd_usr_id,
	mam_cal_$u_mam_cal_all_org.upd_usr_nm,
	mam_cal_$u_mam_cal_all_org.upd_ts,
	mam_cal_$u_mam_cal_all_org.upd_func_id,
	mam_cal_$u_mam_cal_all_org.upd_srv_req_no
FROM
	mam_cal_all mam_cal_$u_mam_cal_all_org
WHERE
	0 = 0
	AND mam_cal_$u_mam_cal_all_org.co_cd = fcpa_context$f_get_co_cd()
;

