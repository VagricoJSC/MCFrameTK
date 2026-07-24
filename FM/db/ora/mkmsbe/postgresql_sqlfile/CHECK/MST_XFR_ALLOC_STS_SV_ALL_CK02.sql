\encoding UTF-8

ALTER TABLE mst_xfr_alloc_sts_sv_all
 ADD CONSTRAINT mst_xfr_alloc_sts_sv_all_ck02 CHECK (sno2_null_flg IN ('0', '1'));

