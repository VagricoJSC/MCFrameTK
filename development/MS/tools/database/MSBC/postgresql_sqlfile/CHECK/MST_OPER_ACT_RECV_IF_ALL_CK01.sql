\encoding UTF-8

ALTER TABLE mst_oper_act_recv_if_all
 ADD CONSTRAINT mst_oper_act_recv_if_all_ck01 CHECK (bkf_ctl_flg IN ('0', '1'));

