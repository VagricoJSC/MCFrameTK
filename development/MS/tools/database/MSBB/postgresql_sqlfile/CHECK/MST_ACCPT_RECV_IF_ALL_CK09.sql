\encoding UTF-8

ALTER TABLE mst_accpt_recv_if_all
 ADD CONSTRAINT mst_accpt_recv_if_all_ck09 CHECK (imp_flg IN ('0', '1'));

