\encoding UTF-8

ALTER TABLE mgt_acc_cost_all
 ADD CONSTRAINT mgt_acc_cost_all_ck01 CHECK (oper_cost_flg IN ('0', '1'));

