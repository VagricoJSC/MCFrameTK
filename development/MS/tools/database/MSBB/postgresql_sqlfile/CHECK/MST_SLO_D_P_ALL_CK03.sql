\encoding UTF-8

ALTER TABLE mst_slo_d_p_all
 ADD CONSTRAINT mst_slo_d_p_all_ck03 CHECK (sno3_null_flg IN ('0', '1'));

