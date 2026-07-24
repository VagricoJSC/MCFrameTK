\encoding UTF-8

ALTER TABLE mgt_arg_all
 ADD CONSTRAINT mgt_arg_all_ck16 CHECK (calc_err_flg IN ('0', '1'));

