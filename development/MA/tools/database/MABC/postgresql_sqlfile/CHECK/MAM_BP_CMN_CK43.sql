\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck43 CHECK (sppl_iv_flg IN ('0', '1'));

