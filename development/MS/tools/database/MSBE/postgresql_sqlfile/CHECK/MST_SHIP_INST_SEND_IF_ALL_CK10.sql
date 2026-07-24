\encoding UTF-8

ALTER TABLE mst_ship_inst_send_if_all
 ADD CONSTRAINT mst_ship_inst_send_if_all_ck10 CHECK (sls_cststk_flg IN ('0', '1'));

