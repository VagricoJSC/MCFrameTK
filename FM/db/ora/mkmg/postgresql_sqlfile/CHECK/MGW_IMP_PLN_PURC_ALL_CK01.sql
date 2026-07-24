\encoding UTF-8

ALTER TABLE mgw_imp_pln_purc_all
 ADD CONSTRAINT mgw_imp_pln_purc_all_ck01 CHECK (imp_err_flg IN ('0', '1'));

