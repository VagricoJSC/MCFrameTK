\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_cal(
cal_cd,
st_dt,
end_dt,
sun_off_flg,
mon_off_flg,
tue_off_flg,
wed_off_flg,
thu_off_flg,
fri_off_flg,
sat_off_flg
)
AS
SELECT
	msvm_mrp_cal_mam_cal_t1.cal_cd,
	msvm_mrp_cal_mam_cal_t1.st_dt,
	msvm_mrp_cal_mam_cal_t1.end_dt,
	msvm_mrp_cal_mam_cal_t1.sun_off_flg,
	msvm_mrp_cal_mam_cal_t1.mon_off_flg,
	msvm_mrp_cal_mam_cal_t1.tue_off_flg,
	msvm_mrp_cal_mam_cal_t1.wed_off_flg,
	msvm_mrp_cal_mam_cal_t1.thu_off_flg,
	msvm_mrp_cal_mam_cal_t1.fri_off_flg,
	msvm_mrp_cal_mam_cal_t1.sat_off_flg
FROM mam_cal msvm_mrp_cal_mam_cal_t1
WHERE 0=0
AND msvm_mrp_cal_mam_cal_t1.del_flg = '0'
;;

