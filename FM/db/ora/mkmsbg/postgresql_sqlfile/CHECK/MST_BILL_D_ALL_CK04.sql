\encoding UTF-8

ALTER TABLE mst_bill_d_all
 ADD CONSTRAINT mst_bill_d_all_ck04 CHECK (ship_dlv_slip_multi_flg IN ('0', '1'));

