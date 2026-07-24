\encoding UTF-8

ALTER TABLE mam_wg_all
 ADD CONSTRAINT mam_wg_all_ck06 CHECK (ap_flg IN ('0', '1'));

