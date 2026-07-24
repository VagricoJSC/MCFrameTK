\encoding UTF-8

ALTER TABLE mst_slo_rsn_all
 ADD CONSTRAINT mst_slo_rsn_all_ck03 CHECK (slo_can_flg IN ('0', '1'));

