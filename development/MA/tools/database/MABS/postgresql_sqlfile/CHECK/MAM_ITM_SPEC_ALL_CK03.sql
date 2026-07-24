\encoding UTF-8

ALTER TABLE mam_itm_spec_all
 ADD CONSTRAINT mam_itm_spec_all_ck03 CHECK (del_flg IN ('0', '1'));

