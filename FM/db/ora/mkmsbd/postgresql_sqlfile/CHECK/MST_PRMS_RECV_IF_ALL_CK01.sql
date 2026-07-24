\encoding UTF-8

ALTER TABLE mst_prms_recv_if_all
 ADD CONSTRAINT mst_prms_recv_if_all_ck01 CHECK (imp_flg IN ('0', '1'));

