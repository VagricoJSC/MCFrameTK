\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck12 CHECK (dest_flg IN ('0', '1'));

