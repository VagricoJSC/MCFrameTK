\encoding UTF-8

ALTER TABLE mam_itm_com
 ADD CONSTRAINT mam_itm_com_ck29 CHECK (sls_upri_cng_flg IN ('0', '1'));

