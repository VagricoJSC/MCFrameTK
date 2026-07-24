\encoding UTF-8

ALTER TABLE mst_slo_prms_h_all
 ADD CONSTRAINT mst_slo_prms_h_all_ck02 CHECK (slo_prms_prnt_flg IN ('0', '1'));

