\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck51 CHECK (pay_ntc_prnt_flg IN ('0', '1'));

