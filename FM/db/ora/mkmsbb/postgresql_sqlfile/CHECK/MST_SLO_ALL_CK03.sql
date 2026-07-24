\encoding UTF-8

ALTER TABLE mst_slo_all
 ADD CONSTRAINT mst_slo_all_ck03 CHECK (aprv_flg IN ('0', '1'));

