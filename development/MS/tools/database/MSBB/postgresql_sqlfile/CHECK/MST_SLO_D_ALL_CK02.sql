\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck02 CHECK (sno2_null_flg IN ('0', '1'));

