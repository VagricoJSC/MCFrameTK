\encoding UTF-8

ALTER TABLE mam_grs_alloc_ctl_all
 ADD CONSTRAINT mam_grs_alloc_ctl_all_ck01 CHECK (del_flg IN ('0', '1'));

