\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck14 CHECK (vmi_flg IN ('0', '1'));

