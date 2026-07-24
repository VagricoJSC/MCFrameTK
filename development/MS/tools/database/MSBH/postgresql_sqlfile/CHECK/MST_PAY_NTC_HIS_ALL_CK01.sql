\encoding UTF-8

ALTER TABLE mst_pay_ntc_his_all
 ADD CONSTRAINT mst_pay_ntc_his_all_ck01 CHECK (latest_flg IN ('0', '1'));

