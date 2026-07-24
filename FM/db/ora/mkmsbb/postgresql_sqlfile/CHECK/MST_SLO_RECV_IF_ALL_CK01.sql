\encoding UTF-8

ALTER TABLE mst_slo_recv_if_all
 ADD CONSTRAINT mst_slo_recv_if_all_ck01 CHECK (sls_cststk_flg IN ('0', '1'));

