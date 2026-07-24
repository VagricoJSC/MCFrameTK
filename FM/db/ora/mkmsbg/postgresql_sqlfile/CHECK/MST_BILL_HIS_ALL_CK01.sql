\encoding UTF-8

ALTER TABLE mst_bill_his_all
 ADD CONSTRAINT mst_bill_his_all_ck01 CHECK (latest_flg IN ('0', '1'));

