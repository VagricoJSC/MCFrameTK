\encoding UTF-8

ALTER TABLE mam_set_itm_all
 ADD CONSTRAINT mam_set_itm_all_ck01 CHECK (del_flg IN ('0', '1'));

