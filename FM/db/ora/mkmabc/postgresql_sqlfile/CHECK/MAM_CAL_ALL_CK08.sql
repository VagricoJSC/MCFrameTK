\encoding UTF-8

ALTER TABLE mam_cal_all
 ADD CONSTRAINT mam_cal_all_ck08 CHECK (del_flg IN ('0', '1'));

