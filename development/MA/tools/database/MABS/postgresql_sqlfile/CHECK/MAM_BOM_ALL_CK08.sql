\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck08 CHECK (yield_calc_flg IN ('0', '1'));

