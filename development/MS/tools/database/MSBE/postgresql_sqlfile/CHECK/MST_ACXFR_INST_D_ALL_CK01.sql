\encoding UTF-8

ALTER TABLE mst_acxfr_inst_d_all
 ADD CONSTRAINT mst_acxfr_inst_d_all_ck01 CHECK (no_lot_fix_flg IN ('0', '1'));

