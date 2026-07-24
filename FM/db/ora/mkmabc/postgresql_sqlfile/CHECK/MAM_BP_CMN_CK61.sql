\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck61 CHECK (not_lot_mix_flg IN ('0', '1'));

