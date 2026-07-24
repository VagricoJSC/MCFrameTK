\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck06 CHECK (sum3_flg IN ('0', '1'));

