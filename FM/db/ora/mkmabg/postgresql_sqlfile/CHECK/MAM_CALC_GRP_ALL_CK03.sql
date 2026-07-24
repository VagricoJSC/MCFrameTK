\encoding UTF-8

ALTER TABLE mam_calc_grp_all
 ADD CONSTRAINT mam_calc_grp_all_ck03 CHECK (prov_calc_flg IN ('0', '1'));

