\encoding UTF-8

ALTER TABLE mam_dpt_all
 ADD CONSTRAINT mam_dpt_all_ck01 CHECK (asst_dpt_flg IN ('0', '1'));

