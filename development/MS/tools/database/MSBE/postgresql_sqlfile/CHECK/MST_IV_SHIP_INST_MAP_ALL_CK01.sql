\encoding UTF-8

ALTER TABLE mst_iv_ship_inst_map_all
 ADD CONSTRAINT mst_iv_ship_inst_map_all_ck01 CHECK (ship_inst_fix_flg IN ('0', '1'));

