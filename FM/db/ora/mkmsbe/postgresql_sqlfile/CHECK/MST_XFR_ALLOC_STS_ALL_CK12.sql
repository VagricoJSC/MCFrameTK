\encoding UTF-8

ALTER TABLE mst_xfr_alloc_sts_all
 ADD CONSTRAINT mst_xfr_alloc_sts_all_ck12 CHECK (not_sublot_mix_flg IN ('0', '1'));

