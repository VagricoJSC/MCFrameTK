\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck08 CHECK (purc_cmpl_flg IN ('0', '1'));

