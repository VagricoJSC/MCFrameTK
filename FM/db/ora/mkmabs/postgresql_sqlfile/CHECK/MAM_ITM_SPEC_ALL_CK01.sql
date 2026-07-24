\encoding UTF-8

ALTER TABLE mam_itm_spec_all
 ADD CONSTRAINT mam_itm_spec_all_ck01 CHECK (multi_sel_flg IN ('0', '1'));

