\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck12 CHECK (bank_ac_flg IN ('0', '1'));

