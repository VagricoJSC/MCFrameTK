\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck06 CHECK (sublot_mix_flg IN ('0', '1'));

