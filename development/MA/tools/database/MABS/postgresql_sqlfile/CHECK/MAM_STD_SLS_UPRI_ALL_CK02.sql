\encoding UTF-8

ALTER TABLE mam_std_sls_upri_all
 ADD CONSTRAINT mam_std_sls_upri_all_ck02 CHECK (del_flg IN ('0', '1'));

