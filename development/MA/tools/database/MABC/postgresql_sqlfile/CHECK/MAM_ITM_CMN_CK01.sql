\encoding UTF-8

ALTER TABLE mam_itm_cmn
 ADD CONSTRAINT mam_itm_cmn_ck01 CHECK (sundry_itm_flg IN ('0', '1'));

