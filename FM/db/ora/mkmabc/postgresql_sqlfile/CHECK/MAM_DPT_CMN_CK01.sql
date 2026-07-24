\encoding UTF-8

ALTER TABLE mam_dpt_cmn
 ADD CONSTRAINT mam_dpt_cmn_ck01 CHECK (asst_dpt_flg IN ('0', '1'));

