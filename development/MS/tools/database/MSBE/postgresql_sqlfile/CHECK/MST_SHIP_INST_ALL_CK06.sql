\encoding UTF-8

ALTER TABLE mst_ship_inst_all
 ADD CONSTRAINT mst_ship_inst_all_ck06 CHECK (can_flg IN ('0', '1'));

