\encoding UTF-8

ALTER TABLE mst_oper_act_recv_if_all
 ADD CONSTRAINT mst_oper_act_recv_if_all_ck02 CHECK (wk_cost_calc_ctl_flg IN ('0', '1'));

