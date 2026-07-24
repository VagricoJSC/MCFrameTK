\encoding UTF-8

ALTER TABLE mgw_imp_itm_purc_all
 ADD CONSTRAINT mgw_imp_itm_purc_all_ck01 CHECK (non_calc_flg IN ('0', '1'));

