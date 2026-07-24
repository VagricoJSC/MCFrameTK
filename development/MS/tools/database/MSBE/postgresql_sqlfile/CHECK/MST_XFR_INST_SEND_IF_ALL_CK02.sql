\encoding UTF-8

ALTER TABLE mst_xfr_inst_send_if_all
 ADD CONSTRAINT mst_xfr_inst_send_if_all_ck02 CHECK (sno2_null_flg IN ('0', '1'));

