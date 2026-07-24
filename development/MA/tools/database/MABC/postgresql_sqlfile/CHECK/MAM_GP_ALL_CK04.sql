\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck04 CHECK (flg4 IN ('0', '1'));

