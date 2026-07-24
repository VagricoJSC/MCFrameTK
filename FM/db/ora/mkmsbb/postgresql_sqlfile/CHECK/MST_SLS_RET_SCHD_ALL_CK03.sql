\encoding UTF-8

ALTER TABLE mst_sls_ret_schd_all
 ADD CONSTRAINT mst_sls_ret_schd_all_ck03 CHECK (sync_flg IN ('0', '1'));

