\encoding UTF-8

ALTER TABLE mgt_itm_oper_all
 ADD CONSTRAINT mgt_itm_oper_all_ck02 CHECK (non_calc_flg IN ('0', '1'));

