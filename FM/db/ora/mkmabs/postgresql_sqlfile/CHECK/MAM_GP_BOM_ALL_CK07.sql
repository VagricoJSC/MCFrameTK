\encoding UTF-8

ALTER TABLE mam_gp_bom_all
 ADD CONSTRAINT mam_gp_bom_all_ck07 CHECK (main_itm_flg IN ('0', '1'));

