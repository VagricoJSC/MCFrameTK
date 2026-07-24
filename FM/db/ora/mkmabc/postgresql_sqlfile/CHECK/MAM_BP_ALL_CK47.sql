\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck47 CHECK (purc_interim_cl_flg IN ('0', '1'));

