\encoding UTF-8

ALTER TABLE mam_trd_all
 ADD CONSTRAINT mam_trd_all_ck04 CHECK (del_flg IN ('0', '1'));

