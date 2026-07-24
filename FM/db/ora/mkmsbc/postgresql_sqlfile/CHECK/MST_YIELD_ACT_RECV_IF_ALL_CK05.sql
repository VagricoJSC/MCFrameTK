\encoding UTF-8

ALTER TABLE mst_yield_act_recv_if_all
 ADD CONSTRAINT mst_yield_act_recv_if_all_ck05 CHECK (imp_flg IN ('0', '1'));

