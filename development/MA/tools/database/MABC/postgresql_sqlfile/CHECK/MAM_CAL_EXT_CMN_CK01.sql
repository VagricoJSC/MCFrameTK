\encoding UTF-8

ALTER TABLE mam_cal_ext_cmn
 ADD CONSTRAINT mam_cal_ext_cmn_ck01 CHECK (off_flg IN ('0', '1'));

