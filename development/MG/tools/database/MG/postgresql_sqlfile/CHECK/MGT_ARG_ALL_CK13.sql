\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck13 CHECK (non_del_flg IN ('0', '1'));

