\encoding UTF-8

ALTER TABLE mst_itm_mfg_inst_p_all
 ADD CONSTRAINT mst_itm_mfg_inst_p_all_ck01 CHECK (unschd_inst_flg IN ('0', '1'));

