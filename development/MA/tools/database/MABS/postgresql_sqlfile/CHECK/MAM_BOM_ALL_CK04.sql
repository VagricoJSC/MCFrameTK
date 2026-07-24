\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck04 CHECK (inst_lot_fix_flg IN ('0', '1'));

