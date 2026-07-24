\encoding UTF-8

ALTER TABLE mam_sub_account_cmn
 ADD CONSTRAINT mam_sub_account_cmn_ck01 CHECK (del_flg IN ('0', '1'));

