\encoding UTF-8

ALTER TABLE mst_pay_ntc_his_all
 ADD CONSTRAINT mst_pay_ntc_his_all_ak01 UNIQUE (pay_chk_no,pay_ntc_rev,co_cd);

