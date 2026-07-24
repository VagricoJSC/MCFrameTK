\encoding UTF-8

ALTER TABLE mst_pay_schd_if_all
 ADD CONSTRAINT mst_pay_schd_if_all_ck02 CHECK (pay_spot_flg IN ('0', '1'));

