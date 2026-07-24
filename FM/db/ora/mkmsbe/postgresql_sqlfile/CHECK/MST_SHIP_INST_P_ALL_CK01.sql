\encoding UTF-8

ALTER TABLE mst_ship_inst_p_all
 ADD CONSTRAINT mst_ship_inst_p_all_ck01 CHECK (ship_to_sundry_flg IN ('0', '1'));

