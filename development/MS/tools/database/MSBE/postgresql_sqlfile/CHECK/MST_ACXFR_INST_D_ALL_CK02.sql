\encoding UTF-8

ALTER TABLE mst_acxfr_inst_d_all
 ADD CONSTRAINT mst_acxfr_inst_d_all_ck02 CHECK (alloc_flg IN ('0', '1'));

