\encoding UTF-8

ALTER TABLE mgt_calc_itm_oper_all
 ADD CONSTRAINT mgt_calc_itm_oper_all_ck01 CHECK (yield_oper_flg IN ('0', '1'));

