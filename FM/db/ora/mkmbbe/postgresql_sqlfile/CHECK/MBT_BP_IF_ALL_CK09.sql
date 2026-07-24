\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck09 CHECK (psppl_flg IN ('0', '1'));

