\encoding UTF-8

ALTER TABLE mst_dlv_slip_d_all
 ADD CONSTRAINT mst_dlv_slip_d_all_ck05 CHECK (ship_dlv_slip_multi_flg IN ('0', '1'));

