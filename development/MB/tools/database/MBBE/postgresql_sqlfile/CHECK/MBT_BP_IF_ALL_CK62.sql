\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck62 CHECK (not_lot_mix_flg IN ('0', '1'));

