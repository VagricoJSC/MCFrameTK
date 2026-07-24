\encoding UTF-8

ALTER TABLE mst_arr_schd_all
 ADD CONSTRAINT mst_arr_schd_all_ck06 CHECK (sls_ret_schd_cmpl_flg IN ('0', '1'));

