\encoding UTF-8

ALTER TABLE mst_dlv_inst_all
 ADD CONSTRAINT mst_dlv_inst_all_ck02 CHECK (edi_flg IN ('0', '1'));

