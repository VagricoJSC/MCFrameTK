\encoding UTF-8

ALTER TABLE mst_mfg_inst_p_all
 ADD CONSTRAINT mst_mfg_inst_p_all_ck02 CHECK (aprv_flg IN ('0', '1'));

