\encoding UTF-8

ALTER TABLE mst_mfg_inst_all
 ADD CONSTRAINT mst_mfg_inst_all_ck05 CHECK (schd_chg_flg IN ('0', '1'));

