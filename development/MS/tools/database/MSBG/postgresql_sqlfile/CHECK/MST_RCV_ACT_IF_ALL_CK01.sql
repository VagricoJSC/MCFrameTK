\encoding UTF-8

ALTER TABLE mst_rcv_act_if_all
 ADD CONSTRAINT mst_rcv_act_if_all_ck01 CHECK (can_flg IN ('0', '1'));

