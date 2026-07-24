\encoding UTF-8

ALTER TABLE mgt_arg_usr_all
 ADD CONSTRAINT mgt_arg_usr_all_ck03 CHECK (prov_calc_flg IN ('0', '1'));

