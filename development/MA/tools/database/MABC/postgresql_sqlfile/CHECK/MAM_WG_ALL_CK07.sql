\encoding UTF-8

ALTER TABLE mam_wg_all
 ADD CONSTRAINT mam_wg_all_ck07 CHECK (sd_flg IN ('0', '1'));

