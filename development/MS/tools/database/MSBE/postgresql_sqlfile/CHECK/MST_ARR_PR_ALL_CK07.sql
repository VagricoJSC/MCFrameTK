\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck07 CHECK (arr_cmpl_flg IN ('0', '1'));

