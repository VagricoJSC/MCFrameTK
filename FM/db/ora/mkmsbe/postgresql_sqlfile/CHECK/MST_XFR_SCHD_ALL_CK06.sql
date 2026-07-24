\encoding UTF-8

ALTER TABLE mst_xfr_schd_all
 ADD CONSTRAINT mst_xfr_schd_all_ck06 CHECK (ship_to_sundry_flg IN ('0', '1'));

