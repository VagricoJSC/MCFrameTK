\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck05 CHECK (period_block_flg IN ('0', '1'));

