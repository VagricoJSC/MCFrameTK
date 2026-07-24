\encoding UTF-8

ALTER TABLE mst_rcv_act_d_all
 ADD CONSTRAINT mst_rcv_act_d_all_ck01 CHECK (appl_cmpl_flg IN ('0', '1'));

