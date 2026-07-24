\encoding UTF-8

ALTER TABLE mgt_arg_usr_all
 ADD CONSTRAINT mgt_arg_usr_all_ck04 CHECK (xfr_calc_flg IN ('0', '1'));

