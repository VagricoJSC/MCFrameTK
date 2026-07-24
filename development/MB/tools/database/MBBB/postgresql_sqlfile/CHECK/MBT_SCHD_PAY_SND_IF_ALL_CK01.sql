\encoding UTF-8

ALTER TABLE mbt_schd_pay_snd_if_all
 ADD CONSTRAINT mbt_schd_pay_snd_if_all_ck01 CHECK (pay_spot_flg IN ('0', '1'));

