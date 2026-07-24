\encoding UTF-8

ALTER TABLE mam_account_cmn
 ADD CONSTRAINT mam_account_cmn_ck01 CHECK (sub_flg IN ('0', '1'));

