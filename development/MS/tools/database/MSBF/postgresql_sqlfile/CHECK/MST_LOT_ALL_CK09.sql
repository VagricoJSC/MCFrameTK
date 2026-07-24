\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck09 CHECK (lot_sub_flg5 IN ('0', '1'));

