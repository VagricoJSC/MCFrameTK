\encoding UTF-8

ALTER TABLE mbt_account_if_all
 ADD CONSTRAINT mbt_account_if_all_ck01 CHECK (sub_flg IN ('0', '1'));

