\encoding UTF-8

ALTER TABLE mam_sls_upri_rank_cmn
 ADD CONSTRAINT mam_sls_upri_rank_cmn_ck01 CHECK (del_flg IN ('0', '1'));

