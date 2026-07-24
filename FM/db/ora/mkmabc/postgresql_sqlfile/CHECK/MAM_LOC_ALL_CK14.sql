\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck14 CHECK (del_flg IN ('0', '1'));

