\encoding UTF-8

ALTER TABLE mgt_itm_wk_all
 ADD CONSTRAINT mgt_itm_wk_all_ck01 CHECK (non_calc_flg IN ('0', '1'));

