\encoding UTF-8

ALTER TABLE mam_site_all
 ADD CONSTRAINT mam_site_all_ck02 CHECK (del_flg IN ('0', '1'));

