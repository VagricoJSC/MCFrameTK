\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck06 CHECK (arr_schd_refl_flg IN ('0', '1'));

