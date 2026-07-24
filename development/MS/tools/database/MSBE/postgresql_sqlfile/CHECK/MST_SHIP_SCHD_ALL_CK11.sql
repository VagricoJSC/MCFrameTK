\encoding UTF-8

ALTER TABLE mst_ship_schd_all
 ADD CONSTRAINT mst_ship_schd_all_ck11 CHECK (ship_lot_chk_tar_flg IN ('0', '1'));

