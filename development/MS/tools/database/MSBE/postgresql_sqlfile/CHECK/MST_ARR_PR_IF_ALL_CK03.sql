\encoding UTF-8

ALTER TABLE mst_arr_pr_if_all
 ADD CONSTRAINT mst_arr_pr_if_all_ck03 CHECK (dlv_rqst_dt_overdue_flg IN ('0', '1'));

