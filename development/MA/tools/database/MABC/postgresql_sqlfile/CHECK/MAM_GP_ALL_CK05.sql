\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck05 CHECK (flg5 IN ('0', '1'));

