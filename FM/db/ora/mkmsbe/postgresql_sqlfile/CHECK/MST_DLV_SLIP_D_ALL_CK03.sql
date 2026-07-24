\encoding UTF-8

ALTER TABLE mst_dlv_slip_d_all
 ADD CONSTRAINT mst_dlv_slip_d_all_ck03 CHECK (sublot_plural_flg IN ('0', '1'));

