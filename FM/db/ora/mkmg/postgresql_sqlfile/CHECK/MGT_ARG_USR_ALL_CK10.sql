\encoding UTF-8

ALTER TABLE mgt_arg_usr_all
 ADD CONSTRAINT mgt_arg_usr_all_ck10 CHECK (itm_limit_flg IN ('0', '1'));

