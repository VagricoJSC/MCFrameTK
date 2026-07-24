\encoding UTF-8

ALTER TABLE mst_rcv_act_all
 ADD CONSTRAINT mst_rcv_act_all_ck03 CHECK (bill_dtl_adv_flg IN ('0', '1'));

