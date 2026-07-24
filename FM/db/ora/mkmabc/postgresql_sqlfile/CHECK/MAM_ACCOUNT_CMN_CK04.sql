\encoding UTF-8

ALTER TABLE mam_account_cmn
 ADD CONSTRAINT mam_account_cmn_ck04 CHECK (sum1_flg IN ('0', '1'));

