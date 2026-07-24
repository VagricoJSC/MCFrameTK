\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck02 CHECK (sno1_null_flg IN ('0', '1'));

