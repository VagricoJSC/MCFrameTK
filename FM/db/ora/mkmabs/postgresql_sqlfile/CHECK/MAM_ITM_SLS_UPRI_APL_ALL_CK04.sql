\encoding UTF-8

ALTER TABLE mam_itm_sls_upri_apl_all
 ADD CONSTRAINT mam_itm_sls_upri_apl_all_ck04 CHECK (del_flg IN ('0', '1'));

