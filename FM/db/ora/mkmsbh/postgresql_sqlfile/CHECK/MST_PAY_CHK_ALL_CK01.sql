\encoding UTF-8

ALTER TABLE mst_pay_chk_all
 ADD CONSTRAINT mst_pay_chk_all_ck01 CHECK (pay_spot_flg IN ('0', '1'));

