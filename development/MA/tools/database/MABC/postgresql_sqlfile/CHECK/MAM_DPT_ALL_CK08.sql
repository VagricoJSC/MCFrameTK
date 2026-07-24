\encoding UTF-8

ALTER TABLE mam_dpt_all
 ADD CONSTRAINT mam_dpt_all_ck08 CHECK (mfg_dpt_flg IN ('0', '1'));

