\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck04 CHECK (sno4_null_flg IN ('0', '1'));

