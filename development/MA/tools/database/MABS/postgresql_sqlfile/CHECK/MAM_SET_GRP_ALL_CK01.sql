\encoding UTF-8

ALTER TABLE mam_set_grp_all
 ADD CONSTRAINT mam_set_grp_all_ck01 CHECK (ship_assort_flg IN ('0', '1'));

