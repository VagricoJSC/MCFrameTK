\encoding UTF-8

ALTER TABLE mam_itm_insp_all
 ADD CONSTRAINT mam_itm_insp_all_ck06 CHECK (pre_insp_valid_flg IN ('0', '1'));

