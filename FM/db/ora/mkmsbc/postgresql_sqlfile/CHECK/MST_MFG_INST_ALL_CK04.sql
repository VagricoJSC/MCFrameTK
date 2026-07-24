\encoding UTF-8

ALTER TABLE mst_mfg_inst_all
 ADD CONSTRAINT mst_mfg_inst_all_ck04 CHECK (abort_flg IN ('0', '1'));

