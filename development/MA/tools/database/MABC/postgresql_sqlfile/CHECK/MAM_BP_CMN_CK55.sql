\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck55 CHECK (dlv_sundry_flg IN ('0', '1'));

