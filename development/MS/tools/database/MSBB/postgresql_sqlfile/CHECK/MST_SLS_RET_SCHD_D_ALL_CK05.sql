\encoding UTF-8

ALTER TABLE mst_sls_ret_schd_d_all
 ADD CONSTRAINT mst_sls_ret_schd_d_all_ck05 CHECK (interim_flg IN ('0', '1'));

