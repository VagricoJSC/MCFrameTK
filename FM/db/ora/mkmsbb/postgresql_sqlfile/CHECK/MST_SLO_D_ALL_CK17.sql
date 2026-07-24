\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck17 CHECK (not_lg_mix_flg IN ('0', '1'));

