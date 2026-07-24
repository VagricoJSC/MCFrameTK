\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck62 CHECK (not_sublot_mix_flg IN ('0', '1'));

