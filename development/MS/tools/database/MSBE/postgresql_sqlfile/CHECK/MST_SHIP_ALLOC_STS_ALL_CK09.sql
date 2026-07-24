\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_all
 ADD CONSTRAINT mst_ship_alloc_sts_all_ck09 CHECK (not_sublot_mix_flg IN ('0', '1'));

