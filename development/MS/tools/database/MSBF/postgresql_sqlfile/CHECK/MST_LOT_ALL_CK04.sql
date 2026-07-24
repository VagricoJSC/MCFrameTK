\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck04 CHECK (no_del_flg IN ('0', '1'));

