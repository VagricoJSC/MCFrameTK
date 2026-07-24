\encoding UTF-8

ALTER TABLE mam_dpt_cmn
 ADD CONSTRAINT mam_dpt_cmn_ck04 CHECK (sls_dpt_flg IN ('0', '1'));

