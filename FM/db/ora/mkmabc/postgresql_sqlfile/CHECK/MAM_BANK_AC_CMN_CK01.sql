\encoding UTF-8

ALTER TABLE mam_bank_ac_cmn
 ADD CONSTRAINT mam_bank_ac_cmn_ck01 CHECK (ext_flg IN ('0', '1'));

