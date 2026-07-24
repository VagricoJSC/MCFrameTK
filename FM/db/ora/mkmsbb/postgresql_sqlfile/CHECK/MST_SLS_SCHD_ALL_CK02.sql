\encoding UTF-8

ALTER TABLE mst_sls_schd_all
 ADD CONSTRAINT mst_sls_schd_all_ck02 CHECK (not_auto_sls_flg IN ('0', '1'));

