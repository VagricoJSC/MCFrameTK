\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_sv_all
 ADD CONSTRAINT mst_ship_alloc_sts_sv_all_ck03 CHECK (sno3_null_flg IN ('0', '1'));

