\encoding UTF-8

ALTER TABLE mst_slo_recv_if_all
 ADD CONSTRAINT mst_slo_recv_if_all_ck04 CHECK (tax_fix_flg IN ('0', '1'));

