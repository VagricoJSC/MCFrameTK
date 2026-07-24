\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck06 CHECK (flg6 IN ('0', '1'));

