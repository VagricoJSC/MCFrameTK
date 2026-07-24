\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck11 CHECK (del_flg IN ('0', '1'));

