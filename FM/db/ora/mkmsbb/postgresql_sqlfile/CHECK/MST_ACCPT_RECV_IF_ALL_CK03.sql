\encoding UTF-8

ALTER TABLE mst_accpt_recv_if_all
 ADD CONSTRAINT mst_accpt_recv_if_all_ck03 CHECK (inc_tax_flg IN ('0', '1'));

