\encoding UTF-8

ALTER TABLE mam_rsrc_loc_all
 ADD CONSTRAINT mam_rsrc_loc_all_ck01 CHECK (del_flg IN ('0', '1'));

