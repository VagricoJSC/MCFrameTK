\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck08 CHECK (del_flg IN ('0', '1'));

