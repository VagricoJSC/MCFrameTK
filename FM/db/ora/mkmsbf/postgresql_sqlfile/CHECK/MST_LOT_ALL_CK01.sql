\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck01 CHECK (schd_flg IN ('0', '1'));

