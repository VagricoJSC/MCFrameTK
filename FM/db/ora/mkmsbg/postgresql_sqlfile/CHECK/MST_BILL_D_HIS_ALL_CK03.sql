\encoding UTF-8

ALTER TABLE mst_bill_d_his_all
 ADD CONSTRAINT mst_bill_d_his_all_ck03 CHECK (ship_dlv_slip_multi_flg IN ('0', '1'));

