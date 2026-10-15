\encoding UTF-8

ALTER TABLE mst_slo_all
 ADD CONSTRAINT mst_slo_all_ck07 CHECK (slo_last_sls_flg IN ('0', '1'));

