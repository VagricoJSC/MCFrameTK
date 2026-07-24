\encoding UTF-8

ALTER TABLE mst_oper_inst_send_if_all
 ADD CONSTRAINT mst_oper_inst_send_if_all_ck04 CHECK (inst_prnt_flg IN ('0', '1'));

