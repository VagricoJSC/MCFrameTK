\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_cal_ext(
cal_cd,
dt,
off_flg
)
AS
SELECT
	msvm_mrp_cal_ext_mam_cal_ext_t1.cal_cd,
	msvm_mrp_cal_ext_mam_cal_ext_t1.dt,
	msvm_mrp_cal_ext_mam_cal_ext_t1.off_flg
FROM mam_cal_ext msvm_mrp_cal_ext_mam_cal_ext_t1
WHERE 0=0
AND msvm_mrp_cal_ext_mam_cal_ext_t1.del_flg = '0'
;;

