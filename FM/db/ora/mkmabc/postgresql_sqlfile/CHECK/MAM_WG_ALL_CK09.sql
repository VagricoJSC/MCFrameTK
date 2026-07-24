\encoding UTF-8

ALTER TABLE mam_wg_all
 ADD CONSTRAINT mam_wg_all_ck09 CHECK (plm_flg IN ('0', '1'));

