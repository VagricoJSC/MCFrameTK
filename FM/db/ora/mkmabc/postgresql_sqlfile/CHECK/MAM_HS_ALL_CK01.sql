\encoding UTF-8

ALTER TABLE mam_hs_all
 ADD CONSTRAINT mam_hs_all_ck01 CHECK (del_flg IN ('0', '1'));

