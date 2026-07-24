\encoding UTF-8

ALTER TABLE mst_xfr_inst_send_if_all
 ADD CONSTRAINT mst_xfr_inst_send_if_all_ck04 CHECK (sno4_null_flg IN ('0', '1'));

