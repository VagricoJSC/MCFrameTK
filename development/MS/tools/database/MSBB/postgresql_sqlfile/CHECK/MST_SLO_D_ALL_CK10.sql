\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck10 CHECK (upri_not_tgt_flg IN ('0', '1'));

