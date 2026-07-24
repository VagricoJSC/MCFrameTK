\encoding UTF-8

ALTER TABLE mam_trnspt_all
 ADD CONSTRAINT mam_trnspt_all_ck01 CHECK (del_flg IN ('0', '1'));

