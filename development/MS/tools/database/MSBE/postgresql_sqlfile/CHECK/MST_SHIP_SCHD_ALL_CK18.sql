\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck18 CHECK (dlv_sundry_flg IN ('0', '1'));

