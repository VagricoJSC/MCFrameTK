\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck16 CHECK (sls_upri_cng_flg IN ('0', '1'));

