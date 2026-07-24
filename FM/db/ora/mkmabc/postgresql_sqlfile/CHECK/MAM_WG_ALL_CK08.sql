\encoding UTF-8

ALTER TABLE mam_wg_all
 ADD CONSTRAINT mam_wg_all_ck08 CHECK (not_xfr_flg IN ('0', '1'));

