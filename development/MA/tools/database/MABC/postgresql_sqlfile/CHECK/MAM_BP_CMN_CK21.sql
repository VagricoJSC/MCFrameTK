\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck21 CHECK (sls_interim_cl_flg IN ('0', '1'));

