\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck10 CHECK (alloc_lmt_flg IN ('0', '1'));

