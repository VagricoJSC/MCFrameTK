\encoding UTF-8

ALTER TABLE mst_slo_p_all
 ADD CONSTRAINT mst_slo_p_all_ck09 CHECK (can_rqst_flg IN ('0', '1'));

