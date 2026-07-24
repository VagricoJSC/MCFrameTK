\encoding UTF-8

ALTER TABLE mst_mfg_inst_all
 ADD CONSTRAINT mst_mfg_inst_all_ck07 CHECK (po_auto_reg_flg IN ('0', '1'));

