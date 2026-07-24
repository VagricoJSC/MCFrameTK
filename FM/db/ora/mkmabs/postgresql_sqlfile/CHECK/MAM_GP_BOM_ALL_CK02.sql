\encoding UTF-8

ALTER TABLE mam_gp_bom_all
 ADD CONSTRAINT mam_gp_bom_all_ck02 CHECK (alt_itm_flg IN ('0', '1'));

