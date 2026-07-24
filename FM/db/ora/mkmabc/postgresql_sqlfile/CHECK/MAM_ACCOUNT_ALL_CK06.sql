\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck06 CHECK (sum3_flg IN ('0', '1'));

