\encoding UTF-8

ALTER TABLE mst_slo_rsn_all
 ADD CONSTRAINT mst_slo_rsn_all_ck01 CHECK (qtn_term_flg IN ('0', '1'));

