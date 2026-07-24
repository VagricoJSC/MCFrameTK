\encoding UTF-8

ALTER TABLE mst_arr_pr_if_all
 ADD CONSTRAINT mst_arr_pr_if_all_ck04 CHECK (arr_cmpl_flg IN ('0', '1'));

