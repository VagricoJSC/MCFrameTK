\encoding UTF-8

ALTER TABLE mst_rcv_act_all
 ADD CONSTRAINT mst_rcv_act_all_ck02 CHECK (prnt_flg IN ('0', '1'));

