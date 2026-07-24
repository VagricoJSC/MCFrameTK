\encoding UTF-8

ALTER TABLE mst_pay_schd_all
 ADD CONSTRAINT mst_pay_schd_all_ck01 CHECK (sw_flg IN ('0', '1'));

