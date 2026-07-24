\encoding UTF-8

ALTER TABLE mst_slo_all
 ADD CONSTRAINT mst_slo_all_ck04 CHECK (edi_flg IN ('0', '1'));

