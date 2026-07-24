\encoding UTF-8

ALTER TABLE mam_std_sls_upri_all
 ADD CONSTRAINT mam_std_sls_upri_all_ck01 CHECK (not_cost_flg IN ('0', '1'));

