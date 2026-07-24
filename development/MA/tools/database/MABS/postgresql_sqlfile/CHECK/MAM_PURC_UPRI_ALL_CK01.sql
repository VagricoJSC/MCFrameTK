\encoding UTF-8

ALTER TABLE mam_purc_upri_all
 ADD CONSTRAINT mam_purc_upri_all_ck01 CHECK (interim_flg IN ('0', '1'));

