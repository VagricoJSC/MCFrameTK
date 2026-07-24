\encoding UTF-8

ALTER TABLE mst_oper_act_recv_if_all
 ADD CONSTRAINT mst_oper_act_recv_if_all_ck03 CHECK (not_cmpl_flg IN ('0', '1'));

