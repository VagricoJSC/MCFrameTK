\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck05 CHECK (sum2_flg IN ('0', '1'));

