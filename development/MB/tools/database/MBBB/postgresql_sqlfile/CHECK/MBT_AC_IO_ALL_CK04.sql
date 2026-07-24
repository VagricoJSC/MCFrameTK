\encoding UTF-8

ALTER TABLE mbt_ac_io_all
 ADD CONSTRAINT mbt_ac_io_all_ck04 CHECK (foreign_flg IN ('0', '1'));

