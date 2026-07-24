\encoding UTF-8

ALTER TABLE mst_bill_his_all
 ADD CONSTRAINT mst_bill_his_all_ck03 CHECK (bill_each_sls_flg IN ('0', '1'));

