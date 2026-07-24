\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck07 CHECK (sum4_flg IN ('0', '1'));

