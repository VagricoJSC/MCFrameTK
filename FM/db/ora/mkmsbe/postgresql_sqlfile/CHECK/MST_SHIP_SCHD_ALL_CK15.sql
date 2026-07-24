\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck15 CHECK (not_sublot_mix_flg IN ('0', '1'));

