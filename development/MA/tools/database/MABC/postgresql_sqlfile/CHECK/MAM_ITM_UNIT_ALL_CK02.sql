\encoding UTF-8

ALTER TABLE mam_itm_unit_all
 ADD CONSTRAINT mam_itm_unit_all_ck02 CHECK (pckg_flg IN ('0', '1'));

