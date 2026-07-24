\encoding UTF-8

ALTER TABLE mst_mly_wip_all
 ADD CONSTRAINT mst_mly_wip_all_ck01 CHECK (cmpl_flg IN ('0', '1'));

