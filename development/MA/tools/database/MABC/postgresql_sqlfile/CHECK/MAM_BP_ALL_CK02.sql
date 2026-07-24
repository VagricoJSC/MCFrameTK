\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck02 CHECK (acst_flg IN ('0', '1'));

