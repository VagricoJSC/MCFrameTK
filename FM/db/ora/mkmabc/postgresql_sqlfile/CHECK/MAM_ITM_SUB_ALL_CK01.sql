\encoding UTF-8

ALTER TABLE mam_itm_sub_all
 ADD CONSTRAINT mam_itm_sub_all_ck01 CHECK (del_flg IN ('0', '1'));

