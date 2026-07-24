\encoding UTF-8

ALTER TABLE mam_calc_grp_all
 ADD CONSTRAINT mam_calc_grp_all_ck02 CHECK (wk_calc_flg IN ('0', '1'));

