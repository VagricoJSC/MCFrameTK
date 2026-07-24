\encoding UTF-8

ALTER TABLE mam_cal_ext_all
 ADD CONSTRAINT mam_cal_ext_all_ck01 CHECK (off_flg IN ('0', '1'));

