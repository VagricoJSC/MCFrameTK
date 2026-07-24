\encoding UTF-8

ALTER TABLE mst_ship_inst_send_if_all
 ADD CONSTRAINT mst_ship_inst_send_if_all_ck07 CHECK (alloc_flg IN ('0', '1'));

