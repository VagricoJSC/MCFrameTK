\encoding UTF-8

ALTER TABLE mam_bank_ac_all
 ADD CONSTRAINT mam_bank_ac_all_ck01 CHECK (ext_flg IN ('0', '1'));

