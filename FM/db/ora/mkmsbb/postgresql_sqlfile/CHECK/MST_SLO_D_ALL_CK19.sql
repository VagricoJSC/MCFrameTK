\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck19 CHECK (not_sublot_mix_flg IN ('0', '1'));

