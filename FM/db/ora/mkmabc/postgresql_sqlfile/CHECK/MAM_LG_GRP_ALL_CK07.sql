\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck07 CHECK (ship_loc_prio_flg IN ('0', '1'));

