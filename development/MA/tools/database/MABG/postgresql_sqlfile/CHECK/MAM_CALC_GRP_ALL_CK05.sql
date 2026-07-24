\encoding UTF-8

ALTER TABLE mam_calc_grp_all
 ADD CONSTRAINT mam_calc_grp_all_ck05 CHECK (del_flg IN ('0', '1'));

