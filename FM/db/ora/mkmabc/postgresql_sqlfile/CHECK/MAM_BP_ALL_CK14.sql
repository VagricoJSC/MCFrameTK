\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck14 CHECK (cst_sundry_flg IN ('0', '1'));

