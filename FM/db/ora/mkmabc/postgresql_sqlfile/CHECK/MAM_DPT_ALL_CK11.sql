\encoding UTF-8

ALTER TABLE mam_dpt_all
 ADD CONSTRAINT mam_dpt_all_ck11 CHECK (bd_dpt_flg IN ('0', '1'));

