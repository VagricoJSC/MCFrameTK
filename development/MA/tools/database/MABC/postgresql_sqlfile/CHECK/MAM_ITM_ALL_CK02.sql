\encoding UTF-8

ALTER TABLE mam_itm_all
 ADD CONSTRAINT mam_itm_all_ck02 CHECK (dscnt_itm_flg IN ('0', '1'));

