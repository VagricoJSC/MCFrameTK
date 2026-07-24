\encoding UTF-8

ALTER TABLE mbt_ac_io_all
 ADD CONSTRAINT mbt_ac_io_all_ck01 CHECK (can_flg IN ('0', '1'));

