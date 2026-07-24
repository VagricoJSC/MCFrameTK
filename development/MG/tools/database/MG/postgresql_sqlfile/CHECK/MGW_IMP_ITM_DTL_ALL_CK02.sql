\encoding UTF-8

ALTER TABLE mgw_imp_itm_dtl_all
 ADD CONSTRAINT mgw_imp_itm_dtl_all_ck02 CHECK (imp_err_flg IN ('0', '1'));

