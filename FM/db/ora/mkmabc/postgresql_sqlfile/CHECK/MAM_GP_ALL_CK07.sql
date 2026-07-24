\encoding UTF-8

ALTER TABLE mam_gp_all
 ADD CONSTRAINT mam_gp_all_ck07 CHECK (flg7 IN ('0', '1'));

