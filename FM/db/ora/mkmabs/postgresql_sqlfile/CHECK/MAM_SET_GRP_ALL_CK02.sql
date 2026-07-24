\encoding UTF-8

ALTER TABLE mam_set_grp_all
 ADD CONSTRAINT mam_set_grp_all_ck02 CHECK (del_flg IN ('0', '1'));

