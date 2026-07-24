\encoding UTF-8

ALTER TABLE mbt_ac_io_all
 ADD CONSTRAINT mbt_ac_io_all_ck02 CHECK (un_fix_flg IN ('0', '1'));

