\encoding UTF-8

ALTER TABLE mst_xfr_inst_send_if_all
 ADD CONSTRAINT mst_xfr_inst_send_if_all_ck03 CHECK (sno3_null_flg IN ('0', '1'));

