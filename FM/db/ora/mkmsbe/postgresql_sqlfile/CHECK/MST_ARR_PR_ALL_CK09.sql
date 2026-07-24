\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck09 CHECK (sls_ret_cmpl_flg IN ('0', '1'));

