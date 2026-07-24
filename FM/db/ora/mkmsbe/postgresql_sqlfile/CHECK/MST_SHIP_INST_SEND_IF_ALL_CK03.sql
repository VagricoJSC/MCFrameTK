\encoding UTF-8

ALTER TABLE mst_ship_inst_send_if_all
 ADD CONSTRAINT mst_ship_inst_send_if_all_ck03 CHECK (sno1_null_flg IN ('0', '1'));

