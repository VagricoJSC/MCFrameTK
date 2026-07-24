\encoding UTF-8

ALTER TABLE mam_site_all
 ADD CONSTRAINT mam_site_all_ck01 CHECK (arr_flg IN ('0', '1'));

