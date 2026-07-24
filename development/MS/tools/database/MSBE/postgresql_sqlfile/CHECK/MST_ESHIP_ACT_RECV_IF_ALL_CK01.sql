\encoding UTF-8

ALTER TABLE mst_eship_act_recv_if_all
 ADD CONSTRAINT mst_eship_act_recv_if_all_ck01 CHECK (iv_flg IN ('0', '1'));

