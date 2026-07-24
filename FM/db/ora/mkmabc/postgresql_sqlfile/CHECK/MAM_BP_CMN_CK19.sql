\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck19 CHECK (cst_iv_flg IN ('0', '1'));

