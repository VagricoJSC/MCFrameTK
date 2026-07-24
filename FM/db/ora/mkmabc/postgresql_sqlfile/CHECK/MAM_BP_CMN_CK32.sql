\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck32 CHECK (repurc_obli_flg IN ('0', '1'));

