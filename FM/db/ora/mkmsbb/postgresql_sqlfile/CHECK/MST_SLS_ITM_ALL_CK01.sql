\encoding UTF-8

ALTER TABLE mst_sls_itm_all
 ADD CONSTRAINT mst_sls_itm_all_ck01 CHECK (rel_flg IN ('0', '1'));

