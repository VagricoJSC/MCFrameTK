\encoding UTF-8

ALTER TABLE mst_ordsnd_cal_if_all
 ADD CONSTRAINT mst_ordsnd_cal_if_all_ck05 CHECK (thu_off_flg IN ('0', '1'));

