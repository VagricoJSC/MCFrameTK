\encoding UTF-8

ALTER TABLE mst_ship_inst_send_if_all
 ADD CONSTRAINT mst_ship_inst_send_if_all_ck09 CHECK (sls_acxfr_flg IN ('0', '1'));

