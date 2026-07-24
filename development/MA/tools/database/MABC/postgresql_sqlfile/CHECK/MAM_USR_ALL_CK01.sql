\encoding UTF-8

ALTER TABLE mam_usr_all
 ADD CONSTRAINT mam_usr_all_ck01 CHECK (full_da_flg IN ('0', '1'));

