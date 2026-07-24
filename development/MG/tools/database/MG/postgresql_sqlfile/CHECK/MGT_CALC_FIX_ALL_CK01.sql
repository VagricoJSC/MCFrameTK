\encoding UTF-8

ALTER TABLE mgt_calc_fix_all
 ADD CONSTRAINT mgt_calc_fix_all_ck01 CHECK (ac_if_flg IN ('0', '1'));

