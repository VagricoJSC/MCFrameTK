\encoding UTF-8

ALTER TABLE mgt_io_if_all
 ADD CONSTRAINT mgt_io_if_all_ck02 CHECK (bi_not_send_flg IN ('0', '1'));

