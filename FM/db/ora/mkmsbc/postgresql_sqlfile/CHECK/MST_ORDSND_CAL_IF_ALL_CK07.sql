\encoding UTF-8

ALTER TABLE mst_ordsnd_cal_if_all
 ADD CONSTRAINT mst_ordsnd_cal_if_all_ck07 CHECK (sat_off_flg IN ('0', '1'));

