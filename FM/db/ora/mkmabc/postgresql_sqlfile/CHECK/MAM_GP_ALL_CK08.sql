\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck08 CHECK (flg8 IN ('0', '1'));

