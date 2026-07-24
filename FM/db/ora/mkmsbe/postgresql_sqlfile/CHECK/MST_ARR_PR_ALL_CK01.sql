\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck01 CHECK (abort_flg IN ('0', '1'));

