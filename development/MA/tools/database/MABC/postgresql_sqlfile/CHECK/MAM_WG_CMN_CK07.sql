\encoding UTF-8

ALTER TABLE mam_wg_cmn
 ADD CONSTRAINT mam_wg_cmn_ck07 CHECK (sd_flg IN ('0', '1'));

