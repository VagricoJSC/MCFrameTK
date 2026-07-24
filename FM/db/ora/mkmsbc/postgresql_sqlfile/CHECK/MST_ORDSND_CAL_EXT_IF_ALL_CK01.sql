\encoding UTF-8

ALTER TABLE mst_ordsnd_cal_ext_if_all
 ADD CONSTRAINT mst_ordsnd_cal_ext_if_all_ck01 CHECK (off_flg IN ('0', '1'));

