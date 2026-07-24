\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck06 CHECK (lot_sub_flg2 IN ('0', '1'));

