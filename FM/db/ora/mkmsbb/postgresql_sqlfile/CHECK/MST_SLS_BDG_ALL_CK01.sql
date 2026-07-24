\encoding UTF-8

ALTER TABLE mst_sls_bdg_all
 ADD CONSTRAINT mst_sls_bdg_all_ck01 CHECK (not_sum_flg IN ('0', '1'));

