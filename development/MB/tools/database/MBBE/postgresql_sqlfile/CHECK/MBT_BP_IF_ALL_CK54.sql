\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck54 CHECK (pay_ntc_adv_pay_flg IN ('0', '1'));

