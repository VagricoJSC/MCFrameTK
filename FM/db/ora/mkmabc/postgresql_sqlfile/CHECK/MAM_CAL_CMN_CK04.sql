\encoding UTF-8

ALTER TABLE mam_cal_cmn
 ADD CONSTRAINT mam_cal_cmn_ck04 CHECK (wed_off_flg IN ('0', '1'));

