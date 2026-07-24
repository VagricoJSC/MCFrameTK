\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck05 CHECK (stktk_tor_disp_flg IN ('0', '1'));

