\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck15 CHECK (rate_fix_flg IN ('0', '1'));

