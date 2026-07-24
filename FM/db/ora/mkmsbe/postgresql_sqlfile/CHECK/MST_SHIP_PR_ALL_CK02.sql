\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck02 CHECK (ship_to_sundry_flg IN ('0', '1'));

