\encoding UTF-8

ALTER TABLE mst_acxfr_inst_d_all
 ADD CONSTRAINT mst_acxfr_inst_d_all_ck04 CHECK (aprv_flg IN ('0', '1'));

