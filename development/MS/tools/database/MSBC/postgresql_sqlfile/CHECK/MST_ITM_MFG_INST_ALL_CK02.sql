\encoding UTF-8

ALTER TABLE mst_itm_mfg_inst_all
 ADD CONSTRAINT mst_itm_mfg_inst_all_ck02 CHECK (unschd_act_flg IN ('0', '1'));

