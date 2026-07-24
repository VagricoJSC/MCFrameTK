\encoding UTF-8

ALTER TABLE mst_xfr_alloc_sts_all
 ADD CONSTRAINT mst_xfr_alloc_sts_all_ck10 CHECK (alloc_flg IN ('0', '1'));

