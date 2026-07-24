\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck09 CHECK (flg9 IN ('0', '1'));

