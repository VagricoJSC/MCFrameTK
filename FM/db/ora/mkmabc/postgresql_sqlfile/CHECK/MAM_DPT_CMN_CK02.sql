\encoding UTF-8

ALTER TABLE mam_dpt_cmn
 ADD CONSTRAINT mam_dpt_cmn_ck02 CHECK (ar_dpt_flg IN ('0', '1'));

