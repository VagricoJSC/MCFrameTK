\encoding UTF-8

ALTER TABLE mam_spec_all
 ADD CONSTRAINT mam_spec_all_ck01 CHECK (del_flg IN ('0', '1'));

