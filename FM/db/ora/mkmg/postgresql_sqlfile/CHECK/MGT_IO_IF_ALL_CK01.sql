\encoding UTF-8

ALTER TABLE mgt_io_if_all
 ADD CONSTRAINT mgt_io_if_all_ck01 CHECK (fix_flg IN ('0', '1'));

