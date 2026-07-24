\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck14 CHECK (not_lot_mix_flg IN ('0', '1'));

