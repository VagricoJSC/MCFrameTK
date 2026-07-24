\encoding UTF-8

ALTER TABLE mam_itm_ver_all
 ADD CONSTRAINT mam_itm_ver_all_ck01 CHECK (cmpl_flg IN ('0', '1'));

