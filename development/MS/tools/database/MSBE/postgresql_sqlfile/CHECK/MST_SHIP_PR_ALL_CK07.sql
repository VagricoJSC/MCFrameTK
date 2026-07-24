\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck07 CHECK (dlv_rqst_dt_overdue_flg IN ('0', '1'));

