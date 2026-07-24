\encoding UTF-8

ALTER TABLE mam_cal_ext_all
 ADD CONSTRAINT mam_cal_ext_all_ck02 CHECK (del_flg IN ('0', '1'));

