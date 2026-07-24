\encoding UTF-8

ALTER TABLE mst_xfr_inst_all
 ADD CONSTRAINT mst_xfr_inst_all_ck03 CHECK (dlv_prnt_flg IN ('0', '1'));

