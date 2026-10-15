\encoding UTF-8

ALTER TABLE mst_slo_all
 ADD CONSTRAINT mst_slo_all_ck08 CHECK (src_ship_flg IN ('0', '1'));

