\encoding UTF-8

ALTER TABLE mst_ship_pr_if_all
 ADD CONSTRAINT mst_ship_pr_if_all_ck04 CHECK (ship_cmpl_flg IN ('0', '1'));

