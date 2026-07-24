\encoding UTF-8

ALTER TABLE mgw_imp_itm_prov_all
 ADD CONSTRAINT mgw_imp_itm_prov_all_ck03 CHECK (imp_flg IN ('0', '1'));

