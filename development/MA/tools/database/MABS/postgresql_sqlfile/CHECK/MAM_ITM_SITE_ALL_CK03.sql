\encoding UTF-8

ALTER TABLE mam_itm_site_all
 ADD CONSTRAINT mam_itm_site_all_ck03 CHECK (mfg_aprv_flg IN ('0', '1'));

