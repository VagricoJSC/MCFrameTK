\encoding UTF-8

ALTER TABLE mgw_imp_itm_oper_all
 ADD CONSTRAINT mgw_imp_itm_oper_all_ck04 CHECK (imp_flg IN ('0', '1'));

