\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck07 CHECK (lot_sub_flg3 IN ('0', '1'));

