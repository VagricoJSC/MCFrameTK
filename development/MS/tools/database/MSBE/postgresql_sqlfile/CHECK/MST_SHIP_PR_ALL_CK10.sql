\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck10 CHECK (sls_cmpl_flg IN ('0', '1'));

