\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck17 CHECK (re_ship_schd_flg IN ('0', '1'));

