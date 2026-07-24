\encoding UTF-8

ALTER TABLE mst_slo_prms_p_all
 ADD CONSTRAINT mst_slo_prms_p_all_ck01 CHECK (can_flg IN ('0', '1'));

