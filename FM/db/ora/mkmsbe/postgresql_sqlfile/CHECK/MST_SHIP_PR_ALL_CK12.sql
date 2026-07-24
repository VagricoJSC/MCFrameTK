\encoding UTF-8

ALTER TABLE mst_ship_pr_all
 ADD CONSTRAINT mst_ship_pr_all_ck12 CHECK (not_lg_mix_flg IN ('0', '1'));

