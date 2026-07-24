\encoding UTF-8

ALTER TABLE mam_site_cmn
 ADD CONSTRAINT mam_site_cmn_ck01 CHECK (arr_flg IN ('0', '1'));

