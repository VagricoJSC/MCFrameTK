\encoding UTF-8

ALTER TABLE mst_yield_act_recv_if_all
 ADD CONSTRAINT mst_yield_act_recv_if_all_ck01 CHECK (unschd_act_flg IN ('0', '1'));

