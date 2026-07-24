\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck12 CHECK (ship_block_flg IN ('0', '1'));

