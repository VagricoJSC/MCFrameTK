\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck55 CHECK (dlv_sundry_flg IN ('0', '1'));

