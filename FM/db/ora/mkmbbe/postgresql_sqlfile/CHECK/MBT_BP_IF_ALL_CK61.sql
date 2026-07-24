\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck61 CHECK (not_lg_mix_flg IN ('0', '1'));

