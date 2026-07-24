\encoding UTF-8

ALTER TABLE mgw_imp_itm_oper_all
 ADD CONSTRAINT mgw_imp_itm_oper_all_ck03 CHECK (imp_err_flg IN ('0', '1'));

