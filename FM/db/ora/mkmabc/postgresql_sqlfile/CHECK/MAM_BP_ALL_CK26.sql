\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck26 CHECK (auto_line_appl_flg IN ('0', '1'));

