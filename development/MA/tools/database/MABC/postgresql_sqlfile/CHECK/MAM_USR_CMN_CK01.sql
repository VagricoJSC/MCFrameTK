\encoding UTF-8

ALTER TABLE mam_usr_cmn
 ADD CONSTRAINT mam_usr_cmn_ck01 CHECK (full_da_flg IN ('0', '1'));

