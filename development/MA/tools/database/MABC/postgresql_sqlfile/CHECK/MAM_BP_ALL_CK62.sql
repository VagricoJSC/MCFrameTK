\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck62 CHECK (not_sublot_mix_flg IN ('0', '1'));

