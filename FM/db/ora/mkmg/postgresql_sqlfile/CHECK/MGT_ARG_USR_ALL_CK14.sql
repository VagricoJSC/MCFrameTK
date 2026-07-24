\encoding UTF-8

ALTER TABLE mgt_arg_usr_all
 ADD CONSTRAINT mgt_arg_usr_all_ck14 CHECK (fix_flg IN ('0', '1'));

