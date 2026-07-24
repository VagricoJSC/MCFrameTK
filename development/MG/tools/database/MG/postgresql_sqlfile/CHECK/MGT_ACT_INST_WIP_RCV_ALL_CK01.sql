\encoding UTF-8

ALTER TABLE mgt_act_inst_wip_rcv_all
 ADD CONSTRAINT mgt_act_inst_wip_rcv_all_ck01 CHECK (imp_flg IN ('0', '1'));

