\encoding UTF-8

ALTER TABLE mst_sls_schd_all
 ADD CONSTRAINT mst_sls_schd_all_ck03 CHECK (abort_flg IN ('0', '1'));

