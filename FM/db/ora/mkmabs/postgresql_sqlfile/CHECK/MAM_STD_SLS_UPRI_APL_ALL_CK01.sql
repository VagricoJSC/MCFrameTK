\encoding UTF-8

ALTER TABLE mam_std_sls_upri_apl_all
 ADD CONSTRAINT mam_std_sls_upri_apl_all_ck01 CHECK (ref_flg IN ('0', '1'));

