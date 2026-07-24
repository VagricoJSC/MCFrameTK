\encoding UTF-8

ALTER TABLE mam_account_cmn
 ADD CONSTRAINT mam_account_cmn_ck07 CHECK (sum4_flg IN ('0', '1'));

