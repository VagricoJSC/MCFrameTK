\encoding UTF-8

ALTER TABLE mst_arr_pr_if_all
 ADD CONSTRAINT mst_arr_pr_if_all_ck06 CHECK (sls_ret_cmpl_flg IN ('0', '1'));

