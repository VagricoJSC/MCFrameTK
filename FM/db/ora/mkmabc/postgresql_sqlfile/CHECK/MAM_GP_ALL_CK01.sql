\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck01 CHECK (flg1 IN ('0', '1'));

