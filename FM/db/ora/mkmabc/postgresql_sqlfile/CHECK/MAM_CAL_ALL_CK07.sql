\encoding UTF-8

ALTER TABLE mam_cal_all
 ADD CONSTRAINT mam_cal_all_ck07 CHECK (sat_off_flg IN ('0', '1'));

