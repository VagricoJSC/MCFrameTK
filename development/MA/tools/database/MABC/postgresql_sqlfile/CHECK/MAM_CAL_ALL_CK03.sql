\encoding UTF-8

ALTER TABLE mam_cal_all
 ADD CONSTRAINT mam_cal_all_ck03 CHECK (tue_off_flg IN ('0', '1'));

