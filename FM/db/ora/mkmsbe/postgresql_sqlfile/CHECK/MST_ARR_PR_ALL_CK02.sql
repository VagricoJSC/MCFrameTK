\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck02 CHECK (purc_ddlv_flg IN ('0', '1'));

