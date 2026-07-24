\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck46 CHECK (repurc_obli_flg IN ('0', '1'));

