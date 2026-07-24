\encoding UTF-8

ALTER TABLE mgw_imp_bom_all
 ADD CONSTRAINT mgw_imp_bom_all_ck03 CHECK (imp_flg IN ('0', '1'));

