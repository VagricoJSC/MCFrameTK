\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck60 CHECK (not_lg_mix_flg IN ('0', '1'));

