\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck36 CHECK (purc_upri_cng_flg IN ('0', '1'));

