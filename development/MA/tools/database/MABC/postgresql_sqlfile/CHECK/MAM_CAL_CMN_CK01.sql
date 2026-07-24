\encoding UTF-8

ALTER TABLE mam_cal_cmn
 ADD CONSTRAINT mam_cal_cmn_ck01 CHECK (sun_off_flg IN ('0', '1'));

