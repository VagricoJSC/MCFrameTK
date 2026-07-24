\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck08 CHECK (bsppl_flg IN ('0', '1'));

