\encoding UTF-8

ALTER TABLE mst_acxfr_inst_d_all
 ADD CONSTRAINT mst_acxfr_inst_d_all_ck03 CHECK (abort_flg IN ('0', '1'));

