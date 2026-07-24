\encoding UTF-8

ALTER TABLE mst_ship_inst_d_all
 ADD CONSTRAINT mst_ship_inst_d_all_ck09 CHECK (can_flg IN ('0', '1'));

