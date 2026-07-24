\encoding UTF-8

ALTER TABLE mam_sls_anly_cmn
 ADD CONSTRAINT mam_sls_anly_cmn_ck01 CHECK (del_flg IN ('0', '1'));

