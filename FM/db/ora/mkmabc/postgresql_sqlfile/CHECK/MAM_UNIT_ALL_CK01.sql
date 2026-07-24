\encoding UTF-8

ALTER TABLE mam_unit_all
 ADD CONSTRAINT mam_unit_all_ck01 CHECK (del_flg IN ('0', '1'));

