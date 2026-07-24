\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck40 CHECK (onr_prsppl_flg IN ('0', '1'));

