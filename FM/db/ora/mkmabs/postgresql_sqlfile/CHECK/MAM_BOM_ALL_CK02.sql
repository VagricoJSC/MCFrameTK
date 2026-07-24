\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck02 CHECK (alt_itm_flg IN ('0', '1'));

