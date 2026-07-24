\encoding UTF-8

ALTER TABLE mam_site_co_all
 ADD CONSTRAINT mam_site_co_all_ck01 CHECK (del_flg IN ('0', '1'));

