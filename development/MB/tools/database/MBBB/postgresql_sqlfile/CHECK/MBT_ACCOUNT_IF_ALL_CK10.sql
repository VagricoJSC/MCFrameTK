\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck10 CHECK (bp_flg IN ('0', '1'));

