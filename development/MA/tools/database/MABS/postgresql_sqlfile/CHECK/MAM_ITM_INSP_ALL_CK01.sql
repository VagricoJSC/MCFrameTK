\encoding UTF-8

ALTER TABLE mam_itm_insp_all
 ADD CONSTRAINT mam_itm_insp_all_ck01 CHECK (no_insp_flg IN ('0', '1'));

