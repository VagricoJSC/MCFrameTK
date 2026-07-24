\encoding UTF-8

ALTER TABLE mst_ship_pr_if_all
 ADD CONSTRAINT mst_ship_pr_if_all_ck02 CHECK (prms_dlv_dt_overdue_flg IN ('0', '1'));

