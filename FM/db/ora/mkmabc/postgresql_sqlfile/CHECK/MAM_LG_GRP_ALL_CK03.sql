\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck03 CHECK (pick_list_flg IN ('0', '1'));

