\encoding UTF-8

ALTER TABLE mam_itm_ver_all
 ADD CONSTRAINT mam_itm_ver_all_ck02 CHECK (del_flg IN ('0', '1'));

