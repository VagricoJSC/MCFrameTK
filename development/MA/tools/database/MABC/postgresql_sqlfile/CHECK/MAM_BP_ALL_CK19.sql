\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck19 CHECK (cst_iv_flg IN ('0', '1'));

