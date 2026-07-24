\encoding UTF-8

ALTER TABLE mam_itm_site_all
 ADD CONSTRAINT mam_itm_site_all_ck05 CHECK (so_prmt_insp_flg IN ('0', '1'));

