\encoding UTF-8

ALTER TABLE mst_pay_chk_all
 ADD CONSTRAINT mst_pay_chk_all_ak01 UNIQUE (pay_chk_no,co_cd);

