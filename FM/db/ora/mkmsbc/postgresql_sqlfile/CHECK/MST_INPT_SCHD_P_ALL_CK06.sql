\encoding UTF-8

ALTER TABLE mst_inpt_schd_p_all
 ADD CONSTRAINT mst_inpt_schd_p_all_ck06 CHECK (inst_lot_fix_flg IN ('0', '1'));

