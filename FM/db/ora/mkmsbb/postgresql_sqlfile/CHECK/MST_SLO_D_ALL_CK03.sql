\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck03 CHECK (sno3_null_flg IN ('0', '1'));

