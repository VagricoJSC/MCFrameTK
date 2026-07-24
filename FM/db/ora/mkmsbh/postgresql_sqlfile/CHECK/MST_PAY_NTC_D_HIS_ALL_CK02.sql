\encoding UTF-8

ALTER TABLE mst_pay_ntc_d_his_all
 ADD CONSTRAINT mst_pay_ntc_d_his_all_ck02 CHECK (interim_flg IN ('0', '1'));

