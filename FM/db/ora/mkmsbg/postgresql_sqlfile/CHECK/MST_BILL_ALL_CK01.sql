\encoding UTF-8

ALTER TABLE mst_bill_all
 ADD CONSTRAINT mst_bill_all_ck01 CHECK (bill_each_sls_flg IN ('0', '1'));

