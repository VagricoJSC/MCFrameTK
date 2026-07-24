\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck47 CHECK (purc_interim_cl_flg IN ('0', '1'));

