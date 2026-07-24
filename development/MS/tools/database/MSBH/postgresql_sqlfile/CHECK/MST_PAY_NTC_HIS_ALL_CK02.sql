\encoding UTF-8

ALTER TABLE mst_pay_ntc_his_all
 ADD CONSTRAINT mst_pay_ntc_his_all_ck02 CHECK (can_flg IN ('0', '1'));

