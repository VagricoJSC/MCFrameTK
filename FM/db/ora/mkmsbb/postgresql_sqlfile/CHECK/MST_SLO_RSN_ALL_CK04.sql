\encoding UTF-8

ALTER TABLE mst_slo_rsn_all
 ADD CONSTRAINT mst_slo_rsn_all_ck04 CHECK (del_flg IN ('0', '1'));

