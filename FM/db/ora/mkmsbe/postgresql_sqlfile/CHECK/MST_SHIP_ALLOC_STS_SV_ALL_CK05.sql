\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_sv_all
 ADD CONSTRAINT mst_ship_alloc_sts_sv_all_ck05 CHECK (alloc_flg IN ('0', '1'));

