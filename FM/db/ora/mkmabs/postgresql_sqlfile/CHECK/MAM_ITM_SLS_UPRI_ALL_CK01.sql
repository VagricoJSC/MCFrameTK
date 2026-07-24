\encoding UTF-8

ALTER TABLE mam_itm_sls_upri_all
 ADD CONSTRAINT mam_itm_sls_upri_all_ck01 CHECK (interim_flg IN ('0', '1'));

