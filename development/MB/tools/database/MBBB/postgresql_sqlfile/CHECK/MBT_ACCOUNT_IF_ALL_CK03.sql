\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck03 CHECK (sum0_flg IN ('0', '1'));

