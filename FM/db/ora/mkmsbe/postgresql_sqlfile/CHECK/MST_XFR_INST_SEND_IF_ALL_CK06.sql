\encoding UTF-8

ALTER TABLE mst_xfr_inst_send_if_all
 ADD CONSTRAINT mst_xfr_inst_send_if_all_ck06 CHECK (abort_flg IN ('0', '1'));

