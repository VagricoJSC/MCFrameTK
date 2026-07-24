\encoding UTF-8

ALTER TABLE mam_dpt_cmn
 ADD CONSTRAINT mam_dpt_cmn_ck10 CHECK (insp_dpt_flg IN ('0', '1'));

