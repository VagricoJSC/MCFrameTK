\encoding UTF-8

ALTER TABLE mst_bill_d_his_all
 ADD CONSTRAINT mst_bill_d_his_all_ck02 CHECK (interim_flg IN ('0', '1'));

