\encoding UTF-8

ALTER TABLE mst_dmnd_all
 ADD CONSTRAINT mst_dmnd_all_ck01 CHECK (dly_div_flg IN ('0', '1'));

