\encoding UTF-8

ALTER TABLE mst_mfg_inst_all
 ADD CONSTRAINT mst_mfg_inst_all_ck06 CHECK (po_locked_flg IN ('0', '1'));

