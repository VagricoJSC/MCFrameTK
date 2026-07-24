\encoding UTF-8

ALTER TABLE mst_oper_inst_send_if_all
 ADD CONSTRAINT mst_oper_inst_send_if_all_ck02 CHECK (wk_cost_calc_flg IN ('0', '1'));

