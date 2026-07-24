\encoding UTF-8

ALTER TABLE mst_sls_act_d_all
 ADD CONSTRAINT mst_sls_act_d_all_ck04 CHECK (upri_not_tgt_flg IN ('0', '1'));

