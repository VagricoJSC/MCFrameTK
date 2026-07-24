\encoding UTF-8

ALTER TABLE mgw_imp_itm_prov_all
 ADD CONSTRAINT mgw_imp_itm_prov_all_ck01 CHECK (non_calc_flg IN ('0', '1'));

