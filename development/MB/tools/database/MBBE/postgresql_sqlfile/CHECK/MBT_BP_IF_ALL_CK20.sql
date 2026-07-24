\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck20 CHECK (cst_iv_flg IN ('0', '1'));

