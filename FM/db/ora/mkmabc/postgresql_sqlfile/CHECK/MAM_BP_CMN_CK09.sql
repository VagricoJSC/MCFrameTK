\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck09 CHECK (cred_flg IN ('0', '1'));

