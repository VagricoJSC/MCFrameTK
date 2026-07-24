\encoding UTF-8

ALTER TABLE mgt_act_wk_rcv_all
 ADD CONSTRAINT mgt_act_wk_rcv_all_ck01 CHECK (no_pln_flg IN ('0', '1'));

