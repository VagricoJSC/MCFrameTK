\encoding UTF-8

ALTER TABLE mam_account_cmn
 ADD CONSTRAINT mam_account_cmn_ck12 CHECK (bank_ac_flg IN ('0', '1'));

