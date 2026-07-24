\encoding UTF-8

ALTER TABLE mst_slo_d_p_all
 ADD CONSTRAINT mst_slo_d_p_all_ck09 CHECK (sls_cststk_flg IN ('0', '1'));

