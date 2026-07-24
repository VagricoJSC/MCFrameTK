\encoding UTF-8

ALTER TABLE mst_sls_ret_schd_d_all
 ADD CONSTRAINT mst_sls_ret_schd_d_all_ck08 CHECK (cmpl_flg IN ('0', '1'));

