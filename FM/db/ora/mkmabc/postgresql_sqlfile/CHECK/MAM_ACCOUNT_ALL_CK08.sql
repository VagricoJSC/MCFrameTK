\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck08 CHECK (sum5_flg IN ('0', '1'));

