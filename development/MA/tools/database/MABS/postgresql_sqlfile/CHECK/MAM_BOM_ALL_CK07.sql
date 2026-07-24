\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck07 CHECK (main_itm_flg IN ('0', '1'));

