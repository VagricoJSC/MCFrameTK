\encoding UTF-8

ALTER TABLE mam_wg_cmn
 ADD CONSTRAINT mam_wg_cmn_ck09 CHECK (plm_flg IN ('0', '1'));

