\encoding UTF-8

ALTER TABLE mam_bank_ac_cmn
 ADD CONSTRAINT mam_bank_ac_cmn_ck02 CHECK (del_flg IN ('0', '1'));

