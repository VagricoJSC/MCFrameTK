\encoding UTF-8

ALTER TABLE mbt_ac_schd_pay_all
 ADD CONSTRAINT mbt_ac_schd_pay_all_ck04 CHECK (send_flg IN ('0', '1'));

