\encoding UTF-8

ALTER TABLE mam_itm_insp_all
 ADD CONSTRAINT mam_itm_insp_all_ck04 CHECK (no_insp_aprv_flg IN ('0', '1'));

