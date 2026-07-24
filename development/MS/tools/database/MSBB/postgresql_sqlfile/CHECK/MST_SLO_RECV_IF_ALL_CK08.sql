\encoding UTF-8

ALTER TABLE mst_slo_recv_if_all
 ADD CONSTRAINT mst_slo_recv_if_all_ck08 CHECK (amt_not_chk_flg IN ('0', '1'));

