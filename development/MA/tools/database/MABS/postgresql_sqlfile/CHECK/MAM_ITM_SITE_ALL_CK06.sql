\encoding UTF-8

ALTER TABLE mam_itm_site_all
 ADD CONSTRAINT mam_itm_site_all_ck06 CHECK (in_prmt_insp_flg IN ('0', '1'));

