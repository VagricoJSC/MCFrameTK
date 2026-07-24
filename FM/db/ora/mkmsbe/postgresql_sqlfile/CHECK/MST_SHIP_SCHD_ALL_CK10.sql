\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck10 CHECK (ship_abl_flg IN ('0', '1'));

