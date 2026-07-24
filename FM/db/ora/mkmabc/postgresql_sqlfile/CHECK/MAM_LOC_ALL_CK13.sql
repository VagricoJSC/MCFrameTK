\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck13 CHECK (addr_flg IN ('0', '1'));

