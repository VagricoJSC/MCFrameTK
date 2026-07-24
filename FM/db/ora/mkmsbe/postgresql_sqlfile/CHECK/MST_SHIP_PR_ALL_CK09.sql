\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck09 CHECK (ship_cmpl_flg IN ('0', '1'));

