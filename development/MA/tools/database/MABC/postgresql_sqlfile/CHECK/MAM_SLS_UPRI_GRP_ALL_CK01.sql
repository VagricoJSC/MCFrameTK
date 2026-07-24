\encoding UTF-8

ALTER TABLE mam_sls_upri_grp_all
 ADD CONSTRAINT mam_sls_upri_grp_all_ck01 CHECK (del_flg IN ('0', '1'));

