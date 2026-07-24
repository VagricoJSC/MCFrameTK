\encoding UTF-8

ALTER TABLE mst_dlv_slip_d_all
 ADD CONSTRAINT mst_dlv_slip_d_all_ck02 CHECK (lot_plural_flg IN ('0', '1'));

