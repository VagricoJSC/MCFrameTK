\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck13 CHECK (all_com_flg IN ('0', '1'));

