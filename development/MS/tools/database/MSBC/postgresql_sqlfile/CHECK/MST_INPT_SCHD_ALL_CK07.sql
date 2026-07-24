\encoding UTF-8

ALTER TABLE mst_inpt_schd_all
 ADD CONSTRAINT mst_inpt_schd_all_ck07 CHECK (lot_mix_flg IN ('0', '1'));

