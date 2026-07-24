\encoding UTF-8

ALTER TABLE mgt_itm_all
 ADD CONSTRAINT mgt_itm_all_ck03 CHECK (non_calc_flg IN ('0', '1'));

