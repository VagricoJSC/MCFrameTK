\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_sv_all
 ADD CONSTRAINT mst_ship_alloc_sts_sv_all_ck04 CHECK (sno4_null_flg IN ('0', '1'));

