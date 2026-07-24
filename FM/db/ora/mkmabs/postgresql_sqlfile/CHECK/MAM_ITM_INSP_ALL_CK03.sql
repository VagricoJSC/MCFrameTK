\encoding UTF-8

ALTER TABLE mam_itm_insp_all
 ADD CONSTRAINT mam_itm_insp_all_ck03 CHECK (no_plnt_aprv_flg IN ('0', '1'));

