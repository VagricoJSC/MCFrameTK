\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck08 CHECK (ship_schd_split_flg IN ('0', '1'));

