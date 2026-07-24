\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck09 CHECK (cred_flg IN ('0', '1'));

