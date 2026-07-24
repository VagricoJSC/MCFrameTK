\encoding UTF-8

ALTER TABLE mst_rcv_act_all
 ADD CONSTRAINT mst_rcv_act_all_ck01 CHECK (rcv_auto_appl_flg IN ('0', '1'));

