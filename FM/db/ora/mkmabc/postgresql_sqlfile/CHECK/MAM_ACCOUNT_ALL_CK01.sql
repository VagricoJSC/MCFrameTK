\encoding UTF-8

ALTER TABLE mam_account_all
 ADD CONSTRAINT mam_account_all_ck01 CHECK (sub_flg IN ('0', '1'));

