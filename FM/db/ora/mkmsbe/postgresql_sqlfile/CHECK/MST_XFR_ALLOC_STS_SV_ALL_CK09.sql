\encoding UTF-8

ALTER TABLE mst_xfr_alloc_sts_sv_all
 ADD CONSTRAINT mst_xfr_alloc_sts_sv_all_ck09 CHECK (alloc_flg IN ('0', '1'));

