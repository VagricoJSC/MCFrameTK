\encoding UTF-8

ALTER TABLE mbt_ac_io_all
 ADD CONSTRAINT mbt_ac_io_all_ck03 CHECK (temp_ap_flg IN ('0', '1'));

