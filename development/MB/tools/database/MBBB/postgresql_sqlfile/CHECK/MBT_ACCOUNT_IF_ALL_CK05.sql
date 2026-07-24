\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck05 CHECK (sum2_flg IN ('0', '1'));

