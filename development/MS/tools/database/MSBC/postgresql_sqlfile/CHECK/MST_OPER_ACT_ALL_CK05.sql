\encoding UTF-8

ALTER TABLE mst_oper_act_all
 ADD CONSTRAINT mst_oper_act_all_ck05 CHECK (if_auto_reg_flg IN ('0', '1'));

