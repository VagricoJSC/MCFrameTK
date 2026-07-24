\encoding UTF-8

ALTER TABLE mam_std_sls_upri_apl_all
 ADD CONSTRAINT mam_std_sls_upri_apl_all_ck03 CHECK (del_flg IN ('0', '1'));

