\encoding UTF-8

ALTER TABLE mam_itm_spec_all
 ADD CONSTRAINT mam_itm_spec_all_ck02 CHECK (req_flg IN ('0', '1'));

