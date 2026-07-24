\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck11 CHECK (data_check_flg IN ('0', '1'));

