\encoding UTF-8

ALTER TABLE mst_slo_d_p_all
 ADD CONSTRAINT mst_slo_d_p_all_ck18 CHECK (not_lot_mix_flg IN ('0', '1'));

