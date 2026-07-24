\encoding UTF-8

ALTER TABLE mbt_aprv_d_all
 ADD CONSTRAINT mbt_aprv_d_all_ck01 CHECK (deputy_flg IN ('0', '1'));

