\encoding UTF-8

ALTER TABLE mst_arr_pr_all
 ADD CONSTRAINT mst_arr_pr_all_ck04 CHECK (dlv_rqst_dt_overdue_flg IN ('0', '1'));

