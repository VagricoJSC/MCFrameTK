\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck13 CHECK (imp_flg IN ('0', '1'));

