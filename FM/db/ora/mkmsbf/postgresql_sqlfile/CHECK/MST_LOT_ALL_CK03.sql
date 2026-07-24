\encoding UTF-8

ALTER TABLE mst_lot_all
 ADD CONSTRAINT mst_lot_all_ck03 CHECK (first_gr_dt_save_flg IN ('0', '1'));

