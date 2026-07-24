\encoding UTF-8

ALTER TABLE mst_slo_prms_all
 ADD CONSTRAINT mst_slo_prms_all_ck01 CHECK (can_flg IN ('0', '1'));

