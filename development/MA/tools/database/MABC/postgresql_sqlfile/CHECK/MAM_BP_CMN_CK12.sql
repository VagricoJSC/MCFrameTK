\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck12 CHECK (dest_flg IN ('0', '1'));

