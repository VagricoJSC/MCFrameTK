\encoding UTF-8

ALTER TABLE mam_cst_sls_upri_rank_all
 ADD CONSTRAINT mam_cst_sls_upri_rank_all_ck01 CHECK (del_flg IN ('0', '1'));

