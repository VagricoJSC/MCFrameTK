\encoding UTF-8

ALTER TABLE mam_cal_base_cmn
 ADD CONSTRAINT mam_cal_base_cmn_ck01 CHECK (del_flg IN ('0', '1'));

