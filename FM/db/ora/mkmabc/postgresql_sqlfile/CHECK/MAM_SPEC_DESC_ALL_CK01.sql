\encoding UTF-8

ALTER TABLE mam_spec_desc_all
 ADD CONSTRAINT mam_spec_desc_all_ck01 CHECK (del_flg IN ('0', '1'));

