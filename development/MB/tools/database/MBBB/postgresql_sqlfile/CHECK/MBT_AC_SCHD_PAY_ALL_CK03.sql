\encoding UTF-8

ALTER TABLE mbt_ac_schd_pay_all
 ADD CONSTRAINT mbt_ac_schd_pay_all_ck03 CHECK (pay_spot_flg IN ('0', '1'));

