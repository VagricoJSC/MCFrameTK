\encoding UTF-8

ALTER TABLE mst_slo_all
 ADD CONSTRAINT mst_slo_all_ck01 CHECK (xrate_inpt_flg IN ('0', '1'));

