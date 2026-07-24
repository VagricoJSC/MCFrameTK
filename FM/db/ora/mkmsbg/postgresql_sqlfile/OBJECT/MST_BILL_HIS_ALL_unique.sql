\encoding UTF-8

ALTER TABLE mst_bill_his_all
 ADD CONSTRAINT mst_bill_his_all_ak01 UNIQUE (bill_no,bill_rev,co_cd);

