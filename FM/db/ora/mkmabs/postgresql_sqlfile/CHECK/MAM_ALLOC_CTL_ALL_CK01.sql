\encoding UTF-8

ALTER TABLE mam_alloc_ctl_all
 ADD CONSTRAINT mam_alloc_ctl_all_ck01 CHECK (in_loc_flg IN ('0', '1'));

