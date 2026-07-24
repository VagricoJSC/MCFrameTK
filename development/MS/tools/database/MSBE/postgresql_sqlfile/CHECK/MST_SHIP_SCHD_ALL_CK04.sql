\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck04 CHECK (sno3_null_flg IN ('0', '1'));

