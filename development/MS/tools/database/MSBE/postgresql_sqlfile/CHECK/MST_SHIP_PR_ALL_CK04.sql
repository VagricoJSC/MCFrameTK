\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck04 CHECK (purc_ddlv_flg IN ('0', '1'));

