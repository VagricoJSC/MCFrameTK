\encoding UTF-8

ALTER TABLE mst_slo_recv_if_all
 ADD CONSTRAINT mst_slo_recv_if_all_ck07 CHECK (upri_not_chk_flg IN ('0', '1'));

