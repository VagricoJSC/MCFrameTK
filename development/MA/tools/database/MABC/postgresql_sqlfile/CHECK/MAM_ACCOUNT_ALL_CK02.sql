\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck02 CHECK (foreign_flg IN ('0', '1'));

