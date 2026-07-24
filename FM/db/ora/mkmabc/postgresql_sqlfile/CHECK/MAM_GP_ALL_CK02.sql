\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck02 CHECK (flg2 IN ('0', '1'));

